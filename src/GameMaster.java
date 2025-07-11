import java.util.ArrayList;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class GameMaster {
    private static Object c1;

    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        ArrayList<Monster> monster = new ArrayList<Monster>();
        party.add(new Hero("勇者",100,"剣"));
        monster.add(new Matango('A',45));
        for(Character c : party){
            System.out.println("---味方パーティ---");
            c.showStatus();
        }
        for(Monster c2 : monster){
            System.out.println("---敵グループ---");
            c2.showStatus();
        }
        for(Character c : party){
            for(Monster c2 : monster){
                c.attack(c2);

            }
        }
        for(Monster c2 : monster){
            for(Character c : party){
                c2.attack(c);
            }
        }
        for(Character c : party){
            System.out.println("---味方パーティの最終ステータス---");
            c.showStatus();
        }
        for(Monster c2 : monster){
            System.out.println("---敵グループの最終ステータス---");
            c2.showStatus();
        }
    }
}