package com.sistemabancario.model;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {
private  Movimentacao instancia;
    
    @Before
    public void setUp(){
       
        instancia = new Movimentacao();
        instancia.setValor(10);
        System.out.println("Instanciado Movimentação");
         
    }

    @Test
    public void instanciaComoConfirmada(){
        assertFalse(instancia.isConfirmada());
    }
    
    
    @Test
    public void setTipoCredito(){
        final char esperado ='c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
    
    
    @Test
    public void setTipoInvalido(){
        final char invalido ='x';
        try{
            instancia.setTipo(invalido);
        }catch(IllegalArgumentException e){
             final char obtido = instancia.getTipo();
            assertNotEquals(invalido, obtido);
        }
        
       
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExcecao(){
        final char invalido ='x';
        instancia.setTipo(invalido);
        
    }
    
    @Test
    public void setTipoCreditoMaisculo(){
        final char esperado ='C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
        instancia.setConfirmada(true);
    }
    @Test
    public void setTipoCreditoMinisculo(){
        final char esperado ='c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void getTipoPadraoC(){
        final char esperado ='c';
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
}