package formula;
import DB.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;


public class formulaonelogen extends javax.swing.JFrame {
        static Connection conn;
        static Statement st;
        static PreparedStatement ps;
        static String sql;
        static ResultSet rs;
        
    public formulaonelogen() {
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
        logen = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 50, 61, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 90, 58, 17);
        jPanel1.add(logen);
        logen.setBounds(340, 50, 173, 22);
        jPanel1.add(pw);
        pw.setBounds(340, 90, 173, 22);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 130, 67, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 90, 160, 29);

        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(430, 130, 79, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\formula\\src\\gambar\\haas.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-6, -13, 820, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        signup obj = new signup();
        obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(formulaonelogen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulaonelogen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulaonelogen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulaonelogen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulaonelogen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logen;
    private javax.swing.JPasswordField pw;
    // End of variables declaration//GEN-END:variables

//    String Username = logen.getText();
//        String Password = pw.getText();
//        if(Username.isEmpty() || Password.isEmpty()){
//            JOptionPane.showMessageDialog(this, "Masih Kosong");
//        }
//        try {
//            sql = "SELECT * FROM tbl_admin WHERE username='"+Username+"' AND "
//                    + "password='"+Password+"' AND role='admin'" ;
//            st = conn.createStatement();
//            rs = st.executeQuery(sql);
//            
//            if(rs.next()){
//            if (Username.equals(rs.getString(2)) && Password.equals(rs.getString(3)) ){
//                JOptionPane.showMessageDialog(this, "Login Berhasil");
//                new menu().setVisible(true);
//                dispose();
//            }else{
//                JOptionPane.showMessageDialog(this, "tidak berhasil");  
//        }
//            }
//        } catch (Exception e) {
//        }
    
public void login(){
        String u,p;
        u = logen.getText();
        p = pw.getText();
        if(u.isEmpty() || p.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill The Username And Password");
        }else{
        try{
        conn = new DatabaseConnection().setConnection();
        sql = "SELECT * FROM tbl_admin WHERE username = '"+u+"' AND password = '"+p+"'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
                if(rs.next())
                {
                    if(u.equals(rs.getString(2)) && p.equals(rs.getString(3)) ){
                    JOptionPane.showMessageDialog(null, "Welcome ");
                    new menu().setVisible(true);
                    this.dispose();
                }else
                    {
                    JOptionPane.showMessageDialog(null, "Wrong username or password!");
                    }
                }
            if(rs!=null)
            {
                JOptionPane.showMessageDialog(this, "hello");
            }else{
                JOptionPane.showMessageDialog(this, "gda");
            }
        }
         
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
        
//        conn = new DatabaseConnection().setConnection();
//        try {
//            sql = "SELECT * FROM tbl_admin";
//            st = conn.createStatement();
//            rs = st.executeQuery(sql);
//            
//            if(rs.next()){
//            if(u.equals(rs.getString(2))&&p.equals(rs.getString(3))){
//                    this.setVisible(false);
//                    new menu().setVisible(true);
//                    this.dispose();
//            }
//                }else{
//                    JOptionPane.showMessageDialog(this, "Username or Password is invalid");
//                }
//            
//        } catch (Exception e) {
//            System.out.println("Error"+e.getMessage());
//        }
        
    }
}
}