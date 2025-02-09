import java.text.NumberFormat;
import java.util.Locale;

public class Formato_numeros {
    public static void main(String[] args) {
        Locale local = new Locale("en", "US");
        NumberFormat formato = NumberFormat.getCurrencyInstance(local);
        String result= formato.format(123456.789);
        System.out.println(result);
    }
}
