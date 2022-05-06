public class MethodReturnValue {
  public static void main(String[] args) {
    System.out.println(sum(2, 4));
    System.out.println(sum(2, 80));
  }

  static int sum(int value1, int value2) {
    var total = value1 + value2;
    return total;
  }

}
