package simple_factory;

public class Anestezist implements PersonalSpital {
    private String nume;
    private int nrPacienti;

    protected Anestezist(String nume, int nrPacienti) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public void descriere() {
        System.out.println("Anestezistul " + this.nume + " a anesteziat " + this.nrPacienti);
    }
}
