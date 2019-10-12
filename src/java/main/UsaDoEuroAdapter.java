package main;

import main.kraje.Usa;

import java.math.BigDecimal;

public class UsaDoEuroAdapter implements Adapter {
    @Override
    public BigDecimal ObliczPodatekLiniowyWEuro(BigDecimal kwota) {
        return new Usa()
                .pobierzPodatekLiniowy()
                .obliczWartoscPodatku(kwota)
                .multiply(new BigDecimal(3))
                .divide(new BigDecimal(3.8), BigDecimal.ROUND_HALF_DOWN);
    }

    @Override
    public BigDecimal ObliczPodatekProgresywnyWEuro(BigDecimal kwota) {
        return new Usa()
                .pobierzPodatekProgresywny()
                .obliczWartoscPodatku(kwota)
                .multiply(new BigDecimal(3))
                .divide(new BigDecimal(3.8), BigDecimal.ROUND_HALF_DOWN);
    }
}
