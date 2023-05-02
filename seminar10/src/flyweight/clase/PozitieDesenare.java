package flyweight.clase;

public class PozitieDesenare {
    private int rand;
    private int loc;
    private String culoare;

    public PozitieDesenare(int rand, int loc, String culoare) {
        this.rand = rand;
        this.loc = loc;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "PozitieDesenare{" +
                "rand=" + rand +
                ", loc=" + loc +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
