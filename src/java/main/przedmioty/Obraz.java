package main.przedmioty;

import java.math.BigDecimal;

public class Obraz implements Przedmiot {
    private int rokNamalowania;

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    public BigDecimal okreslWartosc(){
        return new BigDecimal((2100-rokNamalowania)*10);
    }
}
