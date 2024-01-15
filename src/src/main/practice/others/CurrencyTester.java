
package src.main.practice.others;import java.util.Currency;
import java.util.Locale;

public class CurrencyTester {
public static void main(String[] args) {
	Currency c1=Currency.getInstance(Locale.GERMANY);
	System.out.println(c1.getCurrencyCode());
}
}
