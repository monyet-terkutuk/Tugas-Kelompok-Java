/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.awt.Desktop;
import java.io.File;



/**
 *
 * @author LENOVO
 */
public class Returns extends javax.swing.JFrame {

    /** Creates new form Returns */
    public Returns() {
        initComponents();
        DisplayRental();
        DisplayReturn();
        Cust.setEditable(false);
        Plat.setEditable(false);
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
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
 
private void DisplayReturn() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        St = Con.createStatement();
        Rs = St.executeQuery("SELECT * FROM `return`");
        TabelReturn.setModel(DbUtils.resultSetToTableModel(Rs));
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
        RentalMobil = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Plat = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TglKembali = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        HargaDenda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelRental = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelReturn = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        KembalikanBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Cust = new javax.swing.JTextField();

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

        RentalMobil.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        RentalMobil.setForeground(new java.awt.Color(255, 255, 255));
        RentalMobil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RentalMobil.setText("Rental Mobil");
        RentalMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentalMobilMouseClicked(evt);
            }
        });

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

        jLabel12.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pengembalian Mobil");

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
                            .addComponent(RentalMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(RentalMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel11.setText("Pengembalian Mobil");

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
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        Plat.setEditable(false);
        Plat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(97, 122, 85));
        jLabel21.setText("Tanggal Kembali:");

        jLabel17.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(97, 122, 85));
        jLabel17.setText("Plat Nomor");

        HargaDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaDendaActionPerformed(evt);
            }
        });

        TabelRental.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        TabelRental.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Rental", "Registrasi", "Nama Customer", "Tanggal Rental", "Tanggal Kembali", "Biaya"
            }
        ));
        TabelRental.setRowHeight(25);
        TabelRental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelRentalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelRental);

        jLabel20.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(97, 122, 85));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Pengembalian Mobil");

        TabelReturn.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        TabelReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Rental", "Registrasi", "Nama Customer", "Tanggal Kembalil", "Waktu Tunda", "Denda"
            }
        ));
        TabelReturn.setRowHeight(25);
        TabelReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelReturnMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelReturn);

        jLabel22.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(97, 122, 85));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Daftar Mobil");

        KembalikanBtn.setBackground(new java.awt.Color(255, 255, 255));
        KembalikanBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        KembalikanBtn.setForeground(new java.awt.Color(0, 102, 102));
        KembalikanBtn.setText("Kembalikan");
        KembalikanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalikanBtnActionPerformed(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(255, 255, 255));
        PrintBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 102, 102));
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(97, 122, 85));
        jLabel19.setText("Harga Denda");

        jLabel23.setFont(new java.awt.Font("FreeSerif", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(97, 122, 85));
        jLabel23.setText("Nama Customer");

        Cust.setEditable(false);
        Cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HargaDenda)
                            .addComponent(TglKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Plat)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(Cust)
                            .addComponent(KembalikanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(328, 328, 328))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(290, 290, 290))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Plat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cust, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(TglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HargaDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(KembalikanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menghasilkan(){
        
    }
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

    private void HargaDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaDendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaDendaActionPerformed

    int RentId;
    private void TabelRentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelRentalMouseClicked
        DefaultTableModel model = (DefaultTableModel)TabelRental.getModel();
        int MyIndex = TabelRental.getSelectedRow();
        RentId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        Plat.setText(model.getValueAt(MyIndex, 1).toString());
        Cust.setText(model.getValueAt(MyIndex, 2).toString());
        Cost = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_TabelRentalMouseClicked

    private void TabelReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelReturnMouseClicked
       DefaultTableModel model = (DefaultTableModel)TabelReturn.getModel();
       int MyIndex = TabelReturn.getSelectedRow();
       Plat.setText(model.getValueAt(MyIndex, 1).toString());
       Cust.setText(model.getValueAt(MyIndex, 1).toString());
       TglKembali.setDate((java.util.Date) model.getValueAt(MyIndex, 4));
       HargaDenda.setText(model.getValueAt(MyIndex, 0).toString());
    }//GEN-LAST:event_TabelReturnMouseClicked

    java.util.Date dl,today;
    java.util.Date TanggalKmbl;
    java.sql.Date MyTglKembali;
    private void KembalikanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalikanBtnActionPerformed
      if (TglKembali.getDate() == null) {
    JOptionPane.showMessageDialog(this, "Mohon untuk dilengkapi");
} else {
    try {
        TanggalKmbl = TglKembali.getDate();
        MyTglKembali = new java.sql.Date(TanggalKmbl.getTime());

        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        
        // Mengambil tanggal rental dari tabel 'rental' berdasarkan 'Plat' dan 'Nama_Customer'
        String rentalQuery = "SELECT Tanggal_Kembali FROM rental WHERE Plat_Nomor=? AND Nama_Customer=?";
        PreparedStatement rentalStatement = Con.prepareStatement(rentalQuery);
        rentalStatement.setString(1, Plat.getText());
        rentalStatement.setString(2, Cust.getText());
        ResultSet rentalResult = rentalStatement.executeQuery();
        
        if (rentalResult.next()) {
            java.sql.Date MyTglRental = rentalResult.getDate("Tanggal_Kembali");
            
            // Menghitung selisih hari antara tanggal rental dan tanggal kembali
            long selisihHari = (MyTglKembali.getTime() - MyTglRental.getTime()) / (24 * 60 * 60 * 1000);
            
            // Mengambil harga denda dari input pengguna
            int hargaDenda = Integer.parseInt(HargaDenda.getText());
            
            // Menghitung total denda berdasarkan harga denda dan selisih hari
            int totalDenda = hargaDenda * (int) selisihHari;
            
            PreparedStatement add = Con.prepareStatement("INSERT INTO `return` (Plat_Nomor, Nama_Customer, Tanggal_Kembali, Terlambat, Denda) VALUES (?, ?, ?, ?, ?)");
            add.setString(1, Plat.getText());
            add.setString(2, Cust.getText());
            add.setDate(3, MyTglKembali);
            add.setInt(4, (int) selisihHari);
            add.setInt(5, totalDenda); 
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Mobil berhasil dikembalikan");
            DisplayReturn();
            UpdateCars();
            RemoveFromRental();
        } else {
            JOptionPane.showMessageDialog(this, "Data rental tidak ditemukan");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    }//GEN-LAST:event_KembalikanBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
           try {
        Document document = new Document();
        OutputStream outputStream = new FileOutputStream("output.pdf");
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        
        PdfPTable table = new PdfPTable(TabelReturn.getColumnCount());
        
        // Mengisi header tabel
        for (int i = 0; i < TabelReturn.getColumnCount(); i++) {
            table.addCell(new Phrase(TabelReturn.getColumnName(i)));
        }
        
        // Mengisi data tabel
        for (int i = 0; i < TabelReturn.getRowCount(); i++) {
            for (int j = 0; j < TabelReturn.getColumnCount(); j++) {
                table.addCell(new Phrase(TabelReturn.getValueAt(i, j).toString()));
            }
        }
        
        document.add(table);
        document.close();
        outputStream.close();
        
        JOptionPane.showMessageDialog(this, "Data tabel berhasil diubah menjadi PDF");

        // Membuka file PDF menggunakan aplikasi default
        Desktop.getDesktop().open(new File("output.pdf"));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan dalam mengubah data tabel menjadi PDF: " + ex.getMessage());
    }
    }//GEN-LAST:event_PrintBtnActionPerformed

    
    int Cost = 0;
    int Dend;
    private void UpdateCars()
    {
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        String Reg = Plat.getText();
        String StatusMbl = "Tersedia";
        String Query = "UPDATE RentalDb.cartbl SET Status='"+StatusMbl+"' WHERE Plat_Nomor='"+Reg+"'";
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        //JOptionPane.showMessageDialog(this, "Mobil Berhasil Di Update");
        
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
} 
    
    private void RemoveFromRental() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RentalDb?zeroDateTimeBehavior=convertToNull", "root", "");
        String Query = "DELETE FROM rental WHERE Id_Rental='" + RentId + "'";
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        //JOptionPane.showMessageDialog(this, "Berhasil Menghapus Mobil Dari Data Rental Mobil");
        DisplayRental();
    } catch (SQLException ex) {
        Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
    private void CustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustActionPerformed

    private void DataMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataMobilMouseClicked
     new Cars().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_DataMobilMouseClicked

    private void DataCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataCustomerMouseClicked
     new Customer().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_DataCustomerMouseClicked

    private void RentalMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentalMobilMouseClicked
    new Rental().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_RentalMobilMouseClicked

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
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Returns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cust;
    private javax.swing.JLabel DataCustomer;
    private javax.swing.JLabel DataMobil;
    private javax.swing.JTextField HargaDenda;
    private javax.swing.JButton KembalikanBtn;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField Plat;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JLabel RentalMobil;
    private javax.swing.JTable TabelRental;
    private javax.swing.JTable TabelReturn;
    private com.toedter.calendar.JDateChooser TglKembali;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
