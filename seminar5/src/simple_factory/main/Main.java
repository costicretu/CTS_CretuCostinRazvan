package simple_factory.main;

import simple_factory.Factory;
import simple_factory.PersonalSpital;
import simple_factory.TipPersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factoryPersonal = new Factory();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        PersonalSpital brancardier = factoryPersonal.createObject(TipPersonalSpital.BRANCARDIER, "George");
        PersonalSpital asistent = factoryPersonal.createObject(TipPersonalSpital.ASISTENT, "Marius");

        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add(factoryPersonal.createObject(TipPersonalSpital.MEDIC, "Ion"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonalSpital.MEDIC, "Cristi"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonalSpital.ASISTENT, "Sorin"));

        listaPersonal.add(factoryPersonal.createObject(TipPersonalSpital.ANESTEZIST, "Gabi", 10));

        for (PersonalSpital p : listaPersonal) {
            p.descriere();
        }

    }
}
