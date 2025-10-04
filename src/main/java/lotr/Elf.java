package lotr;
public class Elf extends Character{
    public Elf() {
        this.power = 10;
        this.hp = 10;
        this.kickStrategy = new ElfKickStrategy();
    }
}
