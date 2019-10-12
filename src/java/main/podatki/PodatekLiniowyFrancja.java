package main.podatki;

import java.math.BigDecimal;

public class PodatekLiniowyFrancja implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        return kwota.multiply(new BigDecimal(0.30));
    }
}
