package lotr;
import java.util.Random;

public class Human extends Character{
    public static final Random random = new Random();

    public Human(int min, int max){
        this.hp = random.nextInt((max - min) + 1) + min;
        this.power = random.nextInt((max - min) + 1) + min;
        this.kickStrategy = new HumanKickStrategy();
    }

    @Override
    public void kick(Character c){
        int damage = random.nextInt(this.power) + 1;
        c.setHp(c.hp - damage);
    }

}
