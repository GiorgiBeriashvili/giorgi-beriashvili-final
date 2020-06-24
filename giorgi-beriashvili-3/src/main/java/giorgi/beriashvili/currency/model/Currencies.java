package giorgi.beriashvili.currency.model;

import java.util.ArrayList;
import java.util.Date;

public class Currencies {
    public static ArrayList<Currency> get() {
        ArrayList<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency("EEK", 1.0754, "10 ესტონური კრონი", new Date()));
        currencies.add(new Currency("UKT", 1.3121, "13 კამბოჯას ტირი", new Date()));
        currencies.add(new Currency("TLG", 1.5677, "2 თელიანის ოქრო", new Date()));
        currencies.add(new Currency("KGU", 3.5677, "1 ყარაღაჟის უპა", new Date()));

        return currencies;
    }
}
