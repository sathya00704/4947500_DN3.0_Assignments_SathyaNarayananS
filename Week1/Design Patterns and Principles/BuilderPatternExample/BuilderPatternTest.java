public class BuilderPatternTest {

    public static void main(String[] args) {
        // Create a basic computer with required parameters using the Builder pattern
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                                    .build();
        System.out.println("Basic Computer:");
        System.out.println(basicComputer);

        System.out.println();

        // Create a gaming computer with all parameters using the Builder pattern
        Computer gamingComputer = new Computer.Builder("Ryzen 7", "16GB", "1TB SSD")
                                    .gpu("Nvidia RTX 3080")
                                    .bluetooth("Bluetooth 5.0")
                                    .wifi("Wi-Fi 6")
                                    .build();
        System.out.println("Gaming Computer:");
        System.out.println(gamingComputer);
    }
}
