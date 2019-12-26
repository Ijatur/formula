package formula;
import javax.swing.JOptionPane;
import DB.DatabaseConnection;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class delvali extends javax.swing.JFrame {
        static Connection conn;
        static Statement st;
        static PreparedStatement ps;
        static String sql;
        static ResultSet rs,res;
        
    public delvali() {
        initComponents();
        setLocationRelativeTo(null);
        conn = new DatabaseConnection().setConnection();
        
        teamcombo.setEnabled(false);
        lapscombo.setEnabled(false);
        tirescombo.setEnabled(false);
        circuitcombo.setEnabled(false);
        drivercombo.setEnabled(false);
        
        btnDelete.setEnabled(false);
        btn_up.setVisible(false);
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lapscombo = new javax.swing.JComboBox<>();
        teamcombo = new javax.swing.JComboBox<>();
        tirescombo = new javax.swing.JComboBox<>();
        circuitcombo = new javax.swing.JComboBox<>();
        drivercombo = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tx_ticketid = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        btn_delmode = new javax.swing.JButton();
        btn_up = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete Validation Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 54, 997, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Laps");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(135, 202, 28, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Team");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(135, 166, 34, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tires");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(135, 231, 28, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Circuit");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(135, 266, 38, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Driver");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(135, 299, 37, 17);

        lapscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        lapscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapscomboActionPerformed(evt);
            }
        });
        jPanel1.add(lapscombo);
        lapscombo.setBounds(285, 200, 34, 22);

        teamcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedes", "Ferrari", "Alfa Romeo", "Renault", "McLaren", "Honda", "Red Bull", "BMW Sauber" }));
        jPanel1.add(teamcombo);
        teamcombo.setBounds(285, 164, 101, 22);

        tirescombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soft", "Hard", "Wet" }));
        jPanel1.add(tirescombo);
        tirescombo.setBounds(285, 229, 54, 22);

        circuitcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Reversed", "Extended", " " }));
        jPanel1.add(circuitcombo);
        circuitcombo.setBounds(285, 264, 80, 22);

        drivercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lewis Hamilton", "Sebastian Vettel", "Daniel Ricciardo", "Max Verstappen", "Nico Hulkenberg", "Lando Norris", "Fernando Alonso", "Carlos Sainz", "Rio Haryanto", "Nico Rosberg" }));
        jPanel1.add(drivercombo);
        drivercombo.setBounds(285, 299, 123, 22);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(230, 360, 73, 25);

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMainMenu);
        btnMainMenu.setBounds(440, 590, 95, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Winner Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(135, 129, 97, 17);
        jPanel1.add(tx_ticketid);
        tx_ticketid.setBounds(285, 127, 123, 22);

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(420, 126, 71, 25);

        btnCreate.setText("Create Mode");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate);
        btnCreate.setBounds(480, 190, 105, 25);

        btn_upd.setText("Update Mode");
        btn_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updActionPerformed(evt);
            }
        });
        jPanel1.add(btn_upd);
        btn_upd.setBounds(590, 190, 107, 25);

        btn_delmode.setText("Delete Mode");
        btn_delmode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delmodeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delmode);
        btn_delmode.setBounds(700, 190, 103, 25);

        btn_up.setText("Update");
        btn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upActionPerformed(evt);
            }
        });
        jPanel1.add(btn_up);
        btn_up.setBounds(230, 360, 73, 25);

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
        jScrollPane1.setViewportView(data_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(436, 225, 536, 340);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\formula\\src\\gambar\\f1star.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1, -4, 1020, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
       menu obj = new menu();
       obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void lapscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapscomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lapscomboActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int pil = JOptionPane.showOptionDialog(this, "Do you want to delete this?", "Delete Data",
        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
            if(pil == JOptionPane.YES_NO_OPTION){
        try{
            sql = "DELETE FROM tbl_req WHERE id_req=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, tx_ticketid.getText());
            int rt = ps.executeUpdate();
            if(rt==0){
                JOptionPane.showMessageDialog(this, "ngaco lu");
            }else
            JOptionPane.showMessageDialog(this, "data deleted");
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
            }else{
                JOptionPane.showMessageDialog(this, "apaansi");
            }
            tx_ticketid.setText("");
            datatable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        new vali().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String auo = tx_ticketid.getText();
        if(tx_ticketid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You search for nothing!");
        }
        try {
            sql = "SELECT * FROM `tbl_req` WHERE `id_req` = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, auo);
            res = ps.executeQuery();
            if(res==null){
                JOptionPane.showMessageDialog(this, "no data");
            }
            while(res.next()){
                teamcombo.setSelectedItem(res.getString(3));
                lapscombo.setSelectedItem(res.getString(4));
                tirescombo.setSelectedItem(res.getString(5));
                circuitcombo.setSelectedItem(res.getString(6));
                drivercombo.setSelectedItem(res.getString(7));
            JOptionPane.showMessageDialog(this, "data found");
            btnDelete.setEnabled(true);
            }    
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
         datatable();
         

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed
        // TODO add your handling code here:
        btn_up.setVisible(true);
        btnDelete.setVisible(false);
        
        teamcombo.setEnabled(true);
        lapscombo.setEnabled(true);
        tirescombo.setEnabled(true);
        circuitcombo.setEnabled(true);
        drivercombo.setEnabled(true);
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_delmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delmodeActionPerformed
        // TODO add your handling code here:
        btnDelete.setVisible(true);
        btn_up.setVisible(false);
        
        teamcombo.setEnabled(false);
        lapscombo.setEnabled(false);
        tirescombo.setEnabled(false);
        circuitcombo.setEnabled(false);
        drivercombo.setEnabled(false);
    }//GEN-LAST:event_btn_delmodeActionPerformed

    private void btn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upActionPerformed
        // TODO add your handling code here:
        
        try{
            sql = "UPDATE `tbl_req` SET `team`=?,`laps`=?,`tires`=?,`circuit`=?,"
                    + "`driver`=? WHERE `id_req`=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, teamcombo.getSelectedItem().toString());
            ps.setString(2, lapscombo.getSelectedItem().toString());
            ps.setString(3, tirescombo.getSelectedItem().toString());
            ps.setString(4, circuitcombo.getSelectedItem().toString());
            ps.setString(5, drivercombo.getSelectedItem().toString());
            ps.setString(6, tx_ticketid.getText());
            int rt = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "data successfully updated");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "data gagal");
            System.out.println("Error"+e.getMessage());
        }
        tx_ticketid.setText("");
        datatable();
    }//GEN-LAST:event_btn_upActionPerformed

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
            java.util.logging.Logger.getLogger(delvali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delvali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delvali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delvali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delvali().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn_delmode;
    private javax.swing.JButton btn_up;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> circuitcombo;
    private javax.swing.JTable data_table;
    private javax.swing.JComboBox<String> drivercombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lapscombo;
    private javax.swing.JComboBox<String> teamcombo;
    private javax.swing.JComboBox<String> tirescombo;
    private javax.swing.JTextField tx_ticketid;
    // End of variables declaration//GEN-END:variables

private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("req");
        tbl.addColumn("ID Ticket");
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