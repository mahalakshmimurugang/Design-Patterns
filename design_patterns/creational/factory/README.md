Factory Method Pattern in Java

This project demonstrates the Factory Method Design Pattern using a simple transport delivery example.

👨‍💻 Classes:
Transport – Interface for transport types
Car, Bike – Concrete implementations of Transport
TransportFactory – Factory class with static method to return appropriate transport
Main – Client that uses the factory to get instances

🧠 Pattern Explanation: 
The Factory Method Pattern provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

Here, the factory (TransportFactory) abstracts the creation logic.

Compile all files: >javac *.java
Run the Main file: >java Main