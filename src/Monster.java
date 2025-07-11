public abstract class Monster implements Creature{
    private String name;
    private  int hp;
    private  char suffix;
    public Monster(char suffix, int hp){
        if(hp <= 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.suffix = suffix;
        this.hp = hp;
    }
    final public boolean isAlive(){
        return this.hp>0;
    }
    public void showStatus(){
        System.out.println(getName()+":"+hp);
    }
    public char getSuffix(){return suffix;}
    public void setter(){this.hp=hp;}
    public int getter(){
        return hp;
    }

    public abstract void attack(Creature target);
}

