package command.clase;

public class CommandPlecareCursa implements ICommand {
    private int numarLinie;
    private IAutomobil automobil;

    public CommandPlecareCursa(int numarLinie, IAutomobil automobil) {
        this.numarLinie = numarLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.plecareInCursa(numarLinie);
    }
}
