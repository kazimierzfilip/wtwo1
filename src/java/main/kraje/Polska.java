package main.kraje;

import main.podatki.Podatek;
import main.podatki.PodatekLiniowyPolska;
import main.podatki.PodatekProgresywnyPolska;

public class Polska implements Kraj {
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowyPolska();
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywnyPolska();
    }
}
