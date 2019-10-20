package main.podatki;

import java.math.BigDecimal;

public class PodatekProgresywnyPolskaWEuro implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        return new PodatekProgresywnyPolska()
                .obliczWartoscPodatku(kwota)
                .divide(new BigDecimal(4.2), BigDecimal.ROUND_HALF_DOWN);
    }
}
