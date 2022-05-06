public class Array {
  public static void main(String[] args) {
    // Membuat Array
    String[] arrayString; // Membuat Array dengan tipe data String
    arrayString = new String[3]; // Sebutkan berapa data yang ingin di tampung
    arrayString[0] = "Syeich";
    arrayString[1] = "Khalil";
    arrayString[2] = "Annbiya";

    System.out.println(arrayString[0]); // Syeich

    arrayString[0] = "Budi"; // Ubah index
    System.out.println(arrayString[0]); // Budi

    // ! Array Initializer
    int[] arrayInt = new int[] {
        10, 90, 80, 70, 60
    };

    System.out.println(arrayInt[1]); // 90

    long[] arrayLong = {
        22, 32, 34, 321, 5, 54, 66
    };

    System.out.println(arrayLong[2]); // 34
    arrayLong[0] = 10; // Ubah data array menjadi 10 yang tadinya 22
    System.out.println(arrayLong[0]); // 10

    System.out.println(arrayInt.length); // 5

    // ! Array di dalam Array
    String[][] arrayDuaDimensi = {
        { "Syeich", "Khalil", "Annbiya" },
        { "Budi", "Nugraha" },
        { "Joko", "Arya", "Pratama" }
    };

    System.out.println(arrayDuaDimensi[0][2]); // Annbiya
    System.out.println(arrayDuaDimensi[2][1]); // Arya
  }
}
