public class Matango extends Monster {

    public Matango(char suffix, int hp) {
        super(suffix, hp);
    }

    public void attack(Creature target) {
        System.out.println("お化けキノコ" + getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた");
    }

    @Override
    public String getName() {
        return "お化けキノコ" + getSuffix();
    }

    @Override
    public int getHp() {
        return 0;
    }
}


