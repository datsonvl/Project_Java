/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tran Dat
 */
public class HoaDonXuat extends javax.swing.JInternalFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form HoaDonXuat
     */
    public HoaDonXuat() {
        initComponents();
         conn = ConnectDatabase.ConnectDB();   
        UpdateTableHoaDonXuat();
    }
    private void UpdateTableHoaDonXuat() {

        try {
            String sql = "select * from HoaDonXuat";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jtb_hoadonxuat.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        txt_mahoadon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_makh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_giaxuat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mathuoc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_donvitinh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_thanhtien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_dathanhtoan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_nhanviengiao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nhanviennhan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_conlai = new javax.swing.JTextField();
        jdate_ngayxuat = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_hoadonxuat = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Mã hóa đơn ");

        jLabel2.setText("Mã khách hàng");

        jLabel3.setText("Ngày xuất");

        jLabel4.setText("Giá xuất");

        jLabel5.setText("Số lượng");

        jLabel6.setText("Mã số thuốc ");

        jLabel7.setText("Đơn vị tính");

        jLabel8.setText("Thành tiền");

        jLabel9.setText("Đã thanh toán");

        jLabel10.setText("Nhân viên giao");

        jLabel11.setText("Nhân viên nhận");

        jLabel12.setText("Còn lại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_mahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(txt_makh)
                    .addComponent(txt_giaxuat)
                    .addComponent(txt_soluong)
                    .addComponent(txt_mathuoc)
                    .addComponent(txt_donvitinh)
                    .addComponent(txt_thanhtien)
                    .addComponent(txt_dathanhtoan)
                    .addComponent(txt_nhanviengiao)
                    .addComponent(txt_nhanviennhan)
                    .addComponent(txt_conlai)
                    .addComponent(jdate_ngayxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_conlai, txt_dathanhtoan, txt_donvitinh, txt_giaxuat, txt_mahoadon, txt_makh, txt_mathuoc, txt_nhanviengiao, txt_nhanviennhan, txt_soluong, txt_thanhtien});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_mahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdate_ngayxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_giaxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_mathuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_donvitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_dathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_nhanviengiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_nhanviennhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_conlai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jtb_hoadonxuat.setModel(new javax.swing.table.DefaultTableModel(
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
        jtb_hoadonxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_hoadonxuatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_hoadonxuat);

        jMenu1.setText("Option");

        jMenuItem1.setText("Tạo hóa đơn xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cập nhật");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu3.setText("Sắp xếp");

        jMenuItem4.setText("Sắp xếp theo mã hóa đơn (mặc định)");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Sắp xếp theo ngày xuất");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Sắp xếp theo mã số thuốc");
        jMenu3.add(jMenuItem6);

        jMenu1.add(jMenu3);

        jMenuItem3.setText("Xóa");
        jMenu1.add(jMenuItem3);

        jMenuItem7.setText("In hóa đơn");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            String sql = "Insert into HoaDonNhap (Mahoadon,MaKH,NgayXuat,GiaXuat,Soluong,Mathuoc,DonViTinh,ThanhTien,Ngayxuat,DaThanhToan,NvGiao,NvNhan,Conlai) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_mahoadon.getText());
            pst.setString(2, txt_makh.getText());
            pst.setString(8, ((JTextField) jdate_ngayxuat.getDateEditor().getUiComponent()).getText());
            pst.setString(4, txt_giaxuat.getText());
            pst.setString(5, txt_soluong.getText());
            pst.setString(6, txt_mathuoc.getText());
            pst.setString(7, txt_donvitinh.getText());
            pst.setString(8, txt_thanhtien.getText());                  
            pst.setString(9, txt_dathanhtoan.getText());
            pst.setString(10, txt_nhanviengiao.getText());
            pst.setString(11, txt_nhanviennhan.getText());
            pst.setString(12, txt_conlai.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added!!");
            UpdateTableHoaDonNhap();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jtb_hoadonxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_hoadonxuatMouseClicked
         try{
             
            int row = jtb_hoadonxuat.getSelectedRow();
            String Table_click = (jtb_hoadonxuat.getModel().getValueAt(row, 0)).toString();
            String sql = "select * from HoaDonXuat where Mahoadon='"+Table_click+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(); 
            if(rs.next())
                    {
                        String value1 = rs.getString("Mahoadon");
                        txt_mahoadon.setText(value1);
                        String value2 = rs.getString("MaKH");
                        txt_makh.setText(value2);
                        String value3 = rs.getString("NgayXuat");
                        ((JTextField)jdate_ngayxuat.getDateEditor().getUiComponent()).setText(value3);
                        String value4 = rs.getString("GiaXuat");
                        txt_giaxuat.setText(value4);
                        String value5 = rs.getString("Soluong");
                        txt_soluong.setText(value5);
                        String value6 = rs.getString("Mathuoc");
                        txt_mathuoc.setText(value6);
                        String value7 = rs.getString("DonViTinh");
                        txt_donvitinh.setText(value7);
                        String value8 = rs.getString("ThanhTien");
                        txt_thanhtien.setText(value8);
                        String value9 = rs.getString("DaThanhToan");
                        txt_dathanhtoan.setText(value9);
                        String value10 = rs.getString("NvGiao");
                        txt_nhanviengiao.setText(value10);
                        String value11 = rs.getString("NvNhan");
                        txt_nhanviennhan.setText(value11);  
                        String value12 = rs.getString("Conlai");
                        txt_conlai.setText(value12);
                        
                    }  
            //pst.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtb_hoadonxuatMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try{
           // 
           // 
            String value0 = txt_mahoadon.getText();
            String value1 = txt_mancc.getText();
            String value2 = ((JTextField)jdate_ngaynhap.getDateEditor().getUiComponent()).getText();
            String value3 = txt_gianhap.getText();
            String value4 = txt_soluong.getText();
            String value5 = txt_mathuoc.getText();
            String value6 = txt_thanhtien.getText();
            String value7 = txt_donvitinh.getText();
            String value8 = txt_dathanhtoan.getText();
            String value9 = txt_nhanviengiao.getText();
            String value10 = txt_nhanviennhan.getText();
            String value11 = txt_conlai.getText();
            String sql = "update HoaDonNhap set Mahoadon='"+value0+"',MaNCC='"+value1+"',NgayNhap='"+value2+"',GiaNhap='"+value3+"',Soluong='"+value4+"',Mathuoc='"+value5+"',ThanhTien='"+value6+"',DonViTinh='"+value7+"',DaThanhToan='"+value8+"',NvGiao='"+value9+"',NvNhan='"+value10+"',Conlai='"+value11+"' where Mahoadon='"+value0+"' ";
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update success");
            
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        UpdateTableHoaDonXuat();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate_ngayxuat;
    private javax.swing.JTable jtb_hoadonxuat;
    private javax.swing.JTextField txt_conlai;
    private javax.swing.JTextField txt_dathanhtoan;
    private javax.swing.JTextField txt_donvitinh;
    private javax.swing.JTextField txt_giaxuat;
    private javax.swing.JTextField txt_mahoadon;
    private javax.swing.JTextField txt_makh;
    private javax.swing.JTextField txt_mathuoc;
    private javax.swing.JTextField txt_nhanviengiao;
    private javax.swing.JTextField txt_nhanviennhan;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_thanhtien;
    // End of variables declaration//GEN-END:variables
}
