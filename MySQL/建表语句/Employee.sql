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

 Date: 17/10/2022 14:41:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Employee
-- ----------------------------
DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
  `Eno` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `Ename` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `Sex` char(8) COLLATE utf8_unicode_ci NOT NULL DEFAULT '男',
  `Age` int(11) DEFAULT NULL,
  `Is_Marry` char(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Title` char(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Dno` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Emg` char(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  UNIQUE KEY `Eno` (`Eno`),
  KEY `IX_Emp` (`Dno`,`Eno` DESC)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of Employee
-- ----------------------------
BEGIN;
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1002', '胡一民', '男', 38, '1', '工程师', '01', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1004', '王爱民', '男', 60, '1', '高工', '03', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1005', '张小华', '女', 50, '1', '工程师', '02', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1010', '宋文彬', '男', 36, '1', '工程师', '01', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1011', '胡民', '男', 34, '1', '工程师', '01', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1015', '黄晓英', '女', 26, '1', '助工', '03', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1022', '李红卫', '女', 27, '0', '助工', '02', NULL);
INSERT INTO `Employee` (`Eno`, `Ename`, `Sex`, `Age`, `Is_Marry`, `Title`, `Dno`, `Emg`) VALUES ('1031', '丁为国', '男', 24, '0', '助工', '02', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
