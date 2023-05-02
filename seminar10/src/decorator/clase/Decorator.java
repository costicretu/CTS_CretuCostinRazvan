package decorator.clase;

public abstract class Decorator implements IBilet {

    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    public IBilet getBilet(){
        return bilet;
    }

    public String getNumeEchipa1(){
        return bilet.getNumeEchipa1();
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        printareMesajSustinere();
    }

    public abstract void printareMesajSustinere();
}