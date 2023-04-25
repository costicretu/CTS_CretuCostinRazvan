package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    private List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = 0;
        for (Element g : elemente) {
            suma += g.calculareSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaGrup(Element grupGeneral) {
        this.elemente.add(grupGeneral);
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        this.elemente.remove(grupGeneral);
    }

    @Override
    public Element getGrup(int pozitieGrup) {
        return this.elemente.get(pozitieGrup);
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma pentru asigurare este: " + this.calculareSumaAsigurare());
    }
}
