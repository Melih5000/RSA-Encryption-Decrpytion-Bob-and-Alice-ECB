
import java.awt.Toolkit;

public class RSA_Page extends javax.swing.JFrame {

    RSA math_Calculate;

    public RSA_Page() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("codingbrowser_102152.png")));
        initComponents();
        this.setSize(632, 1002);
        setLocationRelativeTo(null);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        textE1 = new javax.swing.JLabel();
        pr1kk = new javax.swing.JLabel();
        cipherTextInfoArea = new javax.swing.JLabel();
        p1k = new javax.swing.JLabel();
        pr1k = new javax.swing.JLabel();
        generateKeysForAlice = new javax.swing.JButton();
        textPArea1 = new javax.swing.JTextField();
        textQArea1 = new javax.swing.JTextField();
        textP1 = new javax.swing.JLabel();
        textQ1 = new javax.swing.JLabel();
        ForEncryptionMessageArea = new javax.swing.JTextField();
        textEArea1 = new javax.swing.JTextField();
        encryption = new javax.swing.JButton();
        ForEncryptionMessage = new javax.swing.JLabel();
        p1kk = new javax.swing.JLabel();
        textE2 = new javax.swing.JLabel();
        privatet2A = new javax.swing.JLabel();
        plainTextInfoArea = new javax.swing.JLabel();
        decryption = new javax.swing.JButton();
        textEArea2 = new javax.swing.JTextField();
        generateKeysForBob = new javax.swing.JButton();
        textPArea2 = new javax.swing.JTextField();
        plainTextInfo = new javax.swing.JLabel();
        textQArea2 = new javax.swing.JTextField();
        publict2 = new javax.swing.JLabel();
        ForDecryptionMessageArea = new javax.swing.JTextField();
        privatet2 = new javax.swing.JLabel();
        textP2 = new javax.swing.JLabel();
        textQ2 = new javax.swing.JLabel();
        ForDecryptionMessage = new javax.swing.JLabel();
        publict2A = new javax.swing.JLabel();
        Bob = new javax.swing.JLabel();
        ECBRSA = new javax.swing.JLabel();
        cipherTexIinfo = new javax.swing.JLabel();
        Alice = new javax.swing.JLabel();
        ciphertext3 = new javax.swing.JLabel();
        infoMessage = new javax.swing.JLabel();
        ciphertext6 = new javax.swing.JLabel();
        ciphertext7 = new javax.swing.JLabel();
        ciphertext8 = new javax.swing.JLabel();
        ciphertext9 = new javax.swing.JLabel();
        ciphertext10 = new javax.swing.JLabel();
        ciphertext11 = new javax.swing.JLabel();
        ciphertext12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(filler1);
        filler1.setBounds(675, 77, 0, 457);

        textE1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textE1.setText("E:");
        getContentPane().add(textE1);
        textE1.setBounds(20, 210, 20, 22);

        pr1kk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pr1kk.setText("After generation, you can see it");
        getContentPane().add(pr1kk);
        pr1kk.setBounds(80, 260, 500, 15);

        cipherTextInfoArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cipherTextInfoArea.setText("After clicking encrypt button you can see it.");
        getContentPane().add(cipherTextInfoArea);
        cipherTextInfoArea.setBounds(100, 460, 490, 17);

        p1k.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        p1k.setText("Public key:");
        getContentPane().add(p1k);
        p1k.setBounds(10, 260, 58, 15);

        pr1k.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pr1k.setText("Private Key:");
        getContentPane().add(pr1k);
        pr1k.setBounds(10, 290, 65, 15);

        generateKeysForAlice.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        generateKeysForAlice.setForeground(new java.awt.Color(0, 204, 204));
        generateKeysForAlice.setText("Generate For Keys");
        generateKeysForAlice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateKeysForAliceActionPerformed(evt);
            }
        });
        getContentPane().add(generateKeysForAlice);
        generateKeysForAlice.setBounds(20, 320, 180, 40);
        getContentPane().add(textPArea1);
        textPArea1.setBounds(40, 110, 470, 37);
        getContentPane().add(textQArea1);
        textQArea1.setBounds(40, 160, 470, 37);

        textP1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textP1.setText("P:");
        getContentPane().add(textP1);
        textP1.setBounds(20, 110, 20, 22);

        textQ1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textQ1.setText("Q:");
        getContentPane().add(textQ1);
        textQ1.setBounds(20, 160, 20, 22);
        getContentPane().add(ForEncryptionMessageArea);
        ForEncryptionMessageArea.setBounds(230, 360, 370, 35);
        getContentPane().add(textEArea1);
        textEArea1.setBounds(40, 210, 470, 33);

        encryption.setBackground(new java.awt.Color(255, 255, 255));
        encryption.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        encryption.setForeground(new java.awt.Color(51, 204, 0));
        encryption.setText("Encrypt");
        encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionActionPerformed(evt);
            }
        });
        getContentPane().add(encryption);
        encryption.setBounds(320, 400, 200, 49);

        ForEncryptionMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ForEncryptionMessage.setText("Message To Be Encrypted:");
        getContentPane().add(ForEncryptionMessage);
        ForEncryptionMessage.setBounds(10, 370, 220, 22);

        p1kk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        p1kk.setText("After generation, you can see it.");
        getContentPane().add(p1kk);
        p1kk.setBounds(80, 290, 510, 15);

        textE2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textE2.setText("E:");
        getContentPane().add(textE2);
        textE2.setBounds(20, 700, 20, 22);

        privatet2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet2A.setText("After generation, you can see it.");
        getContentPane().add(privatet2A);
        privatet2A.setBounds(70, 740, 500, 15);

        plainTextInfoArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plainTextInfoArea.setText("After clicking decrypt button, you can see it.");
        getContentPane().add(plainTextInfoArea);
        plainTextInfoArea.setBounds(90, 940, 510, 17);

        decryption.setBackground(new java.awt.Color(255, 255, 255));
        decryption.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        decryption.setForeground(new java.awt.Color(255, 51, 0));
        decryption.setText("Decrypt");
        decryption.setAutoscrolls(true);
        decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionActionPerformed(evt);
            }
        });
        getContentPane().add(decryption);
        decryption.setBounds(320, 880, 200, 50);
        getContentPane().add(textEArea2);
        textEArea2.setBounds(40, 700, 460, 31);

        generateKeysForBob.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        generateKeysForBob.setForeground(new java.awt.Color(0, 204, 204));
        generateKeysForBob.setText("Generate For Keys");
        generateKeysForBob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateKeysForBobActionPerformed(evt);
            }
        });
        getContentPane().add(generateKeysForBob);
        generateKeysForBob.setBounds(20, 800, 190, 41);
        getContentPane().add(textPArea2);
        textPArea2.setBounds(40, 600, 460, 34);

        plainTextInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plainTextInfo.setText("Plain Text :");
        getContentPane().add(plainTextInfo);
        plainTextInfo.setBounds(10, 940, 68, 17);
        getContentPane().add(textQArea2);
        textQArea2.setBounds(40, 650, 460, 34);

        publict2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict2.setText("Public key:");
        getContentPane().add(publict2);
        publict2.setBounds(10, 740, 70, 15);
        getContentPane().add(ForDecryptionMessageArea);
        ForDecryptionMessageArea.setBounds(230, 840, 370, 34);

        privatet2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet2.setText("Private Key:");
        getContentPane().add(privatet2);
        privatet2.setBounds(10, 770, 70, 15);

        textP2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textP2.setText("P:");
        getContentPane().add(textP2);
        textP2.setBounds(20, 600, 16, 22);

        textQ2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textQ2.setText("Q:");
        getContentPane().add(textQ2);
        textQ2.setBounds(20, 650, 19, 22);

        ForDecryptionMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ForDecryptionMessage.setText("Message To Be Decrypted:");
        getContentPane().add(ForDecryptionMessage);
        ForDecryptionMessage.setBounds(10, 850, 220, 22);

        publict2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict2A.setText("After generation, you can see it.");
        getContentPane().add(publict2A);
        publict2A.setBounds(80, 770, 500, 15);

        Bob.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bob.setText("Receiver");
        getContentPane().add(Bob);
        Bob.setBounds(250, 550, 130, 29);

        ECBRSA.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ECBRSA.setText("ECB RSA");
        getContentPane().add(ECBRSA);
        ECBRSA.setBounds(260, 20, 110, 29);

        cipherTexIinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cipherTexIinfo.setText("Cipher Text :");
        getContentPane().add(cipherTexIinfo);
        cipherTexIinfo.setBounds(10, 460, 80, 17);

        Alice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Alice.setText("Sender");
        getContentPane().add(Alice);
        Alice.setBounds(270, 70, 100, 29);

        ciphertext3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext3.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext3);
        ciphertext3.setBounds(0, 520, 620, 30);

        infoMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        infoMessage.setText("Please copy the cipher text area to message to be decrypted area and after decrpyt it.");
        getContentPane().add(infoMessage);
        infoMessage.setBounds(40, 500, 540, 30);

        ciphertext6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext6.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext6);
        ciphertext6.setBounds(0, 40, 630, 30);

        ciphertext7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext7.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext7);
        ciphertext7.setBounds(0, 520, 610, 30);

        ciphertext8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext8.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext8);
        ciphertext8.setBounds(0, 480, 610, 30);

        ciphertext9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext9.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext9);
        ciphertext9.setBounds(0, 480, 630, 30);

        ciphertext10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext10.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext10);
        ciphertext10.setBounds(0, 0, 630, 30);

        ciphertext11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext11.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext11);
        ciphertext11.setBounds(0, 0, 630, 30);

        ciphertext12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext12.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getContentPane().add(ciphertext12);
        ciphertext12.setBounds(0, 40, 630, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void generateKeysForAliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateKeysForAliceActionPerformed
        math_Calculate = new RSA(textPArea1.getText(), textQArea1.getText(), textEArea1.getText());
        math_Calculate.factorial();
        p1kk.setText("(" + math_Calculate.E + "," + math_Calculate.calculatefact1 + ")");
        pr1kk.setText("(" + math_Calculate.calculatefact4 + "," + math_Calculate.calculatefact1 + ")");
        math_Calculate.getalphabet();
    }//GEN-LAST:event_generateKeysForAliceActionPerformed

    private void encryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionActionPerformed
        math_Calculate = new RSA(textPArea2.getText(), textQArea2.getText(), textEArea2.getText());
        math_Calculate.factorial();
        math_Calculate.Encryption(ForEncryptionMessageArea.getText());
        cipherTextInfoArea.setText(math_Calculate.cipher.toString());
    }//GEN-LAST:event_encryptionActionPerformed

    private void decryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionActionPerformed
        math_Calculate = new RSA(textPArea2.getText(), textQArea2.getText(), textEArea2.getText());
        math_Calculate.factorial();
        math_Calculate.Decryption(ForDecryptionMessageArea.getText());
        plainTextInfoArea.setText(math_Calculate.cipher.toString());

    }//GEN-LAST:event_decryptionActionPerformed

    private void generateKeysForBobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateKeysForBobActionPerformed
        math_Calculate = new RSA(textPArea2.getText(), textQArea2.getText(), textEArea2.getText());
        math_Calculate.factorial();
        publict2A.setText("(" + math_Calculate.E + "," + math_Calculate.calculatefact1 + ")");
        privatet2A.setText("(" + math_Calculate.calculatefact4 + "," + math_Calculate.calculatefact1 + ")");
    }//GEN-LAST:event_generateKeysForBobActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RSA_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alice;
    private javax.swing.JLabel Bob;
    private javax.swing.JLabel ECBRSA;
    private javax.swing.JLabel ForDecryptionMessage;
    private javax.swing.JTextField ForDecryptionMessageArea;
    private javax.swing.JLabel ForEncryptionMessage;
    private javax.swing.JTextField ForEncryptionMessageArea;
    private javax.swing.JLabel cipherTexIinfo;
    private javax.swing.JLabel cipherTextInfoArea;
    private javax.swing.JLabel ciphertext10;
    private javax.swing.JLabel ciphertext11;
    private javax.swing.JLabel ciphertext12;
    private javax.swing.JLabel ciphertext3;
    private javax.swing.JLabel ciphertext6;
    private javax.swing.JLabel ciphertext7;
    private javax.swing.JLabel ciphertext8;
    private javax.swing.JLabel ciphertext9;
    private javax.swing.JButton decryption;
    private javax.swing.JButton encryption;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton generateKeysForAlice;
    private javax.swing.JButton generateKeysForBob;
    private javax.swing.JLabel infoMessage;
    private javax.swing.JLabel p1k;
    private javax.swing.JLabel p1kk;
    private javax.swing.JLabel plainTextInfo;
    private javax.swing.JLabel plainTextInfoArea;
    private javax.swing.JLabel pr1k;
    private javax.swing.JLabel pr1kk;
    private javax.swing.JLabel privatet2;
    private javax.swing.JLabel privatet2A;
    private javax.swing.JLabel publict2;
    private javax.swing.JLabel publict2A;
    private javax.swing.JLabel textE1;
    private javax.swing.JLabel textE2;
    private javax.swing.JTextField textEArea1;
    private javax.swing.JTextField textEArea2;
    private javax.swing.JLabel textP1;
    private javax.swing.JLabel textP2;
    private javax.swing.JTextField textPArea1;
    private javax.swing.JTextField textPArea2;
    private javax.swing.JLabel textQ1;
    private javax.swing.JLabel textQ2;
    private javax.swing.JTextField textQArea1;
    private javax.swing.JTextField textQArea2;
    // End of variables declaration//GEN-END:variables
}
