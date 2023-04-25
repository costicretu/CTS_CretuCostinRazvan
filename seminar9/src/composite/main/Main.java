package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;

public class Main {
    public static void main(String[] args) {
        Element autobuzMic1 = new Autobuz("Mercedes", 3000, 9);
        Element autobuzMic2 = new Autobuz("Mercedes", 3000, 7);
        Grup grupAutobuzeMici = new Grup("Autobuze mici");
        grupAutobuzeMici.adaugaGrup(autobuzMic1);
        grupAutobuzeMici.adaugaGrup(autobuzMic2);
        grupAutobuzeMici.afisareSumaAsigurare();

        Element autobuzMijlociu1 = new Autobuz("Mercedes", 5000, 20);
        Element autobuzMijlociu2 = new Autobuz("Mercedes", 4000, 15);
        Grup grupAutobuzeMijlocii = new Grup("Autobuze mijlocii");
        grupAutobuzeMijlocii.adaugaGrup(autobuzMijlociu1);
        grupAutobuzeMijlocii.adaugaGrup(autobuzMijlociu2);
        grupAutobuzeMijlocii.afisareSumaAsigurare();

        Element flota = new Grup("Autobuze");
        flota.adaugaGrup(grupAutobuzeMici);
        flota.adaugaGrup(grupAutobuzeMijlocii);
        flota.afisareSumaAsigurare();

        Element autobuzVip = new Autobuz("Ford", 9000, 30);
        flota.adaugaGrup(autobuzVip);
        flota.afisareSumaAsigurare();
    }
}
