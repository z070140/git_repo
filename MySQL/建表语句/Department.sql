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

 Date: 17/10/2022 14:41:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Department
-- ----------------------------
DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department` (
  `Dno` char(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Dname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Manager` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Department
-- ----------------------------
BEGIN;
INSERT INTO `Department` (`Dno`, `Dname`, `Phone`, `Manager`) VALUES ('01', '技术科', '88090121', '1002');
INSERT INTO `Department` (`Dno`, `Dname`, `Phone`, `Manager`) VALUES ('02', '设计科', '88090122', '1005');
INSERT INTO `Department` (`Dno`, `Dname`, `Phone`, `Manager`) VALUES ('03', '车间', '88090123', '1004');
INSERT INTO `Department` (`Dno`, `Dname`, `Phone`, `Manager`) VALUES ('04', '销售科', '88090124', '1101');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
