package formula;
import DB.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {
        static Connection conn;
        static Statement st;
        static PreparedStatement ps;
        static String sql;
        static ResultSet rs;
    
    public signup() {
        initComponents();
        setLocationRelativeTo(null);
        conn = new DatabaseConnection().setConnection();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        tx_pass = new javax.swing.JPasswordField();
        tx_valid = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 70, 54, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 100, 51, 20);
        jPanel1.add(tx_username);
        tx_username.setBounds(280, 70, 180, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SIGN UP ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 20, 75, 22);

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save);
        btn_save.setBounds(250, 180, 70, 25);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Re Enter Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 140, 108, 16);

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(400, 180, 70, 25);
        jPanel1.add(tx_pass);
        tx_pass.setBounds(280, 100, 180, 22);
        jPanel1.add(tx_valid);
        tx_valid.setBounds(280, 140, 180, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\formula\\src\\gambar\\valtteri.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -50, 710, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if(tx_pass.getText().isEmpty() || tx_username.getText().isEmpty() || tx_valid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill adll the data");
        }else{
        String val = tx_pass.getText();
        if(tx_valid.getText().equals(val)){
        try{
            sql = "INSERT INTO tbl_admin(username, password, role) VALUES (?, ?, ? ) ";
            ps =conn.prepareStatement(sql);
            ps.setString(1, tx_username.getText());
            ps.setString(2, tx_pass.getText());
            ps.setString(3, "admin");
            int rt = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Succes");
            new formulaonelogen().setVisible(true);
        dispose();
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(this, "The re entered password is not match ");
            tx_valid.setText("");
        }
        }
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        new formulaonelogen().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tx_pass;
    private javax.swing.JTextField tx_username;
    private javax.swing.JPasswordField tx_valid;
    // End of variables declaration//GEN-END:variables
}
