package giorgi.beriashvili.currency.service;

import giorgi.beriashvili.currency.model.Currencies;
import giorgi.beriashvili.currency.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CurrencyService {
    @WebMethod
    public String GetCurrency(String currency) {
        for (Currency existingCurrency : Currencies.get()) {
            if (existingCurrency.getName().equals(currency)) {
                return String.valueOf(existingCurrency.getValue());
            }
        }

        return "";
    }

    @WebMethod
    public String GetCurrencyDescription(String currency) {
        for (Currency existingCurrency : Currencies.get()) {
            if (existingCurrency.getName().equals(currency)) {
                return String.valueOf(existingCurrency.getDescription());
            }
        }

        return "";
    }

    @WebMethod
    public List<String> GetDate() {
        List<String> dates = new ArrayList<>();

        for (Currency currency : Currencies.get()) {
            dates.add(String.valueOf(currency.getDate()));
        }

        return dates;
    }
}
