package facade.clase;

public class Autobuz {
    private String numarInmatriculare;

    public Autobuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public void deschideUsaFata(){
        System.out.println("Usa din fata a fost deschisa pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void deschideUsaMijloc(){
        System.out.println("Usa din mijloc a fost deschisa pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void deschideUsaSpate(){
        System.out.println("Usa din spate a fost deschisa pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void ramaneLiberUsaFata(){
        System.out.println("Usa din fata poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void ramaneLiberUsaMijloc(){
        System.out.println("Usa din mijloc poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
    public void ramaneLiberUsaSpate(){
        System.out.println("Usa din spate poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.numarInmatriculare);
    }
}
