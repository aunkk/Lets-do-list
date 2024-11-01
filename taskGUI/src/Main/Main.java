package Main;

//import *;
import decorClass.*;
import java.util.HashMap;
import javax.swing.text.*;


public class Main extends javax.swing.JFrame {
    private static String taskname;
    private String dmy;
    private String description;
    private static int state;
    private HashMap taskData = new HashMap(); //date,state,name,des
    
    public Main() {
        initComponents();
        
    }

    public static void setTitleName(String name){
        taskname = name;
    }
    public static void setStatus(int status){
        state = status;
    }
    public HashMap getTaskData() {return taskData;}
    
    public String getTaskDate() {return (String)taskData.get("date");}
    public int getTaskState() {return (int)taskData.get("state");}
    public String getTaskName() {return (String)taskData.get("name");}
    public String getTaskDes() {return (String)taskData.get("des");}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new RoundedPanel(50, 50);
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionText = new javax.swing.JTextArea();
        taskPattern1 = new decorClass.TaskPattern();
        roundedPanel1 = new decorClass.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        roundedPanel2 = new decorClass.RoundedPanel();
        dateField = new javax.swing.JTextField();
        roundedPanel3 = new decorClass.RoundedPanel();
        monthField = new javax.swing.JTextField();
        roundedPanel4 = new decorClass.RoundedPanel();
        yearField = new javax.swing.JTextField();
        doneButton = new decorClass.RoundedButton();

        jTextArea1.setBackground(new java.awt.Color(221, 221, 221));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(221, 221, 221));

        jPanel1.setBackground(new java.awt.Color(133, 210, 203));

        DescriptionText.setBackground(new java.awt.Color(221, 221, 221));
        DescriptionText.setColumns(20);
        DescriptionText.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        DescriptionText.setRows(5);
        DescriptionText.setText("Description...");
        DescriptionText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DescriptionTextMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DescriptionText);

        roundedPanel1.setBackground(new java.awt.Color(146, 203, 228));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Due Date");

        roundedPanel2.setBackground(new java.awt.Color(175, 222, 242));

        dateField.setBackground(new java.awt.Color(175, 222, 242));
        dateField.setColumns(2);
        dateField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setText("DD");
        dateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel3.setBackground(new java.awt.Color(175, 222, 242));

        monthField.setBackground(new java.awt.Color(175, 222, 242));
        monthField.setColumns(2);
        monthField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.setText("MM");
        monthField.setBorder(null);
        monthField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthFieldMouseClicked(evt);
            }
        });
        monthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthField)
                .addContainerGap())
        );

        roundedPanel4.setBackground(new java.awt.Color(175, 222, 242));

        yearField.setBackground(new java.awt.Color(175, 222, 242));
        yearField.setColumns(4);
        yearField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.setText("YYYY");
        yearField.setBorder(null);
        yearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearFieldMouseClicked(evt);
            }
        });
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yearField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        doneButton.setBackground(new java.awt.Color(86, 169, 133));
        doneButton.setText("Done");
        doneButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskPattern1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskPattern1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        String date, month, year;
        date = dateField.getText();
        if (monthField.getText().length() == 1) {
            month = "0"+monthField.getText();
        }else {month = monthField.getText();}
        year = yearField.getText();
        dmy = date + "/" + month + "/" + year;
        
        //taskname = TaskPattern.getTitleName();
        //taskname = TaskPattern.taskTitle.getText();
        
        description = DescriptionText.getText();
        
        System.out.println("-----------");
        System.out.println(dmy);
        System.out.println(state);
        System.out.println(taskname);
        System.out.println(description);
        taskData.put("date", dmy);
        taskData.put("state", state);
        taskData.put("name", taskname);
        taskData.put("des", description);
        System.out.println(taskData.entrySet());
        
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void monthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void dateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFieldMouseClicked
        dateField.selectAll();
    }//GEN-LAST:event_dateFieldMouseClicked

    private void monthFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseClicked
        monthField.selectAll();
    }//GEN-LAST:event_monthFieldMouseClicked

    private void yearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseClicked
        yearField.selectAll();
    }//GEN-LAST:event_yearFieldMouseClicked

    private void DescriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescriptionTextMouseClicked
        if ("Description...".equals(DescriptionText.getText()))
        DescriptionText.selectAll();
    }//GEN-LAST:event_DescriptionTextMouseClicked

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionText;
    private javax.swing.JTextField dateField;
    private decorClass.RoundedButton doneButton;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField monthField;
    private decorClass.RoundedPanel roundedPanel1;
    private decorClass.RoundedPanel roundedPanel2;
    private decorClass.RoundedPanel roundedPanel3;
    private decorClass.RoundedPanel roundedPanel4;
    private decorClass.TaskPattern taskPattern1;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
