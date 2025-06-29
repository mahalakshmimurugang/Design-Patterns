Prototype Pattern in Java - Document Cloning Example

This project demonstrates the Prototype Design Pattern using a practical example of cloning and customizing document templates.

👨‍💻 Classes:
Document – Prototype interface defining clone() and other basic methods

ReportDocument – Concrete implementation of the Document prototype

Main – Client code demonstrating cloning and modification of documents

🧠 Pattern Explanation:
The Prototype Pattern allows you to create new objects by copying existing ones instead of instantiating from scratch.

Useful when object creation is costly or complex.

Cloning avoids re-initializing and configuring the same values repeatedly.

This example simulates a document system where you clone a base report and quickly customize it for different departments like HR and Sales.

✅ How to Run:
1. Compile all `.java` files:
   javac *.java
2. Run the Main.java:
   java Main