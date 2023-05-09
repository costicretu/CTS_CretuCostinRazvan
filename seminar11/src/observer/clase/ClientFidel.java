package observer.clase;

public class ClientFidel implements Observer {
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(numeClient + " ai primit mesajul " + mesaj);
    }
}
