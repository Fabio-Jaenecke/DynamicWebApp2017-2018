DROP DATABASE lebensmittel;
CREATE DATABASE lebensmittel;
USE lebensmittel;

DROP TABLE IF EXISTS lebensmitteldaten;
CREATE TABLE lebensmitteldaten
  (
     LIndex          INT(3) NOT NULL,
     LName           VARCHAR(100) NOT NULL,
     Karenzphase     VARCHAR(100) NOT NULL,
     Dauerernaehrung VARCHAR (100) NOT NULL,
     CONSTRAINT pk_lebensmitteldaten PRIMARY KEY(LIndex)
  );

DROP TABLE IF EXISTS zugriffsskala;
CREATE TABLE zugriffsskala
  (
     ZIndex      INT(3) NOT NULL,
     Platzierung INT(3) NOT NULL,
     AZugriffe   INT(3) NOT NULL,
     CONSTRAINT pk_zugriffskala PRIMARY KEY(ZIndex)
  );

DROP TABLE IF EXISTS lebensmittelkategorie;
CREATE TABLE lebensmittelkategorie
  (
     KIndex INT(3) NOT NULL,
     KName  VARCHAR(100) NOT NULL,
     CONSTRAINT pk_lebensmittelkategorien PRIMARY KEY(KIndex)
  );

DROP TABLE IF EXISTS naehrstoffe;
CREATE TABLE naehrstoffe
  (
     NIndex INT(3) NOT NULL,
     NName  VARCHAR(3) NOT NULL,
     CONSTRAINT pk_naehrstoffe PRIMARY KEY(NIndex)
  );

DROP TABLE IF EXISTS kategorieneinteilung;
CREATE TABLE kategorieneinteilung
  (
     KEIndex INT(3) NOT NULL,
     KIndex1 INT(3) NOT NULL,
     KIndex2 INT(3) NOT NULL,
     KIndex3 INT(3) NOT NULL,
     CONSTRAINT pk_kategorieneinteilung PRIMARY KEY(KEIndex)
  );

DROP TABLE IF EXISTS katzugehoerigkeit;
CREATE TABLE katzugehoerigkeit
  (
     KIndex INT(3) NOT NULL,
     LIndex INT(3) NOT NULL,
     CONSTRAINT uk_katzugehoerigkeit UNIQUE KEY (LIndex),
     CONSTRAINT fk_kategorien_k FOREIGN KEY(KIndex) REFERENCES lebensmittelkategorie(KIndex),
     CONSTRAINT fk_lebensmittelsdaten_k FOREIGN KEY(LIndex) REFERENCES
     lebensmitteldaten(LIndex)
  );

DROP TABLE IF EXISTS favorit;
CREATE TABLE favorit
  (
     ZIndex INT(3) NOT NULL,
     LIndex INT(3) NOT NULL,
     CONSTRAINT uk_favorit UNIQUE KEY(LIndex),
     CONSTRAINT fk_zugriffsskala_f FOREIGN KEY(ZIndex) REFERENCES zugriffsskala(
     ZIndex),
     CONSTRAINT fk_lebensmittelsdaten_f FOREIGN KEY(LIndex) REFERENCES
     lebensmitteldaten(LIndex)
  );

DROP TABLE IF EXISTS naehrzugehoerigkeit;
CREATE TABLE naehrzugehoerigkeit
  (
     NIndex INT(3) NOT NULL,
     LIndex INT(3) NOT NULL,
     CONSTRAINT uk_naehrzugehoerigkeit UNIQUE KEY(LIndex),
     CONSTRAINT fk_naehrstoffe_n FOREIGN KEY(NIndex) REFERENCES naehrstoffe(NIndex
     ),
     CONSTRAINT fk_lebensmittelsdaten_n FOREIGN KEY(LIndex) REFERENCES
     lebensmitteldaten(LIndex)
  );

DROP TABLE IF EXISTS enthaelt;
CREATE TABLE enthaelt
  (
     KIndex  INT(3) NOT NULL,
     KEIndex INT(3) NOT NULL,
     CONSTRAINT uk_enthaelt UNIQUE KEY(KIndex, KEIndex),
     CONSTRAINT fk_kategorien_e FOREIGN KEY(KIndex) REFERENCES lebensmittelkategorie(KIndex),
     CONSTRAINT fk_kateinteilung_e FOREIGN KEY(KEIndex) REFERENCES
     kategorieneinteilung(KEIndex)
  );  