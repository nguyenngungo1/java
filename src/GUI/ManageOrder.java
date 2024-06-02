/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.Chtlutils;
import dao.ConnectionProvider;
import helper.OpenPdf;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Pecision
 */
public class ManageOrder extends javax.swing.JFrame {

    private int ID_HH = 0;
    private int ID_KH = 0;
    private int tongtien = 0;
    private String Mahd = "";

    public ManageOrder() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private void clearproductfield() {
        ID_HH = 0;
        txtproductname.setText("");
        txtproductprice.setText("");
        txtproductdes.setText("");
        txtproductquantity.setText("");

    }

    private String GetUniqueId(String prefix) {
        return prefix + System.nanoTime();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecustomer = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablecart = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerSdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtproductname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtproductprice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtproductdes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtproductquantity = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbltongtien = new javax.swing.JLabel();
        btnsaveorder = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(79, 111, 82));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel1.setText("Manage Order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Customer List");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Product List");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Cart");

        tablecustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Số điện thoại", "Email"
            }
        ));
        tablecustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablecustomer);

        tablecart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID HH", "Tên HH", "Số lượng mua", "Đơn giá", "Mô tả", "Tổng"
            }
        ));
        tablecart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecartMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablecart);

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID HH", "Tên HH", "Số lượng tồn", "Giá", "Mô tả", "ID Danh mục", "Tên Danh mục"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableProduct);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tên khách hàng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Số điện thoại:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Chọn khách hàng:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Tên sản phẩm:");

        txtproductname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtproductname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Giá:");

        txtproductprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtproductprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductpriceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Mô tả:");

        txtproductdes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Số lượng:");

        txtproductquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("ADD TO CART");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Tổng tiền:");

        lbltongtien.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltongtien.setText("00000");

        btnsaveorder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsaveorder.setText("Lưu hóa đơn");
        btnsaveorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveorderActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerName)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerSdt)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustomerEmail)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtproductprice, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtproductname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnadd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtproductdes, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtproductquantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnsaveorder, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(517, 517, 517))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)
                                .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtproductprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lbltongtien))
                                .addGap(17, 17, 17)
                                .addComponent(btnsaveorder)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtproductdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtproductquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtproductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductnameActionPerformed

    private void txtproductpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductpriceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new ManageOrder().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtCustomerName.setEditable(false);
        txtCustomerSdt.setEditable(false);
        txtCustomerEmail.setEditable(false);

        txtproductname.setEditable(false);
        txtproductprice.setEditable(false);
        txtproductdes.setEditable(false);

        DefaultTableModel model = (DefaultTableModel) tablecustomer.getModel();
        DefaultTableModel productmodel = (DefaultTableModel) tableProduct.getModel();

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Khachhang");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("ID_KH"), rs.getString("TenKH"), rs.getString("Sdt"), rs.getString("Email")});
            }

            rs = st.executeQuery("SELECT * FROM Hanghoa inner join Loaihang on Hanghoa.fk_ID_LH = Loaihang.ID_LH ORDER BY Hanghoa.ID_HH ASC");
            while (rs.next()) {
                productmodel.addRow(new Object[]{rs.getString("ID_HH"), rs.getString("Name"), rs.getString("Soluong"), rs.getString("Gia"), rs.getString("Motasp"), rs.getString("fk_ID_LH"), rs.getString(8)});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_formComponentShown

    private void tablecustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecustomerMouseClicked
        int index = tablecustomer.getSelectedRow();
        TableModel model = tablecustomer.getModel();
        String Id = model.getValueAt(index, 0).toString();
        ID_KH = Integer.parseInt(Id);

        String name = model.getValueAt(index, 1).toString();
        txtCustomerName.setText(name);
        String sdt = model.getValueAt(index, 2).toString();
        txtCustomerSdt.setText(sdt);
        String email = model.getValueAt(index, 3).toString();
        txtCustomerEmail.setText(email);
    }//GEN-LAST:event_tablecustomerMouseClicked

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        ID_HH = Integer.parseInt(id);

        String productname = model.getValueAt(index, 1).toString();
        txtproductname.setText(productname);
        String productprice = model.getValueAt(index, 3).toString();
        txtproductprice.setText(productprice);
        String productdes = model.getValueAt(index, 4).toString();
        txtproductdes.setText(productdes);
    }//GEN-LAST:event_tableProductMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String hihi = txtproductquantity.getText();
        if (!hihi.equals("")) {
            String productname = txtproductname.getText();
            String productprice = txtproductprice.getText();
            String productdes = txtproductdes.getText();

            int tien = Integer.parseInt(txtproductquantity.getText()) * Integer.parseInt(productprice);

            int checkstock = 0;
            int checkproductincart = 0;

            try {
                Connection con = ConnectionProvider.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM Hanghoa where ID_HH=" + ID_HH + "");
                while (rs.next()) {
                    if (rs.getInt("Soluong") >= Integer.parseInt(hihi)) {
                        checkstock = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Hàng bạn muốn mua đã hết số lượng nhập. Chỉ còn lại: " + rs.getInt("Soluong"));
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (checkstock == 1) {
                DefaultTableModel cartmodel = (DefaultTableModel) tablecart.getModel();
                if (tablecart.getRowCount() != 0) {
                    for (int i = 0; i < tablecart.getRowCount(); i++) {
                        if (Integer.parseInt(cartmodel.getValueAt(i, 0).toString()) == ID_HH) {
                            checkproductincart = 1;
                            JOptionPane.showMessageDialog(null, "Đã có trong giỏ hàng");

                        }
                    }
                }
                if (checkproductincart == 0) {
                    cartmodel.addRow(new Object[]{ID_HH, productname, hihi, productprice, productdes, tien});
                    tongtien = tongtien + tien;
                    lbltongtien.setText(String.valueOf(tongtien));
                    JOptionPane.showMessageDialog(null, "Thêm vào giỏ hàng thành công");
                }
                clearproductfield();
            }
        } else {
            JOptionPane.showMessageDialog(null, "vui lòng nhập số lượng muốn mua");
        }

    }//GEN-LAST:event_btnaddActionPerformed

    private void tablecartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecartMouseClicked

        int temp = tablecart.getSelectedRow();
        int n = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa sản phẩm ra khỏi giỏ hàng chứ?", "Xóa?", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            TableModel carModel = tablecart.getModel();
            String total = carModel.getValueAt(temp, 5).toString();
            tongtien = tongtien - Integer.parseInt(total);
            lbltongtien.setText(String.valueOf(tongtien));
            ((DefaultTableModel) tablecart.getModel()).removeRow(temp);

        }

    }//GEN-LAST:event_tablecartMouseClicked

    private void btnsaveorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveorderActionPerformed
        if (tongtien != 0 && !txtCustomerName.getText().equals("")) {
            Mahd = GetUniqueId("Bill-");

            DefaultTableModel dtm = (DefaultTableModel) tablecart.getModel();
            if (tablecart.getRowCount() != 0) {
                for (int i = 0; i < tablecart.getRowCount(); i++) {
                    try {
                        Connection con = ConnectionProvider.getConnection();
                        String query = "update Hanghoa set Soluong=Soluong-" + Integer.parseInt(dtm.getValueAt(i, 2).toString()) + " where ID_HH=" + Integer.parseInt(dtm.getValueAt(i, 0).toString());
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeQuery();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }

            }
            try {
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-YYYY");
                Calendar cal = Calendar.getInstance();
                Connection con = ConnectionProvider.getConnection();
                String query = "insert into Hoadon(MaHD,Fk_Makh,NgayHD,Tongtien) values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, Mahd);
                pst.setInt(2, ID_KH);
                pst.setString(3, myFormat.format(cal.getTime()));
                pst.setInt(4, tongtien);
                pst.executeQuery();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            // tạo folder lưu bill
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-YYYY");
                Calendar cal = Calendar.getInstance();
                PdfWriter.getInstance(doc, new FileOutputStream(Chtlutils.billpath+""+Mahd+".pdf"));
                doc.open();
                Paragraph projectName = new Paragraph("                                                                  Fortune Store Manage\n");
                doc.add(projectName);
                Paragraph starline = new Paragraph("****************************************************************************************************************");
                doc.add(starline);
                Paragraph details = new Paragraph("\tMa hoa don: "+Mahd+"\nNgay mua hang: "+ myFormat.format(cal.getTime()) + "\n Tong tri gia hoa don: "+tongtien);
                doc.add(details);
                doc.add(starline);
                PdfPTable tb1 = new PdfPTable(5);
                PdfPCell namecell = new PdfPCell(new Phrase("Ten san pham"));
                PdfPCell descell = new PdfPCell(new Phrase("Mo ta san pham"));
                PdfPCell pricecell = new PdfPCell(new Phrase("Don gia"));
                PdfPCell quantitycell = new PdfPCell(new Phrase("So luong"));
                PdfPCell subtotalcell = new PdfPCell(new Phrase("Tong"));
                
                BaseColor backgroundcolor = new BaseColor(232,223,202);
                namecell.setBackgroundColor(backgroundcolor);
                descell.setBackgroundColor(backgroundcolor);
                pricecell.setBackgroundColor(backgroundcolor);
                quantitycell.setBackgroundColor(backgroundcolor);
                subtotalcell.setBackgroundColor(backgroundcolor);
                
                tb1.addCell(namecell);
                tb1.addCell(descell);
                tb1.addCell(pricecell);
                tb1.addCell(quantitycell);
                tb1.addCell(subtotalcell);
                
                for (int i = 0; i < tablecart.getRowCount(); i++){
                    tb1.addCell(tablecart.getValueAt(i, 1).toString());
                    tb1.addCell(tablecart.getValueAt(i, 4).toString());
                    tb1.addCell(tablecart.getValueAt(i, 3).toString());
                    tb1.addCell(tablecart.getValueAt(i, 2).toString());
                    tb1.addCell(tablecart.getValueAt(i, 5).toString());
                }
                doc.add(tb1);
                doc.add(starline);
                Paragraph ThankMsg = new Paragraph("                                                                  Cam on quy khach\n");
                doc.add(ThankMsg);
                OpenPdf.OpenById(Mahd);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new ManageOrder().setVisible(true);  
        }
        else{
        JOptionPane.showMessageDialog(null, "Hãy thêm sản phẩm trước khi thanh toán");
        }

    }//GEN-LAST:event_btnsaveorderActionPerformed

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
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnsaveorder;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbltongtien;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTable tablecart;
    private javax.swing.JTable tablecustomer;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerSdt;
    private javax.swing.JTextField txtproductdes;
    private javax.swing.JTextField txtproductname;
    private javax.swing.JTextField txtproductprice;
    private javax.swing.JTextField txtproductquantity;
    // End of variables declaration//GEN-END:variables
}