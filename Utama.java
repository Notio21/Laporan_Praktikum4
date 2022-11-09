public class Utama {
    public static void main(string[]args){
        Bangun_Datar bangundatar = new Bangun_Datar();
        Lingkaran lingkaran = new Lingkaran (r=5);
        Segitiga segitiga = new Segitiga (alas=8, tinggi=5);
        Persegi persegi = new Persegi (sisi=10);

        bangundatar.luas();
        System.out.ptintln(x="===============================");
        System.out.println("Luas Lingkaran     : " + lingkaran.luas());
        System.out.ptintln("Luas Segitiga      : " + segitiga.luas());
        System.out.println("Luas Persegi       : " + persegi.luas());
        System.out.println("===================================");

        bangundatar.keliling();
        System.out.ptintln(x="===============================");
        System.out.println("Keliling Lingkaran     : " + lingkaran.keliling());
        System.out.println("Keliling Persegi       : " + persegi.keliling());
        System.out.println("===================================");
    }
}
