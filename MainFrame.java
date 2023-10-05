/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.regex.*;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.JFileChooser;
/**
 *
 * @author Lohitha Atluri
 */
public class MainFrame extends javax.swing.JFrame {
private String selectedFilePath = "";
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        FnameLabel = new javax.swing.JLabel();
        LnameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        FTextField = new javax.swing.JTextField();
        LTextField = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        OtherRadioButton = new javax.swing.JRadioButton();
        EmailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        photoLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        alab = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        TitleLabel.setBackground(new java.awt.Color(204, 255, 204));
        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Customer Registration Form");

        FnameLabel.setText("First Name:");

        LnameLabel.setText("Last Name:");

        AgeLabel.setText("Age:");

        GenderLabel.setText("Gender:");

        AgeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AgeTextFieldKeyReleased(evt);
            }
        });

        GenderbuttonGroup.add(MaleRadioButton);
        MaleRadioButton.setText("Male");

        GenderbuttonGroup.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");

        GenderbuttonGroup.add(OtherRadioButton);
        OtherRadioButton.setText("Other");

        EmailLabel.setText("Email:");

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        messageLabel.setText("Message:");

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        photoLabel.setText("Photo:");

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FnameLabel)
                            .addComponent(LnameLabel)
                            .addComponent(AgeLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EmailLabel)
                                .addComponent(GenderLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(photoLabel)
                                    .addComponent(messageLabel))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MaleRadioButton)
                                        .addGap(34, 34, 34)
                                        .addComponent(FemaleRadioButton)
                                        .addGap(47, 47, 47)
                                        .addComponent(OtherRadioButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(AgeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                            .addComponent(FTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(47, 47, 47)
                                        .addComponent(alab))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(elab))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(uploadButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(SubmitButton)
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(TitleLabel)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FnameLabel)
                    .addComponent(FTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnameLabel)
                    .addComponent(LTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenderLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MaleRadioButton)
                        .addComponent(FemaleRadioButton)
                        .addComponent(OtherRadioButton)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elab))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoLabel)
                    .addComponent(uploadButton))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton)
                    .addComponent(SubmitButton))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        FTextField.setText(null);
       LTextField.setText(null);
       AgeTextField.setText(null);
       emailTextField.setText(null);
       messageTextArea.setText(null);
      
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        selectedFilePath = f.getAbsolutePath();
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        String FirstName = FTextField.getText();
         String LastName = LTextField.getText(); 
         String Age = AgeTextField.getText();
         String Gender = GenderbuttonGroup.getSelection().getActionCommand();
         String Email = emailTextField.getText();
         String Message = messageTextArea.getText();
         
         if(FirstName.equals("")){
             JOptionPane.showMessageDialog(null, "FirstName is Mandatory");
         }
         if(LastName.equals("")){
             JOptionPane.showMessageDialog(null, "LastName is Mandatory");
         }
         if(Age.equals("")){
             JOptionPane.showMessageDialog(null, "Age is Mandatory");
         }
         if(Gender.equals("")){
             JOptionPane.showMessageDialog(null, "Gender is Mandatory");
         }
         if(Email.equals("")){
             JOptionPane.showMessageDialog(null, "Email is Mandatory");
         }
         if(Message.equals("")){
             JOptionPane.showMessageDialog(null, "Message is Mandatory");
         }
         else{
             JOptionPane.showMessageDialog(null, "submited successfully");
         
         }
         
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void AgeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeTextFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{0,100}";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(AgeTextField.getText());
        if(!match.matches()){
            alab.setText("Only number should be there");
        }
        else{
            alab.setText(null);
        }
    }//GEN-LAST:event_AgeTextFieldKeyReleased

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{0,100}[@][a-zA-Z]{0,10}[.][a-zA-Z]";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(emailTextField.getText());
        if(!match.matches()){
            elab.setText("Email is incorrect");
        }
        else{
            elab.setText(null);
        }
    }//GEN-LAST:event_emailTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField FTextField;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JLabel FnameLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.ButtonGroup GenderbuttonGroup;
    private javax.swing.JTextField LTextField;
    private javax.swing.JLabel LnameLabel;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JRadioButton OtherRadioButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel alab;
    private javax.swing.JLabel elab;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables

    
        }
    
