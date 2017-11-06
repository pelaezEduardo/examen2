/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.test;

import gt.edu.url.examen2.problema2.ArrayList;
import gt.edu.url.examen2.problema2.DemoList;
import gt.edu.url.examen2.problema2.DemostracionLista;
import gt.edu.url.examen2.problema2.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tuxtor
 */
public class Problema2Test {
    
    DemoList demo = new DemostracionLista();
    public Problema2Test() {
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

    @Test
    public void testResult() {
        List<Integer> lista = demo.crearDemoLista();
        Integer number = null;
        
        
        assertEquals(new Integer(7).intValue(), lista.get(4).intValue());
        
        assertEquals(new Integer(8).intValue(), lista.get(0).intValue());
        
        assertEquals(new Integer(4).intValue(), lista.get(7).intValue());
        
    }
}
