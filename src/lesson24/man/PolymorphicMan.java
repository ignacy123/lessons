package lesson24.man;

/**
 * Created by ignacy on 12.05.16.
 */
public abstract class PolymorphicMan {
    public abstract String sayHello();


    public static PolymorphicMan polishMan(){
        return new PolishMan();
    }

    public static PolymorphicMan createMan(Lang lang){
        switch (lang) {
            case PL:
                return new PolishMan();
            case ENG:
                return new EnglishMan();
            case FRA:
                return new FrenchMan();
            default:
                throw new IllegalStateException("Unknown lang: " + lang);
        }
    }
}
