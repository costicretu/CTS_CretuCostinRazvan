package flyweight.main;

import flyweight.clase.PozitieDesenare;
import flyweight.clase.SpectatorFactory;

public class Main {
    public static void main(String[] args) {
        SpectatorFactory fabrica = new SpectatorFactory();

        PozitieDesenare pozitie1 = new PozitieDesenare(20, 10, "Rosu");
        PozitieDesenare pozitie2 = new PozitieDesenare(10, 30, "Verde");
        PozitieDesenare pozitie3 = new PozitieDesenare(24, 12, "Albastru");

        fabrica.getSpectator(1, 20, 10).deseneazaSpectator(pozitie3);
        fabrica.getSpectator(2, 13.5F, 16).deseneazaSpectator(pozitie1);
        fabrica.getSpectator(1, 20, 10).deseneazaSpectator(pozitie2);
    }
}
