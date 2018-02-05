
package coffee1;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;

public class selectItem extends javax.swing.JFrame {

    private String itemName;
    private List<ItemEntity> list= new ArrayList<>();
    private ItemEntity selectedEntity = new ItemEntity();

    public selectItem(String name) {
        initComponents();
        itemName = name;
        System.out.println("check "+itemName);
        this.list=AppUtil.getInstance().getItemByName(itemName);
        this.selectedEntity = list.get(0);
        setLocationRelativeTo(null);
        
        
        //itemName.equalsIgnoreCase(itemName)
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Malayan cafe");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Kartika", 3, 18)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(471, 180, 60, 40);

        jButton2.setFont(new java.awt.Font("Kartika", 3, 18)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 180, 60, 40);

        jLabel1.setFont(new java.awt.Font("Vani", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("  price  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 300, 80, 31);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton3.setText("cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 510, 140, 60);

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton5.setText("Confirm to pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(440, 490, 200, 60);

        jLabel2.setFont(new java.awt.Font("Vani", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Quantity   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 180, 150, 20);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(480, 80, 150, 30);

        jLabel3.setFont(new java.awt.Font("Vani", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Size      :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 90, 90, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 180, 60, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("00");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 300, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee1/welcome/WDF_2519962.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        System.out.println(" index "+jComboBox1.getSelectedIndex());
        updatePrice();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String unit= jLabel4.getText();
        int x=Integer.parseInt(unit);
        
        if(x<20)
        {
            ++x;
            String updateUnit=String.valueOf(x);
            jLabel4.setText(updateUnit);
            updatePrice();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        String unit= jLabel4.getText();
        int x=Integer.parseInt(unit);
        
        if(x>1)
        {
            --x;
            String updateUnit=String.valueOf(x);
            jLabel4.setText(updateUnit);
            updatePrice();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        insertItems();
        Bill b=new Bill();
        b.setVisible(true);
        selectItem.this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        second test=new second();
        test.setVisible(true);
        selectItem.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
        public List<String> insertItems(){
        
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection conn = null;
        List<String> list = new ArrayList<>();
        
        try{
            conn=AppUtil.getInstance().getDBConnection();
            
            String insertQuery = "INSERT INTO SHOPPING(ID,NAME,QUANTITY,PRICE,CREATED_DATE) VALUES (?,?,?,?,?)";
              
            ShoppingItem select=AppUtil.getInstance().getLatestShoppingItem();
            String id = "1";
            if(select!=null){
                System.out.println("Status "+select.getStatus()+ " Id "+id);
                if(!select.getStatus().equalsIgnoreCase("pending"))
                {
                    int idVal = Integer.parseInt(id);
                    ++idVal;

                    id = String.valueOf(idVal);
                }else{
                    id = select.getId();
                }
            }
            
            ps = conn.prepareStatement(insertQuery); // create a statement
            ps.setString(1,id);
            ps.setString(2,selectedEntity.getItemName());
            ps.setString(3,jLabel4.getText());
            ps.setString(4,jLabel5.getText());
            ps.setTimestamp(5,AppUtil.getInstance().getCurrentTimeStamp());
// set input parameter
            int val = ps.executeUpdate();
            // extract data from the ResultSet
            
            System.out.println("Val "+val);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try {
                ps.close();
                conn.close();
              } catch (SQLException e) {
                e.printStackTrace();
              }
        }
        return list;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private void updatePrice(){
        
        String size = "SMALL";
        String unitPrice = "0";
        switch(jComboBox1.getSelectedIndex())
        {
            case 1:
                size = "MEDIUM";
                break;
            case 2:
                size = "LARGE";
                break;
            default:
                size = "SMALL";
                break;
        }
        
        for(ItemEntity entity : list){
            System.out.println("coffee1.selectItem.jComboBox1ActionPerformed()" + size +" : "+ entity.getSize());
            if(entity.getSize().equalsIgnoreCase(size)){
                selectedEntity = entity;
                unitPrice = entity.getPrice();
                int price = Integer.parseInt(unitPrice);
                //updatePrice(Integer.parseInt(unitPrice));
                
                int quantity = Integer.parseInt(jLabel4.getText().toString());
                int total = price*quantity;
        
                jLabel5.setText(String.valueOf(total));
                break;
            }
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
            java.util.logging.Logger.getLogger(selectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectItem("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private Connection getDBConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
