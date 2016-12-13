# STARTUP API

Browser and node module for making API requests against [STARTUP API](http://api.startupsass.com).

**Please note: This module uses [Popsicle](https://github.com/blakeembrey/popsicle) to make API requests. Promises must be supported or polyfilled on all target environments.**

## Installation

```
npm install startup-api --save
bower install startup-api --save
```

## Usage

### Node

```javascript
var StartupApi = require('startup-api');

var client = new StartupApi();
```

### Browsers

```html
<script src="startup-api/index.js"></script>

<script>
  var client = new StartupApi();
</script>
```

### Options

You can set options when you initialize a client or at any time with the `options` property. You may also override options for a single request by passing an object as the second argument of any request method. For example:

```javascript
var client = new StartupApi({ ... });

client.options = { ... };

client.resource('/').get(null, {
  baseUri: 'http://example.com',
  headers: {
    'Content-Type': 'application/json'
  }
});
```

#### Base URI

You can override the base URI by setting the `baseUri` property, or initializing a client with a base URI. For example:

```javascript
new StartupApi({
  baseUri: 'https://example.com'
});
```

#### Base URI Parameters

If the base URI has parameters inline, you can set them by updating the `baseUriParameters` property. For example:

```javascript
client.options.baseUriParameters.version = '1.0';
```

### Resources

All methods return a HTTP request instance of [Popsicle](https://github.com/blakeembrey/popsicle), which allows the use of promises (and streaming in node).

#### resources.topics.~(字段选择器)

* **字段选择器** _string_

很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。

Example
--------
如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
  `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`

或者:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`

字段选择器可以选择成员对象中的字段:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`

```js
var resource = client.resources.topics.~(字段选择器);
```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Query Parameters

```javascript
resource.get({ ... });
```

* **count** _integer, default: 10_

Maximum

* **start** _integer_

The offset by which to start Network Update pagination

* **通用Header** _string_

经过校验后生成值

* **keywords** _string_

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-app-key** _string_

系统分配的app_key


* **x-la-sign-method** _string, one of (MD5)_

系统参数签名方式


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### POST

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "description": "ID",
      "type": "string",
      "required": false
    },
    "title": {
      "description": "标题",
      "type": "string",
      "required": false
    },
    "image": {
      "description": "图片",
      "type": "string",
      "required": false
    },
    "desc": {
      "description": "描述",
      "type": "string",
      "required": false
    },
    "status": {
      "description": "当前状态",
      "type": "string",
      "required": false
    },
    "publisher": {
      "description": "发布者",
      "type": "object",
      "$ref": "publisher"
    },
    "publishTime": {
      "description": "发布时间",
      "type": "string",
      "required": false
    },
    "tags": {
      "description": "标签",
      "type": "string",
      "required": false
    },
    "fans": {
      "description": "粉丝",
      "type": "array",
      "items": {
        "$ref": "fans"
      }
    },
    "posters": {
      "description": "帖子集合",
      "type": "array",
      "items": {
        "$ref": "poster"
      }
    },
    "updateTime": {
      "description": "更新时间",
      "type": "string",
      "required": false
    }
  }
}

```

#### resources.topics.topic_id(topic_id)

* **topic_id** _string_

```js
var resource = client.resources.topics.topic_id(topic_id);
```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Query Parameters

```javascript
resource.get({ ... });
```

* **通用Header** _string_

经过校验后生成值

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-app-key** _string_

系统分配的app_key


* **x-la-sign-method** _string, one of (MD5)_

系统参数签名方式


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### PUT

```js
resource.put().then(function (res) { ... });
```

##### Headers

```javascript
resource.put(null, {
  headers: { ... }
});
```

* **x-la-modified-since** _integer_

Value as a Unix time stamp of milliseconds since epoch.


* **x-la-modified** _string, one of (updated, create)_

Values are updated or new.


* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "description": "ID",
      "type": "string",
      "required": false
    },
    "title": {
      "description": "标题",
      "type": "string",
      "required": false
    },
    "image": {
      "description": "图片",
      "type": "string",
      "required": false
    },
    "desc": {
      "description": "描述",
      "type": "string",
      "required": false
    },
    "status": {
      "description": "当前状态",
      "type": "string",
      "required": false
    },
    "publisher": {
      "description": "发布者",
      "type": "object",
      "$ref": "publisher"
    },
    "publishTime": {
      "description": "发布时间",
      "type": "string",
      "required": false
    },
    "tags": {
      "description": "标签",
      "type": "string",
      "required": false
    },
    "fans": {
      "description": "粉丝",
      "type": "array",
      "items": {
        "$ref": "fans"
      }
    },
    "posters": {
      "description": "帖子集合",
      "type": "array",
      "items": {
        "$ref": "poster"
      }
    },
    "updateTime": {
      "description": "更新时间",
      "type": "string",
      "required": false
    }
  }
}

```

