package lotr;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.reflect.*;

public class CharacterFactory {
    private final List<Class<? extends Character>> characterClasses = new ArrayList<>();
    private static final Random random = new Random();

    public CharacterFactory() {
        characterClasses.add(Hobbit.class);
        characterClasses.add(Elf.class);
        characterClasses.add(King.class);
        characterClasses.add(Knight.class);
    }

    public Character createCharacter() {
        try {
            Class<? extends Character> cls = characterClasses.get(random.nextInt(characterClasses.size()));
            return cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error creating character", e);
        }
    }
}
