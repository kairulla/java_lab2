
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruslan
 */
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
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

        jLabel_x = new javax.swing.JLabel();
        jLabel_a = new javax.swing.JLabel();
        jLabel_b = new javax.swing.JLabel();
        jButton_reshit = new javax.swing.JButton();
        jButton_ochistit = new javax.swing.JButton();
        jButton_vikhod = new javax.swing.JButton();
        jLabel_otvet = new javax.swing.JLabel();
        jLabel_primer = new javax.swing.JLabel();
        jTextField_x = new javax.swing.JTextField();
        jTextField_a = new javax.swing.JTextField();
        jTextField_b = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Лабораторная №2");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel_x.setText("X =");
        getContentPane().add(jLabel_x);
        jLabel_x.setBounds(25, 29, 23, 15);

        jLabel_a.setText("A =");
        getContentPane().add(jLabel_a);
        jLabel_a.setBounds(25, 54, 23, 15);

        jLabel_b.setText("B =");
        getContentPane().add(jLabel_b);
        jLabel_b.setBounds(25, 81, 23, 15);

        jButton_reshit.setText("РЕШИТЬ");
        jButton_reshit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reshitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reshit);
        jButton_reshit.setBounds(50, 120, 170, 25);

        jButton_ochistit.setText("ОЧИСТИТЬ");
        jButton_ochistit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ochistitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ochistit);
        jButton_ochistit.setBounds(50, 150, 170, 25);

        jButton_vikhod.setText("ВЫХОД");
        jButton_vikhod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vikhodActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_vikhod);
        jButton_vikhod.setBounds(50, 180, 170, 25);
        getContentPane().add(jLabel_otvet);
        jLabel_otvet.setBounds(230, 220, 480, 50);

        jLabel_primer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2021-09-10_20-59-25.png"))); // NOI18N
        getContentPane().add(jLabel_primer);
        jLabel_primer.setBounds(230, 30, 480, 180);
        getContentPane().add(jTextField_x);
        jTextField_x.setBounds(49, 27, 170, 19);
        getContentPane().add(jTextField_a);
        jTextField_a.setBounds(49, 52, 170, 19);
        getContentPane().add(jTextField_b);
        jTextField_b.setBounds(49, 79, 170, 19);

        setSize(new java.awt.Dimension(732, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_reshitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reshitActionPerformed
        float x = 0, y = 0, a = 0, b = 0;
        try {
            try {
                x = Float.parseFloat(jTextField_x.getText());
            } catch (NumberFormatException e) {
                jTextField_x.setText("");
                jTextField_x.requestFocus(); 
                return;
            }

            try {
                a = Float.parseFloat(jTextField_a.getText());
            } catch (NumberFormatException e) {
                jTextField_a.setText("");
                jTextField_a.requestFocus(); 
                return;
            }
            try {
                b = Float.parseFloat(jTextField_b.getText());
            } catch (NumberFormatException e) {
                jTextField_b.setText("");
                jTextField_b.requestFocus(); 
                return;
            }
            try {
                //if (x >= -1000000 && a >= -1000000 && b >= -1000000 && x <= 1000000 && a <= 1000000 && b <= 1000000) {
                if (x <= 4 && x != 0) {
                    y = (a * a) / (x * x) + (6 * x);
                    jLabel_otvet.setText(String.valueOf(y));
                }
                if (x == 0) {
                    jLabel_otvet.setText("Обнаружен ноль в знаменателе!");
                }
                if (x > 4) {
                    y = b * b * ((4 + x) * (4 + x));
                    jLabel_otvet.setText(String.valueOf(new DecimalFormat("#0.00").format(y))); 
                }
                if (Float.isInfinite(y) || Float.isNaN(y)) {
                    throw new Exception("error");
                }
                //} else {
            } catch (Exception e) {
                jLabel_otvet.setText("Ошибка при расчете значения!");
            }
        } catch (Exception e) {
            jLabel_otvet.setText("Введите нормальные значения!");
        }
    }//GEN-LAST:event_jButton_reshitActionPerformed

    private void jButton_ochistitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ochistitActionPerformed
        jLabel_otvet.setText("");
        jTextField_x.setText("");
        jTextField_a.setText("");
        jTextField_b.setText("");
    }//GEN-LAST:event_jButton_ochistitActionPerformed

    private void jButton_vikhodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vikhodActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_vikhodActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ochistit;
    private javax.swing.JButton jButton_reshit;
    private javax.swing.JButton jButton_vikhod;
    private javax.swing.JLabel jLabel_a;
    private javax.swing.JLabel jLabel_b;
    private javax.swing.JLabel jLabel_otvet;
    private javax.swing.JLabel jLabel_primer;
    private javax.swing.JLabel jLabel_x;
    private javax.swing.JTextField jTextField_a;
    private javax.swing.JTextField jTextField_b;
    private javax.swing.JTextField jTextField_x;
    // End of variables declaration//GEN-END:variables
}
