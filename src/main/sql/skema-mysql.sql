DROP TABLE IF EXISTS produk

CREATE TABLE produk (
  id int(11) NOT NULL AUTO_INCREMENT,
  kode varchar(15) NOT NULL,
  nama varchar(45) NOT NULL,
  harga decimal(19,2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 