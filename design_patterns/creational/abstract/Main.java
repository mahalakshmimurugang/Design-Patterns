public class Main {
    public static void main(String[] args) {
        UIFactory factory;

        String os = "Windows"; // Change to "Mac" to test Mac factory

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
