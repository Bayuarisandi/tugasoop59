public class Parents {
    // Fields
    private int umur;
    private double tinggiBadan;
    private String jenisKelamin;

    // Constructor
    public Parents(int umur, double tinggiBadan, String jenisKelamin) {
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.jenisKelamin = jenisKelamin;
    }

    // Getters
    public int getUmur() {
        return umur;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Method to calculate age after a number of years
    public int hitungUsia(int tahunKeDepan) {
        return umur + tahunKeDepan;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}
