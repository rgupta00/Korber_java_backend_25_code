import javax.xml.transform.stream.StreamSource;

public class PlayerTester {
    public static void main(String[] args) {
        Player player1=new Player("rohit",67);

        Player player2=new Player("umesh",120);

        player1.printPlayerDetails();
        player2.printPlayerDetails();

        Player player3=new Player();

        player3.printPlayerDetails();

        System.out.println(Player.getPlayerCounter());
    }
}
