package teste;


import dubluri.FakePersoana;
import models.PachetTuristic;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Tag("tag2")
    @Test
    void poatePrimiDiscount() {
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Baile Herculane", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(800, pachetTuristic.getPret());
    }

    @Tag("tag1")
    @Test
    void nuPoatePrimiDiscount() {
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(60);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Baile Herculane", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(800, pachetTuristic.getPret());
    }
}