package tubes;

public class driver {
    public static void main(String[] args) {
        double panjang = 5;
        double lebar = 3;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        double luas = persegiPanjang.hitungLuas();

        System.out.println("Luas Persegi Panjang adalah: " + luas);
    }
}

