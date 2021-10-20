public abstract class GameChar {
    private int id;
    private String name;
    private int demage;
    private int health;
    private int money;

    public GameChar(int id, String name, int demage, int health, int money) {
        this.id = id;
        this.name = name;
        this.demage = demage;
        this.health = health;
        this.money = money;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
