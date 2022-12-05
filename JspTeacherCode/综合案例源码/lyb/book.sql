/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 127.0.0.1:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 22/11/2022 15:49:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `author` varchar(20) DEFAULT NULL,
  `content` text,
  `publishtime` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of book
-- ----------------------------
BEGIN;
INSERT INTO `book` VALUES (14, '黑马程序员14', 'JavaWeb程序设计14\r\n本周是第十二周了。', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (15, '黑马程序员15', 'JavaWeb程序设计15', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (16, '黑马程序员16', 'JavaWeb程序设计16', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (17, '黑马程序员17', 'JavaWeb程序设计17', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (18, '黑马程序员18', 'JavaWeb程序设计18', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (19, '黑马程序员19', 'JavaWeb程序设计19', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (20, '黑马程序员20', 'JavaWeb程序设计20', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (21, '黑马程序员21', 'JavaWeb程序设计21', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (23, '黑马程序员23', 'JavaWeb程序设计23', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (24, '黑马程序员24', 'JavaWeb程序设计24', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (25, '黑马程序员25', 'JavaWeb程序设计25', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (26, '黑马程序员26', 'JavaWeb程序设计26', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (27, '黑马程序员27', 'JavaWeb程序设计27', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (28, '黑马程序员28', 'JavaWeb程序设计28', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (29, '黑马程序员29', 'JavaWeb程序设计29', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (30, '黑马程序员30', 'JavaWeb程序设计30', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (31, '黑马程序员31', 'JavaWeb程序设计31', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (32, '黑马程序员32', 'JavaWeb程序设计32', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (33, '黑马程序员33', 'JavaWeb程序设计33', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (34, '黑马程序员34', 'JavaWeb程序设计34', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (35, '黑马程序员35', 'JavaWeb程序设计35', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (36, '黑马程序员36', 'JavaWeb程序设计36', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (37, '黑马程序员37', 'JavaWeb程序设计37', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (38, '黑马程序员38', 'JavaWeb程序设计38', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (39, '黑马程序员39', 'JavaWeb程序设计39', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (40, '黑马程序员40', 'JavaWeb程序设计40', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (41, '黑马程序员41', 'JavaWeb程序设计41', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (42, '黑马程序员42', 'JavaWeb程序设计42', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (43, '黑马程序员43', 'JavaWeb程序设计43', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (44, '黑马程序员44', 'JavaWeb程序设计44', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (45, '黑马程序员45', 'JavaWeb程序设计45', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (46, '黑马程序员46', 'JavaWeb程序设计46', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (47, '黑马程序员47', 'JavaWeb程序设计47', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (48, '黑马程序员48', 'JavaWeb程序设计48', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (49, '黑马程序员49', 'JavaWeb程序设计49', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (50, '黑马程序员50', 'JavaWeb程序设计50', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (51, '黑马程序员51', 'JavaWeb程序设计51', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (52, '黑马程序员52', 'JavaWeb程序设计52', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (53, '黑马程序员53', 'JavaWeb程序设计53', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (54, '黑马程序员54', 'JavaWeb程序设计54', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (55, '黑马程序员55', 'JavaWeb程序设计55', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (56, '黑马程序员56', 'JavaWeb程序设计56', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (57, '黑马程序员57', 'JavaWeb程序设计57', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (58, '黑马程序员58', 'JavaWeb程序设计58', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (59, '黑马程序员59', 'JavaWeb程序设计59', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (60, '黑马程序员60', 'JavaWeb程序设计60', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (61, '黑马程序员61', 'JavaWeb程序设计61', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (62, '黑马程序员62', 'JavaWeb程序设计62', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (63, '黑马程序员63', 'JavaWeb程序设计63', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (64, '黑马程序员64', 'JavaWeb程序设计64', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (65, '黑马程序员65', 'JavaWeb程序设计65', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (66, '黑马程序员66', 'JavaWeb程序设计66', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (67, '黑马程序员67', 'JavaWeb程序设计67', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (68, '黑马程序员68', 'JavaWeb程序设计68', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (69, '黑马程序员69', 'JavaWeb程序设计69', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (70, '黑马程序员70', 'JavaWeb程序设计70', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (71, '黑马程序员71', 'JavaWeb程序设计71', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (72, '黑马程序员72', 'JavaWeb程序设计72', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (73, '黑马程序员73', 'JavaWeb程序设计73', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (74, '黑马程序员74', 'JavaWeb程序设计74', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (75, '黑马程序员75', 'JavaWeb程序设计7575', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (76, '黑马程序员76', 'JavaWeb程序设计76', '2020年12月09日18:20:31');
INSERT INTO `book` VALUES (90, '小王同学', '期末了，要好好学习', '2022-11-22 11:40:08');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
