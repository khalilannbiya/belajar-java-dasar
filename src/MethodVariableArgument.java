public class MethodVariableArgument {
  public static void main(String[] args) {

    int[] nilai = { 80, 80, 90, 70, 60 };
    sayCongrats("Budi", nilai);
    sayCongrats2("Syeich", 80, 80, 90, 70, 60);
  }

  // Tanpa Variable Argument

  static void sayCongrats(String name, int[] values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }

    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Tidak lulus");
    }
  }

  // Dengan Variable Argument
  static void sayCongrats2(String name, int... values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }

    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Tidak lulus");
    }
  }
}
