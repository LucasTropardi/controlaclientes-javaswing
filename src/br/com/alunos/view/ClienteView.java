/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.alunos.view;

/**
 *
 * @author lucas
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    public ClienteView() {
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

        jPanel1 = new javax.swing.JPanel();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnSairCliente = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel1.setLayout(null);

        btnAlterarCliente.setText("Alterar");
        jPanel1.add(btnAlterarCliente);
        btnAlterarCliente.setBounds(20, 80, 67, 25);

        btnExcluirCliente.setText("Excluir");
        jPanel1.add(btnExcluirCliente);
        btnExcluirCliente.setBounds(20, 120, 66, 25);

        btnSairCliente.setText("Sair");
        jPanel1.add(btnSairCliente);
        btnSairCliente.setBounds(20, 160, 66, 25);

        btnNovoCliente.setText("Novo");
        jPanel1.add(btnNovoCliente);
        btnNovoCliente.setBounds(20, 30, 67, 25);

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(165, 19, 27, 15);
        jPanel1.add(txtNome);
        txtNome.setBounds(204, 17, 421, 19);

        jLabel2.setText("CPF");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(173, 50, 19, 15);

        jLabel3.setText("Sexo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(167, 93, 25, 15);

        jLabel4.setText("Nascimento");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 130, 56, 15);

        jLabel5.setText("Endereço");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 170, 46, 15);

        jLabel6.setText("Telefone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 200, 42, 15);
        jPanel1.add(txtFone);
        txtFone.setBounds(210, 200, 421, 19);
        jPanel1.add(txtCpf);
        txtCpf.setBounds(205, 48, 420, 19);
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(210, 170, 421, 19);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(211, 130, 420, 19);

        rbMasculino.setText("Masculino");

        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFeminino)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(210, 80, 242, 41);

        jButton1.setText("Cancelar");
        jPanel1.add(jButton1);
        jButton1.setBounds(656, 102, 77, 25);

        jButton2.setText("Salvar");
        jPanel1.add(jButton2);
        jButton2.setBounds(656, 17, 77, 25);

        jButton3.setText("Atualizar");
        jPanel1.add(jButton3);
        jButton3.setBounds(656, 59, 77, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 750, 250);

        tablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Sexo", "Nascimento", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tablePesquisa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 750, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSairCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tablePesquisa;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
