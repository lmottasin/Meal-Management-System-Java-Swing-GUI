/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealmanagementsystem;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leemon
 */
public class AddBajar extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public AddBajar() {
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

        workPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        seeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bajarTable = new javax.swing.JTable();
        deleteAll = new javax.swing.JButton();
        delField = new javax.swing.JTextField();
        okButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        afterDelTable = new javax.swing.JTable();
        okButton2 = new javax.swing.JButton();
        headingPanel = new javax.swing.JPanel();
        headingLabel = new javax.swing.JLabel();
        creatorLabel = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        optionLabel = new javax.swing.JLabel();
        entryToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 255));
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(1103, 613));

        workPanel.setBackground(new java.awt.Color(102, 255, 102));

        dateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel.setText("Date:");

        amountLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(0, 0, 0));
        amountLabel.setText("Amount:");

        okButton.setBackground(new java.awt.Color(102, 255, 255));
        okButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        okButton.setForeground(new java.awt.Color(0, 0, 0));
        okButton.setText("ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        seeButton.setBackground(new java.awt.Color(102, 255, 255));
        seeButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        seeButton.setForeground(new java.awt.Color(0, 0, 0));
        seeButton.setText("Click to see all data ( Bajar)");
        seeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeButtonActionPerformed(evt);
            }
        });

        bajarTable.setBackground(new java.awt.Color(102, 255, 255));
        bajarTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        bajarTable.setForeground(new java.awt.Color(0, 0, 0));
        bajarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl. No.", "Date ", "Tk."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bajarTable);
        if (bajarTable.getColumnModel().getColumnCount() > 0) {
            bajarTable.getColumnModel().getColumn(0).setResizable(false);
            bajarTable.getColumnModel().getColumn(1).setResizable(false);
            bajarTable.getColumnModel().getColumn(2).setResizable(false);
        }

        deleteAll.setBackground(new java.awt.Color(102, 255, 255));
        deleteAll.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteAll.setForeground(new java.awt.Color(0, 0, 0));
        deleteAll.setText("Delete");
        deleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllActionPerformed(evt);
            }
        });

        okButton1.setBackground(new java.awt.Color(102, 255, 255));
        okButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        okButton1.setForeground(new java.awt.Color(0, 0, 0));
        okButton1.setText("Enter SL. No:");
        okButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButton1ActionPerformed(evt);
            }
        });

        afterDelTable.setBackground(new java.awt.Color(102, 255, 255));
        afterDelTable.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        afterDelTable.setForeground(new java.awt.Color(0, 0, 0));
        afterDelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl. No.", "Date ", "Tk."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(afterDelTable);
        if (afterDelTable.getColumnModel().getColumnCount() > 0) {
            afterDelTable.getColumnModel().getColumn(0).setResizable(false);
            afterDelTable.getColumnModel().getColumn(1).setResizable(false);
            afterDelTable.getColumnModel().getColumn(2).setResizable(false);
        }

        okButton2.setBackground(new java.awt.Color(102, 255, 255));
        okButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        okButton2.setForeground(new java.awt.Color(0, 0, 0));
        okButton2.setText("After Deletion:");
        okButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(dateLabel)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(amountField))
                        .addGap(56, 56, 56)
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                                .addComponent(okButton1)
                                .addGap(37, 37, 37)
                                .addComponent(delField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(deleteAll)
                                .addGap(23, 23, 23))
                            .addComponent(seeButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(okButton2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAll)
                    .addComponent(delField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton1))
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLabel)
                            .addComponent(okButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(okButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headingPanel.setBackground(new java.awt.Color(255, 51, 51));

        headingLabel.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        headingLabel.setText("Meal Management System");

        creatorLabel.setFont(new java.awt.Font("Blackadder ITC", 3, 24)); // NOI18N
        creatorLabel.setForeground(new java.awt.Color(0, 0, 0));
        creatorLabel.setText("By M.Leemon");

        javax.swing.GroupLayout headingPanelLayout = new javax.swing.GroupLayout(headingPanel);
        headingPanel.setLayout(headingPanelLayout);
        headingPanelLayout.setHorizontalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(creatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headingPanelLayout.setVerticalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionPanel.setBackground(new java.awt.Color(255, 204, 51));
        optionPanel.setForeground(new java.awt.Color(0, 0, 0));

        optionLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        optionLabel.setForeground(new java.awt.Color(0, 0, 0));
        optionLabel.setText("Options");

        entryToggleButton.setBackground(new java.awt.Color(102, 255, 102));
        entryToggleButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        entryToggleButton.setText("Home Page");
        entryToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(optionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryToggleButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionLabel)
                .addGap(34, 34, 34)
                .addComponent(entryToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryToggleButtonActionPerformed
       
              
           Homepage hm= new Homepage();
           hm.setVisible(true);
           this.setVisible(false);
          
         
    }//GEN-LAST:event_entryToggleButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            
 
             
           {
                   BufferedWriter xr= new BufferedWriter( new FileWriter("bajar.txt",true));
                   xr.write(dateField.getText()+ ","+ amountField.getText());
                   xr.newLine();
                   xr.close();
           }
            
            
            
            
            
            
        } catch (IOException ex) {
            
        }
         
    }//GEN-LAST:event_okButtonActionPerformed

    private void deleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllActionPerformed
        try
        {
             String q;
             
             BufferedReader wr= new BufferedReader( new FileReader("bajar.txt"));
                BufferedWriter xr= new BufferedWriter( new FileWriter ("catch.txt"));
               while( (q=wr.readLine()  )!=null)
                       {
                           xr.write(q);
                           
                            
                           xr.newLine();
                           
                       }   
               xr.close();
               
              
               
               BufferedReader sr= new BufferedReader( new FileReader("catch.txt"));
            
              String z;
                 ArrayList<String > a = new ArrayList();
                  
                 while( (z=sr.readLine()  )!=null)
                       { 
                           
                       
                         a.add(z);
                             
                           
                       }
                 int v= Integer.parseInt(delField.getText());
                 v--;
                   if (   v<a.size()){  
                   BufferedWriter br= new BufferedWriter( new FileWriter ("bajar.txt"));
                 a.remove(v);
               //  String [] xll= new String[a.size()];
               //  xll = (String[]) a.toArray();
                  for( int i=0; i<a.size();i++)
                  {
                      String zz=a.get(i);
                      br.write(zz);
                      br.newLine();
                      
                  }
          br.close();
               
          
          
                 try
         {
             BufferedReader wwr = new BufferedReader ( new FileReader ( "bajar.txt"));
             String s;
             int i=0;
             while( (s=wwr.readLine())!=null)
             {
                 String []c= s.split(",");
                   DefaultTableModel model= (DefaultTableModel) afterDelTable.getModel();
                   model.addRow(new Object [] {++i,c[0],c[1]});
                 
             }
         }
         catch( Exception xll )
         {
             
         }
               
               
               
        }
        }
        catch( Exception vvt)
        {
            
        }
    }//GEN-LAST:event_deleteAllActionPerformed

    private void seeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeButtonActionPerformed
         try
         {
             BufferedReader wr = new BufferedReader ( new FileReader ( "bajar.txt"));
             String s;
             int i=0;
             while( (s=wr.readLine())!=null)
             {
                 String []c= s.split(",");
                   DefaultTableModel model= (DefaultTableModel) bajarTable.getModel();
                   model.addRow(new Object [] {++i,c[0],c[1]});
                 
             }
         }
         catch( Exception xll )
         {
             
         }
    }//GEN-LAST:event_seeButtonActionPerformed

    private void okButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okButton1ActionPerformed

    private void okButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable afterDelTable;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTable bajarTable;
    private javax.swing.JLabel creatorLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField delField;
    private javax.swing.JButton deleteAll;
    private javax.swing.JToggleButton entryToggleButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JPanel headingPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton okButton;
    private javax.swing.JButton okButton1;
    private javax.swing.JButton okButton2;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JButton seeButton;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
