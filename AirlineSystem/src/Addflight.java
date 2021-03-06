
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AFTAB COMPUTER SHOP
 */
public class Addflight extends javax.swing.JFrame {

    
    public Addflight() {
        initComponents();
        flightID();
    }
    public void flightID()
    {
        Random rd = new Random();
            txtflightID.setText(""+rd.nextInt(10000+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtflightID = new javax.swing.JLabel();
        txtflightname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcharge = new javax.swing.JTextField();
        txtarrival = new javax.swing.JTextField();
        txtperature = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        bwtadd = new javax.swing.JButton();
        bwtcancel = new javax.swing.JButton();
        txtcombosrc = new javax.swing.JComboBox();
        txtcombodep = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(947, 547));
        setMinimumSize(new java.awt.Dimension(947, 547));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Flight ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 130, 220, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Flight Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 220, 240, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Source");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 290, 210, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 340, 240, 42);

        txtflightID.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtflightID.setForeground(new java.awt.Color(0, 51, 51));
        txtflightID.setText("ID");
        getContentPane().add(txtflightID);
        txtflightID.setBounds(260, 120, 130, 40);

        txtflightname.setText("jTextField1");
        getContentPane().add(txtflightname);
        txtflightname.setBounds(240, 220, 190, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 130, 200, 28);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Depature Time");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(500, 210, 250, 28);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Arrival Time");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 280, 240, 28);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Flight Charge");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(520, 350, 250, 28);

        txtcharge.setText("jTextField4");
        getContentPane().add(txtcharge);
        txtcharge.setBounds(690, 350, 210, 30);

        txtarrival.setText("jTextField5");
        getContentPane().add(txtarrival);
        txtarrival.setBounds(690, 280, 210, 30);

        txtperature.setText("jTextField6");
        getContentPane().add(txtperature);
        txtperature.setBounds(690, 210, 210, 30);
        getContentPane().add(txtDate);
        txtDate.setBounds(690, 130, 210, 30);

        bwtadd.setBackground(new java.awt.Color(0, 51, 51));
        bwtadd.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        bwtadd.setForeground(new java.awt.Color(255, 255, 255));
        bwtadd.setText("Add Flight");
        bwtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwtaddActionPerformed(evt);
            }
        });
        getContentPane().add(bwtadd);
        bwtadd.setBounds(60, 450, 150, 33);

        bwtcancel.setBackground(new java.awt.Color(0, 51, 51));
        bwtcancel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        bwtcancel.setForeground(new java.awt.Color(255, 255, 255));
        bwtcancel.setText("Cancel");
        bwtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwtcancelActionPerformed(evt);
            }
        });
        getContentPane().add(bwtcancel);
        bwtcancel.setBounds(270, 450, 160, 33);

        txtcombosrc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "America", "Australia", "Germany", "Canada", "Pakistan", "India", "Londan" }));
        getContentPane().add(txtcombosrc);
        txtcombosrc.setBounds(250, 290, 180, 30);

        txtcombodep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "America", "Australia", "Germany", "Canada", "Pakistan", "India", "Londan" }));
        getContentPane().add(txtcombodep);
        txtcombodep.setBounds(250, 350, 180, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 450, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 55)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("New Flight Panel");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, -10, 490, 120);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\AFTAB COMPUTER SHOP\\Desktop\\Project Pic\\addflight.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 940, 530);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(370, 60, 40, 14);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bwtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwtaddActionPerformed
        // TODO add your handling code here:
        String flightID = txtflightID.getText();
        String flightName = txtflightname.getText();
        String Source = txtcombosrc.getSelectedItem().toString().trim();
        String Dept = txtcombodep.getSelectedItem().toString().trim();
        String Depature = txtperature.getText();
        String ArrTime = txtarrival.getText();
        String Charge = txtcharge.getText();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(txtDate.getDate());
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","root","root");
            PreparedStatement pst = conn.prepareStatement("insert into Flight(Flight_ID,Flight_Name,Source,Department,Dated,Depature_time,Arrival_Time,Flight_Charge)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,flightID);
            pst.setString(2,flightName);
            pst.setString(3,Source);
            pst.setString(4,Dept);
            pst.setString(5,date);
            pst.setString(6,Depature );
            pst.setString(7,ArrTime);
            pst.setString(8,Charge);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Flight is Booked.....");
           
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddCostumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bwtaddActionPerformed

    private void bwtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwtcancelActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_bwtcancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MainPage obj = new MainPage();
        obj.setVisible(true);
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
            java.util.logging.Logger.getLogger(Addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addflight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bwtadd;
    private javax.swing.JButton bwtcancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtarrival;
    private javax.swing.JTextField txtcharge;
    private javax.swing.JComboBox txtcombodep;
    private javax.swing.JComboBox txtcombosrc;
    private javax.swing.JLabel txtflightID;
    private javax.swing.JTextField txtflightname;
    private javax.swing.JTextField txtperature;
    // End of variables declaration//GEN-END:variables
}
