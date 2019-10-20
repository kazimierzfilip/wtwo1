package main.podatki;

import java.math.BigDecimal;

public class PodatekLiniowyUsaWEuro implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        return new PodatekLiniowyUsa()
                .obliczWartoscPodatku(kwota)
                .multiply(new BigDecimal(3))
                .divide(new BigDecimal(3.8), BigDecimal.ROUND_HALF_DOWN);
    }
}
