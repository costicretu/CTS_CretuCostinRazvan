package factory_method;

public class Brancardier implements PersonalSpital {
    private String nume;

    Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul : " + this.nume);
    }
}
