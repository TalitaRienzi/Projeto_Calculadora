
package treinamento.calculadora;


public class ProjetoCalculadora extends javax.swing.JFrame {

    
    public ProjetoCalculadora() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        corFundo = new javax.swing.JPanel();
        txtCalculadora = new javax.swing.JLabel();
        imgCalculadora = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        corFundo.setBackground(new java.awt.Color(255, 204, 204));
        corFundo.setForeground(new java.awt.Color(0, 0, 0));
        corFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        corFundo.setLayout(null);

        txtCalculadora.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        txtCalculadora.setForeground(new java.awt.Color(0, 0, 0));
        txtCalculadora.setText("Calculadora");
        corFundo.add(txtCalculadora);
        txtCalculadora.setBounds(140, 180, 220, 66);

        imgCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/treinamento/calculadora/Imagens/9d8c875f2947ffab637d56d5748e86d2.png"))); // NOI18N
        imgCalculadora.setText("jLabel2");
        corFundo.add(imgCalculadora);
        imgCalculadora.setBounds(160, 30, 200, 150);

        btnIniciar.setBackground(new java.awt.Color(255, 204, 204));
        btnIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciar.setText("INICIAR");
        btnIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        corFundo.add(btnIniciar);
        btnIniciar.setBounds(200, 260, 100, 40);

        getContentPane().add(corFundo);
        corFundo.setBounds(0, 0, 500, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal ();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjetoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel corFundo;
    private javax.swing.JLabel imgCalculadora;
    private javax.swing.JLabel txtCalculadora;
    // End of variables declaration//GEN-END:variables
}
