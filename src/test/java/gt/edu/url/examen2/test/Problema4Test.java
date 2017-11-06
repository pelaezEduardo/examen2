/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.test;

import gt.edu.url.examen2.problema4.LinkedPositionalList;
import gt.edu.url.examen2.problema4.Position;
import gt.edu.url.examen2.problema4.PositionalList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuxtor
 */
public class Problema4Test {
    
    @Test
    public void testPosition(){
        PositionalList<Integer> pList = new LinkedPositionalList<>();
        
        Position<Integer> pivot1, pivot2;
        
        pivot1 = pList.addFirst(5);
        pivot1 = pList.addAfter(pivot1, 9);
        pivot1 = pList.addAfter(pivot1, 7);
        pivot1 = pList.addAfter(pivot1, 8);
        pivot1 = pList.addAfter(pivot1, 6);

        assertEquals(pList.positionAtIndex(3).getElement().intValue(), 8);
    }
    
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBounds(){
        PositionalList<Integer> pList = new LinkedPositionalList<>();
        
        Position<Integer> pivot1, pivot2;
        
        pivot1 = pList.addFirst(5);
        pivot1 = pList.addAfter(pivot1, 9);
        pivot1 = pList.addAfter(pivot1, 7);
        pivot1 = pList.addAfter(pivot1, 8);
        pivot1 = pList.addAfter(pivot1, 6);
        
        System.out.println(
            pList.positionAtIndex(-1).getElement()
        );
    }
}
