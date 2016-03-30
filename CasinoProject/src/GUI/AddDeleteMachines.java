/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Casino.persistence.DBCasino;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logic.Machine;

/**
 *
 * @author Usuario
 */
public class AddDeleteMachines extends javax.swing.JFrame {

    /**
     * Creates new form AddDeleteMachines
     */
    private DBCasino dataFile;
   
    public DBCasino getDataFile() {
        return dataFile;
    }

    public void setDataFile(DBCasino dataFile) {
        this.dataFile = dataFile;
    }

    public AddDeleteMachines() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Maquinas");
        this.setDataFile(new DBCasino());
        this.selectMachine();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        butBack = new javax.swing.JButton();
        panDetailsAddMachine = new javax.swing.JPanel();
        labNumberMachine = new javax.swing.JLabel();
        labTypeMachine = new javax.swing.JLabel();
        labStartCounter = new javax.swing.JLabel();
        txtNumberMachine = new javax.swing.JTextField();
        rbtPoker = new javax.swing.JRadioButton();
        rbtMultijuego = new javax.swing.JRadioButton();
        txtIn = new javax.swing.JTextField();
        txtOut = new javax.swing.JTextField();
        labIn = new javax.swing.JLabel();
        labOut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JacquiDate = new com.toedter.calendar.JDateChooser();
        butDelete = new javax.swing.JButton();
        butUpdate = new javax.swing.JButton();
        butNew = new javax.swing.JButton();
        butLast = new javax.swing.JButton();
        butNext = new javax.swing.JButton();
        butPrevious = new javax.swing.JButton();
        butFirst = new javax.swing.JButton();
        labNumberMachine1 = new javax.swing.JLabel();
        txtBetValue = new javax.swing.JTextField();
        panDateUsers = new javax.swing.JPanel();
        labPhoto = new javax.swing.JLabel();
        labPokerland = new javax.swing.JLabel();
        labPath = new javax.swing.JLabel();
        butReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        butBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back.PNG"))); // NOI18N
        butBack.setText("Back Menu");
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        panDetailsAddMachine.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles Agregar Maquina"));

        labNumberMachine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labNumberMachine.setText("Number Machine");

        labTypeMachine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTypeMachine.setText("Machine Type ");

        labStartCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labStartCounter.setText("Counters ");

        txtNumberMachine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup1.add(rbtPoker);
        rbtPoker.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtPoker.setText("Poker");

        buttonGroup1.add(rbtMultijuego);
        rbtMultijuego.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtMultijuego.setSelected(true);
        rbtMultijuego.setText("Multijuego");

        txtIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labIn.setText("IN");

        labOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labOut.setText("OUT");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Acquisition Date");

