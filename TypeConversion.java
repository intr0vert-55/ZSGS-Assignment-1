public class TypeConversion{
    public static void main(String [] args){

        // Implicit conversions
        byte bNum = 8;
        short sNum = bNum;
        int iNum = sNum;
        float fNum = iNum;
        double dNum = fNum;
        System.out.println("Double : " + dNum);
        System.out.println("Float : " + fNum);
        System.out.println("Int : " + iNum);
        System.out.println("Short : " + sNum);
        System.out.println("Byte : " + bNum);

        char ch = 'a';
        int asciiValue = ch;
        System.out.println("Ascii Value : " + asciiValue);

        // snum = inum; Cannot convert integer to short

        // Explicit conversion
        double d = 120.20;
        float f = (float) d;    // double to float
        int i = (int) f;        // float to int
        short s = (short) i;    // int to short
        byte b = (byte) s;       // short to byte
        System.out.println("Double : " + d);
        System.out.println("Float : " + f);
        System.out.println("Int : " + i);
        System.out.println("Short : " + s);
        System.out.println("Byte : " + b);

        char character = (char) asciiValue;
        System.out.println("Character : " + character);

    }
}