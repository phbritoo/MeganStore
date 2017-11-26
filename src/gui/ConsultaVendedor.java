/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.basica.Vendedor;
import negocio.exception.ConexaoException;
import negocio.exception.DAOException;
import negocio.exception.VendedorException;
import negocio.fachada.FachadaVendedor;

/**
 *
 * @author Djalma
 */
public final class ConsultaVendedor extends javax.swing.JFrame {

    /**
     * iniciar a tela com todos os vendedores listados
     */
    public ConsultaVendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        FachadaVendedor f = new FachadaVendedor();
        try {
            readJTable();
        }catch (VendedorException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendedor = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Vendedor");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Consulta Vendedor");

        jLabel2.setText("Nome:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tblVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        tblVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendedorMouseClicked(evt);
            }
        });
        tblVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblVendedorKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblVendedor);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnPesquisar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnSair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Capturar os dados:
        Vendedor vendedor = new Vendedor();
        vendedor.setVendedorNome(txtNome.getText());
        
        FachadaVendedor f = new FachadaVendedor();
        try {
            ArrayList<Vendedor> listarVendedor;
            if (vendedor.getVendedorNome().isEmpty()){
                listarVendedor = f.listarTodos();
            } else {
                listarVendedor = f.listarPorNome(vendedor.getVendedorNome());
                txtNome.setText("");
            }
                readJTable(listarVendedor);
            JOptionPane.showMessageDialog(this, "Pesquisa realizada com sucesso" );
        }catch (VendedorException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }       
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        try {
            if (tblVendedor.getSelectedRow() != -1) {
                Vendedor vendedor = new Vendedor();
                FachadaVendedor f = new FachadaVendedor();
                
                vendedor.setVendedorCodigo((int) tblVendedor.getValueAt(tblVendedor.getSelectedRow(), 0));
                f.excluir(vendedor);
                readJTable();
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                txtNome.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um vendedor para excluir");
            }
        }catch (VendedorException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if (tblVendedor.getSelectedRow() != -1) {
                Vendedor vendedor = new Vendedor();
                FachadaVendedor f = new FachadaVendedor();
                vendedor.setVendedorNome(txtNome.getText());
                
                vendedor.setVendedorCodigo((int) tblVendedor.getValueAt(tblVendedor.getSelectedRow(), 0));
                f.alterar(vendedor);
                readJTable();
                txtNome.setText("");
                JOptionPane.showMessageDialog(this, "Alteração realizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um vendedor para alterar");
                }    
            } catch (VendedorException ex) {
                 JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (ConexaoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (DAOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblVendedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVendedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVendedorKeyReleased

    private void tblVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendedorMouseClicked
        // Preencher txtNome com o dado selecionado na tabela
        if (tblVendedor.getSelectedRow() != -1) {
            txtNome.setText(tblVendedor.getValueAt(tblVendedor.getSelectedRow(), 1).toString());
        }
        
    }//GEN-LAST:event_tblVendedorMouseClicked

    /**
     *
     * @param listaVendedor
     */
    public void readJTable(ArrayList<Vendedor> listaVendedor) {
        
        DefaultTableModel modelo = (DefaultTableModel) tblVendedor.getModel();
        modelo.setNumRows(0);
        
        for (Vendedor vendedor : listaVendedor) {

            modelo.addRow(new Object[]{
                vendedor.getVendedorCodigo(),
                vendedor.getVendedorNome()
            });
        }
    }
    
    public void readJTable() throws VendedorException, ConexaoException, DAOException {
        DefaultTableModel modelo = (DefaultTableModel) tblVendedor.getModel();
        modelo.setNumRows(0);
        
        FachadaVendedor f = new FachadaVendedor();
        
        ArrayList<Vendedor> listaVendedor;
            listaVendedor = f.listarTodos();
        for (Vendedor vendedor : listaVendedor) {

            modelo.addRow(new Object[]{
                vendedor.getVendedorCodigo(),
                vendedor.getVendedorNome()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVendedor().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVendedor;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
