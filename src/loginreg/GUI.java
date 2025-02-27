
package loginreg;

import Admin.Admindashb;
import config.dbconnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class GUI extends javax.swing.JFrame {

 /**
  * Creates new form GUI
  */
 public GUI() {
      initComponents(); 
 }
 static String status;
 
  public static boolean loginAcc(String username, String password){ 
dbconnector connector = new dbconnector(); 
try{ 
 String query = "SELECT * FROM tbl_user WHERE u_username ="+username+"  AND "
         + "u_password ="+password+"";
ResultSet resultSet = connector.getData(query); 
return resultSet.next(); 
}catch (SQLException ex) { 
return false; 
} 
}
 /**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  right = new javax.swing.JPanel();
  Left = new javax.swing.JPanel();
  jLabel1 = new javax.swing.JLabel();
  User = new javax.swing.JLabel();
  Password = new javax.swing.JLabel();
  user = new javax.swing.JTextField();
  pass = new javax.swing.JPasswordField();
  Login = new javax.swing.JButton();
  registration = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

  right.setBackground(new java.awt.Color(88, 72, 72));

  Left.setBackground(new java.awt.Color(236, 45, 45));

  javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
  Left.setLayout(LeftLayout);
  LeftLayout.setHorizontalGroup(
   LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 138, Short.MAX_VALUE)
  );
  LeftLayout.setVerticalGroup(
   LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 400, Short.MAX_VALUE)
  );

  jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
  jLabel1.setForeground(new java.awt.Color(204, 204, 204));
  jLabel1.setText("LOGIN");

  User.setBackground(new java.awt.Color(204, 204, 204));
  User.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  User.setForeground(new java.awt.Color(204, 204, 204));
  User.setText("User");

  Password.setBackground(new java.awt.Color(204, 204, 204));
  Password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
  Password.setForeground(new java.awt.Color(204, 204, 204));
  Password.setText("Password");

  user.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    userActionPerformed(evt);
   }
  });

  Login.setBackground(new java.awt.Color(236, 45, 45));
  Login.setText("Login");
  Login.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    LoginMouseClicked(evt);
   }
  });
  Login.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    LoginActionPerformed(evt);
   }
  });

  registration.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
  registration.setForeground(new java.awt.Color(204, 204, 204));
  registration.setText("Click here to Create an account..");
  registration.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    registrationMouseClicked(evt);
   }
  });

  javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
  right.setLayout(rightLayout);
  rightLayout.setHorizontalGroup(
   rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(rightLayout.createSequentialGroup()
    .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(rightLayout.createSequentialGroup()
      .addGap(154, 154, 154)
      .addComponent(jLabel1))
     .addGroup(rightLayout.createSequentialGroup()
      .addGap(79, 79, 79)
      .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(User)
       .addComponent(Password)
       .addComponent(Login)
       .addComponent(registration))))
    .addContainerGap(127, Short.MAX_VALUE))
  );
  rightLayout.setVerticalGroup(
   rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addGroup(rightLayout.createSequentialGroup()
    .addGap(77, 77, 77)
    .addComponent(jLabel1)
    .addGap(18, 18, 18)
    .addComponent(User)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(18, 18, 18)
    .addComponent(Password)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(registration)
    .addContainerGap(74, Short.MAX_VALUE))
  );

  getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

 private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_userActionPerformed

 private void registrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationMouseClicked
   new registration().setVisible(true);
        this.dispose(); 
 }//GEN-LAST:event_registrationMouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
Login.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
         LoginMouseClicked(evt);
    }
});
    }//GEN-LAST:event_LoginMouseClicked

 private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
  
  if(loginAcc(user.getText(),pass.getText())){
      if(!status.equals("Active")){
   JOptionPane.showMessageDialog(null,"in-Active acc contact admin");       
      }else{
          JOptionPane.showMessageDialog(null,"Login Success");
            Admindashb ads = new Admindashb ();
            ads.setVisible(true);
            this.dispose();
      }
  }else{  
   JOptionPane.showMessageDialog(null,"Ning Kaon naka?");
  }
  
 }//GEN-LAST:event_LoginActionPerformed

 
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
   java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new GUI().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JPanel Left;
 private javax.swing.JButton Login;
 private javax.swing.JLabel Password;
 private javax.swing.JLabel User;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JPasswordField pass;
 private javax.swing.JLabel registration;
 private javax.swing.JPanel right;
 private javax.swing.JTextField user;
 // End of variables declaration//GEN-END:variables
}
