
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AFTAB COMPUTER SHOP
 */
public class SearchCustomer extends javax.swing.JFrame {
    private Object lblProfPic;
    private Object boas;

    /**
     * Creates new form AddCostumer
     */
    public SearchCustomer() {
        initComponents();
     autoID();
    }
    Connection conn;
    PreparedStatement pst;
    String host="";
    String user="root";
    String pass="root";
    String path = null;
    byte[] userimage = null;
    Statement s;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
   public void autoID()
 {
     
        // Class.forName("sun.jdbc.odbc.Jdb.Odbc.Driver");
        // conn=DriverManager.getConnection("jdbc:odbc:con","root","root");  
        try {
            conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","root","root");
            s= conn.createStatement();
            // rs = s.executeQuery("select MAX(Kumar) from jatinder");
           //ResultSet rs = s.executeQuery("select MAX(child_id) from children");
             //rs.next();
            //rs.next();
           // rs.getString("MAX(Kumar)");
            //rs.getString("MAX(child_id)");
         // if (rs.getString("MAX(Kumar)") == null)
            Random rd = new Random();
         //   txtid.setText(""+rd.nextInt(10000+1));
         
        } catch (SQLException ex) {
            Logger.getLogger(AddCostumer.class.getName()).log(Level.SEVERE, null, ex);
        }
         // String query = "select MAX(id)  from Customers";
         
      
 }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtcnic = new javax.swing.JTextField();
        txtpasswordid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        txtcontact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtphoto = new javax.swing.JLabel();
        txtbrowse = new javax.swing.JButton();
        txtupdate = new javax.swing.JButton();
        txtcancel = new javax.swing.JButton();
        txtCusID = new javax.swing.JTextField();
        txtSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(947, 547));
        setMinimumSize(new java.awt.Dimension(947, 547));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 220, 120, 24);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 270, 110, 24);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CNIC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 320, 100, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 380, 130, 24);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 440, 68, 24);

        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtfirstname);
        txtfirstname.setBounds(170, 220, 170, 30);
        getContentPane().add(txtlastname);
        txtlastname.setBounds(170, 270, 170, 30);

        txtcnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnicActionPerformed(evt);
            }
        });
        getContentPane().add(txtcnic);
        txtcnic.setBounds(170, 320, 170, 30);
        getContentPane().add(txtpasswordid);
        txtpasswordid.setBounds(170, 380, 170, 30);

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 430, 170, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 290, 111, 24);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 350, 64, 24);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 390, 67, 24);
        getContentPane().add(txtdate);
        txtdate.setBounds(540, 290, 180, 30);

        r1.setText("Male");
        getContentPane().add(r1);
        r1.setBounds(540, 350, 80, 23);

        r2.setText("Female");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(630, 350, 90, 23);
        getContentPane().add(txtcontact);
        txtcontact.setBounds(540, 390, 180, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 170, 120, 24);

        txtphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        getContentPane().add(txtphoto);
        txtphoto.setBounds(730, 100, 200, 200);

        txtbrowse.setBackground(new java.awt.Color(204, 204, 255));
        txtbrowse.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtbrowse.setForeground(new java.awt.Color(102, 153, 255));
        txtbrowse.setText("Browse");
        txtbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrowseActionPerformed(evt);
            }
        });
        getContentPane().add(txtbrowse);
        txtbrowse.setBounds(770, 310, 150, 40);

        txtupdate.setBackground(new java.awt.Color(102, 51, 0));
        txtupdate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtupdate.setForeground(new java.awt.Color(255, 255, 255));
        txtupdate.setText("Update");
        txtupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtupdate);
        txtupdate.setBounds(360, 450, 140, 40);

        txtcancel.setBackground(new java.awt.Color(102, 51, 0));
        txtcancel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtcancel.setForeground(new java.awt.Color(255, 255, 255));
        txtcancel.setText("Cancel");
        txtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcancelActionPerformed(evt);
            }
        });
        getContentPane().add(txtcancel);
        txtcancel.setBounds(520, 450, 140, 40);

        txtCusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCusID);
        txtCusID.setBounds(170, 170, 170, 30);

        txtSearch.setBackground(new java.awt.Color(204, 204, 255));
        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(102, 153, 255));
        txtSearch.setText("Search");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearch);
        txtSearch.setBounds(360, 170, 130, 33);

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 450, 140, 40);

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 60)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Search Passenger Panel");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 10, 660, 110);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\AFTAB COMPUTER SHOP\\Desktop\\Project Pic\\searchCustomer.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 950, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtcnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnicActionPerformed

    private void txtbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrowseActionPerformed
        // TODO add your handling code here:
       
        try {
             JFileChooser picchooser = new JFileChooser();
        picchooser.showOpenDialog(null);
        File pic = picchooser.getSelectedFile();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg");
        picchooser.addChoosableFileFilter(filter);
        
        path = pic.getAbsolutePath();
        BufferedImage img;
            
            img = ImageIO.read(picchooser.getSelectedFile());
             ImageIcon imageIcon = new ImageIcon(new 
        ImageIcon(img).getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
        txtphoto.setIcon(imageIcon);
       
        File image = new File(path);
        FileInputStream fis = new  FileInputStream(image);
        ByteArrayOutputStream baos = new  ByteArrayOutputStream();
        byte[] buff = new byte[1024];
        for(int readNum; (readNum=fis.read(buff)) !=-1 ; )
        {
            baos.write(buff,0,readNum);
        }
        userimage=baos.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(AddCostumer.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_txtbrowseActionPerformed

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
        // TODO add your handling code here://////////////////
        
       
        String id = txtCusID.getText();
        String firstname = txtfirstname.getText();
        String lastname = txtlastname.getText();
        String cnic = txtcnic.getText();
        String password = txtpasswordid.getText();
        String address = txtaddress.getText();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(txtdate.getDate());
        String Gender;
        
        if(r1.isSelected())
        {
            Gender = "Male";
        }
        else
        {
            Gender = "Female";
        }
        String contact = txtcontact.getText();
        try {
            conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","root","root");
            pst = conn.prepareStatement("update AddCustomer set firstname = ?,lastname=?,NIC=?,passwordID=?,Adress=?,DOB=?,gender=?,contact=?,picture=? where Cus_ID =?");
          //  pst.setString(1,txtid.getText());
            pst.setString(1,firstname);
            pst.setString(2,lastname);
            pst.setString(3,cnic );
            pst.setString(4,password);
            pst.setString(5,address );
            pst.setString(6,date);
            pst.setString(7,Gender);
            pst.setString(8,contact);
            pst.setBytes(9, userimage);
            pst.setString(10,id);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Registration Updated.....");
           
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddCostumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
    }//GEN-LAST:event_txtupdateActionPerformed

    private void txtCusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusIDActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
        String id = txtCusID.getText();
        try {
           
            conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","root","root");
            pst=conn.prepareStatement("select * from Addcustomer where Cus_ID=?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(this, "Record not Found");
            }
            else
            {
                String fname = rs.getString("firstname");
                 String Lname = rs.getString("lastname");
                  String nic = rs.getString("NIC");
                   String password = rs.getString("passwordID");
                    String Address = rs.getString("Adress");
                     String date = rs.getString("DOB");
                     java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                      String gen = rs.getString("gender");
                    if (gen.equals("Female")) 
                    {
                        
                        r1.setSelected(false);
                        r2.setSelected(true);
                    
                    }
                    else
                    {
                     r1.setSelected(true);
                        r2.setSelected(false);
                    }
                       String phone = rs.getString("contact");
                       Blob blob = rs.getBlob("picture");
                       byte [ ] _imagebytes=blob.getBytes(1, (int) blob.length());
                       ImageIcon image = new ImageIcon(_imagebytes);
                       Image im = image.getImage();
                       Image myImg = im.getScaledInstance(txtphoto.getWidth(),txtphoto.getHeight(), Image.SCALE_SMOOTH);
                       ImageIcon newImage = new ImageIcon(myImg);
                       
                       txtfirstname.setText(fname.trim());
                       txtlastname.setText(Lname.trim());
                       txtcnic.setText(nic.trim());
                       txtpasswordid.setText(password.trim());
                       txtaddress.setText(Address.trim());
                       txtdate.setDate(date1);
                       txtphoto.setIcon(newImage);
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcancelActionPerformed
        // TODO add your handling code here:
         this.hide();
    }//GEN-LAST:event_txtcancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCostumer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField txtCusID;
    private javax.swing.JButton txtSearch;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JButton txtbrowse;
    private javax.swing.JButton txtcancel;
    private javax.swing.JTextField txtcnic;
    private javax.swing.JTextField txtcontact;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtpasswordid;
    private javax.swing.JLabel txtphoto;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables
}
