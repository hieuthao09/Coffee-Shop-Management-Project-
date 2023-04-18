package Ultilities.component;

import GUI.ACC_Setting;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
        setOpaque(false);
        //lb_icon.setIcon(new ImageIcon("E:\\HUFI\\Năm 3\\HK2\\Oracle\\DoAn\\QuanLyCafe\\src\\Ultilities\\icon\\coffee_bg.jpg"));
    }
    String user = null;
    public void setUsername(String user){
        username.setText(user);
        this.user = user;
    }
    public void setLastLogin(String lastLogin){
        lb_lastLogin.setText(lastLogin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        lb_lastLogin = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Administrator");
        username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 128, -1));

        lb_lastLogin.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lb_lastLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lastLogin.setText("Administrator");
        lb_lastLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lb_lastLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 128, -1));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ultilities/icon/user-profile.png"))); // NOI18N
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 70));

        header1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ultilities/icon/settings.png"))); // NOI18N
        header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                header1MouseClicked(evt);
            }
        });
        jPanel1.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void header1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_header1MouseClicked
    ACC_Setting accInfo = null;
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_lastLogin;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
