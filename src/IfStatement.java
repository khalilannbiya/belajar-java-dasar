public class IfStatement {
  public static void main(String[] args) {
    var nilai = 70;
    var absen = 40;

    if (nilai >= 80 && absen >= 88) {
      System.out.println("Nilai anda A");
    } else if (nilai >= 70 && absen >= 77) {
      System.out.println("Nilai anda B");
    } else {
      System.out.println("Nilai anda C");
    }

  }
}
