public class Main {
    public static void main(String[] args) {
        CloudConfigManager manager1 = CloudConfigManager.getInstance();
        System.out.println("Config from manager1: " + manager1.getConfig());

        CloudConfigManager manager2 = CloudConfigManager.getInstance();
        System.out.println("Config from manager2: " + manager2.getConfig());

        System.out.println("Are both instances the same? " + (manager1 == manager2));
    }
}
