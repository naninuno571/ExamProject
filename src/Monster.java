public abstract class Monster implements Creature{
    private String name;
    private  int hp;
    private  char suffix;
    public Monster(char suffix, int hp){
        try{
            setter();
        }catch(IllegalArgumentException e){
            System.err.println("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }
    final public boolean isAlive(){
        return this.hp>0;
    }
    public void showStatus(){
        System.out.println("[" + name+"]["+suffix+"]:["+hp+"]");
    }
    public void setter(){
        this.hp=hp;
    }
    public int getter(){
        return hp;
    }
}

