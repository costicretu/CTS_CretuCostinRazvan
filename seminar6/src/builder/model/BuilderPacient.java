package builder.model;

public class BuilderPacient implements IBuilder {
    Pacient pacient;

    public BuilderPacient(String nume) {
        this.pacient = new Pacient(nume, false, false, false, false);
    }

    public BuilderPacient setNume(String nume) {
        throw new IllegalArgumentException("Not Aplicable!");
    }

    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
        pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public BuilderPacient setPapuciCamera(boolean papuciCamera) {
        pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    public BuilderPacient setHalatInterior(boolean halatInterior) {
        pacient.setHalatInterior(halatInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}