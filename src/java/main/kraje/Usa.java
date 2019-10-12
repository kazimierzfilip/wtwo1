package main.kraje;

import main.podatki.Podatek;
import main.podatki.PodatekLiniowyUsa;
import main.podatki.PodatekProgresywnyUsa;

public class Usa implements Kraj {
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowyUsa();
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywnyUsa();
    }
}
