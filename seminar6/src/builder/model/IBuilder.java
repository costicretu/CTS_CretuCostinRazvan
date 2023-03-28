package builder.model;

public interface IBuilder {
    public IBuilder setNume(String nume);

    public IBuilder setPatRabatabil(boolean patRabatabil);

    public IBuilder setMicDejunInclus(boolean micDejunInclus);

    public IBuilder setPapuciCamera(boolean papuciCamera);

    public IBuilder setHalatInterior(boolean halatInterior);

    public Pacient build();
}