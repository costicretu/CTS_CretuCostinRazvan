package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant =  new Restaurant("Hush");
        restaurant.rezervaMasa(3);
        System.out.println();

        IRestaurant proxy = new ProxyRestaurant(restaurant);
        proxy.rezervaMasa(2);
        System.out.println();
        proxy.rezervaMasa(5);
    }
}
