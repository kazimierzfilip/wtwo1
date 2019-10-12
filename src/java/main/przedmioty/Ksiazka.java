package main.przedmioty;

import java.math.BigDecimal;

public class Ksiazka implements Przedmiot {
    private int rokWydania;
    private int numerWydania;

    public Ksiazka(int rokWydania, int numerWydania) {
        this.rokWydania = rokWydania;
        this.numerWydania = numerWydania;
    }

    public BigDecimal okreslWartosc(){
        return new BigDecimal((2050-rokWydania)/(double)numerWydania);
    }
}
