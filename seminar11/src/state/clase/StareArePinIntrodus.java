package state.clase;

public class StareArePinIntrodus implements IStare {
    @Override
    public void modificaStarea(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareAreCard) {
            bancomat.setStare(this);
            System.out.println("A fost introdus pinul!");
        } else {
            System.out.println("Introduceti PIN-ul corect!");
        }
    }
}
