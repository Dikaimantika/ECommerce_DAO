-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 21, 2020 at 02:35 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ephone_store`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAdminAll` ()  BEGIN
	SELECT *
	FROM admin 
    INNER JOIN kode_pos 
    ON kode_pos.Kode_Pos=admin.kode_pos;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetCustomerAll` ()  BEGIN
	SELECT *
	FROM customer 
    INNER JOIN kode_pos 
    ON kode_pos.Kode_Pos=customer.kode_pos;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetCustomer_Order` ()  BEGIN
	SELECT 
    Id_Customer,
    Product_Name,
    Quantity
	FROM customer_order 
    INNER JOIN product
    ON product.Id_Product=customer_order.Id_Product;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Id_Admin` varchar(10) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `Kode_Pos` varchar(10) NOT NULL,
  `Telephone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Id_Admin`, `Username`, `Password`, `Alamat`, `Kode_Pos`, `Telephone`) VALUES
('Id_Adm01', 'Doraemon', 'emon_pass123', 'Jl. Mahameru', '61380', '321555'),
('Id_Adm02', 'Dorayaki', 'yaki_pass123', 'Jl. Hiu', '61500', '321444'),
('Id_Adm05', 'Admin keempat', 'tigapass', 'Jl. Jalan', '61380', '6677888'),
('Id_Adm06', 'adora', 'doranewpass', 'Jl. Jalan', '61380', '6677888');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Id_Customer` varchar(10) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Telephone` varchar(20) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Kode_Pos` varchar(10) NOT NULL,
  `Gender` char(1) NOT NULL,
  `Date_of_birth` date NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Id_Customer`, `Username`, `Telephone`, `Address`, `Kode_Pos`, `Gender`, `Date_of_birth`, `Email`, `Password`) VALUES
('cst_baru', 'adorable', '234567', 'Jl. Baru', '40111', 'P', '2000-05-01', 'emailnyabaru', 'doranewpass'),
('cus_001', 'Namjoon', '85730999444', 'Jl. Bambu', '40111', 'L', '1994-09-15', 'Joon_mail', 'joon_pass'),
('cus_002', 'Jooni', '85730111999', 'Jl. Paus', '60111', 'L', '1994-09-01', 'Kookie_mail', 'kook_pass'),
('cus_003', 'Jimin', '85730333111', 'Jl. Bumi', '61300', 'L', '1995-10-13', 'Mochi_mail', 'ncim_pass'),
('cus_004', 'adorable', '82111777999', 'Jl. Melati', '61500', 'P', '1997-07-27', 'Lalila_mail', 'doranewpass'),
('cus_005', 'Mbak Mawar', '82333888555', 'Jl. Mawar', '61500', 'P', '1996-01-20', 'Rozee_mail', 'Mawar_Pass');

--
-- Triggers `customer`
--
DELIMITER $$
CREATE TRIGGER `customer_update` BEFORE UPDATE ON `customer` FOR EACH ROW INSERT INTO customer_update
 SET action = 'update',
     cust_id = OLD.Id_Customer,
     cust_username = OLD.Username,
     changedate = NOW()
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `customer_order`
--

CREATE TABLE `customer_order` (
  `Id_Customer` varchar(10) NOT NULL,
  `Id_Product` varchar(10) NOT NULL,
  `Quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_order`
--

INSERT INTO `customer_order` (`Id_Customer`, `Id_Product`, `Quantity`) VALUES
('cus_001', 'prd_012', 1),
('cus_002', 'prd_015', 1),
('cus_004', 'prd_017', 4);

-- --------------------------------------------------------

--
-- Table structure for table `customer_update`
--

CREATE TABLE `customer_update` (
  `id_cst_upd` int(11) NOT NULL,
  `cust_id` varchar(10) NOT NULL,
  `cust_username` varchar(25) NOT NULL,
  `changedate` datetime DEFAULT NULL,
  `action` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_update`
--

INSERT INTO `customer_update` (`id_cst_upd`, `cust_id`, `cust_username`, `changedate`, `action`) VALUES
(1, 'cus_002', 'Joni', '2020-09-06 15:30:35', 'update'),
(2, 'cus_005', 'Roseana', '2020-09-06 15:31:30', 'update'),
(3, 'cus_005', 'Mbak Mawar', '2020-09-06 17:29:31', 'update'),
(4, 'cus_004', 'Lisa', '2020-09-20 22:10:18', 'update'),
(5, 'cst_baru', 'customer keenam', '2020-09-20 22:14:46', 'update'),
(6, 'cst_baru', 'adorable', '2020-09-20 22:17:15', 'update'),
(7, 'cst_baru', 'adorable', '2020-09-20 22:18:28', 'update'),
(8, 'cst_baru', 'customer keenam', '2020-09-20 22:23:50', 'update'),
(9, 'cst_baru', 'adorable', '2020-09-20 22:25:45', 'update'),
(10, 'cst_baru', 'customer keenam', '2020-09-20 22:28:01', 'update');

