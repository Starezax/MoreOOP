package lotr;
public class Demo {

    public static void main(String[] args) {
        System.out.println("___Game Starts___\n");
        GameManager game = new GameManager();
        game.fight();
        System.out.println("\n___Game Over___");
    }
}