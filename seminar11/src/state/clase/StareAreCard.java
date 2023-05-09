package state.clase;

public class StareAreCard implements IStare {
    @Override
    public void modificaStarea(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareNuAreCard) {
            bancomat.setStare(this);
            System.out.println("A fost introdus un card in bancomat!");
        } else {
            System.out.println("Bancomatul are deja un card introdus!");
        }
    }
}