-- --------------------------------------------------------

--
-- Table structure for table `e_wallet`
--

CREATE TABLE `e_wallet` (
  `Id_Wallet` varchar(10) NOT NULL,
  `Id_Customer` varchar(10) NOT NULL,
  `Saldo` decimal(9,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `e_wallet`
--

INSERT INTO `e_wallet` (`Id_Wallet`, `Id_Customer`, `Saldo`) VALUES
('ewal_001', 'cus_001', '12000.00'),
('ewal_002', 'cus_002', '13000.00'),
('ewal_003', 'cus_003', '15000.00');

-- --------------------------------------------------------

--
-- Table structure for table `kode_pos`
--

CREATE TABLE `kode_pos` (
  `Kode_Pos` varchar(10) NOT NULL,
  `Kota` varchar(20) NOT NULL,
  `Provinsi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kode_pos`
--

INSERT INTO `kode_pos` (`Kode_Pos`, `Kota`, `Provinsi`) VALUES
('40111', 'Bandung', 'Jawa Barat'),
('60111', 'Surabaya', 'Jawa Timur'),
('61300', 'Solo', 'Jawa Tengah'),
('61380', 'Mojokerto', 'Jawa Timur'),
('61500', 'Malang', 'Jawa Timur');

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `Id_Order` varchar(10) NOT NULL,
  `Date_Order` date NOT NULL,
  `Id_Customer` varchar(10) NOT NULL,
  `Shipping_Price` decimal(5,2) DEFAULT NULL,
  `Total_Price` decimal(8,2) DEFAULT NULL,
  `Payment_Type` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`Id_Order`, `Date_Order`, `Id_Customer`, `Shipping_Price`, `Total_Price`, `Payment_Type`) VALUES
('ord_001', '2020-09-01', 'cus_002', '20.00', '220.00', 'EWallet'),
('ord_002', '2020-09-02', 'cus_004', '20.00', '220.00', 'ATM'),
('ord_003', '2020-09-03', 'cus_001', '10.00', '210.00', 'EWallet');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Id_Product` varchar(10) NOT NULL,
  `Product_Name` varchar(45) NOT NULL,
  `Merk` varchar(10) NOT NULL,
  `Category` varchar(10) NOT NULL,
  `Description` varchar(200) DEFAULT NULL,
  `Color` varchar(10) DEFAULT NULL,
  `Stock` int(11) DEFAULT NULL,
  `Price` decimal(10,0) DEFAULT NULL,
  `Image` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Id_Product`, `Product_Name`, `Merk`, `Category`, `Description`, `Color`, `Stock`, `Price`, `Image`) VALUES
('prd_011', 'Iphone 6s', 'Iphone', '6s', 'Display: 4.7", Camera: Single 12MP Wide camera, Front Camera: 5MP, Weight: 143 gs, SIM Card: Nano-SIM', 'Space Gray', 1, '3', NULL),
('prd_012', 'Iphone 6s', 'Iphone', '6s', 'Display: 4.7", Camera: Single 12MP Wide camera, Front Camera: 5MP, Weight: 143 gs, SIM Card: Nano-SIM', 'Silver', 2, '3', NULL),
('prd_013', 'Iphone 6s', 'Iphone', '6s', 'Display: 4.7", Camera: Single 12MP Wide camera, Front Camera: 5MP, Weight: 143 gs, SIM Card: Nano-SIM', 'Gold', 1, '3', NULL),
('prd_014', 'Iphone 6s', 'Iphone', '6s', 'Display: 4.7", Camera: Single 12MP Wide camera, Front Camera: 5MP, Weight: 143 gs, SIM Card: Nano-SIM', 'Rose Gold', 1, '3', NULL),
('prd_015', 'Samsung Galaxy S20+ BTS Edition', 'Samsung', 'Galaxy S', 'Display: 169.5mm (6.7" full rectangle) / 165.4mm (6.5" rounded corners), Camera: 64MP High Resolution Camera, Front Camera: 10MP, Weight: 186 gs, SIM Card: Dual-SIM Nano-SIM (4FF), Embedded-SIM', 'Purple', 2, '17', NULL),
('prd_016', 'Vivo Y11', 'Vivo', 'Y11', 'Dimensi: 6.35", Camera: 13MP+2MP, Front Camera: 8MP, Weight: 190.5 gs, SIM Card: Dual-SIM', 'Mineral Bl', 1, '1', NULL),
('prd_017', 'Vivo Y11', 'Vivo', 'Y11', 'Dimensi: 6.35", Camera: 13MP+2MP, Front Camera: 8MP, Weight: 190.5 gs, SIM Card: Dual-SIM', 'Agate Red', 2, '1', NULL),
('prd_baru', 'Product 77', 'mer_baru', 'cat_baru', 'desc', 'peach', 2, '36', 'img77'),
('prd_baru1', 'Somesome', 'mer_baru', 'cat_baru', 'desc', 'peach', 5, '4', 'img77'),
('prd_baru3', 'Product 77', 'mer_baru', 'cat_baru', 'desc', 'peach', 2, '36', 'img77');

-- --------------------------------------------------------

--
-- Table structure for table `product_upd`
--

CREATE TABLE `product_upd` (
  `id_product` varchar(10) NOT NULL,
  `Qty` int(11) DEFAULT NULL,
  `changedate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shipping`
--

CREATE TABLE `shipping` (
  `Id_Shipping` varchar(10) NOT NULL,
  `Id_Order` varchar(10) NOT NULL,
  `Date_Shipping` date NOT NULL,
  `Shipping_Name` varchar(10) DEFAULT NULL,
  `Origin` varchar(20) DEFAULT NULL,
  `Destination` varchar(20) DEFAULT NULL,
  `Shipping_Price` decimal(5,2) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shipping`
--

INSERT INTO `shipping` (`Id_Shipping`, `Id_Order`, `Date_Shipping`, `Shipping_Name`, `Origin`, `Destination`, `Shipping_Price`, `Status`) VALUES
('shp_001', 'ord_001', '2020-09-04', 'JNE', 'Malang', 'Bandung', '20.00', 'Delivered'),
('shp_002', 'ord_002', '2020-09-05', 'Pos Indone', 'Malang', 'Malang', '20.00', 'OTW'),
('shp_003', 'ord_003', '2020-09-06', 'JNE', 'Malang', 'Mojokerto', '10.00', 'Delivered');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Id_Admin`),
  ADD KEY `kd_pos_idx` (`Kode_Pos`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Id_Customer`),
  ADD KEY `kd_pos_idx` (`Kode_Pos`),
  ADD KEY `kd_pos_idt` (`Kode_Pos`);

--
-- Indexes for table `customer_order`
--
ALTER TABLE `customer_order`
  ADD PRIMARY KEY (`Id_Customer`),
  ADD KEY `id_product_idx` (`Id_Product`);

--
-- Indexes for table `customer_update`
--
ALTER TABLE `customer_update`
  ADD PRIMARY KEY (`id_cst_upd`);

--
-- Indexes for table `e_wallet`
--
ALTER TABLE `e_wallet`
  ADD PRIMARY KEY (`Id_Wallet`),
  ADD KEY `id_customer_idx` (`Id_Customer`);

--
-- Indexes for table `kode_pos`
--
ALTER TABLE `kode_pos`
  ADD PRIMARY KEY (`Kode_Pos`);

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`Id_Order`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Id_Product`);

--
-- Indexes for table `product_upd`
--
ALTER TABLE `product_upd`
  ADD PRIMARY KEY (`id_product`);

--
-- Indexes for table `shipping`
--
ALTER TABLE `shipping`
  ADD PRIMARY KEY (`Id_Shipping`),
  ADD KEY `order_idx` (`Id_Order`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer_update`
--
ALTER TABLE `customer_update`
  MODIFY `id_cst_upd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `kd_pos` FOREIGN KEY (`Kode_Pos`) REFERENCES `kode_pos` (`Kode_Pos`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `Kode_Pos` FOREIGN KEY (`Kode_Pos`) REFERENCES `kode_pos` (`Kode_Pos`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `customer_order`
--
ALTER TABLE `customer_order`
  ADD CONSTRAINT `id_product` FOREIGN KEY (`Id_Product`) REFERENCES `product` (`Id_Product`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `e_wallet`
--
ALTER TABLE `e_wallet`
  ADD CONSTRAINT `id_customer` FOREIGN KEY (`Id_Customer`) REFERENCES `customer` (`Id_Customer`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `shipping`
--
ALTER TABLE `shipping`
  ADD CONSTRAINT `order` FOREIGN KEY (`Id_Order`) REFERENCES `order` (`Id_Order`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
