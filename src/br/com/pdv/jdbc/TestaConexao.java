
package br.com.pdv.jdbc;
import javax.swing.JOptionPane;
/**
 *
 * @author zhu
 */
public class TestaConexao {
    
    public static void main(String[]args){
        
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro na conexão: " + erro);
        }
    }
}
