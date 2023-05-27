/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chosenchilde.cadastro_de_trecos.gui;

import chosenchilde.cadastro_de_trecos.db.DbConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 16128412023.1
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
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

        btnListAll = new javax.swing.JButton();
        btnListById = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        panelListAll = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListAll = new javax.swing.JTable();
        panelListById = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelRegister = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelEdit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelDelete = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Trecos");
        setPreferredSize(new java.awt.Dimension(656, 488));

        btnListAll.setText("Listar Todos");
        btnListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAllActionPerformed(evt);
            }
        });

        btnListById.setText("Listar pelo ID");
        btnListById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListByIdActionPerformed(evt);
            }
        });

        btnRegister.setText("Cadastrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Apagar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Trecos");

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listar Todos");
        jLabel2.setToolTipText("");

        tableListAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListAll.setToolTipText("");
        tableListAll.setColumnSelectionAllowed(true);
        tableListAll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableListAll.setName(""); // NOI18N
        tableListAll.setRowHeight(30);
        tableListAll.setShowGrid(true);
        jScrollPane1.setViewportView(tableListAll);
        tableListAll.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tableListAll.getColumnModel().getColumnCount() > 0) {
            tableListAll.getColumnModel().getColumn(0).setMinWidth(30);
            tableListAll.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableListAll.getColumnModel().getColumn(0).setMaxWidth(100);
            tableListAll.getColumnModel().getColumn(1).setMinWidth(100);
            tableListAll.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableListAll.getColumnModel().getColumn(1).setMaxWidth(300);
            tableListAll.getColumnModel().getColumn(2).setMinWidth(100);
            tableListAll.getColumnModel().getColumn(2).setPreferredWidth(500);
            tableListAll.getColumnModel().getColumn(2).setMaxWidth(600);
        }

        javax.swing.GroupLayout panelListAllLayout = new javax.swing.GroupLayout(panelListAll);
        panelListAll.setLayout(panelListAllLayout);
        panelListAllLayout.setHorizontalGroup(
            panelListAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListAllLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        panelListAllLayout.setVerticalGroup(
            panelListAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        mainPanel.add(panelListAll, "cardListAll");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listar pelo ID");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout panelListByIdLayout = new javax.swing.GroupLayout(panelListById);
        panelListById.setLayout(panelListByIdLayout);
        panelListByIdLayout.setHorizontalGroup(
            panelListByIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListByIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListByIdLayout.setVerticalGroup(
            panelListByIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListByIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        mainPanel.add(panelListById, "cardListById");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastrar");
        jLabel4.setToolTipText("");

        jLabel7.setText("Nome:");

        jLabel8.setText("Descrição:");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        mainPanel.add(panelRegister, "cardRegister");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editar");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        mainPanel.add(panelEdit, "cardEdit");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Deletar");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout panelDeleteLayout = new javax.swing.GroupLayout(panelDelete);
        panelDelete.setLayout(panelDeleteLayout);
        panelDeleteLayout.setHorizontalGroup(
            panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDeleteLayout.setVerticalGroup(
            panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        mainPanel.add(panelDelete, "cardDelete");

        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListById)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListAll)
                    .addComponent(btnListById)
                    .addComponent(btnRegister)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(672, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAllActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardListAll");
    }//GEN-LAST:event_btnListAllActionPerformed

    private void btnListByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListByIdActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardListById");
    }//GEN-LAST:event_btnListByIdActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardRegister");
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardEdit");
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardDelete");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja finalizar o programa?",
                "Deseja sair?",
                YES_NO_OPTION
        );
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
                listAll();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnListAll;
    private javax.swing.JButton btnListById;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelDelete;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelListAll;
    private javax.swing.JPanel panelListById;
    private javax.swing.JPanel panelRegister;
    private static javax.swing.JTable tableListAll;
    // End of variables declaration//GEN-END:variables

  public static void listAll() {
        try {
            String sql = "SELECT * FROM things";
            Connection conn = DbConnection.dbConnect();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            DefaultTableModel model = (DefaultTableModel) tableListAll.getModel();
            model.setNumRows(0);

            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("name"),
                    res.getString("description")
                });
            }
            
            DbConnection.dbClose(res, stmt, null, conn);

        } catch (SQLException error) {
            // Tratamento de erros.
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }
    }

}
