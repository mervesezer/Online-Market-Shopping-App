CREATE DATABASE  IF NOT EXISTS `market_alisveris` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `market_alisveris`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: market_alisveris
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adres`
--

DROP TABLE IF EXISTS `adres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adres` (
  `adresId` int NOT NULL AUTO_INCREMENT,
  `semt` varchar(45) NOT NULL,
  `sehir` varchar(45) NOT NULL,
  `adresAciklama` longtext NOT NULL,
  `adresBaslik` varchar(45) NOT NULL,
  `kullaniciId` int DEFAULT NULL,
  `telNo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`adresId`),
  KEY `kullanici_id_fk_idx` (`kullaniciId`),
  CONSTRAINT `kullanici_id_fk` FOREIGN KEY (`kullaniciId`) REFERENCES `kullanici` (`kullaniciId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adres`
--

LOCK TABLES `adres` WRITE;
/*!40000 ALTER TABLE `adres` DISABLE KEYS */;
/*!40000 ALTER TABLE `adres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kategori`
--

DROP TABLE IF EXISTS `kategori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kategori` (
  `kategoriId` int NOT NULL AUTO_INCREMENT,
  `kategoriIsim` varchar(45) NOT NULL,
  PRIMARY KEY (`kategoriId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kategori`
--

LOCK TABLES `kategori` WRITE;
/*!40000 ALTER TABLE `kategori` DISABLE KEYS */;
INSERT INTO `kategori` VALUES (1,'İçecek'),(2,'Yiyecek'),(3,'Atıştırmalık'),(4,'Temizlik Malzemeleri'),(5,'Sebze ve Meyve'),(6,'Unlu Mamul'),(7,'Süt ve Kahvaltılık'),(9,'Dondurma'),(10,'Kişisel Bakım'),(11,'Evcil Hayvan'),(12,'Bebek'),(13,'Kozmetik'),(15,'Et ve Balık');
/*!40000 ALTER TABLE `kategori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanici` (
  `kullaniciId` int NOT NULL AUTO_INCREMENT,
  `kullaniciAdi` varchar(45) NOT NULL,
  `sifre` varchar(45) NOT NULL,
  PRIMARY KEY (`kullaniciId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici`
--

LOCK TABLES `kullanici` WRITE;
/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` VALUES (1,'merve','123');
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `urun`
--

DROP TABLE IF EXISTS `urun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `urun` (
  `urunId` int NOT NULL AUTO_INCREMENT,
  `alisMiktar` float NOT NULL,
  `satisMiktar` float NOT NULL,
  `indirimMiktar` int NOT NULL,
  `stokDurum` varchar(45) NOT NULL,
  `kategoriId` int NOT NULL,
  `urunAdet` int NOT NULL,
  `urunIsim` varchar(45) NOT NULL,
  PRIMARY KEY (`urunId`),
  KEY `kategori_ıd_fk_idx` (`kategoriId`),
  CONSTRAINT `kategori_ıd` FOREIGN KEY (`kategoriId`) REFERENCES `kategori` (`kategoriId`)
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urun`
--

LOCK TABLES `urun` WRITE;
/*!40000 ALTER TABLE `urun` DISABLE KEYS */;
INSERT INTO `urun` VALUES (1,10,15,5,'var',1,5,'Sprite'),(2,25,5,3,'var',1,10,'Fanta'),(3,56,85,15,'var',2,25,'Tost'),(4,76,35,10,'yok',4,30,'Domestos'),(5,15,10,2,'var',1,14,'Kola'),(6,5,7,0,'var',1,3,'ıce tea'),(7,5,8,0,'var',1,20,'fruko'),(8,7,9,0,'var',1,23,'şalgam'),(9,3,7,1,'var',1,30,'red bull'),(10,2,8,2,'var',1,22,'burn'),(11,10,15,3,'var',1,32,'monster'),(12,12,13,0,'var',1,23,'dimes şeftali'),(13,10,15,1,'var',1,5,'limonata'),(14,5,10,3,'var',1,10,'meyveli soda'),(15,4,8,2,'var',1,15,'schweppes'),(16,6,10,0,'var',1,12,'çamlıca gazoz'),(17,8,13,2,'var',1,25,'nescafe x press'),(18,10,15,3,'var',1,18,'doğuş Çay'),(19,5,10,0,'var',1,33,'lipton kutu çay'),(20,6,12,0,'var',1,13,'doğanay çay'),(21,5,12,2,'var',1,5,'Çaykur Çay'),(22,7,17,4,'var',1,8,'Jacobs'),(23,9,15,0,'var',5,50,'domates(kg)'),(24,5,9,0,'var',5,100,'hıyar(kg)'),(25,2,5,1,'var',5,150,'avakado'),(26,3,9,2,'var',5,27,'havuç(kg)'),(27,5,8,3,'var',5,50,'yeşil elma(kg)'),(28,7,10,1,'var',5,60,'kırmızı elma(kg)'),(29,8,11,0,'var',5,10,'salkım domates(kg)'),(30,2,12,0,'var',5,30,'marul'),(31,12,17,0,'var',5,200,'nektali(kg)'),(32,12,20,2,'var',5,80,'erik(paket)'),(33,15,25,5,'var',5,75,'çilek(paket)'),(34,2,8,3,'var',5,89,'nektali (kg)'),(35,8,15,2,'var',5,43,'muz(kg)'),(36,10,13,1,'var',5,23,'vişne(kg)'),(37,9,14,2,'var',5,45,'kiraz(kg)'),(38,15,25,0,'var',5,20,'karpuz'),(39,16,8,1,'var',4,10,'Bingo sprey'),(40,18,9,2,'var',4,12,'cif'),(41,15,7,3,'var',4,13,'cam sil'),(42,13,25,0,'var',4,50,'Ariel deterjan'),(43,7,15,0,'var',4,34,'Omo yumuşatıcı'),(44,8,20,0,'var',4,78,'Fairy'),(45,4,10,2,'var',4,43,'Por Çöz'),(46,10,15,3,'var',4,21,'Activex sabun'),(47,7,12,5,'var',4,3,'denk yüzey Temizleyici'),(48,25,50,7,'var',4,5,'finish kapsül(35 li)'),(146,1,4,3,'var',2,10,'knor ezogelin çorba'),(147,1.45,4,5,'var',2,15,'knor domates çorba'),(148,1.55,4,6,'var',2,18,'knor mercimek çorba'),(149,1.2,2,1,'var',2,22,'ankara makarna'),(150,1.75,3.25,0,'var',2,28,'spagetti'),(151,1.25,3.5,0,'var',2,100,'burgu makarna'),(152,1,3.75,0,'var',2,200,'bardak çorba'),(153,1.5,4,2,'var',2,154,'kimyon'),(154,1,4.1,0,'var',2,278,'karabiber'),(155,1,4.15,3,'var',2,267,'tuz'),(156,4.2,12,5,'var',2,179,'Tamek domates salça'),(157,7,15.99,2,'var',2,273,'tamek biber salça'),(158,3,7.3,1,'var',2,105,'Fasulye'),(159,2,8,2,'var',2,194,'pirinç'),(160,3,7,3,'var',2,738,'bulgur'),(161,2.5,4,0,'var',2,23,'supangle'),(162,2.25,4,0,'var',2,45,'profiterol'),(163,5.75,9,0,'var',2,54,'mercimek'),(164,6,7,0,'var',2,27,'nohut'),(165,0.5,1.5,2,'var',3,15,'ülker çikolatalı gofret'),(166,7,15,3,'var',3,20,'pringles'),(167,3.75,7,1,'var',3,90,'doritos peynir'),(168,2.25,7,5,'var',3,50,'doritos baharat'),(169,4.5,7,0,'var',3,40,'Lays fırından'),(170,4,7,0,'var',3,36,'Lays baharat'),(171,5,8,0,'var',3,67,'M&M'),(172,1,5,1,'var',3,89,'bonibon'),(173,0.25,1.25,0,'var',3,100,'Cheetos'),(174,0.25,2.5,2,'var',3,105,'Ülker Rondo'),(175,3,5.5,2,'var',3,67,'Hanımeler'),(176,0.25,3.75,3,'var',3,43,'Eti Burçak'),(177,1.25,2,0,'var',3,23,'Crax'),(178,0.2,1.25,0,'var',3,16,'çubuk kraker'),(179,0.15,1.5,0,'var',3,10,'Halley'),(180,2,2.75,0,'var',3,20,'bumbo'),(181,3.5,6,1,'var',6,4,'tost ekmeği'),(182,2.75,7,2,'var',6,13,'hamburger ekmeği'),(183,5,10,3,'var',6,17,'yulaf'),(184,2.7,5.5,1,'var',6,20,'buğdaylı ekmek'),(185,3,7.75,0,'var',6,25,'kepek ekmek'),(186,8.25,15,0,'var',6,100,'kuru pasta(kg)'),(187,35,50,0,'var',6,11,'yaş pasta'),(188,7,9,2,'var',6,100,'galeta'),(189,3,8,1,'var',6,5,'cup kek'),(190,3,8,2,'var',6,6,'Muffin'),(191,1.25,3,0,'var',6,50,'Tuzlu Çubuk'),(192,4.5,7.25,0,'var',6,15,'Trabzon ekmek'),(193,9,12,1,'var',7,10,'nesquik gevrek'),(194,9.75,13,2,'var',7,34,'form gevrek'),(195,8.25,11,2,'var',7,23,'nesfit gevrek'),(196,7.99,14,2,'var',7,26,'special K'),(197,5,12.5,1,'var',7,54,'coco pops'),(198,1,2,0,'var',7,36,'çikolatalı süt'),(199,0.5,2,0,'var',7,45,'çilekli süt'),(200,2.25,3.75,0,'var',7,50,'süt'),(201,7,12,3,'var',7,100,'yumurta'),(202,6,10,2,'var',7,5,'reçel'),(203,5.5,13,1,'var',7,7,'bal'),(204,6.25,15,1,'var',7,14,'tahin'),(205,7.25,18,0,'var',7,25,'pekmez'),(206,4.5,7,0,'var',7,42,'krem peynir'),(207,3.25,7.75,0,'var',7,24,'beyaz peynir'),(208,4,15,0,'var',7,36,'kaşar'),(209,8,12.25,0,'var',7,10,'tereyağı'),(210,7,15.75,1,'var',7,22,'Labne peynir'),(211,4,6.5,1,'var',9,50,'Magnum Badem'),(212,4,6.5,2,'var',9,55,'Magnum vişne'),(213,9,12,2,'var',9,52,'Algida maraş'),(214,3,6,1,'var',9,30,'Nogger'),(215,1.5,2.75,0,'var',9,35,'frigola'),(216,12,17,1,'var',9,27,'Golf maraş'),(217,4,5,0,'var',9,63,'cornetto'),(218,3,12,0,'var',9,36,'Carte Dor'),(219,2.75,6.75,0,'var',9,37,'Magnum cookie'),(220,1,2.5,0,'var',9,38,'algida max'),(221,1,3.25,0,'var',9,68,'golf roko'),(222,4.5,7,0,'var',9,60,'Magnum ruby'),(223,10,15,2,'var',10,5,'şampuan'),(224,2,5,3,'var',10,7,'sabun'),(225,8.25,12,1,'var',10,10,'duş jeli'),(226,4.6,10,1,'var',10,9,'tırnak makası'),(227,16,20,1,'var',10,3,'yüz temizleme jeli'),(228,14,18,2,'var',10,2,'bakım maskesi'),(229,9,12,2,'var',10,2,'diş fırçası'),(230,12.5,20,0,'var',10,1,'diş macunu'),(231,6.25,7,0,'var',10,11,'diş ipi'),(232,12,15,0,'var',10,2,'saç kremi'),(233,18,25,2,'var',10,3,'saç bakım yağı'),(234,20.75,28,2,'var',10,5,'ped'),(235,40.25,50,1,'var',11,7,'köpek maması'),(236,22,25,1,'var',11,8,'köpek şampuanı'),(237,5,10,1,'var',11,10,'ödül maması'),(238,12.75,15,1,'var',11,4,'kedi maması'),(239,30,35,1,'var',11,2,'kedi kumu'),(240,14.5,18,1,'var',11,3,'oyuncak'),(241,62,70,1,'var',11,5,'kedi tuvaleti'),(242,52,55,1,'var',11,20,'köpek tasması'),(243,8,10,1,'var',11,22,'su kabı'),(244,16.8,18,1,'var',11,13,'yemek kabı'),(245,12,15,0,'var',12,3,'emzik'),(246,10,20.5,0,'var',12,7,'biberon'),(247,44.5,50,0,'var',12,8,'bez'),(248,17.25,25.25,3,'var',12,20,'süt pompası'),(249,12,15,0,'var',12,12,'bebek maması'),(250,8.25,12.75,0,'var',12,18,'dalin şampuan'),(251,2,5,0,'var',12,25,'pudra'),(252,4.7,7.1,0,'var',12,32,'ıslak mendil'),(253,10,15,2,'var',12,2,'zıbın'),(254,12.25,22.3,3,'var',12,18,'önlük'),(255,3.75,5.15,0,'var',12,13,'mama kaşığı'),(256,3.5,6,1,'var',12,22,'emzik tutucu'),(257,4,7,2,'var',13,3,'kulak çubuğu'),(258,11,15,3,'var',13,1,'rolon'),(259,12.25,20,4,'var',13,5,'deodorant'),(260,138,150,5,'var',13,8,'tıraş makinesi'),(261,9.5,12,2,'var',13,10,'nemlendirici'),(262,12.2,17,1,'var',13,9,'bakım kremi'),(263,21.3,25,2,'var',13,8,'cımbız'),(264,110,120,3,'var',13,3,'güneş kremi'),(265,50,56.9,0,'var',15,10,'kangal sucuk'),(266,12,17,0,'var',15,12,'piliç baget'),(267,18.9,34.9,0,'var',15,13,'levrek(400 gr)'),(268,5,12.95,0,'var',15,5,'poşet piliç'),(269,45.25,69.9,0,'var',15,7,'somon'),(270,50.3,55.9,0,'var',15,8,'dana kıyma'),(271,1.5,3.75,0,'var',15,2,'salam'),(272,58.75,66.9,0,'var',15,4,'dana kıymalık et'),(273,12,22.95,0,'var',15,9,'piliç pirzola'),(274,10.9,20.95,0,'var',15,10,'piliç bonfile');
/*!40000 ALTER TABLE `urun` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-15 18:35:02
