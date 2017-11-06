package gt.edu.url.examen2.test;

import gt.edu.url.examen2.problema5.DynamicStack;
import gt.edu.url.examen2.problema5.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuxtor
 */
public class Problema5Test {
    
    public Problema5Test() {
    }

    @Test
    public void testPop(){
        Stack<Integer> leStack = new DynamicStack<>();
        
        leStack.push(5);
        leStack.push(6);
        leStack.push(7);
        leStack.push(8);
        leStack.pop();
        
        assertEquals(leStack.pop().intValue(), 7);
    }
    
    @Test
    public void testTop(){
        Stack<Integer> leStack = new DynamicStack<>();
        
        leStack.push(5);
        leStack.push(6);
        leStack.push(7);
        leStack.push(8);
        
        assertEquals(leStack.top().intValue(), 8);
    }
    
}
