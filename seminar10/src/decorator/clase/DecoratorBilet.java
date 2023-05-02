package decorator.clase;

public class DecoratorBilet extends Decorator{
    public DecoratorBilet(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printareMesajSustinere() {
        System.out.println("Sustinem echipa " + super.getBilet().getNumeEchipa1());
    }
}