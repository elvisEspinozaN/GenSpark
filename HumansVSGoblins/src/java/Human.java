public class Human {
    private int x_point;
    private int y_point;
    private int health;
    private int strength;
    private String name;

    Human(int x_point, int y_point, int health, int strength, String name) {
        this.x_point= x_point;
        this.y_point= y_point;
        this.health= health;
        this.strength= strength;
        this.name= name;
    }

    public void setX_point(int x_point) {
        this.x_point = x_point;
    }
    public void setY_point(int y_point) {
        this.y_point = y_point;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getX_point() {
        return x_point;
    }
    public int getY_point() {
        return y_point;
    }
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
       return "Human";
    }
}
