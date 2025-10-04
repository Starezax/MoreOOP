package lotr;
import java.util.Random;

public class HumanKickStrategy implements KickStrategy{
    private static final Random random = new Random();

    @Override
    public void kick(Character c1, Character c2){
        int damage = random.nextInt(c1.getPower()) + 1;
        System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName() + " for " + damage + " damage!");
        c2.setHp(c2.getHp() - damage);
    }
}
