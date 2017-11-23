/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import negocio.basica.Vendedor;
import negocio.exception.ConexaoException;
import negocio.exception.DAOException;

/**
 *
 * @author Gildo
 */
public interface DAOVendedor {
    
    /**
     * Salva os dados no BD
     * @param vendedor objeto com o nome do vendedor
     */
    public void inserir(Vendedor vendedor) throws DAOException, ConexaoException;
    
    /**
     * Busca no BD um registro correspondente ao nome passado
     * @param nome
     * @return nome do vendedor
     */
    public Vendedor consultar(String nome) throws DAOException, ConexaoException;
    
}
