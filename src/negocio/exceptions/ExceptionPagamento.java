/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.exceptions;

/**
 *
 * @author aluno
 */
public class ExceptionPagamento extends Exception {

    public ExceptionPagamento(String texto) {
        super(texto);
    }
    
    public ExceptionPagamento(){
    }
    
}