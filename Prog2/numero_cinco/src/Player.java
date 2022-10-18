public class Player implements Comparable<Player> {
    public String name;
    public int age;
    public int position;

    public Player() {
    }

    public Player(String name, int age, int position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        if (this.age > o.age){
            return -1;
        }else if(this.age < o.age){
            return 1;
        } else if(this.age == o.age){
            return this.name.compareTo(o.name);
        }
        return 0;
    }
}
