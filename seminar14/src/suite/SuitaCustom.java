package suite;


import org.junit.runners.Suite;
import teste.AplicaDiscountTest;
import teste.PachetTuristicTest;

@Suite.SuiteClasses({AplicaDiscountTest.class, PachetTuristicTest.class})
@IncludeTags({"tag1", "tag2"})
public class SuitaCustom {
}