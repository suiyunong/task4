/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : task4

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 05/08/2019 15:15:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学员头像',
  `position` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位',
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简介',
  `salary` int(11) NOT NULL COMMENT '薪资',
  `employment_status` int(4) NOT NULL COMMENT '就业状态',
  `status` int(4) NOT NULL COMMENT '0不是优秀学员，1代表优秀学员',
  `editor_id` int(11) NOT NULL COMMENT '编辑者',
  `create_at` bigint(255) NOT NULL COMMENT '创建时间',
  `update_at` bigint(255) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '/tilesTest3/other/images/242424.png', '研发总监', '张曼玉', '微软技术总监：互联网基础服务领域，从事虚拟主机，云主机，域名。曾任新网高级技术经理，负责技术研发，团队管理与建设。', 40, 1, 1, 1, 1545055825509, 1545055825509);
INSERT INTO `student` VALUES (2, '/tilesTest3/other/images/242424.png', '技术顾问', '李建成', '百度技术总监：互联网基础服务领域，从事虚拟主机，云主机，域名。曾任新网高级技术经理，负责技术研发，团队管理与建设。', 22, 1, 1, 1, 1545056306977, 1545056306977);
INSERT INTO `student` VALUES (3, '/tilesTest3/other/images/242424.png', 'web开发', '李世民', '新浪技术总监：互联网基础服务领域，从事虚拟主机，云主机，域名。曾任新网高级技术经理，负责技术研发，团队管理与建设。', 34, 1, 1, 1, 1545056476006, 1545056476006);
INSERT INTO `student` VALUES (4, '/tilesTest3/other/images/242424.png', 'web开发', '李广', '阿里巴巴技术总监：互联网基础服务领域，从事虚拟主机，云主机，域名。曾任新网高级技术经理，负责技术研发，团队管理与建设。', 35, 1, 1, 1, 1545056538542, 1545056538542);
INSERT INTO `student` VALUES (5, '/tilesTest3/other/images/242424.png', 'ios开发', '张三丰', '华为技术总监：互联网基础服务领域，从事虚拟主机，云主机，域名。曾任新网高级技术经理，负责技术研发，团队管理与建设。', 10, 1, 1, 1, 1545102228676, 1545102228676);

SET FOREIGN_KEY_CHECKS = 1;
