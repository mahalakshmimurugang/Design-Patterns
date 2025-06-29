import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder {
    private String method;
    private String url;
    private Map<String, String> headers = new HashMap<>();
    private String body;

    public HttpRequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder addHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequest build() {
        return new HttpRequest(method, url, headers, body);
    }
}
