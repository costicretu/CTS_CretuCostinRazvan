package strategy.clase;

public class Calator {
    private String nume;
    private ITipPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCardCalatorii();
    }

    public ITipPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(ITipPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
    public void platesteBilet(double tarifBilet) {
        this.metodaPlata.plateste(tarifBilet);
    }
}
