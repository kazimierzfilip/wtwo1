package main.podatki;

import java.math.BigDecimal;

public class PodatekProgresywnyFrancja implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        if (isLessOrEqual(kwota, 40_000)){
            return kwota.multiply(new BigDecimal(0.30));
        } else {
            BigDecimal wartoscPodatku = new BigDecimal(40_000).multiply(new BigDecimal(0.30));
            return wartoscPodatku.add(kwota.subtract(new BigDecimal(40_000)).multiply(new BigDecimal(0.50)));
        }
    }

    private boolean isLessOrEqual(BigDecimal kwota, int number) {
        return kwota.compareTo(new BigDecimal(number)) <= 0;
    }
}
