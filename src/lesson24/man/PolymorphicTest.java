package lesson24.man;

/**
 * Created by ignacy on 12.05.16.
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        PolymorphicMan[] men = new PolymorphicMan[]{PolymorphicMan.createMan(Lang.PL),PolymorphicMan.createMan(Lang.ENG),PolymorphicMan.createMan(Lang.FRA)};
        for (PolymorphicMan man : men) {
            System.out.println(man.sayHello());
        }
    }
}
