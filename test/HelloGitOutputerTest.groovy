import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*

/**
 *
 * @author kazuhito
 */
class HelloGitOutputerTest {

    HelloGitOutputer sut
    
    @Before
    public void setUp() {
        sut = HelloGitOutputer
    }
    @Test
    public void mainIsNagareru() {
        sut.gitOutputLogic()
    }
}
