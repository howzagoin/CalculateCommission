import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//JUnit will invoke the class which is annotated to run the tests.
@RunWith(Suite.class)
//Suite class holds the classes to run (CalculateCommissionTest and UserInputTest)
@Suite.SuiteClasses({
   CalculateCommissionTest.class,
   UserInputTest.class
})
public class TestSuite {   
}  	