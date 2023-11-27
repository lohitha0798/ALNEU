import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lohitha Atluri
 */
public class MoveBackwardTest {
    
    public MoveBackwardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pressLeftPedal method, of class MoveBackward.
     */
    @Test
    public void testPressLeftPedal() {
        System.out.println("pressLeftPedal");
        int numOfTimesPressed = 0;
        MoveBackward instance = new MoveBackward(new Rover()); // Create an actual instance
        instance.pressLeftPedal(numOfTimesPressed);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pressRightPedal method, of class MoveBackward.
     */
    @Test
    public void testPressRightPedal() {
        System.out.println("pressRightPedal");
        int numOfTimesPressed = 0;
        MoveBackward instance = new MoveBackward(new Rover()); // Create an actual instance
        instance.pressRightPedal(numOfTimesPressed);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pressRightPedalForTime method, of class MoveBackward.
     */
    @Test
    public void testPressRightPedalForTime() {
        System.out.println("pressRightPedalForTime");
        int numOfSecondsPressed = 0;
        MoveBackward instance = new MoveBackward(new Rover()); // Create an actual instance
        instance.pressRightPedalForTime(numOfSecondsPressed);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pressLeftPedalForTime method, of class MoveBackward.
     */
    @Test
    public void testPressLeftPedalForTime() {
        System.out.println("pressLeftPedalForTime");
        int numOfSecondsPressed = 0;
        MoveBackward instance = new MoveBackward(new Rover()); // Create an actual instance
        instance.pressLeftPedalForTime(numOfSecondsPressed);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of voidPressLeftPedalForTime method, of class MoveBackward.
     */
    @Test
    public void testVoidPressLeftPedalForTime() {
        System.out.println("voidPressLeftPedalForTime");
        int numOfSecondsPressed = 0;
        MoveBackward instance = new MoveBackward(new Rover()); // Create an actual instance
        instance.voidPressLeftPedalForTime(numOfSecondsPressed);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
