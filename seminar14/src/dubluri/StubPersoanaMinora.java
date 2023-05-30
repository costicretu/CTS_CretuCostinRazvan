package dubluri;

import models.IPersoana;

public class StubPersoanaMinora implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 15;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}