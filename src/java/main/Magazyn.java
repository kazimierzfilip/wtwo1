package main;

import main.podatki.Podatek;
import main.przedmioty.Przedmiot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Przedmiot> przedmioty;

    public Magazyn() {
        this.przedmioty = new ArrayList<>();
    }

    public void dodajDoSpisu(Przedmiot przedmiot){
        przedmioty.add(przedmiot);
    }

    public BigDecimal pobierzWartoscPoOpodatkowaniu(Podatek podatek){
        BigDecimal wartosc = new BigDecimal(0);
        for (Przedmiot przedmiot : przedmioty) {
            wartosc = wartosc.add(przedmiot.okreslWartosc());
        }
        return wartosc.subtract(podatek.obliczWartoscPodatku(wartosc));
    }
}
