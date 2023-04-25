package facade.clase;

public class AutobuzSimplificat {
    Autobuz autobuz;

    public AutobuzSimplificat(String numarInmatriculare) {
        this.autobuz = new Autobuz(numarInmatriculare);
    }

    public void deschideUsi(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void ramaneLiber(){
        autobuz.ramaneLiberUsaFata();
        autobuz.ramaneLiberUsaMijloc();
        autobuz.ramaneLiberUsaSpate();
    }
}
