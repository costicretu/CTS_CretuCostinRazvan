package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, double totalNota) {
        restaurant.printeazaNota(totalNota);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Alcadibo");
//        bar.printeazaNotaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("George");
//        bucatarie.printeazaNota(300);

//        Main.imprimare(bar, 300);
        Main.imprimare(bucatarie, 500);

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
        Main.imprimare(adapter, 450);

        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecte, 150);
    }
}
