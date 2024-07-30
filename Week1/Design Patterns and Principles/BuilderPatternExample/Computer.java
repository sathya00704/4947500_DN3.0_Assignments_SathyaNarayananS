public class Computer {

    // Required parameters
    private String cpu;
    private String ram;
    private String storage;

    // Optional parameters
    private String gpu;
    private String bluetooth;
    private String wifi;

    // Private constructor to enforce the use of Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    // Getters for attributes (optional)
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getWifi() {
        return wifi;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String cpu;
        private String ram;
        private String storage;

        // Optional parameters - initialized to default values
        private String gpu = "No GPU";
        private String bluetooth = "No Bluetooth";
        private String wifi = "No Wifi";

        // Builder methods for setting attributes
        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder bluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder wifi(String wifi) {
            this.wifi = wifi;
            return this;
        }

        // Build method to return the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    // Optional: Override toString() for debugging purposes
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", wifi='" + wifi + '\'' +
                '}';
    }
}
