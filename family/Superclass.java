public class Superclass {
    public static void main(String[] args) {
        // Create an instance of Child for Andi
        Child andi = new Child(15, 160.0, "Laki-laki", "SMA Negeri 1");
        System.out.println("Informasi tentang Andi:");
        andi.displayInfo();

        // Create an instance of Child for Budi
        Child budi = new Child(12, 155.0, "Laki-laki", "SMP Negeri 2");
        System.out.println("\nInformasi tentang Budi:");
        budi.displayInfo();

        // Create an instance of Child for Rofi
        Child rofi = new Child(10, 150.0, "Perempuan", "SD Negeri 1");
        System.out.println("\nInformasi tentang Rofi:");
        rofi.displayInfo();
    }
}
