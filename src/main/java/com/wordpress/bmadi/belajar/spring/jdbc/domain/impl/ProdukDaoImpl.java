package com.wordpress.bmadi.belajar.spring.jdbc.domain.impl;

import com.wordpress.bmadi.belajar.spring.jdbc.domain.ProdukDao;
import com.wordpress.bmadi.belajar.spring.jdbc.model.Produk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("produkDao")
public class ProdukDaoImpl implements ProdukDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public void simpan(Produk p) {
        try {
            Connection conn = dataSource.getConnection();
            String sql = "INSERT INTO produk (kode, nama, harga) VALUES (?, ?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(sql);
            psInsert.setString(1, p.getKode());
            psInsert.setString(2, p.getNama());
            psInsert.setBigDecimal(3, p.getHarga());
            psInsert.executeUpdate();

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
