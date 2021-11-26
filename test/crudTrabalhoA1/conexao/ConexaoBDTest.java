/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudTrabalhoA1.conexao;

import crudTrabalhoA1.modelo.Funcionario;
import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kassi
 */
public class ConexaoBDTest {
   
    
    public ConexaoBDTest() {
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

   

    /**
     * Test of Delete method, of class ConexaoBD.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        int Codigo_Funcionario = 2;
        int expResult = 0;
        int result = ConexaoBD.Delete(Codigo_Funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /**
     * Test of getFuncionario method, of class ConexaoBD.
     */
    @Test
    public void testGetFuncionario() {
        System.out.println("getFuncionario");
        int Codigo_Funcionario = 0;
        Funcionario expResult = null;
        Funcionario result = ConexaoBD.getFuncionario(Codigo_Funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
