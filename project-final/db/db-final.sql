-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for db_oop
CREATE DATABASE IF NOT EXISTS `db_oop` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_oop`;

-- Dumping structure for table db_oop.tb_soal
CREATE TABLE IF NOT EXISTS `tb_soal` (
  `id_soal` int NOT NULL AUTO_INCREMENT,
  `pertanyaan` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',
  `pilihan1` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '0',
  `pilihan2` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '0',
  `pilihan3` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '0',
  `pilihan4` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '0',
  `jawaban` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',
  `tipe` enum('pilihanganda','benarsalah','essay') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'pilihanganda',
  PRIMARY KEY (`id_soal`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9807 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table db_oop.tb_soal: ~9 rows (approximately)
INSERT INTO `tb_soal` (`id_soal`, `pertanyaan`, `pilihan1`, `pilihan2`, `pilihan3`, `pilihan4`, `jawaban`, `tipe`) VALUES
	(1297, 'Blok finally dalam try-catch akan selalu dieksekusi, bahkan jika tidak ada exception', '0', '0', '0', '0', 'benar', 'benarsalah'),
	(1863, 'Keyword static digunakan untuk mendeklarasikan variabel yang hanya dapat diakses melalui objek', '0', '0', '0', '0', 'salah', 'benarsalah'),
	(2365, 'Apa tipe data untuk menyimpan bilangan pecahan (desimal) dalam Java?', 'int', 'float', 'double', 'char', 'c', 'pilihanganda'),
	(3234, 'Apa istilah yang digunakan untuk menggabungkan data dan metode dalam satu entitas dalam Java?', 'Encapsulation', 'Inheritance', 'Polymorphism', 'Abstraction', 'a', 'pilihanganda'),
	(3421, 'Bagaimana cara menginisialisasi array dalam Java?', 'int arr[] = {1, 2, 3};', 'array arr = {1, 2, 3};', 'int arr() = {1, 2, 3};', 'array arr() = {1, 2, 3};', 'a', 'pilihanganda'),
	(4683, 'Tipe data String pada Java adalah tipe data primitif', '0', '0', '0', '0', 'salah', 'benarsalah'),
	(5219, 'Apa keyword yang digunakan untuk melakukan inheritance?', '0', '0', '0', '0', 'extends', 'essay'),
	(5313, 'Apa keyword yang digunakan untuk membatasi inheritance?', '0', '0', '0', '0', 'final', 'essay'),
	(7531, 'Apa keyword yang digunakan untuk membuat objek baru?', '0', '0', '0', '0', 'new', 'essay');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
