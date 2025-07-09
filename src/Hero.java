public class Hero extends Character{
    private String weapon;
    public Hero(String name,int hp,String weapon){
        super(name,hp);
    }
    public void attack(Creature target){
        System.out.println(getName()+"は"+weapon+"で攻撃！"+target.hp+"に10のダメージを与えた");
        target.hp-=10;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp() {

    }

    public getter
}
