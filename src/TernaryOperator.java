public class TernaryOperator {
  public static void main(String[] args) {

    // Kode Tanpa Ternary
    var nilai = 75;
    String ucapan;

    if (nilai >= 75) {
      ucapan = "Selamat Anda LULUS!";
    } else {
      ucapan = "Silahkan Coba Lagi";
    }

    System.out.println(ucapan);

    // Kode dengan Ternary

    String text = nilai >= 75 ? "Selamat Anda LULUS ya" : "Yah Coba Lagi ya!";

    System.out.println(text);
  }
}
