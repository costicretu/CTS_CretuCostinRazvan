package strategy.clase;

public class PlataCardBancar implements ITipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de " + pretBilet + " a fost efectuata cu cardul bancar.");
    }
}
