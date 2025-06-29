import java.util.Map;

public class HttpRequest {
    private String method;
    private String url;
    private Map<String, String> headers;
    private String body;

    public HttpRequest(String method, String url, Map<String, String> headers, String body) {
        this.method = method;
        this.url = url;
        this.headers = headers;
        this.body = body;
    }

    public void send() {
        System.out.println("Sending " + method + " request to: " + url);
        if (headers != null) {
            System.out.println("Headers: " + headers.toString());
        }
        if (body != null) {
            System.out.println("Body: " + body);
        }
    }
}
