/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacist_Pharmacy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import logIn.logIn;

/**
 *
 * @author User
 */
public class ConfirmMed_Pharmacist extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmMed_Admin
     * @param data
     */
    public ConfirmMed_Pharmacist(Object[] data) {
        this.d = data;
        TableModel tableModel = (TableModel) jTable1.getModel();
        //Temp_MedList[] medTemp;
        int[] index = jTable1.getSelectedRows();
        //medTemp = new Temp_MedList[index.length];
//        d = medTemp;
        for (int i = 0; i < index.length; i++) {
            data[i] = tableModel.getValueAt(index[i], 0);
            data[i] = tableModel.getValueAt(index[i], 1);
            data[i] = tableModel.getValueAt(index[i], 2);
            data[i] = tableModel.getValueAt(index[i], 3);
            data[i] = tableModel.getValueAt(index[i], 4);
            tableModel.setValueAt(data, i, 0);
            tableModel.setValueAt(data, i, 1);
            tableModel.setValueAt(data, i, 2);
            tableModel.setValueAt(data, i, 3);
            tableModel.setValueAt(data, i, 4);
        }
        initComponents();
    }
    
    public ConfirmMed_Pharmacist() {
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

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        addMed3 = new javax.swing.JButton();
        sellMed3 = new javax.swing.JButton();
        profit3 = new javax.swing.JButton();
        changePrice3 = new javax.swing.JButton();
        inventory3 = new javax.swing.JButton();
        myAccount3 = new javax.swing.JButton();
        logOut3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 168, 8));

        close.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel2.setText("CONfir med medicines");

        jLabel3.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel3.setText("-");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(close)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(close))
                .addGap(10, 10, 10))
        );

        jPanel6.setBackground(new java.awt.Color(42, 62, 80));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setText("jLabel4");

        jPanel7.setBackground(new java.awt.Color(42, 62, 80));

        addMed3.setText("Add Med");
        addMed3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMed3MouseClicked(evt);
            }
        });

        sellMed3.setText("Sell Med");
        sellMed3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellMed3MouseClicked(evt);
            }
        });

        profit3.setText("Profit");
        profit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profit3MouseClicked(evt);
            }
        });

        changePrice3.setText("Change Price");
        changePrice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePrice3MouseClicked(evt);
            }
        });

        inventory3.setText("Inventory");
        inventory3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventory3MouseClicked(evt);
            }
        });

        myAccount3.setText("My Account");
        myAccount3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myAccount3MouseClicked(evt);
            }
        });

        logOut3.setText("Log-Out");
        logOut3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOut3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(addMed3)
                        .addGap(18, 18, 18)
                        .addComponent(sellMed3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(profit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(inventory3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(myAccount3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(changePrice3))
                    .addComponent(logOut3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMed3)
                    .addComponent(sellMed3)
                    .addComponent(profit3)
                    .addComponent(changePrice3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inventory3)
                    .addComponent(myAccount3)
                    .addComponent(logOut3)))
        );

        jScrollPane2.setBackground(new java.awt.Color(42, 62, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Generic Name", "Brand Name", "Quantity", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        cancel.setBackground(new java.awt.Color(192, 57, 43));
        cancel.setText("Cancel");

        cancel1.setBackground(new java.awt.Color(192, 57, 43));
        cancel1.setText("Submit");
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(cancel)
                .addGap(29, 29, 29)
                .addComponent(cancel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(cancel1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame = new JFrame();
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Pharmacy Store",
                JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void addMed3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMed3MouseClicked
        Phar_ADD_MED addMed = new Phar_ADD_MED();
        addMed.setVisible(true);
        addMed.pack();
        addMed.setLocationRelativeTo(null);
        addMed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_addMed3MouseClicked

    private void sellMed3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellMed3MouseClicked
        Phar_SELL_MED sellMed = new Phar_SELL_MED();
        sellMed.setVisible(true);
        sellMed.pack();
        sellMed.setLocationRelativeTo(null);
        sellMed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_sellMed3MouseClicked

    private void profit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profit3MouseClicked
        Phar_Profit prof = new Phar_Profit();
        prof.setVisible(true);
        prof.setVisible(true);
        prof.setLocationRelativeTo(null);
        prof.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_profit3MouseClicked

    private void changePrice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePrice3MouseClicked
        Phar_ChangePrice chaPrice = new Phar_ChangePrice();
        chaPrice.setVisible(true);
        chaPrice.pack();
        chaPrice.setLocationRelativeTo(null);
        chaPrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_changePrice3MouseClicked

    private void inventory3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory3MouseClicked
        Phar_Inventory invent = new Phar_Inventory();
        invent.setVisible(true);
        invent.setVisible(true);
        invent.setLocationRelativeTo(null);
        invent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_inventory3MouseClicked

    private void myAccount3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccount3MouseClicked
        Phar_MyAccount pharData = new Phar_MyAccount();
        pharData.setVisible(true);
        pharData.pack();
        pharData.setLocationRelativeTo(null);
        pharData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_myAccount3MouseClicked

    private void logOut3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut3MouseClicked
        logIn lG = new logIn();
        lG.setVisible(true);
        lG.setVisible(true);
        lG.setLocationRelativeTo(null);
        lG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logOut3MouseClicked

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        
    }//GEN-LAST:event_cancel1MouseClicked

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
            java.util.logging.Logger.getLogger(ConfirmMed_Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmMed_Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmMed_Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmMed_Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmMed_Pharmacist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMed3;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton changePrice3;
    private javax.swing.JLabel close;
    private javax.swing.JButton inventory3;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOut3;
    private javax.swing.JButton myAccount3;
    private javax.swing.JButton profit3;
    private javax.swing.JButton sellMed3;
    // End of variables declaration//GEN-END:variables
    Object[] d;
}
