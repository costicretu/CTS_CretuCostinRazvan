package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public String numeFisier;

    public ReaderAplicant(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public String getNumeFisier() {
        return numeFisier;
    }

    public void citesteAplicant(Scanner input, Aplicant aplicant) {
        aplicant.setNume(input.next());
        aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());
        aplicant.setNrProiecte(input.nextInt());

        String[] denumiriProiecte = new String[aplicant.getNrProiecte()];
        for (int i = 0; i < aplicant.getNrProiecte(); i++)
            denumiriProiecte[i] = input.next();
        aplicant.setDenumireProiect(denumiriProiecte);
    }

}
