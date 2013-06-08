package javaapplication1

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
    void setUp() {
        sut = HelloGitOutputer
    }
    
    @Test
    void mainIsNagareru() {
        assert sut != null
        sut.gitOutputLogic()
        println 'test miura'
    }
    
    @Test
    void testPrintB() {
        // act 
        sut.printlnB "one"
        sut.printlnB "two"
        // assert
        assert sut.buff.length()
        assert sut.buff[0] == 'one'
        assert sut.buff[0] == 'two'
    }
}
