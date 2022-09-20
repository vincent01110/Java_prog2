public class Main {
    public static void main(String[] args) { // psvm shortcut

        int a = 5;

        /**
         * Player player1 = new Player();
         * player1.setName("Tom");
        player1.setHealth(100);
        player1.setArmor(50);
        player1.setX(0);
        player1.setY(0);
        System.out.println(player1.toString());

        Player player2 = player1;
        System.out.println(player2);
        player1.setHealth(200);
        System.out.println(player1);
        System.out.println(player2);*/

        Player player1 = new Player("Tom", 100, 50, 0, 0); //ctrl+p
        Player player2 = new Player("David", 100, 50, 0, 0);

        /**if (player1 == player2){
            System.out.println("Egyenlo");
        }

        if (player1.equals(player2)){
            System.out.println("Egyenlo");
        }*/

        System.out.println(player1);
        player1.moveUp(20);
        System.out.println(player1);
    }
}