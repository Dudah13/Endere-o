/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Dao.EnderecoDao;
import javax.swing.JOptionPane;
import modelo.Endereco;
import tela.manutencao.TelaManutencao;
/**
 *
 * @author Administrador
 */
public class ControladorEndereco {

  
    public static void inserir(TelaManutencao man){
        Endereco objeto = new Endereco();
        objeto.setLogradouro(man.jtfLogradouro.getText());
        objeto.setComplemento(man.jtfComplemento.getText());
         objeto.setBairro(man.jtfBairro.getText());
        boolean resultado = EnderecoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    
}
