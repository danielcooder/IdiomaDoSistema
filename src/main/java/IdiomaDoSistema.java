import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        String idioma = locale.getLanguage();

        System.out.println("O idioma do sistema é " + idioma);
    }
}
