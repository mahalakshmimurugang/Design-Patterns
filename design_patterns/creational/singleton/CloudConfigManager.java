class CloudConfigManager {
    private static CloudConfigManager instance;
    private String config;

    private CloudConfigManager() {
        this.config = "Loaded AWS Config";
        System.out.println("CloudConfigManager initialized"); 
    }

    public static synchronized CloudConfigManager getInstance() {
        if (instance == null) {
            instance = new CloudConfigManager();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }
}