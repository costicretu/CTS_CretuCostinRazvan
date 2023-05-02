package strategy.clase;

public class VerificareVip implements Strategy {

    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " este verificat doar pentru bilet pentru ca este VIP");
    }
}
