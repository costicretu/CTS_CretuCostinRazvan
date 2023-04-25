package composite.clase;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;
    private int numarLocuri;

    public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = 1.5F * this.capacitateCilindrica;
        return suma;
    }

    @Override
    public void adaugaGrup(Element grupGeneral) {
        throw new IllegalArgumentException("Operatia adaugaGrup nu este implementata pentru nodul frunza(Autobuz)");
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        throw new IllegalArgumentException("Operatia stergeGrup nu este implementata pentru nodul frunza(Autobuz)");
    }

    @Override
    public Element getGrup(int pozitieGrup) {
        throw new IllegalArgumentException("Operatia getGrup nu este implementata pentru nodul frunza(Autobuz)");
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma de asigurare pentru autobuzul " + this.producator + " este " + this.calculareSumaAsigurare());
    }
}
