package main;

import main.kraje.Kraj;
import main.podatki.Podatek;
import main.podatki.PodatekLiniowyUsaWEuro;
import main.podatki.PodatekProgresywnyUsaWEuro;

public class UsaDoEuroAdapter implements Kraj {

    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowyUsaWEuro();
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywnyUsaWEuro();
    }
}
