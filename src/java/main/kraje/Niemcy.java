package main.kraje;

import main.podatki.Podatek;
import main.podatki.PodatekLiniowyNiemcy;
import main.podatki.PodatekProgresywnyNiemcy;

public class Niemcy implements Kraj {
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowyNiemcy();
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywnyNiemcy();
    }
}
