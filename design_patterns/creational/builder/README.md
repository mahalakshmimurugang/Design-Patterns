Builder Pattern in Java - HTTP Request Example

This project demonstrates the Builder Design Pattern using a technical and realistic use case: constructing an HTTP request object, commonly used in API development and testing tools.

👨‍💻 Classes:
HttpRequest – Represents an HTTP request with method, URL, headers, and body

HttpRequestBuilder – Builder class to build the HttpRequest object step by step

Main – Client class that uses the builder to create and send the request

🧠 Pattern Explanation:
The Builder Pattern is used when constructing complex objects step-by-step.

It helps avoid telescoping constructors or messy optional parameters.

It separates the construction of an object from its representation.

The builder provides a fluent API that allows chaining of methods.

In this example, the builder allows creating different types of HTTP requests (e.g., GET, POST) with optional headers and body content.

✅ How to Run:
1. Compile all `.java` files:
   javac *.java
2. Run the Main.java:
   java Main