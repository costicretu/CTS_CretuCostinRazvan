package singletonregisry_nerecomandat;

public class Firma {
    private String nume;
    private int cifraAfaceri;

    public void incheiereContract(int sumaContract) {
        this.cifraAfaceri += sumaContract;
    }

    public Firma(String nume, int cifraAfaceri) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
