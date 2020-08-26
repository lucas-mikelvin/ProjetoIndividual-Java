/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikelvin.projeto.individual;

import java.awt.Color;
import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author lucas pc
 */
public class ProjetoIndividual extends javax.swing.JFrame {

    /**
     * Creates new form TesteProva
     */
    public ProjetoIndividual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAcao = new javax.swing.JButton();
        pbPorcentagem1 = new javax.swing.JProgressBar();
        lbFrase1 = new javax.swing.JLabel();
        pbPorcentagem2 = new javax.swing.JProgressBar();
        lbFrase3 = new javax.swing.JLabel();
        pbPorcentagem3 = new javax.swing.JProgressBar();
        lbFrase2 = new javax.swing.JLabel();
        lbNome3 = new javax.swing.JLabel();
        lbNome4 = new javax.swing.JLabel();
        lbNome5 = new javax.swing.JLabel();
        lbMax1 = new javax.swing.JLabel();
        lbMax2 = new javax.swing.JLabel();
        lbMax3 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMin3 = new javax.swing.JLabel();
        lbMedia1 = new javax.swing.JLabel();
        lbMedia2 = new javax.swing.JLabel();
        lbMedia3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAcao.setBackground(new java.awt.Color(153, 153, 153));
        btAcao.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btAcao.setText("Análisar componentes");
        btAcao.setBorder(null);
        btAcao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcaoActionPerformed(evt);
            }
        });

        lbFrase1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N

        lbFrase3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N

        pbPorcentagem3.setBackground(new java.awt.Color(51, 51, 51));
        pbPorcentagem3.setForeground(new java.awt.Color(0, 0, 0));

        lbFrase2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N

        lbNome3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbNome3.setText("Memória");

        lbNome4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbNome4.setText("Disco");

        lbNome5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbNome5.setText("Processador");

        lbMax1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMax1.setForeground(new java.awt.Color(255, 0, 0));

        lbMax2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMax2.setForeground(new java.awt.Color(255, 0, 0));

        lbMax3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMax3.setForeground(new java.awt.Color(255, 0, 0));

        lbMin2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMin2.setForeground(new java.awt.Color(0, 100, 0));

        lbMin1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMin1.setForeground(new java.awt.Color(0, 100, 0));

        lbMin3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMin3.setForeground(new java.awt.Color(0, 100, 0));

        lbMedia1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMedia1.setForeground(new java.awt.Color(0, 100, 0));

        lbMedia2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMedia2.setForeground(new java.awt.Color(0, 100, 0));

        lbMedia3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbMedia3.setForeground(new java.awt.Color(0, 100, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pbPorcentagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pbPorcentagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNome5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbMedia2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNome3)
                                    .addGap(31, 31, 31)
                                    .addComponent(lbMax2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(lbMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNome4)
                                    .addGap(53, 53, 53)
                                    .addComponent(lbMax3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbMin3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(lbMedia3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pbPorcentagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFrase1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(lbFrase2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFrase3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMax1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMedia2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pbPorcentagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbFrase1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbNome3)
                                .addComponent(lbMax2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbMedia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pbPorcentagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFrase2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMax3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMin3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMedia3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFrase3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbPorcentagem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Vector  vAnalise1 = new Vector();
        Vector  vAnalise2 = new Vector();
        Vector  vAnalise3 = new Vector();
    private void btAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcaoActionPerformed
        
        Integer n1 = (int) (Math.random()*101);
        Integer n2 = (int) (Math.random()*101);
        Integer n3 = (int) (Math.random()*101);
        
        vAnalise1.add(n1);
        vAnalise2.add(n2);
        vAnalise3.add(n3);
        
        // setSize(largura,altura)
        pbPorcentagem1.setValue(n1); 
        pbPorcentagem2.setValue(n2); 
        pbPorcentagem3.setValue(n3); 
       
        lbFrase1.setText(String.format("%d %%", n1));
        lbFrase2.setText(String.format("%d %%", n2));
        lbFrase3.setText(String.format("%d %%", n3));
        
        lbMax1.setText(String.format("Max: %d %%", Collections.max(vAnalise1)));
        lbMax2.setText(String.format("Max: %d %%", Collections.max(vAnalise2)));
        lbMax3.setText(String.format("Max: %d %%", Collections.max(vAnalise3)));
        
        lbMin1.setText(String.format("Min: %d %%", Collections.min(vAnalise1)));
        lbMin2.setText(String.format("Min: %d %%", Collections.min(vAnalise2)));
        lbMin3.setText(String.format("Min: %d %%", Collections.min(vAnalise3)));
        
        if (n1 <= 60) {
            lbFrase1.setForeground(Color.decode("#006400"));
        }else if (n1 >60 && n1<=80) {
            lbFrase1.setForeground(Color.decode("#cc8400"));
        } else {
             lbFrase1.setForeground(Color.RED);
        }
        
        if (n2 <= 60) {
            lbFrase2.setForeground(Color.decode("#006400"));
        }else if (n2 >60 && n2<=80) {
            lbFrase2.setForeground(Color.decode("#cc8400"));
        } else {
             lbFrase2.setForeground(Color.RED);
        }
        
        if (n3 <= 60) {
            lbFrase3.setForeground(Color.decode("#006400"));
        }else if (n3 >60 && n3<=80) {
            lbFrase3.setForeground(Color.decode("#cc8400"));
        } else {
             lbFrase3.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcao;
    private javax.swing.JLabel lbFrase1;
    private javax.swing.JLabel lbFrase2;
    private javax.swing.JLabel lbFrase3;
    private javax.swing.JLabel lbMax1;
    private javax.swing.JLabel lbMax2;
    private javax.swing.JLabel lbMax3;
    private javax.swing.JLabel lbMedia1;
    private javax.swing.JLabel lbMedia2;
    private javax.swing.JLabel lbMedia3;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private javax.swing.JLabel lbMin3;
    private javax.swing.JLabel lbNome3;
    private javax.swing.JLabel lbNome4;
    private javax.swing.JLabel lbNome5;
    private javax.swing.JProgressBar pbPorcentagem1;
    private javax.swing.JProgressBar pbPorcentagem2;
    private javax.swing.JProgressBar pbPorcentagem3;
    // End of variables declaration//GEN-END:variables
}
