
package coffee1;
import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;



public class SearchItem extends javax.swing.JFrame {
    
    final void FillList(){
           try{
        String url="jdbc:derby://localhost:1527/recruit ";
        String username="senthan";
        String password="senthan";
        
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        
        String Query="SELECT * FROM ITEMS1";
        ResultSet rs=stmt.executeQuery(Query);
        
        DefaultListModel DLM=new DefaultListModel();
        
        while(rs.next()){
            
            DLM.addElement(rs.getString(1));
            
        }
        jList1.setModel(DLM);
           }
           catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }

    
    public SearchItem() {
        initComponents();
        
        FillList();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("ITEM ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 170, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText(":");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 170, 7, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(450, 170, 300, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(450, 230, 300, 30);

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("ITEM NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 210, 120, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 255));
        jLabel11.setText(":");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(410, 230, 40, 14);

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("CATEGORY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 270, 110, 70);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 255));
        jLabel12.setText(":");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(410, 290, 20, 17);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Cake", "Juice", "Sweet" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(450, 290, 180, 30);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(450, 350, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("SIZE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 340, 70, 44);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText(":");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(410, 340, 5, 30);

        jLabel6.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("PRICE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 410, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 204));
        jLabel13.setText(":");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(410, 410, 40, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(440, 410, 300, 30);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 210, 240);

        jButton1.setFont(new java.awt.Font("Vijaya", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 470, 110, 27);

        jButton2.setFont(new java.awt.Font("Vijaya", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 470, 110, 27);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Items ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 160, 210, 14);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 490, 120, 60);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Update item");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 20, 170, 30);

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 153));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(90, 130, 100, 27);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(20, 80, 230, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee1/welcome/10966536-Vintage-coffee-background-Stock-Photo.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
       
                try{
        String url="jdbc:derby://localhost:1527/recruit ";
        String username="senthan";
        String password="senthan";
        
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        
        String Query="SELECT * FROM ITEMS1 WHERE ID='"+jList1.getSelectedValue()+"'";
        ResultSet rs=stmt.executeQuery(Query);
        
        DefaultListModel DLM=new DefaultListModel();
        
        while(rs.next()){
            
            jTextField1.setText(rs.getString(1));
            jTextField2.setText(rs.getString(2));
            jComboBox3.setSelectedItem(rs.getString(3));
            jComboBox2.setSelectedItem(rs.getString(4));
            jTextField5.setText(rs.getString(5));
            
            
        }
       
           }
           catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try{
        String url="jdbc:derby://localhost:1527/recruit ";
        String username="senthan";
        String password="senthan";
        
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        
        String Query="UPDATE ITEMS1 SET ID='"+jTextField1.getText()+"',ITEM_NAME='"+jTextField2.getText()+"',CATEGORY='"+jComboBox3.getSelectedItem()+"',SIZE='"+jComboBox2.getSelectedItem()+"',PRICE='"+jTextField5.getText()+"'WHERE ID='"+jList1.getSelectedValue()+"'";
        stmt.execute(Query);
        
     JOptionPane.showMessageDialog(null,"Item info updated successfully");
     
     FillList();
        
        
       
           }
           catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
        String url="jdbc:derby://localhost:1527/recruit ";
        String username="senthan";
        String password="senthan";
        
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        
        String Query="DELETE FROM ITEMS1 WHERE ID='"+jList1.getSelectedValue()+"'";
        stmt.execute(Query);
        
     JOptionPane.showMessageDialog(null,"Item deleted successfully");
     
     FillList();
        
        
       
           }
           catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex.toString());
           }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        zero h=new zero();
        h.setVisible(true);
        SearchItem.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int result= jList1.getNextMatch(jTextField3.getText(), 0, Position.Bias.Forward);
       jList1.setSelectedIndex(result);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
