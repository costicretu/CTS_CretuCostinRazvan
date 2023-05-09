package observer.main;

import observer.clase.Agentie;
import observer.clase.ClientFidel;

public class Main {
    public static void main(String[] args) {
        ClientFidel client2 = new ClientFidel("Adrian");
        ClientFidel client1 = new ClientFidel("Mihai");
        ClientFidel client3 = new ClientFidel("Angela");

        Agentie agentie = new Agentie("AgeTur");

        agentie.adaugaObserver(client1);
        agentie.adaugaObserver(client2);
        agentie.notificareOfertaNoua();
        agentie.adaugaObserver(client3);
        agentie.notificareReducerePret();
    }
}
