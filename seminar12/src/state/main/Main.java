package state.main;

import state.clase.Bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("VL21BUN");
        bus.goInService();
        bus.arriveAtTheEndOfTheRoute();
        bus.arriveAtTheEndOfTheRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtTheEndOfTheRoute();
    }
}
