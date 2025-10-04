package lotr;
public class ElfKickStrategy implements KickStrategy{
    @Override
    public void kick(Character c1, Character c2) {
        if (c2.getPower() < c1.getPower()) {
            System.out.println(c1.getClass().getSimpleName() + " kills " + c2.getClass().getSimpleName());
            c2.setHp(0);
        } else {
            System.out.println(c1.getClass().getSimpleName() +
                    " decreases " + c2.getClass().getSimpleName() + "'s power by 1");
            c2.setPower(c2.getPower() - 1);
        }
    }
}
