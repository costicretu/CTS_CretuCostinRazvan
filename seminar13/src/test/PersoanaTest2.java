package test;

import persoana.IPersoana;
import persoana.Persoana;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest2 {

    @Test
    void testGetVarstaRight() {
        IPersoana persoana = new Persoana("Das", "5010913375674");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryNouNascut() {
        IPersoana persoana = new Persoana("Marcel", "5230523551122");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn2000() {
        IPersoana persoana = new Persoana("Ion", "6000101551122");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn1999() {
        IPersoana persoana = new Persoana("Maria", "1991231551122");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGetVarstaError() {
        IPersoana persoana = new Persoana("Costel", "6230724551122");
//        assertThrows(ExceptieVarsta.class, () -> persoana.getVarsta());
        assertThrows(IllegalArgumentException.class, () -> persoana.getVarsta());
    }

    @Test
    void testGetVarstaPerformance() {
        IPersoana persoana = new Persoana("Mugur", "5010424551122");
        assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @Test
    void testConstructorPersoanaConformance() {
        Persoana persoana = new Persoana("Test", "5010212667788");
        assertEquals(13, persoana.CNP.length());
    }

    @Test
    void testGetVarstaOrder() {
        IPersoana persoana1 = new Persoana("Gigi", "5010212778899");
        IPersoana persoana2 = new Persoana("Ion", "5020330778899");

        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    //Existance test
    @Test
    void testGetVarstaNoCNP() {
        IPersoana persoana = new Persoana(null, null);
//        assertThrows(ExceptieCNPInexistent.class, () -> persoana.getVarsta());
        assertThrows(RuntimeException.class, () -> persoana.getVarsta());
    }

    @Test
    void testGetVarstaCardinality() {
        IPersoana persoana = new Persoana("Bebe", "5220523778899");
        assertEquals(1, persoana.getVarsta());
    }


}