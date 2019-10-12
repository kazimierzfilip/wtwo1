package main.podatki;

import java.math.BigDecimal;

public interface Podatek {
    BigDecimal obliczWartoscPodatku(BigDecimal kwota);
}
