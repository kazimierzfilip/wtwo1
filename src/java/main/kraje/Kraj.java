package main.kraje;

import main.podatki.Podatek;

public interface Kraj {
    Podatek pobierzPodatekLiniowy();
    Podatek pobierzPodatekProgresywny();
}
