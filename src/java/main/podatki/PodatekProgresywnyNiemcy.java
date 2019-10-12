package main.podatki;

import java.math.BigDecimal;

public class PodatekProgresywnyNiemcy implements Podatek {
    @Override
    public BigDecimal obliczWartoscPodatku(BigDecimal kwota) {
        if (isLessOrEqual(kwota, 50_000)){
            return kwota.multiply(new BigDecimal(0.20));
        } else {
            BigDecimal wartoscPodatku = new BigDecimal(50_000).multiply(new BigDecimal(0.20));
            return wartoscPodatku.add(kwota.subtract(new BigDecimal(50_000)).multiply(new BigDecimal(0.40)));
        }
    }

    private boolean isLessOrEqual(BigDecimal kwota, int number) {
        return kwota.compareTo(new BigDecimal(number)) <= 0;
    }
}
