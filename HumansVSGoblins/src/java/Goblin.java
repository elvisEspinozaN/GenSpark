public class Goblin {
    private int x_point;
    private int y_point;
    private int strength;
    private String name;

    Goblin(int x_point, int y_point, int strength, String name) {
        this.x_point= x_point;
        this.y_point= y_point;
        this.strength= strength;
        this.name= name;
    }

    public void setX_point(int x_point) {
        this.x_point = x_point;
    }
    public void setY_point(int y_point) {
        this.y_point = y_point;
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
    public int getStrength() {
        return strength;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
