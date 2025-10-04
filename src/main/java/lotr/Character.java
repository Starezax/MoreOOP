package lotr;
public abstract class Character {
    protected int power;
    protected int hp;
    protected KickStrategy kickStrategy;

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }

    public int getHp(){
        return this.hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }

    public boolean isAlive() {
        return hp > 0;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
