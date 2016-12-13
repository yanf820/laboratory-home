(function (root, client) {
  if (typeof define === 'function' && define.amd) {
    define(['popsicle'], client)
  } else if (typeof exports === 'object') {
    module.exports = client(require('popsicle'))
  } else {
    root.StartupApi = client(root.popsicle)
  }
})(this, function (popsicle) {
  var TEMPLATE_REGEXP = /\{([^\{\}]+)\}/g

  /**
   * @param  {String} string
   * @param  {Object} interpolate
   * @param  {Object} defaults
   * @return {String}
   */
  function template (string, interpolate, defaults) {
    defaults = defaults || {}
    interpolate = interpolate || {}

    return string.replace(TEMPLATE_REGEXP, function (match, key) {
      if (interpolate[key] != null) {
        return encodeURIComponent(interpolate[key])
      }

      if (defaults[key] != null) {
        return encodeURIComponent(defaults[key])
      }

      return ''
    })
  }

  /**
   * @param  {Object} dest
   * @param  {Object} ...source
   * @return {Object}
   */
  function extend (dest /*, ...source */) {
    for (var i = 1; i < arguments.length; i++) {
      for (var key in arguments[i]) {
        dest[key] = arguments[i][key]
      }
    }

    return dest
  }

  function handleRequest (client, path, method, body, options) {
    options = extend({}, client.options, options)

    var baseUri = template(options.baseUri, options.baseUriParameters)
    var hasBody = method !== 'GET' && method !== 'HEAD'
    var reqOpts = {}

    var reqBody = hasBody && body != null ? body : options.body
    var reqQuery = !hasBody && body != null ? body : options.query

    var reqOpts = {
      url: baseUri.replace(/\/$/, '') + path,
      method: method,
      headers: extend({}, options.headers),
      body: reqBody,
      query: typeof reqQuery === 'object' ? extend({}, reqQuery) : reqQuery
    }

    if (options.user && typeof options.user.sign === 'function') {
      options.user.sign(reqOpts)
    }

    return client.request(reqOpts)
  }

  function Resource0 (uri, client) {
    this._uri = uri
    this._client = client

    this.topics = new Resource1(uri + '/topics', client)
    this.posts = new Resource7(uri + '/posts', client)
  }


  function Resource1 (uri, client) {
    this._uri = uri
    this._client = client

  }

  Resource1.prototype. = function (/* ...args */) {
    var uri = this._uri + template('/~{0}', arguments, [undefined])

    return new Resource2(uri, this._client)
  }
  Resource1.prototype.topicId = function (/* ...args */) {
    var uri = this._uri + template('/{0}', arguments, [undefined])

    return new Resource3(uri, this._client)
  }

  function Resource2 (uri, client) {
    this._uri = uri
    this._client = client

  }


  Resource2.prototype.get = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-app-key':undefined,'x-la-sign-method':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'GET', body, options)
  }
  Resource2.prototype.post = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'POST', body, options)
  }
  function Resource3 (uri, client) {
    this._uri = uri
    this._client = client

    this. = new Resource4(uri + '/~', client)
  }


  Resource3.prototype.get = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-app-key':undefined,'x-la-sign-method':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'GET', body, options)
  }
  Resource3.prototype.put = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-modified-since':undefined,'x-la-modified':undefined,'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'PUT', body, options)
  }
  Resource3.prototype.patch = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-modified-since':undefined,'x-la-modified':undefined,'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'PATCH', body, options)
  }
  function Resource4 (uri, client) {
    this._uri = uri
    this._client = client

    this.follow = new Resource6(uri + '/follow', client)
  }

  Resource4.prototype.posts = function (/* ...args */) {
    var uri = this._uri + template('/posts{0}', arguments, [undefined])

    return new Resource5(uri, this._client)
  }

  function Resource5 (uri, client) {
    this._uri = uri
    this._client = client

  }


  Resource5.prototype.get = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-app-key':undefined,'x-la-sign-method':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'GET', body, options)
  }
  function Resource6 (uri, client) {
    this._uri = uri
    this._client = client

  }


  Resource6.prototype.post = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'POST', body, options)
  }
  function Resource7 (uri, client) {
    this._uri = uri
    this._client = client

  }

  Resource7.prototype. = function (/* ...args */) {
    var uri = this._uri + template('/~{0}', arguments, [undefined])

    return new Resource8(uri, this._client)
  }
  Resource7.prototype.postId = function (/* ...args */) {
    var uri = this._uri + template('/{0}', arguments, [undefined])

    return new Resource9(uri, this._client)
  }

  function Resource8 (uri, client) {
    this._uri = uri
    this._client = client

  }


  Resource8.prototype.get = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-app-key':undefined,'x-la-sign-method':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'GET', body, options)
  }
  Resource8.prototype.post = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'POST', body, options)
  }
  function Resource9 (uri, client) {
    this._uri = uri
    this._client = client

    this. = new Resource10(uri + '/~', client)
  }


  Resource9.prototype.get = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-app-key':undefined,'x-la-sign-method':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'GET', body, options)
  }
  Resource9.prototype.put = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-modified-since':undefined,'x-la-modified':undefined,'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'PUT', body, options)
  }
  Resource9.prototype.patch = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-modified-since':undefined,'x-la-modified':undefined,'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'PATCH', body, options)
  }
  function Resource10 (uri, client) {
    this._uri = uri
    this._client = client

    this.like = new Resource11(uri + '/like', client)
    this.review = new Resource12(uri + '/review', client)
  }


  function Resource11 (uri, client) {
    this._uri = uri
    this._client = client

  }


  Resource11.prototype.post = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'POST', body, options)
  }
  function Resource12 (uri, client) {
    this._uri = uri
    this._client = client

  }


  Resource12.prototype.post = function (body, options) {
    options = extend({}, options)
    options.headers = extend({'x-la-authorization':undefined,'x-la-session':undefined,'x-la-format':undefined}, options.headers)

    return handleRequest(this._client, this._uri, 'POST', body, options)
  }

  function CustomResource (uri, client) {
    this._uri = uri
    this._client = client
  }

  CustomResource.prototype.acl = function (body, options) {
    return handleRequest(this._client, this._uri, 'ACL', body, options)
  }
  CustomResource.prototype.bind = function (body, options) {
    return handleRequest(this._client, this._uri, 'BIND', body, options)
  }
  CustomResource.prototype.checkout = function (body, options) {
    return handleRequest(this._client, this._uri, 'CHECKOUT', body, options)
  }
  CustomResource.prototype.connect = function (body, options) {
    return handleRequest(this._client, this._uri, 'CONNECT', body, options)
  }
  CustomResource.prototype.copy = function (body, options) {
    return handleRequest(this._client, this._uri, 'COPY', body, options)
  }
  CustomResource.prototype.delete = function (body, options) {
    return handleRequest(this._client, this._uri, 'DELETE', body, options)
  }
  CustomResource.prototype.get = function (body, options) {
    return handleRequest(this._client, this._uri, 'GET', body, options)
  }
  CustomResource.prototype.head = function (body, options) {
    return handleRequest(this._client, this._uri, 'HEAD', body, options)
  }
  CustomResource.prototype.link = function (body, options) {
    return handleRequest(this._client, this._uri, 'LINK', body, options)
  }
  CustomResource.prototype.lock = function (body, options) {
    return handleRequest(this._client, this._uri, 'LOCK', body, options)
  }
  CustomResource.prototype.mSearch = function (body, options) {
    return handleRequest(this._client, this._uri, 'M-SEARCH', body, options)
  }
  CustomResource.prototype.merge = function (body, options) {
    return handleRequest(this._client, this._uri, 'MERGE', body, options)
  }
  CustomResource.prototype.mkactivity = function (body, options) {
    return handleRequest(this._client, this._uri, 'MKACTIVITY', body, options)
  }
  CustomResource.prototype.mkcalendar = function (body, options) {
    return handleRequest(this._client, this._uri, 'MKCALENDAR', body, options)
  }
  CustomResource.prototype.mkcol = function (body, options) {
    return handleRequest(this._client, this._uri, 'MKCOL', body, options)
  }
  CustomResource.prototype.move = function (body, options) {
    return handleRequest(this._client, this._uri, 'MOVE', body, options)
  }
  CustomResource.prototype.notify = function (body, options) {
    return handleRequest(this._client, this._uri, 'NOTIFY', body, options)
  }
  CustomResource.prototype.options = function (body, options) {
    return handleRequest(this._client, this._uri, 'OPTIONS', body, options)
  }
  CustomResource.prototype.patch = function (body, options) {
    return handleRequest(this._client, this._uri, 'PATCH', body, options)
  }
  CustomResource.prototype.post = function (body, options) {
    return handleRequest(this._client, this._uri, 'POST', body, options)
  }
  CustomResource.prototype.propfind = function (body, options) {
    return handleRequest(this._client, this._uri, 'PROPFIND', body, options)
  }
  CustomResource.prototype.proppatch = function (body, options) {
    return handleRequest(this._client, this._uri, 'PROPPATCH', body, options)
  }
  CustomResource.prototype.purge = function (body, options) {
    return handleRequest(this._client, this._uri, 'PURGE', body, options)
  }
  CustomResource.prototype.put = function (body, options) {
    return handleRequest(this._client, this._uri, 'PUT', body, options)
  }
  CustomResource.prototype.rebind = function (body, options) {
    return handleRequest(this._client, this._uri, 'REBIND', body, options)
  }
  CustomResource.prototype.report = function (body, options) {
    return handleRequest(this._client, this._uri, 'REPORT', body, options)
  }
  CustomResource.prototype.search = function (body, options) {
    return handleRequest(this._client, this._uri, 'SEARCH', body, options)
  }
  CustomResource.prototype.subscribe = function (body, options) {
    return handleRequest(this._client, this._uri, 'SUBSCRIBE', body, options)
  }
  CustomResource.prototype.trace = function (body, options) {
    return handleRequest(this._client, this._uri, 'TRACE', body, options)
  }
  CustomResource.prototype.unbind = function (body, options) {
    return handleRequest(this._client, this._uri, 'UNBIND', body, options)
  }
  CustomResource.prototype.unlink = function (body, options) {
    return handleRequest(this._client, this._uri, 'UNLINK', body, options)
  }
  CustomResource.prototype.unlock = function (body, options) {
    return handleRequest(this._client, this._uri, 'UNLOCK', body, options)
  }
  CustomResource.prototype.unsubscribe = function (body, options) {
    return handleRequest(this._client, this._uri, 'UNSUBSCRIBE', body, options)
  }

  function Client (options) {
    this.options = extend({
      baseUri: 'http://api.startupsass.com',
      baseUriParameters: {}
    }, options)

    this.resources = new Resource0('', this)
  }

  Client.prototype.resource = function (route, parameters) {
    var path = '/' + template(route, parameters).replace(/^\//, '')

    return new CustomResource(path, this)
  }

  Client.prototype.request = popsicle
  Client.prototype.form = Client.form = popsicle.form
  Client.prototype.version  = '1.0'


  return Client
})
