package main;

import main.kraje.Polska;

import java.math.BigDecimal;

public class PolskaDoEuroAdapter implements Adapter {

    @Override
    public BigDecimal ObliczPodatekLiniowyWEuro(BigDecimal kwota) {
        return new Polska()
                .pobierzPodatekLiniowy()
                .obliczWartoscPodatku(kwota)
                .divide(new BigDecimal(4.2), BigDecimal.ROUND_HALF_DOWN);
    }

    @Override
    public BigDecimal ObliczPodatekProgresywnyWEuro(BigDecimal kwota) {
        return new Polska()
                .pobierzPodatekProgresywny()
                .obliczWartoscPodatku(kwota)
                .divide(new BigDecimal(4.2), BigDecimal.ROUND_HALF_DOWN);
    }
}
