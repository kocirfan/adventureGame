import java.util.Scanner;

public class Player {

    private int demage;
    private int health;
    private int orijinalHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Knight(), new Archer()};
        System.out.println("Seçebileceğin Karakterler : ");
        System.out.println("---------------------------");

        for (GameChar gameChar : charList) {
            System.out.println("ID :" + gameChar.getId() +
                    "\t\t Karakter :" + gameChar.getName() +
                    "\t\t Hasar :" + gameChar.getDemage() +
                    "\t\t Sağlık :" + gameChar.getHealth() +
                    "\t\t Para :" + gameChar.getMoney());

        }
        System.out.println("---------------------------");
        System.out.println(" Şimdi Karakterini Seç !");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
        }
       /* System.out.println("Karakter :" + this.getCharName() +
                ", Hasar: " + this.getDemage() +
                ", Sağlık: " + this.getHealth() +
                ", Para: " + this.getMoney());

        */


    }


    public void initPlayer(GameChar gameChar) {
        this.setDemage(gameChar.getDemage());
        this.setHealth(gameChar.getHealth());
        this.setOrijinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());

    }

    public void printInfo() {
        System.out.println("Silahız: " + this.getInventory().getWeapon().getName() +
                ", Zırh :" + this.getInventory().getArmor().getName() +
                ", Bloklama :" + this.getInventory().getArmor().getBlock() +
                ", Hasarınız: " + this.getTotalDemage() +
                ", Sağlık: " + this.getHealth() +
                ", Para: " + this.getMoney());
    }
public int getTotalDemage(){
        return demage + this.getInventory().getWeapon().getDemage();
}

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }
}
