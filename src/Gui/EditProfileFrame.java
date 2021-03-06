/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Neel_Esh
 */
public class EditProfileFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditProfileFrame
     */
    private File file;
    public EditProfileFrame() {
       
        initComponents();
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        this.setLocationRelativeTo(null);
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
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        FilePathTxt = new javax.swing.JTextField();
        BrowseFileBtn = new javax.swing.JButton();
        PhnLbl3 = new javax.swing.JLabel();
        ChkBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        CurPwdBar = new javax.swing.JLabel();
        CurPwdLbl = new javax.swing.JLabel();
        NewPwdBar = new javax.swing.JLabel();
        NewPwdLbl = new javax.swing.JLabel();
        CnfNewPwdBar = new javax.swing.JLabel();
        CnfPwdLbl = new javax.swing.JLabel();
        ChkBox = new javax.swing.JCheckBox();
        MailTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        disCardBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PhnTxt = new javax.swing.JTextField();
        PhnLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PhnLbl2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        PhnLbl1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 1010, 10));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("* Upload resume in within 1000kb");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        FilePathTxt.setEditable(false);
        jPanel4.add(FilePathTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 30));

        BrowseFileBtn.setBackground(new java.awt.Color(174, 192, 236));
        BrowseFileBtn.setText("Browse File");
        BrowseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseFileBtnActionPerformed(evt);
            }
        });
        jPanel4.add(BrowseFileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 850, 60));

        PhnLbl3.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        PhnLbl3.setText("Want to change Resume");
        jPanel1.add(PhnLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        ChkBox1.setOpaque(false);
        ChkBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(ChkBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 20, 20));

        jPanel3.setOpaque(false);

        CurPwdBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        CurPwdBar.setText("jLabel6");

        CurPwdLbl.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        CurPwdLbl.setText("Current PassWord");

        NewPwdBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        NewPwdBar.setText("jLabel6");

        NewPwdLbl.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        NewPwdLbl.setText("New PassWord");

        CnfNewPwdBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        CnfNewPwdBar.setText("jLabel6");

        CnfPwdLbl.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        CnfPwdLbl.setText("Confirm New PassWord");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(CnfPwdLbl)
                        .addGap(18, 18, 18)
                        .addComponent(CnfNewPwdBar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(NewPwdLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewPwdBar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CurPwdLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CurPwdBar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurPwdBar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurPwdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPwdBar)
                    .addComponent(NewPwdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CnfNewPwdBar)
                    .addComponent(CnfPwdLbl))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 570, 170));

        ChkBox.setOpaque(false);
        ChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 295, 20, 20));

        MailTxt.setBackground(new java.awt.Color(173, 192, 234));
        MailTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MailTxt.setText("neelesh1210@gmail.com");
        MailTxt.setBorder(null);
        MailTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(MailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 280, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jLabel12.setText("jLabel6");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 330, -1));

        NameLbl.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        NameLbl.setText("Name :-");
        jPanel1.add(NameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        EmailTxt.setBackground(new java.awt.Color(173, 192, 234));
        EmailTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        EmailTxt.setText("neelesh mehar");
        EmailTxt.setBorder(null);
        EmailTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });
        jPanel1.add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 280, 30));

        disCardBtn.setBackground(new java.awt.Color(172, 194, 236));
        disCardBtn.setText("Discard changes");
        disCardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disCardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(disCardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 170, 30));

        jButton1.setBackground(new java.awt.Color(172, 194, 236));
        jButton1.setText("Save Changes");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, 170, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 330, -1));

        PhnTxt.setBackground(new java.awt.Color(173, 192, 234));
        PhnTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PhnTxt.setText("8871414187");
        PhnTxt.setBorder(null);
        PhnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PhnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhnTxtActionPerformed(evt);
            }
        });
        jPanel1.add(PhnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 280, 30));

        PhnLbl.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        PhnLbl.setText("Phone no :-");
        jPanel1.add(PhnLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2021-12-23 00.04.59.png"))); // NOI18N
        jLabel11.setText("jLabel6");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 330, -1));

        PhnLbl2.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        PhnLbl2.setText("Mail Address :-");
        jPanel1.add(PhnLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 20, 240));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 970, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 970, 200));

        PhnLbl1.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        PhnLbl1.setText("Want to change password ");
        jPanel1.add(PhnLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtActionPerformed

    private void PhnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhnTxtActionPerformed

    private void ChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBoxActionPerformed
        // TODO add your handling code here:
       
        if(ChkBox.isSelected())
        {
            jPanel3.setVisible(true);  
        }
        else
        {
            jPanel3.setVisible(false);
        }
    }//GEN-LAST:event_ChkBoxActionPerformed

    private void ChkBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBox1ActionPerformed
        // TODO add your handling code here:
        if(ChkBox1.isSelected())
        {
            jPanel4.setVisible(true);  
        }
        else
        {
            jPanel4.setVisible(false);
        }
    }//GEN-LAST:event_ChkBox1ActionPerformed

    private void BrowseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseFileBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.setDialogTitle("Browse Files");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int result =chooser.showOpenDialog(null);
        
        if (result == chooser.APPROVE_OPTION) 
        {   
            file=chooser.getSelectedFile();
            System.out.println(file.toString());
            String [] filename=file.toString().split("\\.");
            //System.out.println(filename[filename.length-1]);
            if(filename[filename.length-1].contains("pngjpeg"))
            {
                System.out.println(filename[filename.length-1]);
            }
            FilePathTxt.setText(file.toString().trim());
            
        } 
        else if (result == chooser.CANCEL_OPTION) 
        {
            System.out.println("Cancel was selected");
        }
    }//GEN-LAST:event_BrowseFileBtnActionPerformed

    private void disCardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disCardBtnActionPerformed
        // TODO add your handling code here:
        new ParticipantsOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_disCardBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfileFrame().setVisible(true);
            }
        });
    }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseFileBtn;
    private javax.swing.JCheckBox ChkBox;
    private javax.swing.JCheckBox ChkBox1;
    private javax.swing.JLabel CnfNewPwdBar;
    private javax.swing.JLabel CnfPwdLbl;
    private javax.swing.JLabel CurPwdBar;
    private javax.swing.JLabel CurPwdLbl;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JTextField FilePathTxt;
    private javax.swing.JTextField MailTxt;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JLabel NewPwdBar;
    private javax.swing.JLabel NewPwdLbl;
    private javax.swing.JLabel PhnLbl;
    private javax.swing.JLabel PhnLbl1;
    private javax.swing.JLabel PhnLbl2;
    private javax.swing.JLabel PhnLbl3;
    private javax.swing.JTextField PhnTxt;
    private javax.swing.JButton disCardBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
