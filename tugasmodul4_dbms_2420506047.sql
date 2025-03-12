-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2025 at 04:53 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasmodul4_dbms_2420506047`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id_mahasiswa` int(10) NOT NULL,
  `nama` varchar(225) NOT NULL,
  `jurusan` varchar(60) NOT NULL,
  `matkul` varchar(60) NOT NULL,
  `nilai` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id_mahasiswa`, `nama`, `jurusan`, `matkul`, `nilai`) VALUES
(1, 'Muhammad Asyrof', 'Teknologi Informasi', 'Struktur Data', 98),
(2, 'Muhammad Asyrof', 'Teknologi Informasi', 'Basis Data', 100),
(3, 'Zaki Indomi', 'Teknologi Informasi', 'Struktur Data', 90),
(4, 'Zaki Indomi', 'Teknologi Informasi', 'Basis Data', 80),
(5, 'Farrel Kecap Asin', 'Teknologi Informasi', 'Struktur Data', 92),
(6, 'Farrel Kecap Asin', 'Teknologi Informasi', 'Basis Data', 87),
(7, 'Samuel Tahu', 'Teknik Elektro', 'Elektronika', 75),
(8, 'Samuel Tahu', 'Teknik Elektro', 'Telekomunikasi', 95),
(9, 'Dhimas Dimus', 'Teknik Elektro', 'Elektronika', 83),
(10, 'Dhimas Dimus', 'Teknik Elektro', 'Telekomunikasi', 96),
(11, 'Rehan Nasgor', 'Teknik Mesin', 'Desain Mesin', 70),
(12, 'Rehan Nasgor', 'Teknik Mesin', 'Terodinamika', 79),
(13, 'Joe Pentol', 'Teknik Mesin', 'Desain Mesin', 99),
(14, 'Joe Pentol', 'Teknik Mesin', 'Terodinamika', 89);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id_mahasiswa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id_mahasiswa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
