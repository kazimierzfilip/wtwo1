package main;

import java.math.BigDecimal;

public interface Adapter {
    BigDecimal ObliczPodatekLiniowyWEuro(BigDecimal kwota);

    BigDecimal ObliczPodatekProgresywnyWEuro(BigDecimal kwota);
}
