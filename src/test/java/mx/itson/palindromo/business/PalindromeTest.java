/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.palindromo.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author eveli
 */
public class PalindromeTest {
    
    public PalindromeTest() {
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

    /**
     * Test of isPalindrome method, of class Palindrome.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String phrase = "La ruta natural";
        boolean expResult = true;
        boolean result = Palindrome.isPalindrome(phrase);
        assertEquals(expResult, result);
        
    }
    
}
