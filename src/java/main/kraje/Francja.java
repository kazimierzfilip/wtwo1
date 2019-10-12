package main.kraje;

import main.podatki.Podatek;
import main.podatki.PodatekLiniowyFrancja;
import main.podatki.PodatekProgresywnyFrancja;

public class Francja implements Kraj {
    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowyFrancja();
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywnyFrancja();
    }
}
