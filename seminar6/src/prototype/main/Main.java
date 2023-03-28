package prototype.main;

import prototype.classes.Prototype;
import prototype.classes.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Float> solutii = new HashMap<>();
        solutii.put("sol1", (float) 40.2);
        solutii.put("sol2", (float) 59.8);
        solutii.put("sol3", (float) 100);
        Reteta reteta = new Reteta(solutii, "Reteta1", (float) 200);

        Prototype retetaLaborator = reteta.clonare();
        Prototype retetaPacient = reteta.clonare();
        System.out.println(retetaLaborator.toString());
    }
}
