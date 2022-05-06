import java.util.Scanner;

public class HitungLuasLingkaran {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("1 : Hitung Luas Lingkaran");
    System.out.println("2 : Hitung Luas Setengah Lingkaran");
    System.out.println("=======================================");
    System.out.println("Selamat Datang silahkan pilih angka : ");
    var changed = keyboard.nextInt();

    if (changed == 1) {
      hitungLuas();
    } else {
      hitungLuasSetengah();
    }

  }

  static void hitungLuas() {
    final double phi = 3.14;
    double r;
    double luas;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Silahkan Isi Jari-jari : ");
    r = keyboard.nextDouble();
    luas = phi * r * r;
    System.out.println("Hasil : " + luas);
  }

  static void hitungLuasSetengah() {
    final double phi = 3.14;
    double r;
    double luas;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Silahkan Isi Jari-jari : ");
    r = keyboard.nextDouble();
    luas = (phi * r * r) / 2;
    System.out.println("Hasil : " + luas);

  }
}
