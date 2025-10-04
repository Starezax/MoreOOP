package lotr;
public class HobbitCryStrategy implements KickStrategy{
    @Override
    public void kick(Character c1, Character c2){
        System.out.println(c1.getClass().getSimpleName() + " cries");
    }
}
