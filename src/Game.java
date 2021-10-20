import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);


    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz");
        System.out.println("Lütfen Bir İsim Giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Adaya hoşgeldin senin için macera başlyor ! ");
        player.selectChar();

        Location location = null;

        while (true) {
            player.printInfo();
            System.out.println("*****Bölgeler***** ");
            System.out.println("1 Güvenli Ev ");
            System.out.println("2 Mağaza  ");
            System.out.println("3 Mağara ---> Mağaraya gir, dikkatli ol zombi olabilir ! ");
            System.out.println("4  Orman ---> Ormana git, dikkatli ol vampir çıkabilir ! ");
            System.out.println("5 Nehir ---> Nehire git, dikkatli ol ayı çıkabilir ! ");
            System.out.println("0 Çıkış Yap  ");


            System.out.println("Lütfen Gitmek İstediğiniz Bölgeyi Seçin ");

            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5 :
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);

            }
            if(location == null){
                System.out.println("Oyun Sonlandı");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER ");
                break;
            }


        }
    }

}

