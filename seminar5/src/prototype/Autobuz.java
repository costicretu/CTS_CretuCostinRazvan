package prototype;

public class Autobuz implements MijlocTransport {
    private String nrInmatriculare;
    private Integer nrLocuri;

    public Autobuz() {
    }

    public Autobuz(String nrInmatriculare, Integer nrLocuri) {
        if (nrInmatriculare.length() == 7) {
            this.nrInmatriculare = nrInmatriculare;
        }
        if (nrLocuri > 10 && nrLocuri < 50) {
            this.nrLocuri = nrLocuri;
        }
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public MijlocTransport clone() {
        Autobuz autobuz = new Autobuz();
        autobuz.nrInmatriculare = this.nrInmatriculare;
        autobuz.nrLocuri = this.nrLocuri;
        return autobuz;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
