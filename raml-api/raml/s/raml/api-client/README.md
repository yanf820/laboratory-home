# eternity API

Browser and node module for making API requests against [eternity API](http://api.startupsass.com).

**Please note: This module uses [Popsicle](https://github.com/blakeembrey/popsicle) to make API requests. Promises must be supported or polyfilled on all target environments.**

## Installation

```
npm install eternity-api --save
bower install eternity-api --save
```

## Usage

### Node

```javascript
var EternityApi = require('eternity-api');

var client = new EternityApi();
```

### Browsers

```html
<script src="eternity-api/index.js"></script>

<script>
  var client = new EternityApi();
</script>
```

### Options

You can set options when you initialize a client or at any time with the `options` property. You may also override options for a single request by passing an object as the second argument of any request method. For example:

```javascript
var client = new EternityApi({ ... });

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
new EternityApi({
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

#### resources.topics.~(Field Selectors)

* **Field Selectors** _string_

Many of our resources allow you to specify what fields you want returned. We call this syntax field selectors.
By indicating exactly the information you need, we can optimize the amount of time needed to return your results.
It also reduces the amount of data passing across the wire. The two combine to make our APIs speedy and efficient,
a critical factor in any web application, and more so for anyone relying on external APIs.

Field selectors are specified after the resource identifiers and path components of a resource, prefixed by a colon,
contained within parenthesis, and separated by commas. Fields will be returned in the order specified. When URL-encoding
your resource URLs, ensure that the parenthesis used in selectors remain unescaped.

Examples
--------
To get a member's ID, first name, last name, and industry:
  `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`

Or the same set of information for their connections:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`

Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
job titles and not the rest of the information about positions:
  `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`

Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL

  `http://api.startupsass.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.startupsass.com%2Fin%2Fadamnash)`

Describes field selectors uri path parameter

```js
var resource = client.resources.topics.~(Field Selectors);
```

##### POST

```js
resource.post().then(function (res) { ... });
```

##### Body

**application/json**

```
{
  "required": true,
  "$schema": "http://json-schema.org/draft-extends/schema",
  "type": "object",
  "properties": {
    "id": {
      "type": "string",
      "required": false
    },
    "title": {
      "type": "string",
      "required": false
    },
    "image": {
      "type": "string",
      "required": false
    },
    "desc": {
      "type": "string",
      "reuqired": false
    },
    "status": {
      "type": "string",
      "required": false
    },
    "publisher": {
      "type": "object",
      "$ref": "publisher"
    },
    "tags": {
      "type": "string",
      "required": false
    },
    "funs": {
      "type": "array",
      "items": {
        "$ref": "funs"
      }
    },
    "posters": {
      "type": "array",
      "items": {
        "$ref": "poster"
      }
    }
  }
}

```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Query Parameters

```javascript
resource.get({ ... });
```

* **membership-state** _string, one of (non-member, awaiting-confirmation, awaiting-parent-group-confirmation, member, moderator, manager, owner), default: non-member_

The state of the callers membership to the specified group. Use the value member to retrieve the groups to which a
user belongs.

* **count** _integer, default: 10_

Maximum

* **start** _integer_

The offset by which to start Network Update pagination

#### resources.topics.~(Field Selectors).topicId(Numeric group ID)

* **Numeric group ID** _integer_

The unique identifier for a topic

```js
var resource = client.resources.topics.~(Field Selectors).topicId(Numeric group ID);
```

##### GET

```js
resource.get().then(function (res) { ... });
```

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **x-la-format** _string, one of (json)_

Type of data




### Custom Resources

You can make requests to a custom path in the API using the `#resource(path)` method.

```javascript
client.resource('/example/path').get();
```

## License

Apache 2.0
