public class MethodParameter {
  public static void main(String[] args) {
    sayHello("Syeich", "Khalil");
    sayHello("Budi", "Widada");
  }

  static void sayHello(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
  }
}
