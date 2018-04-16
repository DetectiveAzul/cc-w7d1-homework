package persons;

public class Visitor {
    private String name;
    private int age;
    private double height;
    private double money;
    private boolean hadMeal;

    public Visitor(String name, int age, double height, double money, boolean hadMeal) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
        this.hadMeal = hadMeal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void changeMoney(double amount) {
        this.money += amount;
    }

    public boolean isHadMeal() {
        return hadMeal;
    }

    public void setHadMeal(boolean hadMeal) {
        this.hadMeal = hadMeal;
    }
}
