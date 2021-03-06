/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascrud.Frame;

import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.search;
import tugascrud.Helper.Helper;
import net.proteanit.sql.DbUtils;
import tugascrud.Controller.InController;
import tugascrud.Logic.Logic;
import tugascrud.Model.MainModel;
/**
 *
 * @author hello
 */
public class Incoming extends javax.swing.JFrame {
    MainModel model = new MainModel();
    InController controller = new InController();
    Logic logic = new Logic();
        
    Helper helper = new Helper();
    String goods_id;
    ResultSet rs;
    
    public void search(String type, String query) {
        try {
	if (query.isEmpty()) {
            this.rs = controller.get();
	} else if (type.equals("id") && !query.isEmpty()) {
	    this.rs = controller.showById(query);
	} else if (type.equals("name") && !query.isEmpty()) {
	    this.rs = controller.showByName(query);
	}

			loadTable(this.rs);
	} catch (Exception e) {
		System.out.println(e.getMessage());
    }
}

    public void getAllData() {
        this.rs = controller.get();
        loadTable(this.rs);
    }

    public void loadTable(ResultSet rs) {
        tb_goods.setModel(DbUtils.resultSetToTableModel(rs));
    }
        
    public void clear() {
	tf_name.setText("");
	tf_goods.setText("");
	tf_stock.setText("");
	tf_price.setText("");
	tf_status.setText("");
	cb_type.setSelectedIndex(0);
	dp_income.setDate(null);

	btn_update.setEnabled(false);
	btn_delete.setEnabled(false);
}
    
    public void refresh(){
	clear();
	tf_name.setEnabled(true);
	dp_income.setEnabled(true);
	tf_status.setEnabled(false);
    }

