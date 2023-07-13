-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2023 at 07:26 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `firstian06680`
--

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `nofilm` int(10) NOT NULL,
  `film` varchar(60) NOT NULL,
  `jam` varchar(10) NOT NULL,
  `kursi` varchar(30) NOT NULL,
  `tagihan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` char(20) NOT NULL,
  `nama` char(30) NOT NULL,
  `telp` char(30) NOT NULL,
  `email` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `telp`, `email`) VALUES
('', '', '', ''),
('1', 'Nama', '1', '1'),
('A12.2021.06671', 'Zhafar', '08162626272', 'zhafar@gmail.com'),
('A12.2021.06680', 'Firstian Alfani Okiviardi', '0822254362727', 'firstian@gmail.com'),
('A22.2010.00001', 'Damar Sulistiyono', '0856672723', 'DamarSulis@gmail.com'),
('Nim', 'Nama', 'Telpon', 'Email');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa2`
--

CREATE TABLE `mahasiswa2` (
  `nim` char(20) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `telp` char(20) NOT NULL,
  `email` char(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `kodepos` varchar(6) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` varchar(11) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `prodi` varchar(25) NOT NULL,
  `ipk` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa2`
--

INSERT INTO `mahasiswa2` (`nim`, `nama`, `telp`, `email`, `alamat`, `kota`, `kodepos`, `tempat_lahir`, `tgl_lahir`, `agama`, `prodi`, `ipk`) VALUES
('', 'Resha Catur', '089999888', 'meiranadi@yahoo.com', 'Jl Merak', 'Semarang', '50122', 'Semarang', '15 Mei 2004', 'Islam', 'Sistem Informasi S1', '4'),
('06566', '', '', '', '', '', '', '', '', '', 'Sistem Informasi S1', ''),
('A12.2021.06680', 'Firstian Alfani', '081212121', 'firstian@gmail.com', 'Jl Merapi', 'Semarang', '50511', 'Kab Semarang', '30 Januari ', 'Islam', 'Sistem Informasi S1', '3.8');

-- --------------------------------------------------------

--
-- Table structure for table `tb_paket`
--

CREATE TABLE `tb_paket` (
  `no_paket` varchar(5) NOT NULL,
  `kota_tujuan` varchar(20) NOT NULL,
  `provinsi_tujuan` varchar(20) NOT NULL,
  `biaya` double NOT NULL,
  `berat` int(11) NOT NULL,
  `kategori` int(11) NOT NULL,
  `total_bayar` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tiketing`
--

CREATE TABLE `tiketing` (
  `id` int(20) NOT NULL,
  `pemesan` char(50) NOT NULL,
  `kategori` int(20) NOT NULL,
  `jmltiket` int(20) NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nip` char(20) NOT NULL,
  `nama` varchar(25) DEFAULT NULL,
  `bagian` varchar(15) DEFAULT NULL,
  `jeniskel` varchar(15) DEFAULT NULL,
  `pass` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nip`, `nama`, `bagian`, `jeniskel`, `pass`) VALUES
('a122106680', 'firstian ', 'si', 'laki', 'firstian'),
('', '', '', NULL, NULL),
('a122106665', 'rafi', 'si', 'laki', 'rafi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`nofilm`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `mahasiswa2`
--
ALTER TABLE `mahasiswa2`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tiketing`
--
ALTER TABLE `tiketing`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `film`
--
ALTER TABLE `film`
  MODIFY `nofilm` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
