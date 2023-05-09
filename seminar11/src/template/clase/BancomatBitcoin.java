package template.clase;

public class BancomatBitcoin extends BancomatAbstract {
    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul Bitcoin in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pinul pt cardul bitcoin in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int suma) {
        System.out.println("A fost specificata suma de criptomoneda pt retragere " + suma);
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma de criptomoneda solicitata din bancomatul din " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul Bitcoin din bancomatul din " + super.getAdresa());
    }
}
