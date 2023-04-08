/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.GetData;
import Ultilities.ConvertData.ConvertDataORCL;

/**
 *
 * @author phatl
 */
public class ACC_Setting extends javax.swing.JFrame {

    /**
     * Creates new form ACC_Setting
     */
    public ACC_Setting() {
        initComponents();
        txt_chucVu.setEditable(false);
        txt_username.setEditable(false);
        txt_SDT.setEditable(false);
        txt_GioiTinh.setEditable(false);
        loadInfo();
    }
    
    GetData getdata = new GetData();
    private void loadInfo(){
        Object[][] info = getdata.getInfoAccount();
        if(info != null && info.length > 0){
            txt_hoTen.setText(info[0][1].toString());
            txt_maNV.setText(info[0][0].toString());

            txt_SDT.setText("SDT: "+info[0][2].toString());
            txt_GioiTinh.setText("Giới tính: "+info[0][3].toString());
            txt_username.setText("Username: "+info[0][4].toString().toUpperCase());
            txt_chucVu.setText("Chức vụ: "+getQuyenHan(info[0][0].toString()));
        }
    }

    private String getQuyenHan(String maNV){
        String kq = "Nhân Viên";
        String temp = maNV.substring(0, 2);
        
        switch(temp){
            case "NV":
                kq="Nhân Viên";
                break;
            case "QL":
                kq="Quản Lý";
                break;
            case "KT":
                kq="Kế Toán";
                break;
        }
        return kq;
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
        jPanel2 = new javax.swing.JPanel();
        bg_avatar = new Ultilities.login.Background();
        txt_hoTen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_SDT = new javax.swing.JTextField();
        txt_GioiTinh = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_chucVu = new javax.swing.JTextField();
        txt_maNV = new javax.swing.JLabel();
        btn_ChangePassword = new Ultilities.swing.Controls.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN TÀI KHOẢN");

        bg_avatar.setImage("/Ultilities/icon/user.png");

        txt_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_hoTen.setText("Họ Tên");
        txt_hoTen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        txt_SDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_SDT.setText("SDT");
        txt_SDT.setBorder(null);
        txt_SDT.setFocusable(false);
        jPanel3.add(txt_SDT);

        txt_GioiTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_GioiTinh.setText("Giới Tính");
        txt_GioiTinh.setBorder(null);
        txt_GioiTinh.setFocusable(false);
        jPanel3.add(txt_GioiTinh);

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_username.setText("Username");
        txt_username.setBorder(null);
        txt_username.setFocusable(false);
        jPanel3.add(txt_username);

        txt_chucVu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_chucVu.setText("Chức vụ");
        txt_chucVu.setBorder(null);
        txt_chucVu.setFocusable(false);
        jPanel3.add(txt_chucVu);

        txt_maNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_maNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_maNV.setText("Mã Nhân Viên");
        txt_maNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_hoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_maNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(bg_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bg_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hoTen)
                .addGap(4, 4, 4)
                .addComponent(txt_maNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_ChangePassword.setForeground(new java.awt.Color(0, 0, 0));
        btn_ChangePassword.setText("Đổi Mật Khẩu");
        btn_ChangePassword.setColor1(new java.awt.Color(0, 255, 153));
        btn_ChangePassword.setColor2(new java.awt.Color(0, 255, 204));
        btn_ChangePassword.setFocusPainted(false);
        btn_ChangePassword.setFocusable(false);
        btn_ChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ChangePassword.setSizeSpeed(5.0F);
        btn_ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ChangePassword changePass = null;
    private void btn_ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChangePasswordActionPerformed
        if(changePass == null)
            changePass = new ChangePassword();
        changePass.setVisible(true);
    }//GEN-LAST:event_btn_ChangePasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ultilities.login.Background bg_avatar;
    private Ultilities.swing.Controls.ButtonGradient btn_ChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_GioiTinh;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_chucVu;
    private javax.swing.JLabel txt_hoTen;
    private javax.swing.JLabel txt_maNV;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}