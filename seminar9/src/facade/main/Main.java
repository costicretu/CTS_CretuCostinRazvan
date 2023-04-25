package facade.main;

import facade.clase.Autobuz;
import facade.clase.AutobuzSimplificat;

public class Main {
    public static void main(String[] args) {
//        Autobuz autobuz = new Autobuz("B111STB");
//        autobuz.deschideUsaFata();
//        autobuz.deschideUsaMijloc();
//        autobuz.deschideUsaSpate();

        AutobuzSimplificat autobuzSimplificat = new AutobuzSimplificat("B111STB");
        autobuzSimplificat.ramaneLiber();
        autobuzSimplificat.deschideUsi();
    }
}
