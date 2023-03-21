package factory_method.main;

import factory_method.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factoryMedici = new FactoryMedici();
        Factory factoryAsistenti = new FactoryAsistenti();
        Factory factoryBrancardieri = new FactoryBrancardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryAsistenti.crearePersonal("Ionescu"));
        listaPersonal.add(factoryMedici.crearePersonal("Andrei"));
        listaPersonal.add(factoryBrancardieri.crearePersonal("Cristian"));
        listaPersonal.add(factoryMedici.crearePersonal("Matei"));
        listaPersonal.add(factoryMedici.crearePersonal("Catalin"));

        for (PersonalSpital p : listaPersonal) {
            p.descriere();
        }
    }
}
