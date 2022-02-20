/**********************************************************************
@File PilaTest.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Programa que servira para probar el funcionamiento de la clase Pila.
**********************************************************************/

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testEvaluate() {
        System.out.println("Evaluate");
        String expresion = "";
        Pila pila = new Pila();
        int expResult = 14;
        int result = pila.Evaluate("1 1 + 5 + 8 + 1 +");
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}

