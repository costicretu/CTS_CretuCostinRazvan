package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype {
    private Map<String, Float> solutii;
    private String numeReteta;
    private Float gramajMedicament;

    public Reteta(Map<String, Float> solutii, String numeReteta, Float gramajMedicament) {
        this.numeReteta = numeReteta;
        this.gramajMedicament = gramajMedicament;
        float suma = 0;
        for (Float valoare : solutii.values()) {
            suma += valoare;
        }
        if (this.gramajMedicament == suma) {
            this.solutii = solutii;
        } else {
            throw new IllegalArgumentException("Gramaj gresit");
        }
    }

    private Reteta() {
        numeReteta = null;
        gramajMedicament = null;
        solutii = null;
    }

    @Override
    public Prototype clonare() {
        Reteta reteta = new Reteta();
        reteta.numeReteta = this.numeReteta;
        reteta.gramajMedicament = this.gramajMedicament;
        reteta.solutii = new HashMap<>();
        for (String val : this.solutii.keySet()) {
            reteta.solutii.put(val, this.solutii.get(val));
        }
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeReteta='" + numeReteta + '\'' +
                ", gramajMedicament=" + gramajMedicament +
                '}';
    }
}
