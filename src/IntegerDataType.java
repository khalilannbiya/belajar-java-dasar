public class IntegerDataType {
  public static void main(String[] args) {

    byte iniByte = 100; // byte Min -128, Max 127
    System.out.println(iniByte); // 100

    short iniShort = 10000; // short Min -32.768, Max 32.767
    System.out.println(iniShort); // 10000

    int iniInteger = 1000000000; // int Min -2.147.483.648, Max 2.147.483.647
    System.out.println(iniInteger); // 1000000000

    long iniLong = 100000000000000L; // long Min -9.223.372.036.854.775.808, Max 9.223.372.036.854.775.807
    System.out.println(iniLong); // 100000000000000

    float iniFloat = 10.10F; // float Min 3.4e-038, Max 3.4e+038
    System.out.println(iniFloat); // 10.1

    double iniDouble = 10.10; // double Min 1.7e-308,Max 1.7e+308
    System.out.println(iniDouble); // 10.1

    int decimalInt = 34; // Penulisan Decimal
    System.out.println(decimalInt); // 34

    int hexaDecimal = 0xFFFFFF; // Penulisan Hexa Decimal
    System.out.println(hexaDecimal); // 16777215

    int binDecimal = 0b10101010; // Penulisan Binary Decimal
    System.out.println(binDecimal); // 170

  }
}
