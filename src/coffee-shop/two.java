
package coffee1;

import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;


public class two extends javax.swing.JFrame {
    
    final void FillList(){
        
        
      
          
        try{
            
            
        String url="jdbc:derby://localhost:1527/recruit";
            String username="senthan";
            String password="senthan";
            
            Connection con=DriverManager.getConnection(url,username,password);
             Statement stmt=con.createStatement();
             
              String Query="SELECT * FROM EMPLOYEE";
              
              ResultSet rs=stmt.executeQuery(Query);
              
              DefaultListModel DLM=new DefaultListModel();
              
              
              while(rs.next())
              {
                  DLM.addElement(rs.getString(1));
              }
             jList1.setModel(DLM);
        }
        catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

  
    public two() {
        initComponents();
        for (int i = 1900; i < 2016; i++) {
            jComboBox3.addItem(String.valueOf(i));
             setLocationRelativeTo(null);}
        FillList();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Malayan cafe");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 510, 110, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("sex");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 460, 70, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("mobile");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 360, 80, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 400, 100, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 320, 50, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Date of Birth");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 280, 110, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Full name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 230, 90, 22);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(460, 230, 330, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(460, 270, 80, 40);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(580, 270, 90, 40);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(700, 270, 90, 40);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(460, 320, 330, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(460, 360, 330, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(460, 400, 330, 30);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(460, 450, 90, 40);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cooking", "Packing", "Storing", "Catering", "Cleaning" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(460, 500, 90, 40);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 230, 260, 240);

        jButton1.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 490, 110, 50);

        jButton2.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 102));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 490, 100, 50);

        jButton3.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(0, 170, 100, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Search Employee");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 50, 300, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee1/welcome/789.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 40, 280, 170);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(130, 170, 250, 30);

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(660, 510, 100, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee1/welcome/background-texture-1014963_960_720.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int result=jList1.getNextMatch(jTextField6.getText(), 0, Position.Bias.Forward);

        jList1.setSelectedIndex(result);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            String url="jdbc:derby://localhost:1527/recruit";
            String username="senthan";
            String password="senthan";

            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();

            String Query="DELETE FROM EMPLOYEE WHERE NAME='"+jList1.getSelectedValue()+"'";

            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Employee data deleted successfully ");

            FillList();

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{

            String url="jdbc:derby://localhost:1527/recruit";
            String username="senthan";
            String password="senthan";

            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();

            String Query="UPDATE EMPLOYEE SET NAME='"+jTextField1.getText()+"',BIRTHDAY='"+jComboBox1.getSelectedItem()+"',BIRTHMONTH='"+jComboBox2.getSelectedItem()+"',BIRTHYEAR='"+jComboBox3.getSelectedItem()+"',ID='"+jTextField2.getText()+"',MOBILE='"+jTextField3.getText()+"',ADDRESS='"+jTextField4.getText()+"',SEX='"+jComboBox4.getSelectedItem()+"',DEPARTMENT='"+jComboBox5.getSelectedItem()+"' WHERE NAME='"+jList1.getSelectedValue()+"'";

            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Employee data updated successfully ");

            FillList();

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        //JOptionPane.showMessageDialog(rootPane, evt);
        try{

            String url="jdbc:derby://localhost:1527/recruit";
            String username="senthan";
            String password="senthan";

            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();

            String Query="SELECT * FROM EMPLOYEE WHERE NAME='"+jList1.getSelectedValue()+"'";

            ResultSet rs=stmt.executeQuery(Query);

            while(rs.next())
            {
                jTextField1.setText(rs.getString(1));
                jComboBox1.setSelectedItem(rs.getString(2));
                jComboBox2.setSelectedItem(rs.getString(3));
                jComboBox3.setSelectedItem(rs.getString(4));
                jTextField2.setText(rs.getString(5));
                jTextField3.setText(rs.getString(6));
                jTextField4.setText(rs.getString(7));
                jComboBox4.setSelectedItem(rs.getString(8));
                jComboBox5.setSelectedItem(rs.getString(9));

            }

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        zero t=new zero();
        t.setVisible(true);
        two.this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new two().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
