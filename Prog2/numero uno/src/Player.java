import java.util.Objects;

public class Player {
    private String name;
    private int health;
    private int armor;
    private int x;
    private int y;

    public Player() {
    }

    public Player(String name, int health, int armor, int x, int y) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", armor=" + armor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return health == player.health && armor == player.armor && x == player.x && y == player.y && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, armor, x, y);
    }

    public void moveUp(int moveCount) {
        this.y = this.y + moveCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
