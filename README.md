# dubbo-RPC 简介
一、架构简介
  1.soa-api-web为对外提供api接口层
  2.*-facade 为框架内部dubbo接口层，不涉及任何业务逻辑
  3.*-service 为dubbo接口的实现层，包含dao层，和业务逻辑，缓存层逻辑也包含其中
  4.commen-parent 为父项目，只定义公共jar包
  5.dubbo接口层可以互相调用（互为提供者和消费者），即 facade接口可被其他 facade接口的实现类调用。
二、待完善部分
  1.尚未实现配置分离，后期计划与开源分布式配置文件管理平台整合
