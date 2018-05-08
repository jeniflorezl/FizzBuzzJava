
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import principal.Numero;

// Test FizzBuzz
public class FizzBuzzTest {
   
    Numero numero;
    
    //Instancia de la clase Numero
    @Before
    public void instanciaBefore(){
        numero = new Numero();
    }
    
    /*
    * Prueba con 3 numeros que deben cumplir con la condición
    * de ser multiplos de 3
    */
    @Test
    public void testMultiploTres(){
        boolean resultado = numero.multiploDeTres(3);
        assertTrue(resultado);
        resultado = numero.multiploDeTres(6);
        assertTrue(resultado);
        resultado = numero.multiploDeTres(9);
        assertTrue(resultado);
    }
    
    /*
    * Prueba con 3 numeros que deben cumplir con la condición
    * de ser multiplos de 5
    */
    @Test
    public void testMultiploCino(){
        boolean resultado = numero.multiploDeCinco(5);
        assertTrue(resultado);
        resultado = numero.multiploDeCinco(10);
        assertTrue(resultado);
        resultado = numero.multiploDeCinco(15);
        assertTrue(resultado);
    }
    
     /*
    * Prueba con 3 numeros que deben cumplir con la condición
    * de no ser multiplos de 3 ni de 5
    */
    @Test
    public void testMultiploAmbos(){
        boolean resultado = numero.esMultiploAmbos(15);
        assertTrue(resultado);
        resultado = numero.esMultiploAmbos(30);
        assertTrue(resultado);
        resultado = numero.esMultiploAmbos(45);
        assertTrue(resultado);
    }
}
