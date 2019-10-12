package main.przedmioty;

import java.math.BigDecimal;

public class Rzezba implements Przedmiot {
    private int rokWykonania;
    private int rozmiar;

    public Rzezba(int rokWykonania, int rozmiar) {
        this.rokWykonania = rokWykonania;
        this.rozmiar = rozmiar;
    }

    public BigDecimal okreslWartosc(){
        return new BigDecimal((2020-rokWykonania)*rozmiar*2);
    }
}
