import java.util.ArrayList;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        ArrayList<Monster> monster = new ArrayList<Monster>();
        Hero h = new Hero("勇者",100,"剣");
        party.add(h);
        Matango m = new Matango('A',45);
        monster.add(m);
        for(Character c : party){
            System.out.println("---味方パーティ---");
            c.showStatus();
        }
        for(Character c : party){
            for(Monster c2 : monster){
                .attack(c2);
            }
        }
    }
}