public class Main {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequestBuilder()
            .setMethod("POST")
            .setUrl("https://api.example.com/user")
            .addHeader("Content-Type", "application/json")
            .addHeader("Authorization", "MM211003@gmail.com")
            .setBody("{\"name\":\"Mahalakshmi Murugan\",\"age\":18}")
            .build();

        request.send();
    }
}
