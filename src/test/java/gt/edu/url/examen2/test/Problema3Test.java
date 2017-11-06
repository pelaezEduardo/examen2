/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.test;
import gt.edu.url.examen2.problema3.LinkedPositionalList;
import gt.edu.url.examen2.problema3.Position;
import gt.edu.url.examen2.problema3.PositionalList;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 *
 * @author tuxtor
 */
public class Problema3Test {
    
    @Test
    public void testSwap(){
        PositionalList<Integer> pList = new LinkedPositionalList<>();
        
        Position<Integer> pivot1, pivot2;
        
        pivot1 = pList.addFirst(5);
        pivot1 = pList.addAfter(pivot1, 9);
        pivot2 = pList.addAfter(pivot1, 7);
        pivot2 = pList.addAfter(pivot2, 8);
        pivot2 = pList.addAfter(pivot2, 6);

        assertEquals(pivot1.getElement().intValue(), 9);
        pList.swap(pivot1, pivot2);
        assertEquals(pList.after(pList.first()).getElement().intValue(), 6);
        
    }
    
}
