package teste;

import categorii.Categorie1;
import dubluri.StubPersoana;
import dubluri.StubPersoanaMinora;
import models.IPersoana;
import models.PachetTuristic;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicTest {

    @Tag("tag1")
    @Test
    void poateRezervaraPachet() {
        StubPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Dubai", 1500.0);
        assertTrue(pachet.poateRezerva());
    }

    @Category(Categorie1.class)
    @Test
    void nuPoateRezervaPachet() {
        IPersoana persoana = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti", 50.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
}