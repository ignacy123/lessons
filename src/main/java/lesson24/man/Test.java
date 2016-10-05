package lesson24.man;

/**
 * Created by ignacy on 12.05.16.
 */
public class Test {
    public static void main(String[] args) {
        Man[] men = new Man[]{new Man(Lang.PL), new Man(Lang.ENG), new Man(Lang.FRA)};
        for (Man man : men) {
            System.out.println(man.sayHello());
        }
    }
}
