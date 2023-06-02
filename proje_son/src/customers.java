
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ZEHRABENGÜEMÜL
 */
public class customers extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement Ps = null;
    ResultSet Rs = null;
    Statement St = null;
    int selectedRowIndex;
    String customerName;
    String oldCustomerName;
    Object[] row ;


    /**
     * Creates new form customers
     */
    public customers() throws SQLException {
        initComponents();
        displayCustomers();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        customername_field = new javax.swing.JTextField();
        phoneNumber_field = new javax.swing.JTextField();
        address_field = new javax.swing.JTextField();
        musteri_sil_btn = new javax.swing.JButton();
        musteri_kaydet_btn = new javax.swing.JButton();
        muster_duzenle_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hayvan_btn5 = new javax.swing.JButton();
        kullanici_btn5 = new javax.swing.JButton();
        musteri_btn5 = new javax.swing.JButton();
        fatura_btn5 = new javax.swing.JButton();
        urun_btn5 = new javax.swing.JButton();
        cikis_btn5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(246, 242, 242));

        jLabel12.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel12.setText("ADRES");

        jLabel13.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel13.setText("TC");

        jLabel14.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel14.setText("AD");

        customername_field.setBackground(new java.awt.Color(245, 245, 245));

        phoneNumber_field.setBackground(new java.awt.Color(245, 245, 245));

        address_field.setBackground(new java.awt.Color(245, 245, 245));

        musteri_sil_btn.setBackground(new java.awt.Color(255, 204, 204));
        musteri_sil_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        musteri_sil_btn.setText("SIL");
        musteri_sil_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        musteri_sil_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        musteri_sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_sil_btnActionPerformed(evt);
            }
        });

        musteri_kaydet_btn.setBackground(new java.awt.Color(255, 204, 204));
        musteri_kaydet_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        musteri_kaydet_btn.setText("KAYDET");
        musteri_kaydet_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        musteri_kaydet_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        musteri_kaydet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_kaydet_btnActionPerformed(evt);
            }
        });

        muster_duzenle_btn.setBackground(new java.awt.Color(255, 204, 204));
        muster_duzenle_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        muster_duzenle_btn.setText("DÜZENLE");
        muster_duzenle_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        muster_duzenle_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        muster_duzenle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muster_duzenle_btnActionPerformed(evt);
            }
        });

        customerTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Müsteri Adı", "Adres", "TC"
            }
        ));
        customerTable.setRowHeight(30);
        customerTable.setRowMargin(2);
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 1, 25)); // NOI18N
        jLabel15.setText("MÜSTERI LISTESI");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1204, 163));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel3.setText("HAYVANLAR");

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel4.setText("KULLANICILAR");

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel8.setText("MÜSTERILER");

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel9.setText("ÜRÜNLER");

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel10.setText("       CIKIS");

        jLabel18.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel18.setText("FATURALAR");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oo.png"))); // NOI18N

        hayvan_btn5.setBackground(new java.awt.Color(255, 204, 204));
        hayvan_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets.png"))); // NOI18N
        hayvan_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pets_btn(evt);
            }
        });

        kullanici_btn5.setBackground(new java.awt.Color(255, 204, 204));
        kullanici_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users.png"))); // NOI18N
        kullanici_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_btn(evt);
            }
        });

        musteri_btn5.setBackground(new java.awt.Color(255, 204, 204));
        musteri_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); // NOI18N

        fatura_btn5.setBackground(new java.awt.Color(255, 204, 204));
        fatura_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.png"))); // NOI18N
        fatura_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billing_btn(evt);
            }
        });

        urun_btn5.setBackground(new java.awt.Color(255, 204, 204));
        urun_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1375593-200-removebg-preview 1.png"))); // NOI18N
        urun_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btn(evt);
            }
        });

        cikis_btn5.setBackground(new java.awt.Color(255, 204, 204));
        cikis_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        cikis_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(hayvan_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kullanici_btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musteri_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(fatura_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urun_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cikis_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hayvan_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kullanici_btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(musteri_btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fatura_btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(urun_btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cikis_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mewo-removebg-preview 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(musteri_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(musteri_sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(muster_duzenle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNumber_field, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(customername_field, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(address_field, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customername_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumber_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(musteri_sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(musteri_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muster_duzenle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void musteri_sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_sil_btnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        try {
            Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db");
            Ps = (PreparedStatement) Con.prepareStatement("delete from Customers where `Musteri Adi` = ?");

            selectedRowIndex = customerTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                customerName = (String) customerTable.getValueAt(selectedRowIndex, 0);
                Ps.setString(1, customerName);
                Ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Müşteri Silindi");
            } else {
                JOptionPane.showMessageDialog(this, "Sileceğiniz müşteriyi seçmeniz gerekmektedir");
            }
            Ps.close();
            Con.close();
            displayCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        //musteri silme butonu event yeri
    }//GEN-LAST:event_musteri_sil_btnActionPerformed

    private void musteri_kaydet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_kaydet_btnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        if (customername_field.getText().isEmpty() || address_field.getText().isEmpty() || phoneNumber_field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Eksik Bilgi");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db");
                Ps = (PreparedStatement) Con.prepareStatement("insert into Customers(`Musteri Adi`, `Adres`, `TCkimlik`) VALUES(?,?,?)");
                Ps.setString(1, customername_field.getText());
                Ps.setString(2, address_field.getText());
                Ps.setString(3, phoneNumber_field.getText());
                Ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Müşteri Eklendi");
                Con.close();
                displayCustomers();
            } catch (SQLException ex) {
                Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }
        }
        // TODO add your handling code here:
        //musteri kaydet butonu event yeri
    }//GEN-LAST:event_musteri_kaydet_btnActionPerformed

    private void muster_duzenle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muster_duzenle_btnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db");
            Ps = (PreparedStatement) Con.prepareStatement("Update Customers Set `Musteri Adi` = ? , `Adres` = ? , `TCkimlik` = ? where `Musteri Adi`=?");

            selectedRowIndex = customerTable.getSelectedRow();
            if (selectedRowIndex != -1) {

                oldCustomerName = (String) customerTable.getValueAt(selectedRowIndex, 0);
                if (customername_field.getText().isEmpty() || address_field.getText().isEmpty() || phoneNumber_field.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Eksik Bilgi");
                } else {
                    Ps.setString(1, customername_field.getText());
                    Ps.setString(2, address_field.getText());
                    Ps.setString(3, phoneNumber_field.getText());

                    Ps.setString(4, oldCustomerName);
                    Ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Müşteri Güncellendi");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Güncelleyeceğiniz müşteriyi seçmeniz gerekmektedir");
            }
            Ps.close();
            Con.close();
            displayCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        // TODO add your handling code here:
        //musteri duzenleme butonu event yeri
    }//GEN-LAST:event_muster_duzenle_btnActionPerformed

    private void pets_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pets_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new pets().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_pets_btn

    private void users_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new users().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_users_btn

    private void displayCustomers() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db");

        St = Con.createStatement();
        Rs = St.executeQuery("Select * from Customers");

        ResultSetMetaData metaData = Rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }

        // DefaultTableModel nesnesini oluştur ve sütun bilgilerini ekle
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // ResultSet nesnesinden verileri tabloya ekle
        while (Rs.next()) {
            row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = Rs.getObject(i);
            }
            tableModel.addRow(row);
        }

        // JTable nesnesini oluştur ve verileri ekleyerek göster
        customerTable.setModel(tableModel);
        //JOptionPane.showMessageDialog(null, new JScrollPane(table), "Table", JOptionPane.PLAIN_MESSAGE);

        // Kaynakları serbest bırak
        Rs.close();
        St.close();
        Con.close();
    }

    private void billing_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billing_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new billing().setVisible(true);
        });
    }//GEN-LAST:event_billing_btn

    private void products_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new products().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_products_btn

    private void logout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new login_page().setVisible(true);
        });
    }//GEN-LAST:event_logout_btn

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        int selectedRowIndex = customerTable.getSelectedRow();
        customername_field.setText((String) customerTable.getValueAt(selectedRowIndex, 0));
        address_field.setText((String) customerTable.getValueAt(selectedRowIndex, 1));
        phoneNumber_field.setText((String) customerTable.getValueAt(selectedRowIndex, 2));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTableMouseClicked

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
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new customers().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_field;
    private javax.swing.JButton cikis_btn5;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customername_field;
    private javax.swing.JButton fatura_btn5;
    private javax.swing.JButton hayvan_btn5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kullanici_btn5;
    private javax.swing.JButton muster_duzenle_btn;
    private javax.swing.JButton musteri_btn5;
    private javax.swing.JButton musteri_kaydet_btn;
    private javax.swing.JButton musteri_sil_btn;
    private javax.swing.JTextField phoneNumber_field;
    private javax.swing.JButton urun_btn5;
    // End of variables declaration//GEN-END:variables

   
}
