package main;

import main.kraje.Niemcy;
import main.kraje.Polska;
import main.przedmioty.Ksiazka;
import main.przedmioty.Obraz;
import main.przedmioty.Rzezba;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();

        magazyn.dodajDoSpisu(new Ksiazka(2000, 2));
        magazyn.dodajDoSpisu(new Rzezba(1990, 3000));
        magazyn.dodajDoSpisu(new Obraz(1700));
//        magazyn.dodajDoSpisu(new Ksiazka(1999, 2));
//        magazyn.dodajDoSpisu(new Ksiazka(2006, 3));
//        magazyn.dodajDoSpisu(new Obraz(1800));
//        magazyn.dodajDoSpisu(new Obraz(1900));
//        magazyn.dodajDoSpisu(new Rzezba(1500, 3));
//        magazyn.dodajDoSpisu(new Rzezba(900, 5));


        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(
                new Polska().pobierzPodatekLiniowy()).setScale(2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(
                new Polska().pobierzPodatekProgresywny()).setScale(2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(
                new Niemcy().pobierzPodatekLiniowy()).setScale(2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(
                new Niemcy().pobierzPodatekProgresywny()).setScale(2, BigDecimal.ROUND_HALF_DOWN));

        System.out.println(new PolskaDoEuroAdapter().ObliczPodatekLiniowyWEuro(new BigDecimal(124_000)));
        System.out.println(new PolskaDoEuroAdapter().ObliczPodatekProgresywnyWEuro(new BigDecimal(124_000)));
    }
}
