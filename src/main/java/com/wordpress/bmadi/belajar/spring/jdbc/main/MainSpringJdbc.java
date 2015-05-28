package com.wordpress.bmadi.belajar.spring.jdbc.main;

import com.wordpress.bmadi.belajar.spring.jdbc.domain.ProdukDao;
import com.wordpress.bmadi.belajar.spring.jdbc.model.Produk;
import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringJdbc {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("classpath:jdbc.xml");
        ProdukDao pd = (ProdukDao) ctx.getBean("produkDao");
        Produk p = new Produk();
        p.setKode("P-001");
        p.setNama("Produk 001");
        p.setHarga(new BigDecimal(1000000.00));
        
        pd.simpan(p);
    }

}
