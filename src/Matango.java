public class Matango extends Monster{
    public Matango(char suffix,int hp) {
        super(suffix,hp);
    }
    public void attack(Creature target) {
        System.out.println("お化けキノコ"+suffix+"は体当たり攻撃！"+target.hp+"に6のダメージを与えた");
        target.hp-=6;
    }
}
