public class Child extends Parents {
    // Additional field specific to Child
    private String sekolah;

    // Constructor
    public Child(int umur, double tinggiBadan, String jenisKelamin, String sekolah) {
        super(umur, tinggiBadan, jenisKelamin); // Call the parent constructor
        this.sekolah = sekolah;
    }

    // Getter
    public String getSekolah() {
        return sekolah;
    }

    // Display method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent displayInfo
        System.out.println("Sekolah: " + sekolah);
    }
}
