package main.podatki;

import java.math.BigDecimal;

public class PodatekLiniowyUsa implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        return kwota.multiply(new BigDecimal(0.10));
    }
}
