### 数据权限
项目架构：  `springboot` `mybatis-plus`

## 演示
![](https://i.loli.net/2021/05/25/PawkBRM28h7HbfW.png)

![](https://i.loli.net/2021/05/25/5imZgQFjD4NbeuO.png)

### 说明
拦截器如果配置要拦截的地址，是忽略掉 `application.yml` 里面的 `servlet - path` 的！

### 数据库
```mysql
/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80024
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80024
 File Encoding         : 65001

 Date: 25/05/2021 16:14:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `creat_dept_id` int(0) NULL DEFAULT NULL COMMENT '所属部门',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'A', '1', 1);
INSERT INTO `user` VALUES (2, 'B', '1', 1);
INSERT INTO `user` VALUES (3, 'C', '2', 2);
INSERT INTO `user` VALUES (4, 'D', '4', 3);
INSERT INTO `user` VALUES (5, 'E', '1', 2);
INSERT INTO `user` VALUES (6, 'F', '1', 2);

SET FOREIGN_KEY_CHECKS = 1;

```