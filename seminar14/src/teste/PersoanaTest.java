package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import models.IPersoana;
import models.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import persoana.ExceptieCNPInexistent;
import persoana.ExceptieVarsta;

public class PersoanaTest {

    @Test
    public void testGetVarstaRight() {
        IPersoana persoana= new Persoana("mafia","5011017297545");
        assertEquals(21, persoana.getVarsta());
    }
    @Test
    public void testGetVarstaBoundaryNouNascut() {
        IPersoana persoana=new Persoana("Marcel","5230523129494");
        assertEquals(0,persoana.getVarsta());
    }
    @Test
    public void testGetVarstaBoundaryAn2000() {
        IPersoana persoana=new Persoana("Marcel","6000101125156");
        assertEquals(23, persoana.getVarsta());
    }
    @Test
    public void testGetVarstaBoundaryAn1999() {
        IPersoana persoana=new Persoana("Mafia2","1991231324952");
        assertEquals(23,persoana.getVarsta());
    }
    @Test
    public void testGetVarstaError() {
        IPersoana persoana=new Persoana("Mafia2","6230731324952");
        assertThrows(ExceptieVarsta.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }
    @Test
    public void testGetVarstaPerformance() {
        IPersoana persoana=new Persoana("Mafia2","1991231324952");
        assertTimeout(Duration.ofMillis(100), ()->persoana.getVarsta());
    }

    @Test
    public void testConstructorPersoanaConformance() {
        Persoana persoana=new Persoana("Mafia2","5001231188512");
        assertEquals(13,persoana.CNP.length());
    }
    @Test
    public void testGetVarstaOrder() {
        IPersoana persoana=new Persoana("Mafia2","5001230188512");
        IPersoana persoana2=new Persoana("Mafia2","5011231188512");
        assertTrue(persoana.getVarsta()>persoana2.getVarsta());
    }

    @Test
    void testGetVarstaNoCNP() {
        IPersoana persoana=new Persoana(null,null);
        assertThrows(ExceptieCNPInexistent.class,()->persoana.getVarsta());
    }
    @Test
    public void testGetVarstaCardinality() {
        IPersoana pers=new Persoana("cineva","5220523162847");
        assertEquals(1,pers.getVarsta());
    }
}