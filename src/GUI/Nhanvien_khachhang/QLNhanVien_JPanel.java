/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Nhanvien_khachhang;

import BLL.ExecuteData;
import BLL.GetData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phatl
 */
public class QLNhanVien_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form QL_NhanVienForm
     */
    public QLNhanVien_JPanel() {
        initComponents();
        loadNhanVienIntoTable();
    }

    boolean flag = false;//false -> thêm, true -> sửa
    
    // <editor-fold defaultstate="collapsed" desc="Biến dùng chung"> 
    ArrayList alTemp = null ; 
    GetData data = new GetData();
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="hàm load dữ liệu nhan vien"> 
    public void loadNhanVienIntoTable(){
        alTemp = data.getDataNhanVien();
        DefaultTableModel model = (DefaultTableModel)tb_NhanVien.getModel();
        model.setDataVector((Object[][])alTemp.get(1), (Object[])alTemp.get(0));
    }
    // </editor-fold>
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_NhanVien = new Ultilities.swing.Controls.Table();
        lbThucHien = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        btnXacNhan = new Ultilities.swing.Controls.buttonCustom();
        jLabel6 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSua = new Ultilities.swing.Controls.ButtonGradient();
        btn_Xoa = new Ultilities.swing.Controls.ButtonGradient();
        btn_Them = new Ultilities.swing.Controls.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1100, 660));
        setPreferredSize(new java.awt.Dimension(1100, 660));

        tb_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb_NhanVienMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_NhanVien);

        lbThucHien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbThucHien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThucHien.setText("THÊM NHÂN VIÊN MỚI");
        lbThucHien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Số điện thoại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Giới Tính");

        cbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        btnXacNhan.setText("XÁC NHẬN");
        btnXacNhan.setBorderColor(new java.awt.Color(0, 255, 51));
        btnXacNhan.setColor(new java.awt.Color(51, 255, 51));
        btnXacNhan.setColorClick(new java.awt.Color(102, 255, 102));
        btnXacNhan.setColorOver(new java.awt.Color(51, 255, 0));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Mã nhân viên");

        txtMaNV.setEditable(false);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3, 20, 0));

        btnSua.setForeground(new java.awt.Color(0, 0, 0));
        btnSua.setText("SỬA");
        btnSua.setColor1(new java.awt.Color(255, 255, 204));
        btnSua.setColor2(new java.awt.Color(255, 204, 153));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);

        btn_Xoa.setBackground(new java.awt.Color(0, 0, 0));
        btn_Xoa.setText("XÓA");
        btn_Xoa.setColor1(new java.awt.Color(255, 102, 102));
        btn_Xoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Xoa);

        btn_Them.setForeground(new java.awt.Color(0, 0, 0));
        btn_Them.setText("THÊM MỚI");
        btn_Them.setColor1(new java.awt.Color(102, 204, 255));
        btn_Them.setColor2(new java.awt.Color(102, 255, 255));
        btn_Them.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Them);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(670, 670, 670)
                        .addComponent(lbThucHien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSDT)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        lbThucHien.setText("THÊM NHÂN VIÊN MỚI");
        flag = false;
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtSDT.setText("");
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int indexRow = tb_NhanVien.getSelectedRow();
        if(indexRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa !","Thông Báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        String MaNV = tb_NhanVien.getValueAt(indexRow, 0).toString();
        if(ExecuteData.XoaNhanVien(MaNV)){
            loadNhanVienIntoTable();
            JOptionPane.showMessageDialog(null, "Xóa nhân viên '"+MaNV+"' thành công !","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Xóa nhân viên '"+MaNV+"' thất bại !","Thông Báo",JOptionPane.ERROR_MESSAGE);    
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if(!flag){//them nhan nhan vien
            String TenNV = txtTenNV.getText();
            String SDT = txtSDT.getText();
            String GioiTinh = cbGioiTinh.getSelectedItem().toString();
            //tu sinh ma NV
            int sl = tb_NhanVien.getRowCount() + 1;
            String maNV = "NV"+sl;
            //thuc thi them nhan vien
            if(ExecuteData.ThemNhanVien(maNV, TenNV, SDT, GioiTinh)){
                JOptionPane.showMessageDialog(null, "Thêm nhân viên mới thành công !","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                loadNhanVienIntoTable();
            }else{
                JOptionPane.showMessageDialog(null, "Thêm nhân viên mới thất bại !","Thông Báo",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(flag){//sua nhan vien
            int indexRow = tb_NhanVien.getSelectedRow();
            if(indexRow < 0)
            {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần sửa !","Thông Báo",JOptionPane.WARNING_MESSAGE);
                return;
            }   
            String MaNV = tb_NhanVien.getValueAt(indexRow, 0).toString();
            //get value from form
            String TenNV = txtTenNV.getText();
            String SDT = txtSDT.getText();
            String GioiTinh = cbGioiTinh.getSelectedItem().toString();
            //execute edit
            if(ExecuteData.SuaNhanVien(MaNV, TenNV,SDT,GioiTinh)){
                loadNhanVienIntoTable();
                JOptionPane.showMessageDialog(null, "Sửa thông tin nhân viên '"+MaNV+"' thành công !","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Sửa thông tin nhân viên '"+MaNV+"' thất bại !","Thông Báo",JOptionPane.ERROR_MESSAGE);    
            }   
        }
        
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        lbThucHien.setText("SỬA NHÂN VIÊN");
        flag = true;
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tb_NhanVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NhanVienMouseReleased
        if(flag){
            int indexRow = tb_NhanVien.getSelectedRow();            
            String MaNV = tb_NhanVien.getValueAt(indexRow, 0).toString();
            //load data into form
            txtMaNV.setText(MaNV);
            txtTenNV.setText(tb_NhanVien.getValueAt(indexRow, 1).toString());
            txtSDT.setText(tb_NhanVien.getValueAt(indexRow, 2).toString());
            String gioitinh = tb_NhanVien.getValueAt(indexRow, 3).toString();
            if(gioitinh.equals("Nam"))
                cbGioiTinh.setSelectedIndex(0);
            else
                cbGioiTinh.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tb_NhanVienMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ultilities.swing.Controls.ButtonGradient btnSua;
    private Ultilities.swing.Controls.buttonCustom btnXacNhan;
    private Ultilities.swing.Controls.ButtonGradient btn_Them;
    private Ultilities.swing.Controls.ButtonGradient btn_Xoa;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbThucHien;
    private Ultilities.swing.Controls.Table tb_NhanVien;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
