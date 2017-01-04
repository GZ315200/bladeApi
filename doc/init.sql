/*
Navicat MySQL Data Transfer

Source Server         : local_data
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : security

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-01-04 16:25:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tx_permission
-- ----------------------------
DROP TABLE IF EXISTS `tx_permission`;
CREATE TABLE `tx_permission` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父结点id',
  `parentids` varchar(128) DEFAULT NULL COMMENT '父结点id列表串',
  `sortstring` varchar(128) DEFAULT NULL COMMENT '排序号',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tx_permission
-- ----------------------------
INSERT INTO `tx_permission` VALUES ('1', '权限', '', '', null, '0', '0/', '0', '1');
INSERT INTO `tx_permission` VALUES ('11', '机构管理', 'menu', '/item/queryItem.action', null, '1', '0/1/', '1.', '1');
INSERT INTO `tx_permission` VALUES ('12', '机构新增', 'permission', '/item/add.action', 'item:create', '11', '0/1/11/', '', '1');
INSERT INTO `tx_permission` VALUES ('13', '机构修改', 'permission', '/item/editItem.action', 'item:update', '11', '0/1/11/', '', '1');
INSERT INTO `tx_permission` VALUES ('14', '机构删除', 'permission', '', 'item:delete', '11', '0/1/11/', '', '1');
INSERT INTO `tx_permission` VALUES ('15', '机构查询', 'permission', '/item/queryItem.action', 'item:query', '11', '0/1/11/', null, '1');
INSERT INTO `tx_permission` VALUES ('21', '用户管理', 'menu', '/user/query.action', 'user:query', '1', '0/1/', '2.', '1');
INSERT INTO `tx_permission` VALUES ('22', '用户新增', 'permission', '', 'user:create', '21', '0/1/21/', '', '1');
INSERT INTO `tx_permission` VALUES ('23', '用户修改', 'permission', '', 'user:update', '21', '0/1/21/', '', '1');
INSERT INTO `tx_permission` VALUES ('24', '用户删除', 'permission', '', 'user:delete', '21', '0/1/21/', '', '1');

-- ----------------------------
-- Table structure for tx_role
-- ----------------------------
DROP TABLE IF EXISTS `tx_role`;
CREATE TABLE `tx_role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(128) NOT NULL,
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tx_role
-- ----------------------------
INSERT INTO `tx_role` VALUES ('1', '机构管理员', '1');
INSERT INTO `tx_role` VALUES ('2', '用户管理员', '1');
INSERT INTO `tx_role` VALUES ('3', '用户管理员', '1');

-- ----------------------------
-- Table structure for tx_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `tx_role_permission`;
CREATE TABLE `tx_role_permission` (
  `id` varchar(36) NOT NULL,
  `tx_role_id` varchar(32) NOT NULL COMMENT '角色id',
  `tx_permission_id` varchar(32) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tx_role_permission
-- ----------------------------
INSERT INTO `tx_role_permission` VALUES ('ebc8a441-c6f9-11e4-b137-0adc305c3f21', '1', '12');
INSERT INTO `tx_role_permission` VALUES ('ebc8a441-c6f9-11e4-b137-0adc305c3f22', '1', '11');
INSERT INTO `tx_role_permission` VALUES ('ebc8a441-c6f9-11e4-b137-0adc305c3f24', '2', '21');
INSERT INTO `tx_role_permission` VALUES ('ebc8a441-c6f9-11e4-b137-0adc305c3f25', '3', '15');
INSERT INTO `tx_role_permission` VALUES ('ebc9d647-c6f9-11e4-b137-0adc305c3f23', '2', '22');
INSERT INTO `tx_role_permission` VALUES ('ebc9d647-c6f9-11e4-b137-0adc305c3f26', '3', '13');

-- ----------------------------
-- Table structure for tx_user
-- ----------------------------
DROP TABLE IF EXISTS `tx_user`;
CREATE TABLE `tx_user` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `usercode` varchar(32) NOT NULL COMMENT '账号',
  `username` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐',
  `locked` char(1) DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tx_user
-- ----------------------------
INSERT INTO `tx_user` VALUES ('1', 'lisi', '李四', 'bf07fd8bbc73b6f70b8319f2ebb87483', 'uiwueylm', '0');
INSERT INTO `tx_user` VALUES ('2', 'zhangsan', '张三', 'cb571f7bd7a6f73ab004a70322b963d5', 'eteokues', '0');
INSERT INTO `tx_user` VALUES ('3', 'mazean', '马泽安', '56b291d6ed9b9cb8e2d3dc09cb6377b9', '123456', '0');
INSERT INTO `tx_user` VALUES ('4', 'gyges', '吉格斯', 'ad34e4dcbdbad79ca879e5edbf546f00', '123456', '0');

-- ----------------------------
-- Table structure for tx_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tx_user_role`;
CREATE TABLE `tx_user_role` (
  `id` varchar(36) NOT NULL,
  `tx_user_id` varchar(32) NOT NULL,
  `tx_role_id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tx_user_role
-- ----------------------------
INSERT INTO `tx_user_role` VALUES ('ebc8a441-c6f9-11e4-b137-0adc305c3f28', '1', '1');
INSERT INTO `tx_user_role` VALUES ('ebc9d647-c6f9-11e4-b137-0adc305c3f28', '2', '2');
SET FOREIGN_KEY_CHECKS=1;