##### PATCH

```js
resource.patch().then(function (res) { ... });
```

##### Headers

```javascript
resource.patch(null, {
  headers: { ... }
});
```

* **x-la-modified-since** _integer_

Value as a Unix time stamp of milliseconds since epoch.


* **x-la-modified** _string, one of (updated, create)_

Values are updated or new.


* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "description": "ID",
      "type": "string",
      "required": false
    },
    "title": {
      "description": "标题",
      "type": "string",
      "required": false
    },
    "image": {
      "description": "图片",
      "type": "string",
      "required": false
    },
    "desc": {
      "description": "描述",
      "type": "string",
      "required": false
    },
    "status": {
      "description": "当前状态",
      "type": "string",
      "required": false
    },
    "publisher": {
      "description": "发布者",
      "type": "object",
      "$ref": "publisher"
    },
    "publishTime": {
      "description": "发布时间",
      "type": "string",
      "required": false
    },
    "tags": {
      "description": "标签",
      "type": "string",
      "required": false
    },
    "fans": {
      "description": "粉丝",
      "type": "array",
      "items": {
        "$ref": "fans"
      }
    },
    "posters": {
      "description": "帖子集合",
      "type": "array",
      "items": {
        "$ref": "poster"
      }
    },
    "updateTime": {
      "description": "更新时间",
      "type": "string",
      "required": false
    }
  }
}

```

#### resources.topics.topic_id(topic_id).~.posts(字段选择器)

* **字段选择器** _string_

很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。

Example
--------
如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
  `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`

或者:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`

字段选择器可以选择成员对象中的字段:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`

```js
var resource = client.resources.topics.topic_id(topic_id).~.posts(字段选择器);
```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Query Parameters

```javascript
resource.get({ ... });
```

* **count** _integer, default: 10_

Maximum

* **start** _integer_

The offset by which to start Network Update pagination

* **通用Header** _string_

经过校验后生成值

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-app-key** _string_

系统分配的app_key


* **x-la-sign-method** _string, one of (MD5)_

系统参数签名方式


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


#### resources.topics.topic_id(topic_id).~.follow

```js
var resource = client.resources.topics.topic_id(topic_id).~.follow;
```

##### POST

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "topicId" : {
      "type": "integer",
      "required": false
    },
    "follower": {
      "type": "object",
      "$ref": "fans"
    },
    "followType": {
      "type": "string",
      "required": false
    },
    "followTime": {
      "type": "string",
      "required": false
    }
  }
}

```

#### resources.posts.~(字段选择器)

* **字段选择器** _string_

很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。

Example
--------
如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
  `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`

或者:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`

字段选择器可以选择成员对象中的字段:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`

```js
var resource = client.resources.posts.~(字段选择器);
```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Query Parameters

```javascript
resource.get({ ... });
```

* **count** _integer, default: 10_

Maximum

* **start** _integer_

The offset by which to start Network Update pagination

* **通用Header** _string_

经过校验后生成值

* **keywords** _string_

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-app-key** _string_

系统分配的app_key


* **x-la-sign-method** _string, one of (MD5)_

系统参数签名方式


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### POST

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "description": "ID",
      "type": "string",
      "required": false
    },
    "createTime": {
      "description": "创建时间",
      "type": "string",
      "required": false
    },
    "status": {
      "description": "当前状态",
      "type": "string",
      "required": false
    },
    "content": {
      "description": "内容",
      "type": "object",
      "$ref": "content"
    },
    "poster": {
      "description": "发帖人",
      "type": "object",
      "$ref": "poster"
    },
    "topic": {
      "description": "主题",
      "type": "object",
      "$ref": "topic"
    },
    "review": {
      "description": "评论集合",
      "type": "array",
      "items": {
        "$ref": "review"
      }
    },
    "likes": {
      "description": "点赞集合",
      "type": "array",
      "items": {
        "$ref": "liker"
     }
    }
  }
}

