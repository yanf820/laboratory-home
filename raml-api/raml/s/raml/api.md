# STARTUP API API documentation version 1.0
http://api.startupsass.com/

### 创业服务平台接口规范
Get: 获取资源的某个表述

Post: 基于给定的表述信息，在当前资源的下一级创建新的资源

Put: 用给定的表述信息替换资源的当前状态

Delete: 销毁一个资源

Patch: 根据提供的表述信息修改资源的部分状态。如果有某些资源状态在提供的表述中没有被提到， 这些状态就保持不变。类似于Put，但是允许对资源状态进行一些细粒度的改动

---

## /topics

### /topics/~{field_selectors}

* **get** *(secured)*: 
* **post** *(secured)*: 

### /topics/{topic_id}

* **get** *(secured)*: 
* **put** *(secured)*: 
* **patch** *(secured)*: 

### /topics/{topic_id}/~/posts{field_selectors}

* **get** *(secured)*: 

### /topics/{topic_id}/~/follow

* **post** *(secured)*: 

## /posts

### /posts/~{field_selectors}

* **get** *(secured)*: 
* **post** *(secured)*: 

### /posts/{postId}

* **get** *(secured)*: 
* **put** *(secured)*: 
* **patch** *(secured)*: 

### /posts/{postId}/~/like

* **post** *(secured)*: 

### /posts/{postId}/~/review

* **post** *(secured)*: 

