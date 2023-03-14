package singletonregisry_nerecomandat.main;

import singletonregisry_nerecomandat.Firma;
import singletonregisry_nerecomandat.Registru;

public class Main {
    public static void main(String[] args) {
        Firma firma1 = Registru.getFirma("Amicii SRL");
        Firma firma2 = Registru.getFirma("Amicii SRL");
        Firma firma3 = Registru.getFirma("CISCO SRL");
        firma1.incheiereContract(100);
        firma2.incheiereContract(200);
        firma3.incheiereContract(3000);
        System.out.println(firma1.toString());
        System.out.println(firma2.toString());
        System.out.println(firma3.toString());
    }
}
