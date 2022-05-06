public class SwitchStatement {
  public static void main(String[] args) {

    var nilai = "D";
    switch (nilai) {
      case "A":
        System.out.println("Anda lulus dengan BAIK");
        break;
      case "B":
        System.out.println("Anda lulus dengan CUKUP BAIK");
        break;
      case "C":
        System.out.println("Anda lulus dengan TIDAK BAIK");
        break;
      default:
        System.out.println("Anda lulus dengan SANGAT TIDAK BAIK");
        break;
    }

    System.out.println("Lambda");

    // ! Switch Lambda
    switch (nilai) {
      case "A" -> System.out.println("Anda lulus dengan BAIK");
      case "B" -> System.out.println("Anda lulus dengan CUKUP BAIK");
      case "C" -> System.out.println("Anda lulus dengan TIDAK BAIK");
      default -> {
        System.out.println("Anda lulus dengan SANGAT TIDAK BAIK");
      }
    }

  }
}
