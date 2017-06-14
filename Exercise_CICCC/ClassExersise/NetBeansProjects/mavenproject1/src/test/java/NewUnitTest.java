/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.mavenproject1.StringHelper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NewUnitTest {
    StringHelper helper1 ;
    
    public NewUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
           helper1 = new StringHelper();
           System.out.println("before every test");
    }
    
    @After
    public void tearDown() {
        System.out.println("----------After every test--------");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void StringhelperTest_1() {
         //AACD-->CD ACD->CD CDAA->CDAA
       
         assertEquals("CD", helper1.truncateAInFirst2Positions("AACD")); 
        //Expected value (CD) , Actual Value (AACD)
        //Expected value (CD) , Actual Value (ACD)
     }
     @Test
     public void StringhelperTest_2() {
         
         assertEquals("CD",  helper1.truncateAInFirst2Positions("ACD"));
     }
      @Test
     public void StringhelperTest_3() {
         
         assertEquals("CDAA",  helper1.truncateAInFirst2Positions("CDAA"));
     }
}