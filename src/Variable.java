public class Variable {
  public static void main(String[] args) {
    String firstName = "Syeich";
    System.out.println(firstName); // Syeich

    String nama1 = "Budi";
    System.out.println(nama1); // Budi

    String name;
    name = "Syeich Khalil Annbiya";
    System.out.println(name); // Syeich Khalil Annbiya

    name = "Budi Nugraha";
    System.out.println(name); // Budi Nugraha -> memperbarui variable name sebelumnya

    // ! Penggunaan var seperti di JavaScript
    var hello = "Hello Guys";
    System.out.println(hello); // Hello Guys

    var iniAngka = 30;
    System.out.println(iniAngka); // 30

    // ! Kata kunci final
    // Seperti const di JavaScript jadi datanya tidak bisa diubah lagi valuenya

    final String app = "Belajar Java";
    System.out.println(app); // Belajar Java

    // app = "Belajar PHP"; //Error karena memperbarui value yang final

  }
}