```

#### resources.posts.postId(postId)

* **postId** _string_

```js
var resource = client.resources.posts.postId(postId);
```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Query Parameters

```javascript
resource.get({ ... });
```

* **通用Header** _string_

经过校验后生成值

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-app-key** _string_

系统分配的app_key


* **x-la-sign-method** _string, one of (MD5)_

系统参数签名方式


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### PUT

```js
resource.put().then(function (res) { ... });
```

##### Headers

```javascript
resource.put(null, {
  headers: { ... }
});
```

* **x-la-modified-since** _integer_

Value as a Unix time stamp of milliseconds since epoch.


* **x-la-modified** _string, one of (updated, create)_

Values are updated or new.


* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "description": "ID",
      "type": "string",
      "required": false
    },
    "createTime": {
      "description": "创建时间",
      "type": "string",
      "required": false
    },
    "status": {
      "description": "当前状态",
      "type": "string",
      "required": false
    },
    "content": {
      "description": "内容",
      "type": "object",
      "$ref": "content"
    },
    "poster": {
      "description": "发帖人",
      "type": "object",
      "$ref": "poster"
    },
    "topic": {
      "description": "主题",
      "type": "object",
      "$ref": "topic"
    },
    "review": {
      "description": "评论集合",
      "type": "array",
      "items": {
        "$ref": "review"
      }
    },
    "likes": {
      "description": "点赞集合",
      "type": "array",
      "items": {
        "$ref": "liker"
     }
    }
  }
}

```

##### PATCH

```js
resource.patch().then(function (res) { ... });
```

##### Headers

```javascript
resource.patch(null, {
  headers: { ... }
});
```

* **x-la-modified-since** _integer_

Value as a Unix time stamp of milliseconds since epoch.


* **x-la-modified** _string, one of (updated, create)_

Values are updated or new.


* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "description": "ID",
      "type": "string",
      "required": false
    },
    "createTime": {
      "description": "创建时间",
      "type": "string",
      "required": false
    },
    "status": {
      "description": "当前状态",
      "type": "string",
      "required": false
    },
    "content": {
      "description": "内容",
      "type": "object",
      "$ref": "content"
    },
    "poster": {
      "description": "发帖人",
      "type": "object",
      "$ref": "poster"
    },
    "topic": {
      "description": "主题",
      "type": "object",
      "$ref": "topic"
    },
    "review": {
      "description": "评论集合",
      "type": "array",
      "items": {
        "$ref": "review"
      }
    },
    "likes": {
      "description": "点赞集合",
      "type": "array",
      "items": {
        "$ref": "liker"
     }
    }
  }
}

```

#### resources.posts.postId(postId).~.like

```js
var resource = client.resources.posts.postId(postId).~.like;
```

##### POST

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "postId" : {
      "type": "integer",
      "required": false
    },
    "action": {
      "type": "object",
      "enum": [ "like", "unlike"]
    },
    "operator": {
      "type": "object",
      "$ref": "liker"
    },
    "operateTime": {
      "type": "string",
      "required": false
    }
  }
}

```

#### resources.posts.postId(postId).~.review

```js
var resource = client.resources.posts.postId(postId).~.review;
```

##### POST

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **x-la-authorization** _string_

使用 oauth2.0 的方式获取access_token


* **x-la-session** _string_

当前用户的sessionId


* **x-la-format** _string, one of (json)_

自定义header字段，标识响应结果的格式。 枚举类型：[json]


##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "title" : {
      "type": "string",
      "required": false
    },
    "contentDetail": {
      "type": "array",
      "items": {
        "$ref": "contentDetail"
      }
    }
  }
}

```



### Custom Resources

You can make requests to a custom path in the API using the `#resource(path)` method.

```javascript
client.resource('/example/path').get();
```

## License

Apache 2.0
