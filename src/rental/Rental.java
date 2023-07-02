package rental;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Rental extends javax.swing.JFrame {

    public Rental() {
        initComponents();
        DisplayCars();
        DisplayRental();
        GetCustomers();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    private void DisplayCars()
    {
        String Status = "Tersedia";
        try{
             Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
             St = (Statement) Con.createStatement();
             Rs = St.executeQuery("select * from cartbl where Status='"+Status+"'");
             TabelMobil.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void DisplayRental()
    {
        try{
             Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
             St = (Statement) Con.createStatement();
             Rs = St.executeQuery("select * from rental");
             TabelRental.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void GetCustomers()
    {
        try{
             Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
             St = (Statement) Con.createStatement();
             String query ="select * from RentalDb.customer";
             Rs = St.executeQuery(query);
             while(Rs.next()){
                 String customer = Rs.getString("Nama_Customer");
                 Cust.addItem(customer);
             }
        } catch (SQLException ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        DataMobil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataCustomer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ReturnMobil = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Plat = new javax.swing.JTextField();
        SimpanBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelMobil = new javax.swing.JTable();
        Cust = new javax.swing.JComboBox<>();
        TglRental = new com.toedter.calendar.JDateChooser();
        TglKembali = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelRental = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        RentalID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        DataMobil.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        DataMobil.setForeground(new java.awt.Color(255, 255, 255));
        DataMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataMobil.setText("Data Mobil");
        DataMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataMobilMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("__________________________");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("__________________________");

        DataCustomer.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        DataCustomer.setForeground(new java.awt.Color(255, 255, 255));
        DataCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataCustomer.setText("Data Customer");
        DataCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataCustomerMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("__________________________");

        jLabel7.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Rental Mobil");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("__________________________");

        LogOut.setBackground(new java.awt.Color(255, 0, 51));
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("LogOut");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/image/car (1).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Rental Mobil Kami");

        ReturnMobil.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        ReturnMobil.setForeground(new java.awt.Color(255, 255, 255));
        ReturnMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReturnMobil.setText("Pengembalian Mobil");
        ReturnMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMobilMouseClicked(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("__________________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReturnMobil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DataMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DataCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReturnMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(542, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel11.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(97, 122, 85));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Rental Mobil");

        jLabel15.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(97, 122, 85));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Close");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(97, 122, 85));
        jLabel14.setText("ID Rental:");

        jLabel16.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(97, 122, 85));
        jLabel16.setText("Plat Nomor");

        jLabel17.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(97, 122, 85));
        jLabel17.setText("Nama Customer");

        jLabel18.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(97, 122, 85));
        jLabel18.setText("Tanggal Rental");

        Plat.setEditable(false);
        Plat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatActionPerformed(evt);
            }
        });

        SimpanBtn.setBackground(new java.awt.Color(255, 255, 255));
        SimpanBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        SimpanBtn.setForeground(new java.awt.Color(0, 102, 102));
        SimpanBtn.setText("Simpan");
        SimpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 255, 255));
        EditBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 204, 102));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(255, 255, 255));
        ResetBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(51, 51, 51));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(97, 122, 85));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Daftar Mobil");

        TabelMobil.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        TabelMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Plat Nomor", "Brand", "Model", "Status", "Harga"
            }
        ));
        TabelMobil.setRowHeight(25);
        TabelMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelMobil);

        Cust.setFont(new java.awt.Font("FreeMono", 0, 12)); // NOI18N
        Cust.setForeground(new java.awt.Color(0, 102, 102));
        Cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustActionPerformed(evt);
            }
        });

        TglRental.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        TglKembali.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(97, 122, 85));
        jLabel21.setText("Tanggal Kembali");

        TabelRental.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        TabelRental.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Rental", "Plat Nomor", "Nama Customer", "Tanggal Rental", "Tanggal Kembali", "Biaya"
            }
        ));
        TabelRental.setRowHeight(25);
        TabelRental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelRentalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelRental);

        jLabel22.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(97, 122, 85));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Mobil Yang Di Rental");

        PrintBtn.setBackground(new java.awt.Color(255, 255, 255));
        PrintBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 102, 102));
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        RentalID.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        RentalID.setForeground(new java.awt.Color(0, 102, 102));
        RentalID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RentalID.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RentalID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(Plat))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cust, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addComponent(TglRental, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)))))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(497, 497, 497)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(482, 482, 482)
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(457, 457, 457)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RentalID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TglRental, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Cust, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Plat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
        new Login().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void PlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlatActionPerformed

    private void UpdateCar()
    {
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        String Reg = Plat.getText();
        String StatusMbl = "Di Pesan";
        String Query = "UPDATE RentalDb.cartbl SET Status='"+StatusMbl+"' WHERE Plat_Nomor='"+Reg+"'";
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "Mobil Berhasil Di Update");
        DisplayCars();
        Reset();
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    java.util.Date TanggalRntl, TanggalKmbl;
    java.sql.Date MyTglRental, MyTglKembali;
    private void SimpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanBtnActionPerformed
            if ( Plat.getText().isEmpty() || TglRental.getDate() == null || TglKembali.getDate() == null) {
    JOptionPane.showMessageDialog(this, "Mohon Untuk Di Lengkapi");
} else {
    try {
        TanggalRntl = TglRental.getDate();
        MyTglRental = new java.sql.Date(TanggalRntl.getTime());

        TanggalKmbl = TglKembali.getDate();
        MyTglKembali = new java.sql.Date(TanggalKmbl.getTime());

        String plat = Plat.getText();
        int hargaMobil = 0;

        String query = "SELECT harga FROM cartbl WHERE Plat_Nomor=?";
        PreparedStatement statement = Con.prepareStatement(query);
        statement.setString(1, plat);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            hargaMobil = resultSet.getInt("harga");
        }

        String getLastRentalIdQuery = "SELECT MAX(Id_Rental) AS maxId FROM rental";
        PreparedStatement getLastRentalIdStatement = Con.prepareStatement(getLastRentalIdQuery);
        ResultSet lastRentalIdResult = getLastRentalIdStatement.executeQuery();

        int rentalId = 1; // RentalId default jika belum ada data di tabel
        if (lastRentalIdResult.next()) {
            rentalId = lastRentalIdResult.getInt("maxId") + 1; // RentalId terakhir + 1
        }

        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        PreparedStatement add = Con.prepareStatement("INSERT INTO rental VALUES (?, ?, ?, ?, ?, ?)");
        add.setInt(1, rentalId);
        add.setString(2, Plat.getText());
        add.setString(3, Cust.getSelectedItem().toString());
        add.setDate(4, MyTglRental);
        add.setDate(5, MyTglKembali);
        // Mengalikan harga mobil dengan selisih hari antara tanggal rental dan tanggal kembali
        long selisihHari = (MyTglKembali.getTime() - MyTglRental.getTime()) / (24 * 60 * 60 * 1000);
        int totalBiaya = hargaMobil * (int) selisihHari;
        add.setInt(6, totalBiaya);

        int row = add.executeUpdate();
        JOptionPane.showMessageDialog(this, "Berhasil Menambahkan");
        DisplayRental();
        UpdateCar();
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    }//GEN-LAST:event_SimpanBtnActionPerformed
 


    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
         if ( Plat.getText().isEmpty() || TglRental.getDate() == null || TglKembali.getDate() == null) 
         {
        JOptionPane.showMessageDialog(this, "Pilih ID yang akan di update");
    } else {
        TanggalRntl = TglRental.getDate();
        MyTglRental = new java.sql.Date(TanggalRntl.getTime());
        
        TanggalKmbl = TglKembali.getDate();
        MyTglKembali = new java.sql.Date(TanggalKmbl.getTime());
            
        try {
        
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
            int Rent = Integer.valueOf(RentalID.getText());
            String Query = "UPDATE RentalDb.rental SET Plat_Nomor='"+Plat.getText()+"', Nama_Customer='"+Cust.getSelectedItem().toString()+"', Tanggal_Rental='"+ MyTglRental+"', Tanggal_Kembali='"+ MyTglKembali+"' WHERE Id_Rental='"+Rent+"'";
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Update Berhasil");
            DisplayRental();
            Reset();
        } catch (SQLException ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void Reset(){
        RentalID.setText("0");
        Plat.setText("");
        Cust.setSelectedIndex(0);
        TglRental.setDate(null);
        TglKembali.setDate(null);
    }
    
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        try{
            TabelRental.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void TabelMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMobilMouseClicked
       DefaultTableModel model = (DefaultTableModel)TabelMobil.getModel();
       int MyIndex = TabelMobil.getSelectedRow();
       Plat.setText(model.getValueAt(MyIndex, 0).toString());
    }//GEN-LAST:event_TabelMobilMouseClicked

    private void TabelRentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelRentalMouseClicked
       DefaultTableModel model = (DefaultTableModel)TabelRental.getModel();
       int MyIndex = TabelRental.getSelectedRow();
       RentalID.setText(model.getValueAt(MyIndex, 0).toString());
       Plat.setText(model.getValueAt(MyIndex, 1).toString());
       Cust.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
       TglRental.setDate((java.util.Date) model.getValueAt(MyIndex, 3));
       TglKembali.setDate((java.util.Date) model.getValueAt(MyIndex, 4));
    }//GEN-LAST:event_TabelRentalMouseClicked

    private void DataMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataMobilMouseClicked
        new Cars().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DataMobilMouseClicked

    private void DataCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataCustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DataCustomerMouseClicked

    private void ReturnMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMobilMouseClicked
        new Returns().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMobilMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cust;
    private javax.swing.JLabel DataCustomer;
    private javax.swing.JLabel DataMobil;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField Plat;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JLabel RentalID;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel ReturnMobil;
    private javax.swing.JButton SimpanBtn;
    private javax.swing.JTable TabelMobil;
    private javax.swing.JTable TabelRental;
    private com.toedter.calendar.JDateChooser TglKembali;
    private com.toedter.calendar.JDateChooser TglRental;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
