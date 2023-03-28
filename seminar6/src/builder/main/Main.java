package builder.main;

import builder.model.BuilderPacient;
import builder.model.BuilderPacientV2;
import builder.model.Pacient;
import builder.model.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builderPacient = new BuilderPacient("Costi");
        Pacient pacient = builderPacient.setHalatInterior(true).build();
        Pacient pacient2 = builderPacient.setMicDejunInclus(true).build();
        //pacient2.setMicDejunInclus(true);
        System.out.println(pacient.toString());
        System.out.println(pacient2.toString());

        IBuilder builderPacient2 = new BuilderPacientV2();
        Pacient pacient3 = builderPacient2.setNume("Gigel").setPapuciCamera(true).build();
        Pacient pacient4 = builderPacient2.setNume("Vlad").setPatRabatabil(true).build();
        System.out.println(pacient3.toString());
        System.out.println(pacient4.toString());
    }
}