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

 Date: 17/10/2022 14:41:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Item_Emp
-- ----------------------------
DROP TABLE IF EXISTS `Item_Emp`;
CREATE TABLE `Item_Emp` (
  `Ino` int(11) DEFAULT NULL,
  `Eno` int(11) DEFAULT NULL,
  `IEno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Item_Emp
-- ----------------------------
BEGIN;
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200801, 1004, 1);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200801, 1016, 2);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200802, 1002, 1);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200802, 1010, 2);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200902, 1005, 3);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200901, 1010, 1);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200901, 1031, 2);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200902, 1005, 1);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (200902, 1031, 2);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (201001, 1002, 1);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (201001, 1004, 2);
INSERT INTO `Item_Emp` (`Ino`, `Eno`, `IEno`) VALUES (201002, 1015, 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
