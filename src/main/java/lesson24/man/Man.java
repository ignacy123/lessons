package lesson24.man;

import java.util.Locale;

/**
 * Created by ignacy on 12.05.16.
 */
public class Man {
    private final Lang lang;

    public Man(Lang lang) {
        this.lang = lang;
    }

    public String sayHello(){
        switch (lang) {
            case PL:
                return "cześć";
            case ENG:
                return "hi";
            case FRA:
                return "salut";
            default:
                throw new IllegalStateException("Unknown lang: " + lang);
        }
    }

}
