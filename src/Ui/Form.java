/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import Demo.User;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author Lohitha Atluri
 */
public class Form extends javax.swing.JPanel {

    /**
     * Creates new form Form
     */
    private JPanel bottomPanel;
    public Form(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        FLabel = new javax.swing.JLabel();
        LLabel = new javax.swing.JLabel();
        ALabel = new javax.swing.JLabel();
        GLabel = new javax.swing.JLabel();
        ELabel = new javax.swing.JLabel();
        TLabel = new javax.swing.JLabel();
        MLabel = new javax.swing.JLabel();
        FTextField = new javax.swing.JTextField();
        ATextField = new javax.swing.JTextField();
        LTextField = new javax.swing.JTextField();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        oRadioButton = new javax.swing.JRadioButton();
        ETextField = new javax.swing.JTextField();
        TComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        MTextArea = new javax.swing.JTextArea();
        PLabel = new javax.swing.JLabel();
        UButton = new javax.swing.JButton();
        SButton = new javax.swing.JButton();
        alab = new javax.swing.JLabel();
        flab = new javax.swing.JLabel();
        llab = new javax.swing.JLabel();
        plab = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Patient Registration Form");

        FLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FLabel.setText("FirstName:");

        LLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LLabel.setText("LastName:");

        ALabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ALabel.setText("Age:");

        GLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GLabel.setText("Gender:");

        ELabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ELabel.setText("Email:");

        TLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TLabel.setText("Type:");

        MLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MLabel.setText("Message:");

        FTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FTextFieldKeyPressed(evt);
            }
        });

        ATextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ATextFieldKeyPressed(evt);
            }
        });

        LTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LTextFieldKeyPressed(evt);
            }
        });

        GenderbuttonGroup.add(mRadioButton);
        mRadioButton.setText("Male");

        GenderbuttonGroup.add(fRadioButton);
        fRadioButton.setText("Female");

        GenderbuttonGroup.add(oRadioButton);
        oRadioButton.setText("Other");

        TComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Visitor" }));
        TComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TComboBoxActionPerformed(evt);
            }
        });

        MTextArea.setColumns(20);
        MTextArea.setRows(5);
        jScrollPane1.setViewportView(MTextArea);

        PLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PLabel.setText("Photo:");

        UButton.setText("upload");
        UButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UButtonActionPerformed(evt);
            }
        });

        SButton.setText("Submit");
        SButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ALabel)
                                .addComponent(LLabel)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MLabel)
                                    .addComponent(ELabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PLabel, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(FTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(alab))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(flab))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(llab))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mRadioButton)
                                        .addGap(32, 32, 32)
                                        .addComponent(fRadioButton)
                                        .addGap(28, 28, 28)
                                        .addComponent(oRadioButton))
                                    .addComponent(ETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UButton))
                                .addGap(150, 150, 150))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(SButton)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plab, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TitleLabel)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FLabel)
                    .addComponent(FTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLabel)
                    .addComponent(LTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ALabel)
                    .addComponent(ATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mRadioButton)
                        .addComponent(fRadioButton)
                        .addComponent(oRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ELabel)
                    .addComponent(ETextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TLabel)
                            .addComponent(TComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(plab, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PLabel)
                    .addComponent(UButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SButton)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ATextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ATextFieldKeyPressed
        String PATTERN="^[0-9]{0,100}";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(ATextField.getText());
        if(!match.matches()){
            alab.setText("Incorrect Format");
        }
        else{
            alab.setText(null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ATextFieldKeyPressed

    private void TComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TComboBoxActionPerformed

    private void SButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SButtonActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        newUser.setFirstName(FTextField.getText()); 
        newUser.setLastName(LTextField.getText());
        newUser.setAge(ATextField.getText());
        newUser.setType(TComboBox.getSelectedItem().toString()); 
        newUser.setGender(GenderbuttonGroup.getSelection().getActionCommand());
        newUser.setEmail(ETextField.getText()); 
        newUser.setMessage(MTextArea.getText());
        newUser.setPhoto((ImageIcon) plab.getIcon());
        View newView = new View(newUser);
        bottomPanel.add(newView);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_SButtonActionPerformed

    private void FTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FTextFieldKeyPressed
       String PATTERN="^[a-zA-Z]";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(ATextField.getText());
        if(!match.matches()){
            flab.setText("Incorrect Format");
        }
        else{
            flab.setText(null);
        }  
             // TODO add your handling code here:
    }//GEN-LAST:event_FTextFieldKeyPressed

    private void LTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LTextFieldKeyPressed
       String PATTERN="^[a-zA-Z]";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(ATextField.getText());
        if(!match.matches()){
            llab.setText("Incorrect Format");
        }
        else{
            llab.setText(null);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_LTextFieldKeyPressed

    private void UButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
try {
BufferedImage img = ImageIO.read(file.getSelectedFile());
Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
if (edited_image != null) {
PLabel.setText (file.getSelectedFile().getAbsolutePath());
//this.User.setPhoto(new ImageIcon(edited_image));
} else {
throw new Exception();
}
} catch (Exception ex) {
}
}


    }//GEN-LAST:event_UButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALabel;
    private javax.swing.JTextField ATextField;
    private javax.swing.JLabel ELabel;
    private javax.swing.JTextField ETextField;
    private javax.swing.JLabel FLabel;
    private javax.swing.JTextField FTextField;
    private javax.swing.JLabel GLabel;
    private javax.swing.ButtonGroup GenderbuttonGroup;
    private javax.swing.JLabel LLabel;
    private javax.swing.JTextField LTextField;
    private javax.swing.JLabel MLabel;
    private javax.swing.JTextArea MTextArea;
    private javax.swing.JLabel PLabel;
    private javax.swing.JButton SButton;
    private javax.swing.JComboBox<String> TComboBox;
    private javax.swing.JLabel TLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton UButton;
    private javax.swing.JLabel alab;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JLabel flab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel llab;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JRadioButton oRadioButton;
    private javax.swing.JLabel plab;
    // End of variables declaration//GEN-END:variables

    
}
