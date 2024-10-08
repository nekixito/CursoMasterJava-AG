public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor míximo de un byte: " + Byte.MIN_VALUE);
        System.out.println();

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor míximo de un short: " + Short.MIN_VALUE);
        System.out.println();

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor míximo de un int: " + Integer.MIN_VALUE);
        System.out.println();

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor míximo de un long: " + Long.MIN_VALUE);
        System.out.println();

        var numeroVar = 2147483647;
    }
}
