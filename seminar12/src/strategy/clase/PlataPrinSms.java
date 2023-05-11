package strategy.clase;

public class PlataPrinSms implements ITipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de " + pretBilet + " a fost efectuata prin SMS.");
    }
}