    /**
     * Creates new form Incoming
     */
    public Incoming() {
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

        dp_income = new org.jdesktop.swingx.JXDatePicker();
        btn_submit = new javax.swing.JButton();
        tf_stock = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        tf_price = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_switch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_goods = new javax.swing.JTable();
        tf_status = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_search = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_searchID = new javax.swing.JButton();
        tf_name = new javax.swing.JTextField();
        btn_searchName = new javax.swing.JButton();
        tf_goods = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        dp_income.setBackground(new java.awt.Color(102, 102, 102));

        btn_submit.setBackground(new java.awt.Color(102, 102, 102));
        btn_submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        tf_stock.setBackground(new java.awt.Color(102, 102, 102));

        btn_update.setBackground(new java.awt.Color(102, 102, 102));
        btn_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        tf_price.setBackground(new java.awt.Color(102, 102, 102));

        btn_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_switch.setBackground(new java.awt.Color(102, 102, 102));
        btn_switch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_switch.setText("Pindah ke Outcoming");
        btn_switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_switchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Aplikasi Incoming");

        cb_type.setBackground(new java.awt.Color(102, 102, 102));
        cb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan:", "Elektronik\t", "Pakaian\t", "Makanan & Minuman" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Status");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        tb_goods.setBackground(new java.awt.Color(102, 102, 102));
        tb_goods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_goods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_goodsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tb_goodsMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tb_goods);

        tf_status.setBackground(new java.awt.Color(102, 102, 102));
        tf_status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_statusMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Masuk");

        label_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_search.setText("Pencarian Barang");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stok Barang");

        tf_search.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Harga Barang");

        btn_searchID.setBackground(new java.awt.Color(102, 102, 102));
        btn_searchID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_searchID.setText("Cari dengan Nama");
        btn_searchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchIDActionPerformed(evt);
            }
        });

        tf_name.setBackground(new java.awt.Color(102, 102, 102));

        btn_searchName.setBackground(new java.awt.Color(102, 102, 102));
        btn_searchName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_searchName.setText("Cari dengan ID");
        btn_searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchNameActionPerformed(evt);
            }
        });

        tf_goods.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_price, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_stock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_goods, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_status, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dp_income, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addComponent(btn_switch)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btn_submit)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_update)
                            .addComponent(btn_delete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_searchID)
                        .addGap(18, 18, 18)
                        .addComponent(btn_searchName))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_search))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(tf_goods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addComponent(dp_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_submit)
                                    .addComponent(btn_update))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_switch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_searchID)
                            .addComponent(btn_searchName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        try {
            String name = tf_name.getText();
            String goods_name = tf_goods.getText();
            String type = cb_type.getSelectedItem().toString();
            Date date = dp_income.getDate();
            String stock = tf_stock.getText();
            String price = tf_price.getText();

            model.setIncome_name(name);
            model.setGoods_name(goods_name);
            model.setCategory(type);
            model.setIncoming(date);
            model.setStock(stock);
            model.setPrice(price);

            boolean result = controller.input(model);
            Boolean check_name = logic.checkName(name);
            if (check_name) {
                if (result) {
                    JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data");
                    refresh();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menambahkan Data");
            }
            getAllData();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            String name = tf_name.getText();
            String goods_name = tf_goods.getText();
            String type = cb_type.getSelectedItem().toString();
            Date date = dp_income.getDate();
            String stock = tf_stock.getText();
            String price = tf_price.getText();

            tf_status.setText("1"); //WALAUPUN DIUBAH DI FRAME, VALUENYA TETAP 1

            model.setIncome_name(name);
            model.setGoods_name(goods_name);
            model.setCategory(type);
            model.setIncoming(date);
            model.setStock(stock);
            model.setPrice(price);

            boolean result = controller.update(goods_id, model);
            if (result) {
                JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Mengubah Data");
            }
            refresh();
            getAllData();
            dp_income.setEnabled(true); //SETELAH KLIK BUTTON UPDATE BARU DP_INCOME BISA DIGUNAKAN KEMBALI

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            String status = tf_status.getText();

            model.setDelete_income(status);

            boolean result = controller.delete(goods_id, model);
            if (status.equals("0")) {
            if (result) {
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data");
                refresh();
                }
            } else{
                JOptionPane.showMessageDialog(null, "Ubah Status menjadi angka "
                        + "0 terlebih dahulu untuk menghapus data");
            }
            getAllData();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_switchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_switchActionPerformed
        // TODO add your handling code here:
        Outcoming outcoming = new Outcoming();
        this.setVisible(false);
        outcoming.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_switchActionPerformed

    private void tb_goodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_goodsMouseClicked
        // TODO add your handling code here:
        try {
            String id = helper.getValueRows(tb_goods, 0);
            String name = helper.getValueRows(tb_goods, 1);
            String goods_name = helper.getValueRows(tb_goods, 2);
            String category = helper.getValueRows(tb_goods, 3);
            String incoming = helper.getValueRows(tb_goods, 4);
            String stock = helper.getValueRows(tb_goods, 5);
            String price = helper.getValueRows(tb_goods, 6);
            String status = helper.getValueRows(tb_goods, 7);

            btn_update.setEnabled(true);
            btn_delete.setEnabled(true);

            this.goods_id = id;
            tf_name.setText(name);
            tf_goods.setText(goods_name);
            cb_type.setSelectedItem(category);
            dp_income.setDate(helper.parseStringToDatePickerFormat(incoming));
            dp_income.setEnabled(false);
            tf_status.setEnabled(true);
            tf_name.setEnabled(false); //SUPAYA NAMA PENG INPUT DATA TIDAK BISA DIUBAH
            tf_stock.setText(stock);
            tf_price.setText(price);
            tf_status.setText(status);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_goodsMouseClicked

    private void tb_goodsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_goodsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_goodsMouseExited

    private void tf_statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_statusMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Masukkan angka 0 untuk menghapus Data, lalu klik tombol Delete");
    }//GEN-LAST:event_tf_statusMouseClicked

    private void btn_searchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchIDActionPerformed
        // TODO add your handling code here:
        search("name", tf_search.getText());
    }//GEN-LAST:event_btn_searchIDActionPerformed

    private void btn_searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchNameActionPerformed
        // TODO add your handling code here:
        search("id", tf_search.getText());
    }//GEN-LAST:event_btn_searchNameActionPerformed

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
            java.util.logging.Logger.getLogger(Incoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incoming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_searchID;
    private javax.swing.JButton btn_searchName;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_switch;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_type;
    private org.jdesktop.swingx.JXDatePicker dp_income;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_search;
    private javax.swing.JTable tb_goods;
    private javax.swing.JTextField tf_goods;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_status;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}
