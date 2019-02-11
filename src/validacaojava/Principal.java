
package validacaojava;

import javax.swing.JFrame;


public class Principal {
    public static void main(String[] args){
        JFrame janela = new JFrame("Carlos");
        Validacao painel = new Validacao();
        
        //Definir atributos de tela
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(600, 400);
        janela.add(painel);
        janela.setVisible(true);
        
        
       
   
        
    
    }
}
