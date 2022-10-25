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

 Date: 17/10/2022 14:41:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Item
-- ----------------------------
DROP TABLE IF EXISTS `Item`;
CREATE TABLE `Item` (
  `Ino` int(16) DEFAULT NULL,
  `Iname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Start_date` date DEFAULT NULL,
  `End_date` date DEFAULT NULL,
  `Outlay` decimal(10,2) DEFAULT NULL,
  `Check_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Item
-- ----------------------------
BEGIN;
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (200801, '硬盘伺服系统', '2008-03-01', '2009-02-28', 10.00, '2009-02-10');
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (200802, '巨磁阻磁头研究', '2008-06-01', '2009-05-30', 6.50, '2009-05-20');
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (200901, '磁流体轴承改进', '2009-04-01', '2010-02-01', 4.80, '2010-03-18');
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (200902, '高密度记录磁性材料研究', '2009-10-18', '2010-09-30', 25.00, '2010-09-28');
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (201001, 'MO驱动器性能研究', '2010-03-15', '2011-03-14', 12.00, NULL);
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (201002, '相变光盘性能研究', '2010-06-01', '2011-12-31', 20.00, NULL);
INSERT INTO `Item` (`Ino`, `Iname`, `Start_date`, `End_date`, `Outlay`, `Check_date`) VALUES (200011, '实验', '2022-10-15', '2022-10-15', NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
