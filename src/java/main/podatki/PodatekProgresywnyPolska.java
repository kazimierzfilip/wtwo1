package main.podatki;

import main.podatki.Podatek;

import java.math.BigDecimal;

public class PodatekProgresywnyPolska implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        if (isLessOrEqual(kwota, 10_000)){
            return kwota.multiply(new BigDecimal(0.18));
        } else {
            BigDecimal wartoscPodatku = new BigDecimal(10_000).multiply(new BigDecimal(0.18));
            return wartoscPodatku.add(kwota.subtract(new BigDecimal(10_000)).multiply(new BigDecimal(0.32)));
        }
    }

    private boolean isLessOrEqual(BigDecimal kwota, int number) {
        return kwota.compareTo(new BigDecimal(number)) <= 0;
    }
}
