package formula;

import DB.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class registeredexp extends javax.swing.JFrame {
        static Connection conn;
        static Statement st;
        static PreparedStatement ps;
        static String sql;
        static ResultSet rs;
        String[][] dataUser;
    public registeredexp() {
        initComponents();
        setLocationRelativeTo(null);
        conn = new DatabaseConnection().setConnection();
        
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectf1PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("projectf1PU").createEntityManager();
        tblReqQuery = java.beans.Beans.isDesignTime() ? null : projectf1PUEntityManager.createQuery("SELECT t FROM TblReq t");
        tblReqList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblReqQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Registered Experience");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 40, 236, 29);

        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(data_table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(370, 100, 592, 110);

        jButton1.setText("Delete and Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 230, 137, 25);

        btn_back.setText("back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(880, 510, 59, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\formula\\src\\gambar\\2019-renault-rs19-f1-08-1024.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(3, -7, 1024, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new delvali().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(registeredexp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeredexp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeredexp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeredexp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeredexp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JTable data_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.persistence.EntityManager projectf1PUEntityManager;
    private java.util.List<formula.TblReq> tblReqList;
    private javax.persistence.Query tblReqQuery;
    // End of variables declaration//GEN-END:variables

    private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Req");
        tbl.addColumn("Ticket Win");
        tbl.addColumn("Team");
        tbl.addColumn("Laps");
        tbl.addColumn("Tires");
        tbl.addColumn("Circuit");
        tbl.addColumn("Driver");
        data_table.setModel(tbl);
        try{
            String sql = "SELECT * FROM tbl_req ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                tbl.addRow(new Object []{
                    rs.getString("id_req"),
                    rs.getString("ticket_win"),
                    rs.getString("team"),
                    rs.getString("laps"),
                    rs.getString("tires"),
                    rs.getString("circuit"),
                    rs.getString("driver")
                });
                data_table.setModel(tbl);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }
}
