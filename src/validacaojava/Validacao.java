/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaojava;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Validacao extends javax.swing.JPanel {

    /**
     * Creates new form Validacao
     */
    public Validacao() {
        initComponents();
        comboSexo.addItem("Masculino");
        comboSexo.addItem("Feminino");
        comboSexo.addItem("Outro");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        comboSexo = new javax.swing.JComboBox<>();
        labelTel1 = new javax.swing.JLabel();
        cpCpf = new javax.swing.JFormattedTextField();
        cpTel = new javax.swing.JFormattedTextField();

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Cadastro de Cliente");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNome.setText("Nome:");

        labelCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCpf.setText("CPF:");

        labelTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTel.setText("Telefone:");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });
        cpNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpNomeKeyPressed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        labelTel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTel1.setText("Sexo:");

        try {
            cpCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(labelTitulo)
                                .addGap(0, 200, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(cpNome)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cpCpf)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpTel)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cpNome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpTel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void cpNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpNomeKeyPressed
        System.out.println("Você está no campo de nome: " + cpNome.getText());
    }//GEN-LAST:event_cpNomeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validarCampos()) {
            JOptionPane.showMessageDialog(null, "Campos preenchidos Corretamente");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean validarCampos() {
        CPFValidator validator = new CPFValidator();

        try {
            // lógica de negócio ...
           

            String nome = cpNome.getText();
            String telefone = cpTel.getText();
            if (nome.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o seu nome");
                return false;
            }
            validator.assertValid(cpCpf.getText());     
            telefone = telefone.replaceAll(" ", "");
            telefone = telefone.replaceAll("-", "");
    
            if(telefone.trim().equals("") || telefone.trim().equals("()")){
                JOptionPane.showMessageDialog(null, "Informe o telefone");
                return false;
            }

            if (comboSexo.getSelectedItem().equals("Selecione")) {
                JOptionPane.showMessageDialog(null, "Por favor Selecione uma opção");
                return false;
            } else {
                return true;
            }

            // continuação da lógica de negócio ...
        } catch (InvalidStateException e) { // exception lançada quando o documento é inválido
            JOptionPane.showMessageDialog(null, "CPF inválido" + e.getInvalidMessages());
            return false;
        }

    }

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        setBackground(Color.red);
        JOptionPane.showMessageDialog(null, "Evento");
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JFormattedTextField cpCpf;
    private javax.swing.JTextField cpNome;
    private javax.swing.JFormattedTextField cpTel;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel labelTel1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
