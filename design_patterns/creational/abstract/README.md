Abstract Factory Pattern in Java

This project demonstrates the Abstract Factory Design Pattern by simulating cross-platform UI components.

👨‍💻 Classes:
- `Button`, `Checkbox` – Interfaces for product families
- `WindowsButton`, `MacButton` – Concrete Buttons
- `WindowsCheckbox`, `MacCheckbox` – Concrete Checkboxes
- `UIFactory` – Abstract factory interface
- `WindowsFactory`, `MacFactory` – Concrete factories for creating compatible product families
- `Main` – Client that selects and uses the appropriate factory

🧠 Pattern Explanation:
- The Abstract Factory Pattern is used when the system needs to create families of related objects without specifying their concrete classes.
- Here, the client code (Main) depends on abstract interfaces but can work with both Windows and Mac UI components by switching factories.

✅ How to Run:
1. Compile all `.java` files:
   javac *.java
2. Run the Main.java:
   java Main

