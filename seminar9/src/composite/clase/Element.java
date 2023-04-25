package composite.clase;

public interface Element {
    public float calculareSumaAsigurare();
    public void adaugaGrup(Element grupGeneral);
    public void stergeGrup(Element grupGeneral);
    public Element getGrup(int pozitieGrup);
    public void afisareSumaAsigurare();
}
