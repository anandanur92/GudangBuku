/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ObjectBuku extends javax.swing.JFrame {
    private ArrayList<Buku> listBuku = new ArrayList<Buku>();
    public static String nameFile = "daftarBuku.out";
    private Buku buku;
    
    /**
     * Creates new form ObjectMobil
     */
    public ObjectBuku() {
        initComponents();
        mulaiJam(); 

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
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        kode = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        judul = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        pengarang = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tahunterbit = new javax.swing.JTextPane();
        simpan = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        simpanlist = new javax.swing.JButton();
        bacadata = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        penerbit = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "JUDUL", "PENGARANG", "PENERBIT", "TAHUN TERBIT"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jScrollPane2.setViewportView(kode);

        jScrollPane3.setViewportView(judul);

        jScrollPane4.setViewportView(pengarang);

        jScrollPane5.setViewportView(tahunterbit);

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        clear.setText("Clear All Table Data");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("GUDANG BUKU");

        jLabel2.setText("KODE BUKU");

        jLabel3.setText("JUDUL");

        jLabel4.setText("PENERBIT");

        jLabel5.setText("PENGARANG");

        timeLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        timeLabel.setText("TIME");

        jLabel6.setText("TAHUN");

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        simpanlist.setText("Simpan List Buku");
        simpanlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanlistActionPerformed(evt);
            }
        });

        bacadata.setText("Baca Data List Buku");
        bacadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacadataActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(penerbit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(simpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hapus)
                                        .addGap(13, 13, 13)
                                        .addComponent(edit))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clear)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bacadata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(simpanlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simpanlist)
                        .addGap(18, 18, 18)
                        .addComponent(bacadata)
                        .addGap(18, 18, 18)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(simpan)
                                    .addComponent(edit)
                                    .addComponent(hapus)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here: SIMPAN DATA
        
        String code1 = kode.getText();
        String judul1 = judul.getText();
        String pengarang1 = pengarang.getText();
        String penerbit1 = penerbit.getText();
        
        
        Buku buku = new Buku();
        buku.setKode(code1);
        buku.setJudul(judul1);
        buku.setPengarang(pengarang1);
        buku.setPenerbit(penerbit1);
        
        if(buku.validasiTahun(tahunterbit.getText())){
            int tahunterbit1 = Integer.parseInt(tahunterbit.getText());
            buku.setTahunterbit(tahunterbit1);
            listBuku.add(buku);
        }else{
            JOptionPane.showMessageDialog(null, "INPUT TAHUN SALAH!");
        }
        
        reloadTable();
        clearTextInput();
    }//GEN-LAST:event_simpanActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here: DELETE DATA
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        while(dm.getRowCount() > 0)
        {
            dm.removeRow(0);
        }
    }//GEN-LAST:event_clearActionPerformed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        // TODO add your handling code here: ISI TABLE
       
    }//GEN-LAST:event_tableKeyReleased

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        int SelectedRowIndex = table.getSelectedRow();
        tableModel.removeRow(SelectedRowIndex);
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanlistActionPerformed
        // TODO add your handling code here:
        try {
           // TODO add your handling code here:
           simpanObject(listBuku);
       } catch (IOException ex) {
           Logger.getLogger(ObjectBuku.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_simpanlistActionPerformed

    private void bacadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacadataActionPerformed
        // TODO add your handling code here:
        try {
            listBuku = bacaObject();
            reloadTable();
        } catch (IOException ex) {
            Logger.getLogger(ObjectBuku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bacadataActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        kode.setText(model.getValueAt(selectedRow, 0).toString());
        judul.setText(model.getValueAt(selectedRow, 1).toString());
        pengarang.setText(model.getValueAt(selectedRow, 2).toString());
        penerbit.setText(model.getValueAt(selectedRow, 3).toString());
        tahunterbit.setText(model.getValueAt(selectedRow, 4).toString());

    }//GEN-LAST:event_tableMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         int i =table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Buku buku = new Buku();
        if(buku.validasiTahun(tahunterbit.getText())){
            int tahunterbit1 = Integer.parseInt(tahunterbit.getText());
                buku.setTahunterbit(tahunterbit1);
                listBuku.set(5, buku);
                
            model.setValueAt(kode.getText(), i, 0);
            model.setValueAt(judul.getText(), i, 1);
            model.setValueAt(pengarang.getText(), i, 2);
            model.setValueAt(penerbit.getText(), i, 3);
            model.setValueAt(tahunterbit.getText(), i, 4);
                 
            }else{
                JOptionPane.showMessageDialog(null, "INPUT TAHUN SALAH!");
            }
           
       
            clearTextInput();
    }//GEN-LAST:event_editActionPerformed

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
            java.util.logging.Logger.getLogger(ObjectBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjectBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjectBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjectBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjectBuku().setVisible(true);
            }
        });
    }
    public static void simpanObject(ArrayList<Buku> m) throws FileNotFoundException, IOException{
        FileOutputStream fout;
        fout = new FileOutputStream(nameFile);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(m);
        System.out.println("Daftar Buku Berhasil Disimpan!");
    }
    public static ArrayList<Buku> bacaObject() throws FileNotFoundException,
        IOException, ClassNotFoundException{
        ObjectInputStream ois;
        ois = new ObjectInputStream(new FileInputStream(nameFile));
        System.out.println("Object dibaca.");
        return (ArrayList<Buku>) ois.readObject();
    }
    private void reloadTable(){
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        tableModel.fireTableDataChanged();
        String[] listData = new String[5];
        int i =0;
        for(Buku m : listBuku){
            
            i++;
//            listData[0] = String.valueOf(i);
            listData[0] = m.getKode();
            listData[1] = m.getJudul();
            listData[2] = m.getPengarang();
            listData[3] = m.getPenerbit();
            listData[4] = String.valueOf(m.getTahunterbit());
            tableModel.addRow(listData);
        }
        tableModel.fireTableDataChanged();
    
    }
    private void clearTextInput(){
        kode.setText("");
        judul.setText("");
        pengarang.setText("");
        penerbit.setText("");
        tahunterbit.setText("");
        
        
    }
    public void mulaiJam() {
        Date skrg = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE, dd MMM yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        timeLabel.setText(jam.format(skrg)+" | "+tgl.format(skrg));
        //timeLabel.setText(tgl.format(skrg));
    }

    public ArrayList<Buku> getListBuku() {
        return listBuku;
    }

    public JButton getBacadata() {
        return bacadata;
    }

    public JButton getEdit() {
        return edit;
    }

    public JButton getHapus() {
        return hapus;
    }

    public JButton getSimpanlist() {
        return simpanlist;
    }

    public JTextPane getTahunterbit() {
        return tahunterbit;
    }

    public JTextPane getPenerbit() {
        return penerbit;
    }

    public JButton getClear() {
        return clear;
    }

    public JTextPane getKode() {
        return kode;
    }

    public JTextPane getJudul() {
        return judul;
    }

    public JTextPane getPengarang() {
        return pengarang;
    }

    public JButton getSimpan() {
        return simpan;
    }

    public JTable getTable() {
        return table;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bacadata;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane judul;
    private javax.swing.JTextPane kode;
    private javax.swing.JTextPane penerbit;
    private javax.swing.JTextPane pengarang;
    private javax.swing.JButton simpan;
    private javax.swing.JButton simpanlist;
    private javax.swing.JTable table;
    private javax.swing.JTextPane tahunterbit;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
