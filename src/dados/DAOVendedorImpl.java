
package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.basica.Vendedor;
import negocio.exception.ConexaoException;
import negocio.exception.DAOException;
import util.GerenciadorConexao;
import util.GerenciadorConexaoImpl;

/**
 *
 * @author Gildo
 */
public class DAOVendedorImpl implements DAOVendedor{
    private GerenciadorConexao gc;
    
    public DAOVendedorImpl(){
       gc = GerenciadorConexaoImpl.getInstancia();
    }
    
    @Override
    public void inserir(Vendedor vendedor) throws DAOException, ConexaoException{
        Connection c = gc.conectar();
        String sql = "INSERT INTO VENDEDOR (VEND_NOME) VALUES (?)";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, vendedor.getVendedorNome());
            pstm.executeUpdate();
        }catch(SQLException e){
            throw new DAOException(e);
        }finally{
            gc.desconectar(c);
        } 
    }

    @Override
    public Vendedor consultar(String nome) throws DAOException, ConexaoException{
        Vendedor vendedor = null;
        GerenciadorConexao ger = GerenciadorConexaoImpl.getInstancia();
        String sql = "SELECT Vend_Nome, Vend_Cod FROM Vendedor WHERE nome=1";
        try{
        PreparedStatement pstm = ger.conectar().prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
          vendedor = new Vendedor();
          vendedor.setVendedorNome(rs.getString("nome") );
          vendedor.setVendedorCodigo(rs.getInt("cod"));
        }
    }catch(SQLException e){
         throw new DAOException();
    }
        return vendedor;  
    }
    
}
