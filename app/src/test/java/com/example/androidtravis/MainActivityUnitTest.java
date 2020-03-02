package com.example.androidtravis;

//This defines our class as a test class
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test ;
//This allows us to use assert statements to ensure that the parameters satisfy the condition to assert, else the test case failes
import static org.junit.Assert.* ;

public class MainActivityUnitTest {
    static MainActivity main = null ;

    @BeforeClass
    public static void setUp()
    {
        //sets up our environment so we can start testing. Similar to switching on the app before we start testing it

        //this main activity is the android class which is responsible for modifying our main screen when we enter the app
        main = new MainActivity() ;
    }

    @Test
    public void unitTestFunctionTest()
    {
        //we're testing whether the function in unitTestFunction, in main activity, does what's it's supposed to do. In this case, it should return 4
        assertEquals( 4, main.unitTestFunction());
    }

    @Test
    public void unitTestFunctionTestFail()
    {
        //a test we're meant to fail. There's nothing special about this test. I just want more tests and some of which should fail, is all.
        assertEquals( 7, main.unitTestFunction());
    }

    @AfterClass
    public static void tearDown()
    {
        //clean up our environment after testing. Similar to closing an app after testing whether it works
        main = null ;
    }
}
