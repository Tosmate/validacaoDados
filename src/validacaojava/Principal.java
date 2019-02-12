
package validacaojava;

import javax.swing.JFrame;


public class Principal {
    public static void main(String[] args){
        JFrame janela = new JFrame("Carlos");
        Painell painel = new Painell();
        
        //Definir atributos de tela
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(800, 600);
        janela.add(painel);
        janela.setVisible(true);
        
        
       
   
        
    
    }
}
