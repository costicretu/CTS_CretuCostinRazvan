package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {
    private List<Observer> observeri;
    private String numeAgentie;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        this.observeri = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObservator(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer:observeri){
            observer.receptionareMesaj(numeAgentie + ": " + mesaj);
        }
    }

    public void notificareOfertaNoua(){
        trimiteNotificare("A fosta adaugata o noua oferta. Consultati catalogul nostru!");
    }

    public void notificareReducerePret(){
        trimiteNotificare("Preturile au fost reduse. Consultati noul nostru catalog!");
    }
}
