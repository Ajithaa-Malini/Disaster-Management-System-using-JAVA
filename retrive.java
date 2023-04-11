
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class retrive extends javax.swing.JFrame {

    private java.sql.Connection connection;

   
    public retrive() {
        initComponents();
        
        Connect(); 
        try {
            loadreport();
        } catch (JRException ex) {
            Logger.getLogger(retrive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Connection con;
    PreparedStatement pst;
    
    
    
    public void Connect()
    {
        try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
             con=       (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/disaster","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(retrive.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(retrive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("TO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setText("FROM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 570, 350));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  /*      try {
            // TODO add your handling code here:
            loadreport();
        } catch (JRException ex) {
            Logger.getLogger(retrive.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param a
     * @throws net.sf.jasperreports.engine.JRExceptionrgs the command line arguments
     */
    
    
    
    public void loadreport() throws JRException
    {
     /*    String t=new String(jTextField1.getText());
        // String t=new String(jTextField2.getText());
         HashMap a=new HashMap();
       //  Map<String, Object> parameters=getParameters();
         a.put("tod",t);
       //  a.put("fromD", f);*/
         jPanel1.removeAll();
         jPanel1.repaint();
         jPanel1.revalidate();
         
       JasperDesign jDesign= JRXmlLoader.load("C:\\Users\\ponth\\OneDrive\\Documents\\NetBeansProjects\\disaster\\src\\report3.jrxml");
       JasperReport jreport = JasperCompileManager.compileReport(jDesign);
      JasperPrint jPrint= JasperFillManager.fillReport(jreport,null,con);
      JasperViewer.viewReport(jPrint);
       
       JRViewer v=new JRViewer(jPrint);
       jPanel1.setLayout(new BorderLayout());
       jPanel1.add(v);
       setContentPane(jPanel1);
      
    }
    
    
    
    
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(retrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new retrive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
