public class StringDataType {
  public static void main(String[] args) {
    String firstName = "Syeich";
    String middleName = "Khalil";
    String lastName = "Annbiya";
    String fullName = firstName + " " + middleName + " " + lastName;

    System.out.println(fullName); // Syeich Khalil Annbiya
    System.out.println(firstName + " " + middleName); // Syeich Khalil
    System.out.println(middleName); // Khalil
    System.out.println(lastName); // Annbiya

  }
}
