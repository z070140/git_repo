/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80017 (8.0.17)
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017 (8.0.17)
 File Encoding         : 65001

 Date: 17/10/2022 14:41:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Salary
-- ----------------------------
DROP TABLE IF EXISTS `Salary`;
CREATE TABLE `Salary` (
  `Eno` int(11) NOT NULL,
  `Basepay` decimal(10,2) DEFAULT NULL,
  `Service` decimal(10,2) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  `Rest` decimal(10,2) DEFAULT NULL,
  `Insure` decimal(10,2) DEFAULT NULL,
  `Fund` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Salary
-- ----------------------------
BEGIN;
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1002, 685.00, 1300.00, 85.00, 488.40, 18.80, 630.50);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1004, 728.34, 3500.00, 85.00, 580.00, 21.00, 800.50);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1005, 685.00, 2500.00, 85.00, 512.00, 18.80, 700.50);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1010, 660.50, 1200.00, 85.00, 441.20, 16.60, 580.00);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1011, 660.50, 1000.00, 85.00, 441.20, 16.60, 580.00);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1015, 512.27, 600.00, 85.00, 398.90, 10.20, 440.00);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1022, 523.45, 700.00, 85.00, 422.60, 12.20, 480.60);
INSERT INTO `Salary` (`Eno`, `Basepay`, `Service`, `Price`, `Rest`, `Insure`, `Fund`) VALUES (1031, 512.27, 300.00, 85.00, 398.90, 10.20, 440.00);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
