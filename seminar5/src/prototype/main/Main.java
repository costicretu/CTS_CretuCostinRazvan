package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("PH01CTS", 20);
        MijlocTransport autobuz1 = new Autobuz("B999BIG", 40);
        Autobuz autobuz2 = (Autobuz) autobuz1.clone();
        Autobuz autobuz3 = (Autobuz) autobuz1.clone();
        autobuz2.setNrInmatriculare("B666PAC");
        autobuz3.setNrInmatriculare("B001ICE");

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
        System.out.println(autobuz3.toString());
    }
}
