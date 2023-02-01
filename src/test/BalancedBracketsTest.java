package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    //Test1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test2
    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Test3
    @Test
    public void stringMayContainNonBracketCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));

    }
    //Test4
    @Test
    public void bracketsBeforeStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));


    }
    //Test5
    @Test
    public void bracketsAfterStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));

    }
    //Test6
    @Test
    public void bracketsWithinStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));

    }
    //Test7
    @Test
    public void openFacedBracketsBeforeString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));

    }
    //Test8
    @Test
    public void openFacedBracketsAfterString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));

    }
    //Test9
    @Test
    public void multipleBracketsWithNoString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    //Test10
    @Test
    public void multipleBracketsBeforeString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]LaunchCode"));}


    //Test11
    @Test
    public void multipleBracketsAfterString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[][]"));
    }

    //Test12
    @Test
    public void multipleBracketsWithinString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[][]Code"));
    }



}
