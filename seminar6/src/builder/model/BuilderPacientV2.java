package builder.model;

public class BuilderPacientV2 implements IBuilder {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public BuilderPacientV2() {
        this.nume = "Anonim";
        this.patRabatabil = false;
        this.papuciCamera = false;
        this.micDejunInclus = false;
        this.halatInterior = false;
    }

    public IBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public IBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public IBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public IBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public IBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.patRabatabil, this.micDejunInclus, this.papuciCamera, this.halatInterior);
    }
}