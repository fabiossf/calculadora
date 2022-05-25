
package calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RuinWith;
import org.junit.runners.Suite;
import org.junit.jupiter.runners.Suite.SuiteClasses;

import calculadora.TestCalculadora;

@RunWith(Suite.class)
@SuiteClasses({TestCalculadora.class})
public class TesteSuite {
    
    public static junit.framework.Test suite() {
        return new JUnit4testAdapter(TestSuite.class);
    }
    

}
