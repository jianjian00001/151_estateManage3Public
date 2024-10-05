---
### 👉作者QQ ：1556708905 微信：zheng0123Long (支持修改、部署调试、定制毕设)

### 👉接网站建设、小程序、H5、APP、各种系统等

### 👉选题+开题报告+任务书+程序定制+安装调试+ppt 都可以做
---

**博客地址：
[https://blog.csdn.net/2303_76227485/article/details/140612449](https://blog.csdn.net/2303_76227485/article/details/140612449)**

**视频演示：
[https://www.bilibili.com/video/BV1uw4m1k7gW/](https://www.bilibili.com/video/BV1uw4m1k7gW/)**

**毕业设计所有选题地址：
[https://github.com/zhengjianzhong0107/allProject](https://github.com/zhengjianzhong0107/allProject)**

## 基于Java+Springboot+vue的物业管理系统(源代码+数据库+万字论文)151

## 一、系统介绍
本项目前后端分离(还有ssm版本)，分为用户、员工、管理员三种角色
### 1、用户：
- 注册、登录、业主信息、费用信息管理、车位信息、投诉、公告查看、个人信息、密码修改

### 2、员工：
- 注册、登录、业主信息、费用信息管理、车位信息、投诉、公告查看、个人信息、密码修改
- 
### 3、管理员：
- 用户管理、员工管理、业主信息管理、费用管理、楼房管理、报修管理、车位管理、停车管理

## 二、所用技术

后端技术栈：

- Springboot
- mybatisPlus
- Mysql
- Maven

前端技术栈：
 
- Vue
- Vue-router
- axios
- elementUi

## 三、环境介绍

基础环境 :IDEA/eclipse, JDK1.8, Mysql5.7及以上, Maven3.6, node14

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图
### 论文截图
![contents](./picture/picture0.png)
![contents](./picture/picture00.png)
### 1、用户：
![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
### 2、员工：
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)
### 3、管理员：
![contents](./picture/picture19.png)
![contents](./picture/picture20.png)
![contents](./picture/picture21.png)
![contents](./picture/picture22.png)
![contents](./picture/picture23.png)
![contents](./picture/picture24.png)
![contents](./picture/picture25.png)
![contents](./picture/picture26.png)
![contents](./picture/picture27.png)
![contents](./picture/picture28.png)

## 五、浏览地址

前台地址：http://localhost:8081

用户账号密码：用户1/123456

用户账号密码：员工2/123456

管理员账户密码：admin/admin

## 六、部署教程
1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并执行项目的sql文件

2. 使用IDEA/Eclipse导入estateManage3项目，若为maven项目请选择maven，等待依赖下载完成
 
3. 修改application.yml里面的数据库配置,src/main/java/com/SpringbootSchemaApplication.java启动后端项目
 
4. vscode或idea打开src/main/resources/admin/admin目录

5. 在编译器中打开terminal，执行npm install 依赖下载完成后执行 npm run serve启动,执行成功后会显示访问地址
