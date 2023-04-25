/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.ExecuteData;
import BLL.GetData;
import DTO.PhanLoai;
import DTO.SanPham;
import Ultilities.ConvertData.ConvertDataORCL;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thi Duong
 */
public class QuanLySP extends javax.swing.JPanel {

    /**
     * Creates new form QuanLySP
     */
    ExecuteData exdt = new ExecuteData();
    SanPham sp = new SanPham();
    PhanLoai pl = new PhanLoai(); 
    public QuanLySP() {
        initComponents();
         
        loadCombobox_PL();
        loadCombobox_TT();
        loadCombobox_KC();
        pl = (PhanLoai) cbo_loai.getSelectedItem();
        showDataOnTable(x.getDataTD(pl.getMaloai()));
        tbl_sanpham.setRowHeight(50);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();
        btn_them = new Ultilities.swing.Controls.ButtonGradient();
        btn_xoa = new Ultilities.swing.Controls.ButtonGradient();
        btn_sua = new Ultilities.swing.Controls.ButtonGradient();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tenmon = new Ultilities.swing.Controls.TextField();
        txt_gia = new Ultilities.swing.Controls.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbo_kichco = new Ultilities.swing.Controls.ComboBoxSuggestion();
        cbo_loai = new Ultilities.swing.Controls.ComboBoxSuggestion<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_trangthai = new Ultilities.swing.Controls.ComboBoxSuggestion();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_sanpham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sanpham);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 640, 270));

        btn_them.setText("Thêm");
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, -1, -1));

        btn_xoa.setText("Xóa");
        btn_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaMouseClicked(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, -1, -1));

        btn_sua.setText("Sửa");
        btn_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaMouseClicked(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tên món :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 36, -1, -1));

        jLabel3.setText("Giá :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 97, 52, -1));

        jLabel6.setText("Mô tả :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 158, -1, -1));

        txt_tenmon.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_tenmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 27, 200, -1));

        txt_gia.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 88, 200, -1));

        txt_mota.setColumns(20);
        txt_mota.setRows(5);
        jScrollPane2.setViewportView(txt_mota);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, 300, 210));

        jPanel2.setPreferredSize(new java.awt.Dimension(252, 189));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Loại :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 130, 44, -1));

        jLabel5.setText("Trạng thái :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, -1, -1));

        cbo_kichco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_kichcoActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_kichco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 23));

        cbo_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_loaiActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_loai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 23));

        jLabel4.setText("Kích cỡ :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        cbo_trangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_trangthaiActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_trangthai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 23));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 101, -1, 210));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_loaiActionPerformed
        // TODO add your handling code here:
        PhanLoai pl = new PhanLoai();
        pl = (PhanLoai) cbo_loai.getSelectedItem();
        showDataOnTable(x.getDataTD(pl.getMaloai()));
    }//GEN-LAST:event_cbo_loaiActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tbl_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sanphamMouseClicked
        // TODO add your handling code here:
        int row = tbl_sanpham.getSelectedRow();
        if (row != -1) {
            txt_tenmon.setText(tbl_sanpham.getValueAt(row, 1).toString());
            txt_gia.setText(tbl_sanpham.getValueAt(row, 2).toString());
//            txt_kichco.setText(tbl_sanpham.getValueAt(row, 3).toString());
            String kichco = tbl_sanpham.getValueAt(row, 3).toString();
            if(kichco.compareTo("M") == 0){
                cbo_kichco.setSelectedIndex(0);
            }
            else{
                cbo_kichco.setSelectedIndex(1);
            }
            String trangthai = tbl_sanpham.getValueAt(row, 4).toString();
            if(trangthai.compareTo("Còn") == 0)
                cbo_trangthai.setSelectedIndex(0);
            else
                cbo_trangthai.setSelectedIndex(1);
            //txt_mota.setText("hjgj");
            txt_mota.setText(tbl_sanpham.getValueAt(row, 5).toString());   
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn dòng nào!!!");
        }
    }//GEN-LAST:event_tbl_sanphamMouseClicked

    private void cbo_kichcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_kichcoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cbo_kichcoActionPerformed

    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        // TODO add your handling code here:
        String tenMon = txt_tenmon.getText();
        String gia = txt_gia.getText();
        String kichco = cbo_kichco.getSelectedItem().toString();
        String trangthai = cbo_trangthai.getSelectedItem().toString();
        if(trangthai.compareTo("Còn") == 0)
            trangthai = "01";
        else
            trangthai = "00";
        String mota = txt_mota.getText();
        PhanLoai phanloaimaloai = (PhanLoai)cbo_loai.getSelectedItem();
        sp.setTenmon(tenMon);
        sp.setGia(gia);
        sp.setKichco(kichco);
        sp.setTrangthai(trangthai);
        sp.setMota(mota);
        sp.setPhanloaimaloai(phanloaimaloai.getMaloai());
        exdt.insertSP(sp);
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        resetText();
        showDataOnTable(x.getDataTD(pl.getMaloai()));
    }//GEN-LAST:event_btn_themMouseClicked

    private void cbo_trangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_trangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_trangthaiActionPerformed

    private void btn_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaMouseClicked
        // TODO add your handling code here:
        int row = tbl_sanpham.getSelectedRow();
        sp.setMamon(tbl_sanpham.getValueAt(row, 0).toString());
        exdt.deleteSP(sp);
        JOptionPane.showMessageDialog(this, "Xóa Thành Công");
        resetText();
        showDataOnTable(x.getDataTD(pl.getMaloai()));
    }//GEN-LAST:event_btn_xoaMouseClicked

    private void btn_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaMouseClicked
        // TODO add your handling code here:
        String tenMon = txt_tenmon.getText();
        String gia = txt_gia.getText();
        String kichco = cbo_kichco.getSelectedItem().toString();
        String trangthai = cbo_trangthai.getSelectedItem().toString();
        if(trangthai.compareTo("Còn") == 0)
            trangthai = "01";
        else
            trangthai = "00";
        String mota = txt_mota.getText();
        PhanLoai phanloaimaloai = (PhanLoai)cbo_loai.getSelectedItem();
        sp.setTenmon(tenMon);
        sp.setGia(gia);
        sp.setKichco(kichco);
        sp.setTrangthai(trangthai);
        sp.setMota(mota);
        sp.setPhanloaimaloai(phanloaimaloai.getMaloai());
        int row = tbl_sanpham.getSelectedRow();
        sp.setMamon(tbl_sanpham.getValueAt(row, 0).toString());
        exdt.updateSP(sp);
        JOptionPane.showMessageDialog(this, "Sửa Thành Công");
        resetText();
        showDataOnTable(x.getDataTD(pl.getMaloai()));
    }//GEN-LAST:event_btn_suaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ultilities.swing.Controls.ButtonGradient btn_sua;
    private Ultilities.swing.Controls.ButtonGradient btn_them;
    private Ultilities.swing.Controls.ButtonGradient btn_xoa;
    private Ultilities.swing.Controls.ComboBoxSuggestion cbo_kichco;
    private Ultilities.swing.Controls.ComboBoxSuggestion<PhanLoai> cbo_loai;
    private Ultilities.swing.Controls.ComboBoxSuggestion cbo_trangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_sanpham;
    private Ultilities.swing.Controls.TextField txt_gia;
    private javax.swing.JTextArea txt_mota;
    private Ultilities.swing.Controls.TextField txt_tenmon;
    // End of variables declaration//GEN-END:variables

    GetData x ;
    public void showDataOnTable(ArrayList arr ){
        DefaultTableModel model = (DefaultTableModel)tbl_sanpham.getModel();
        String[][] t = ConvertDataORCL.ConvertObject2DToString2D((Object[][])arr.get(1));
        for (int i = 0; i < t.length; i++) {
            if(t[i][4].toString().compareTo("1") == 0){
                t[i][4] = "Còn";
            }
            else{
                t[i][4] = "Đã hết";
            }
        }   
        String[] tenCot = {"Mã món","Tên món","Giá","Kích cỡ","Trạng thái","Mô tả"};
        model.setDataVector(t, tenCot);
    }
    DefaultComboBoxModel<PhanLoai> model_cbo_pl = null;
    private void loadCombobox_PL() {
        x = new GetData();
        ArrayList arr =  x.getDataPhanLoai();
        Object[][] info1 = (Object[][]) arr.get(1);
        model_cbo_pl = new DefaultComboBoxModel<>();
        for (Object[] innerList : info1)
        {
            PhanLoai pl = new PhanLoai();
                if (innerList[1] instanceof String) {
                            pl.setMaloai((String) innerList[0]);
                        }
                if (innerList[0] instanceof String) {
                        pl.setTenloai((String) innerList[1]);
                    }
                model_cbo_pl.addElement(pl);
        }
        cbo_loai.setModel(model_cbo_pl);
    }
    DefaultComboBoxModel model_cbo_tt = null;
    private void loadCombobox_TT(){
       model_cbo_tt = new DefaultComboBoxModel<>();
        String[] t = {"Còn","Đã hết"};
        for(String s : t)
        {
            model_cbo_tt.addElement(s);
        }
        cbo_trangthai.setModel(model_cbo_tt);
    }
    DefaultComboBoxModel model_cbo_kc = null;
    private void loadCombobox_KC(){
       model_cbo_kc = new DefaultComboBoxModel<>();
        String[] t = {"M","L"};
        for(String s : t)
        {
            model_cbo_kc.addElement(s);
        }
        cbo_kichco.setModel(model_cbo_kc);
    }
    private void resetText() {
        txt_tenmon.setText("");
        txt_gia.setText("");
        txt_mota.setText("");
    }
}