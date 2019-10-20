package main;

import main.kraje.Kraj;
import main.podatki.*;

public class PolskaDoEuroAdapter implements Kraj {

    @Override
    public Podatek pobierzPodatekLiniowy() {
        return new PodatekLiniowyPolskaWEuro();
    }

    @Override
    public Podatek pobierzPodatekProgresywny() {
        return new PodatekProgresywnyPolskaWEuro();
    }
}
