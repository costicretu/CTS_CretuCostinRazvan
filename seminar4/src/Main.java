import classes.Administrator;
import classes.Soare;
import singletonregistry.DomeniuInternet;

public class Main {
    public static void main(String[] args) {
        Administrator administrator1 = Administrator.getInstance();
        Administrator administrator2 = Administrator.getInstance();
        System.out.println(administrator1.toString());
        System.out.println(administrator2.toString());

        Soare soare1 = Soare.getInstance("galben", 1000);
        Soare soare2 = Soare.getInstance("portocaliu", 2000);
        System.out.println(soare1.toString());
        System.out.println(soare2.toString());
    }
}
