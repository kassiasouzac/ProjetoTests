/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudTrabalhoA1.modelo;

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
public class FuncionarioTest {
   
    
    public FuncionarioTest() {
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
	public void criarFuncionario() {
		Funcionario instance = new Funcionario();
		assertNotNull(instance);
	}
        
    @Test
	public void validarCPF() {
		Funcionario instance = new Funcionario();
		assertEquals(true, instance.validaCPF());
	}
        
    @Test
	public void validarPIS() {
		Funcionario instance = new Funcionario();
		assertEquals(true, instance.validaPIS());
	}   
    @Test
	public void validarCTPS() {
		Funcionario instance = new Funcionario();
		assertEquals(true, instance.validaCTPS());
	}      
  
    /**
     * Test of setCodigo_Funcionario method, of class Funcionario.
     */
    @Test
    public void testSetCodigo_Funcionario() {
        System.out.println("setCodigo_Funcionario");
        Integer Codigo_Funcionario = 2;
        Funcionario instance = new Funcionario();
        instance.setCodigo_Funcionario(Codigo_Funcionario);
        
       
    }

    /**
     * Test of setNome_Completo method, of class Funcionario.
     */
    @Test
    public void testSetNome_Completo() {
        System.out.println("setNome_Completo");
        String Nome_Completo = "Fulano de Tal";
        Funcionario instance = new Funcionario();
        instance.setNome_Completo(Nome_Completo);
         
    }

    /**
     * Test of setNumero_RG method, of class Funcionario.
     */
    @Test
    public void testSetNumero_RG() {
        System.out.println("setNumero_RG");
        String Numero_RG = "166589";
        Funcionario instance = new Funcionario();
        instance.setNumero_RG(Numero_RG);
        
       
    }

    /**
     * Test of setOrgao_Emissor method, of class Funcionario.
     */
    @Test
    public void testSetOrgao_Emissor() {
        System.out.println("setOrgao_Emissor");
        String Orgao_Emissor = "SSP";
        Funcionario instance = new Funcionario();
        instance.setOrgao_Emissor(Orgao_Emissor);
        
        
    }

    /**
     * Test of setNumero_CPF method, of class Funcionario.
     */
    @Test
    public void testSetNumero_CPF() {
        System.out.println("setNumero_CPF");
        String Numero_CPF = "00000000000";
        Funcionario instance = new Funcionario();
        instance.setNumero_CPF(Numero_CPF);
        
        
    }

    /**
     * Test of setEndereco method, of class Funcionario.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String Endereco = "Rua dos Bobos";
        Funcionario instance = new Funcionario();
        instance.setEndereco(Endereco);
      
        
    }

    
    
}
