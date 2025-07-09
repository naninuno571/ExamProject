import java.util.*;
public abstract class Character implements Creature{
    private String name;
    private int hp;
    public Character(String name, int hp){
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
        System.out.println(name+":"+hp);
    }
    public void setter(){
        this.hp=hp;
    }
    public int getter(){
        return hp;
    }
}
