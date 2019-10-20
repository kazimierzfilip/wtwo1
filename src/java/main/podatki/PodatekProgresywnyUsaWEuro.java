package main.podatki;

import java.math.BigDecimal;

public class PodatekProgresywnyUsaWEuro implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        return new PodatekProgresywnyUsa()
                .obliczWartoscPodatku(kwota)
                .multiply(new BigDecimal(3))
                .divide(new BigDecimal(3.8), BigDecimal.ROUND_HALF_DOWN);
    }
}
