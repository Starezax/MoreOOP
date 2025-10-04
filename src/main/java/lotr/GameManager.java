package lotr;
import java.util.Random;

public class GameManager {
    private static final Random random = new Random();
    private final Character c1;
    private final Character c2;

    public GameManager() {
        CharacterFactory factory = new CharacterFactory();
        this.c1 = factory.createCharacter();
        this.c2 = factory.createCharacter();
    }

    public void fight() {
        String characterName1 = c1.getClass().getSimpleName();
        String characterName2 = c2.getClass().getSimpleName();
        System.out.println("Fight between " + characterName1 + " and " + characterName2 + " has started!");
        System.out.println("__________FIGHT__________");

        while (c1.isAlive() && c2.isAlive()) {
            int kicker = random.nextInt(2);
            if (kicker == 0) {
                c1.kick(c2);
                System.out.println(characterName1 + " kicks " + characterName2);
            } else {
                c2.kick(c1);
                System.out.println(characterName2 + " kicks " + characterName1);
            }

            System.out.println(characterName1 + " — HP: " + c1.getHp() + ", Power: " + c1.getPower());
            System.out.println(characterName2 + " — HP: " + c2.getHp() + ", Power: " + c2.getPower());
            System.out.println("----------------------------");
            if (!c1.isAlive()) {
                System.out.println(characterName1 + " DIED — " + characterName2 + " WON!");
                break;
            } else if (!c2.isAlive()) {
                System.out.println(characterName2 + " DIED — " + characterName1 + " WON!");
                break;
            }
        }
    }
}
