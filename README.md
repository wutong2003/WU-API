## WU-API接口开放平台后端
<h1 align="center">Wu-API 接口开放平台</h1>
<p align="center"><strong>Wu-API 接口开放平台是一个为用户和开发者提供全面API接口调用服务的平台 🛠</strong></p>
## 项目介绍 🙋


**😀 作为用户您可以通过注册登录账户，获取接口调用权限，并根据自己的需求浏览和选择适合的接口。您可以在线进行接口调试，快速验证接口的功能和效果。** 

**💻 作为开发者 我们提供了[客户端SDK: Wu-API-SDK](https://github.com/qimu666/qi-api-sdk)， 通过[开发者凭证]即可将轻松集成接口到您的项目中，实现更高效的开发和调用。** 

**🤝 您可以将自己的接口接入到Wu-API 接口开放平台平台上，并发布给其他用户使用。 您可以管理和各个接口，以便更好地分析和优化接口性能。** 

 **🏁 无论您是用户还是开发者，Wu-API 接口开放平台都致力于提供稳定、安全、高效的接口调用服务，帮助您实现更快速、便捷的开发和调用体验。**

## 目录结构 📑


| 目录                                                     | 描述               |
|--------------------------------------------------------| ------------------ |
| **🏘️ [wu-api-backend](./wu-api-backend)**             | Qi-API后端服务模块 |
| **🏘️ [wu-api-common](./wu-api-common)**               | 公共服务模块       |
| **🕸️ [wu-api-gateway](./wu-api-gateway)**             | 网关模块           |
| **🔗 [wu-api-interface](./wu-api-interface)**          | 接口模块           |
| **🛠 [wu-qpi-sdk](https://github.com/wutong666/wu-api-sdk)** | 开发者调用sdk      |

## 项目架构图
![pic2](https://github.com/user-attachments/assets/f5f7f3d3-3689-4cea-9416-db0069941c06)


## 快速启动 🚀

### 前端

环境要求：Node.js >= 16

安装依赖：

```bash
yarn or npm install
```

启动：

```bash
yarn run dev or npm run start:dev
```

部署：

```bash
yarn build or npm run build
```

### 后端

执行sql目录下ddl.sql

## 项目选型 🎯

### **后端**

- Spring Boot 2.7.0
- Spring MVC
- MySQL 数据库
- 腾讯云OOS存储
- Dubbo 分布式（RPC、Nacos）
- Spring Cloud Gateway 微服务网关
- API 签名认证（Http 调用）
- Swagger + Knife4j 接口文档
- Spring Boot Starter（SDK 开发）
- Jakarta.Mail 邮箱通知、验证码
- Spring Session Redis 分布式登录
- Apache Commons Lang3 工具类
- MyBatis-Plus 及 MyBatis X 自动生成
- Hutool、Apache Common Utils、Gson 等工具库

### 前端

- React 18

- Ant Design Pro 5.x 脚手架

- Ant Design & Procomponents 组件库

- Umi 4 前端框架

- OpenAPI 前端代码生成