        butDelete.setText("Delete");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        butUpdate.setText("Update");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        butNew.setText("New");
        butNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNewActionPerformed(evt);
            }
        });

        butLast.setText(">|");
        butLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLastActionPerformed(evt);
            }
        });

        butNext.setText(">");
        butNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNextActionPerformed(evt);
            }
        });

        butPrevious.setText("<");
        butPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPreviousActionPerformed(evt);
            }
        });

        butFirst.setText("|<");
        butFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFirstActionPerformed(evt);
            }
        });

        labNumberMachine1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labNumberMachine1.setText("Bet Value");

        javax.swing.GroupLayout panDetailsAddMachineLayout = new javax.swing.GroupLayout(panDetailsAddMachine);
        panDetailsAddMachine.setLayout(panDetailsAddMachineLayout);
        panDetailsAddMachineLayout.setHorizontalGroup(
            panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                        .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labStartCounter)
                            .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                                        .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labNumberMachine)
                                            .addComponent(labTypeMachine))
                                        .addGap(14, 14, 14)
                                        .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labIn)
                                            .addComponent(labOut)))
                                    .addComponent(labNumberMachine1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumberMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                                        .addComponent(rbtPoker)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtMultijuego))
                                    .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtBetValue, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIn, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOut, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JacquiDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                        .addComponent(butFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butLast)
                        .addGap(77, 77, 77)
                        .addComponent(butNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butDelete)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panDetailsAddMachineLayout.setVerticalGroup(
            panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNumberMachine)
                    .addComponent(txtNumberMachine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTypeMachine)
                            .addComponent(rbtPoker)))
                    .addGroup(panDetailsAddMachineLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(rbtMultijuego)))
                .addGap(18, 18, 18)
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labStartCounter)
                    .addComponent(txtIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JacquiDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBetValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNumberMachine1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panDetailsAddMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butFirst)
                    .addComponent(butPrevious)
                    .addComponent(butNext)
                    .addComponent(butLast)
                    .addComponent(butUpdate)
                    .addComponent(butNew)
                    .addComponent(butDelete)))
        );

        panDateUsers.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario"));

        labPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/admon.png"))); // NOI18N

        labPokerland.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/LETRAS.PNG"))); // NOI18N

        javax.swing.GroupLayout panDateUsersLayout = new javax.swing.GroupLayout(panDateUsers);
        panDateUsers.setLayout(panDateUsersLayout);
        panDateUsersLayout.setHorizontalGroup(
            panDateUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDateUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labPokerland, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labPhoto)
                .addGap(19, 19, 19))
        );
        panDateUsersLayout.setVerticalGroup(
            panDateUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDateUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labPokerland, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDateUsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panDateUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPhoto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labPath, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        butReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/clipboard-charts-32.png"))); // NOI18N
        butReport.setText("Report ");
        butReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panDateUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panDetailsAddMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(butBack)
                        .addGap(43, 43, 43)
                        .addComponent(butReport)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panDateUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDetailsAddMachine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
        MenuManager Wconnect = new MenuManager();
        Wconnect.setVisible(true);
        dispose();
    }//GEN-LAST:event_butBackActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "are you to delete record ?",
                "delete record", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.deleteMachine();
            JOptionPane.showMessageDialog(this, "delete record", "delete record",
                    JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
         this.updateMachine();
        JOptionPane.showMessageDialog(this, "Updated record!", "Update record",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_butUpdateActionPerformed

    private void butNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNewActionPerformed
        if (butNew.getText().equalsIgnoreCase("New")) {
            this.newInterface();
        } else if (butNew.getText().equalsIgnoreCase("save")){
            if(validateView()){
                this.insertMachine();
                butNew.setText("New");
                butFirst.setEnabled(true);
                butPrevious.setEnabled(true);
                butNext.setEnabled(true);
                butLast.setEnabled(true);
                butUpdate.setEnabled(true);
                butDelete.setEnabled(true);
            }else{
               JOptionPane.showMessageDialog(this, "Please, fill the requeried fields", 
                        "Error", JOptionPane.ERROR_MESSAGE); 
            }
            
        }
    }//GEN-LAST:event_butNewActionPerformed

    private void butLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLastActionPerformed
        try {
            this.getDataFile().getResultSet().last();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butLastActionPerformed

    private void butNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNextActionPerformed
        try {
            if (!this.getDataFile().getResultSet().isLast()) {
                this.getDataFile().getResultSet().next();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butNextActionPerformed

    private void butPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPreviousActionPerformed
        try {
            if (!this.getDataFile().getResultSet().isFirst()) {
                this.getDataFile().getResultSet().previous();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butPreviousActionPerformed

    private void butFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFirstActionPerformed
        try {
            this.getDataFile().getResultSet().first();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butFirstActionPerformed

    private void butReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReportActionPerformed
//        // TODO add your handling code here:
    }//GEN-LAST:event_butReportActionPerformed

    
  
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
            java.util.logging.Logger.getLogger(AddDeleteMachines.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDeleteMachines.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDeleteMachines.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDeleteMachines.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDeleteMachines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JacquiDate;
    private javax.swing.JButton butBack;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butFirst;
    private javax.swing.JButton butLast;
    private javax.swing.JButton butNew;
    private javax.swing.JButton butNext;
    private javax.swing.JButton butPrevious;
    private javax.swing.JButton butReport;
    private javax.swing.JButton butUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labIn;
    private javax.swing.JLabel labNumberMachine;
    private javax.swing.JLabel labNumberMachine1;
    private javax.swing.JLabel labOut;
    private javax.swing.JLabel labPath;
    private javax.swing.JLabel labPhoto;
    private javax.swing.JLabel labPokerland;
    private javax.swing.JLabel labStartCounter;
    private javax.swing.JLabel labTypeMachine;
    private javax.swing.JPanel panDateUsers;
    private javax.swing.JPanel panDetailsAddMachine;
    private javax.swing.JRadioButton rbtMultijuego;
    private javax.swing.JRadioButton rbtPoker;
    private javax.swing.JTextField txtBetValue;
    private javax.swing.JTextField txtIn;
    private javax.swing.JTextField txtNumberMachine;
    private javax.swing.JTextField txtOut;
    // End of variables declaration//GEN-END:variables

    /**
     * You prepare the interface to enter a new a item
     */
   private void newInterface() {
        txtNumberMachine.setText("");
        txtIn.setText("");
        txtOut.setText("");
        rbtPoker.setSelected(true);
        JacquiDate.setDate(new Date());
        txtBetValue.setText("");
        butNew.setText("Save");
        butFirst.setEnabled(false); 
        butPrevious.setEnabled(false);
        butNext.setEnabled(false);
        butLast.setEnabled(false);
        butDelete.setEnabled(false);
        butUpdate.setEnabled(false);
    }
    private boolean validateView() {
        boolean validate = !(txtNumberMachine.getText().equals("")
                || txtIn.getText().equals("") 
                || txtOut.getText().equals("")
                || (txtBetValue.getText().equals(""))
                || (JacquiDate.getDate() == null));
        return validate;
    }

    /**
     * Obtain the view data and tranfer it to the object
     */
    private Machine view2Object() {
        Machine ma = new Machine();

        ma.setNumberMachine(Integer.parseInt(txtNumberMachine.getText()));
        ma.setMachineType(rbtMultijuego.isSelected() ? 0 : 1);
        ma.setAccountantIn(Long.parseLong(txtIn.getText()));
        ma.setAccountantOut(Long.parseLong(txtOut.getText()));
        ma.setDay(JacquiDate.getDate());
        ma.setBetValue(Long.parseLong(txtBetValue.getText()));
        
        return ma;
    }

    /**
     * You obtain data from an object and pass it to the view
     */
    private void updateView() {
        if (this.getDataFile().getResultSet() == null) {
            this.newInterface();
        }
        else {
            this.object2View();
        }
    }

    /**
     * You prepare the view to enter a new employee data
     */
 

    /**
     * Result set -> object
     */
    private void object2View() {
        Machine ma =new Machine();
        try {
            ma.setNumberMachine(this.getDataFile().getResultSet().getInt("numberMachine"));
            ma.setMachineType(this.getDataFile().getResultSet().getInt("machineType"));
            ma.setAccountantIn(this.getDataFile().getResultSet().getLong("accountantIn"));
            ma.setAccountantOut(this.getDataFile().getResultSet().getLong("accountantOut"));
            ma.setDay(this.getDataFile().getResultSet().getDate("dayAcquisicion"));
            ma.setBetValue(this.getDataFile().getResultSet().getInt("BetValue"));
            this.object2View(ma);
        } catch (SQLException ex) {
            Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Show the object data into view
     * @param employee Employee to show
     */
    private void object2View(Machine ma) {
        txtNumberMachine.setText("" + ma.getNumberMachine());
        txtBetValue.setText(""+ma.getBetValue());
        txtIn.setText(""+ma.getAccountantIn());
        txtOut.setText(""+ma.getAccountantOut());        
        rbtMultijuego.setSelected(ma.getMachineType() == 0);
        rbtPoker.setSelected(ma.getMachineType()==1);
        JacquiDate.setDate(ma.getDay());
    }

    /**
     * Select employees from DB
     */
    private void selectMachine() {
        String query = "SELECT * FROM machine";
        if (this.getDataFile().execute(query)) {
            try {
                this.getDataFile().getResultSet().next();
                this.updateView();
            } catch (SQLException ex) {
                Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Insert new ma
     */
    private void insertMachine() {
        Machine ma = this.view2Object();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String query = "INSERT INTO machine"
                + "(numberMachine, machineType, accountantIn, accountantOut, dayAcquisicion, BetValue) "
                + "VALUES ("
                + ma.getNumberMachine()+ ","
                + ma.getMachineType()+ ","
                + ma.getAccountantIn()+ ","
                + ma.getAccountantOut() + ", #"            
                + dateFormat.format(ma.getDay()) + "#,"
                + ma.getBetValue() + ")";
        if (this.getDataFile().execute(query)) {
            this.selectMachine();
            this.searchMachine(ma.getNumberMachine());
        }
    }

    /**
     * Update ma
     */
    private void updateMachine() {
        Machine ma = this.view2Object();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String query = "UPDATE machine SET "
                + "machineType = " + ma.getMachineType()+ ", "
                + " accountantIn= " + ma.getAccountantIn() + ", "
                + "accountantOut = " + ma.getAccountantOut()+ ", "
                + "dayAcquisicion = #" + dateFormat.format(ma.getDay()) + "#, "
                + "BetValue = " + ma.getBetValue() + " "
                + "WHERE numberMachine = " + ma.getNumberMachine();
        if (this.getDataFile().execute(query)) {
            this.selectMachine();
            this.searchMachine(ma.getNumberMachine());
        }
    }

    /**
     * Delete ma
     */
    private void deleteMachine() {
        Machine ma = this.view2Object();
        String query = "DELETE * FROM machine WHERE numberMachine = " + ma.getNumberMachine();
        if (this.getDataFile().execute(query)) {
            this.selectMachine();
        }        
    }

    /**
     * Search ma by id
     * @param id Employee id
     */
    private void searchMachine(int numberMachine) {
        boolean find = false;
        try {
            if (this.getDataFile().getResultSet() != null) {
                int lastNumberMachine = this.getDataFile().getResultSet().getInt("numberMachine");
                this.getDataFile().getResultSet().beforeFirst();
                while (this.getDataFile().getResultSet().next()) {
                    if (this.getDataFile().getResultSet().getInt("numberMachine") == numberMachine) {
                        find = true;
                        break;
                    }
                }
                if (find) {
                    this.updateView();
                }
                else {
                    this.getDataFile().getResultSet().first();
                    this.searchMachine(lastNumberMachine);
                    JOptionPane.showMessageDialog(this, "Machine" + numberMachine + " was not found!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddDeleteMachines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}


