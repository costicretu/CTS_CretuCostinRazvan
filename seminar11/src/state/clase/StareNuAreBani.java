package state.clase;

public class StareNuAreBani implements IStare {
    @Override
    public void modificaStarea(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareArePinIntrodus) {
            bancomat.setStare(this);
            System.out.println("Bancomatul nu are bani iar cardul a fost scos!");
        }
    }
}
