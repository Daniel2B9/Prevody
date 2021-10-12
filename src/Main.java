import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("1: Prevadeni z 2 soustavy do 16");
            System.out.println("2: Prevadeni z 16 soustavy do 2");
            System.out.println("3: Prevadeni z 10 soustavy do 2");
            System.out.println("4: Prevadeni z 10 soustavy do 16");

            int select = Integer.parseInt(scan.nextLine());


            switch (select) {
                case 1 -> {
                    System.out.println("Zadej binarni cislo");
                    int binar = Integer.parseInt(scan.nextLine(), 2);
                    String hexStr = Integer.toString(binar, 16);
                    System.out.println(hexStr);

                }

                case 2 -> {
                    System.out.println("Zadej hexdecimalni cislo");
                    int hex = Integer.parseInt(scan.nextLine(), 16);
                    String binStr = Integer.toString(hex, 2);
                    System.out.println(binStr);

                }


                case 3 -> {
                    System.out.println("Zadej decimalni cislo");
                    int dec = Integer.parseInt(scan.nextLine());
                    String bin = Integer.toBinaryString(dec);
                    System.out.println(bin);

                }
                case 4 -> {
                    System.out.println("Zadej binarni cislo");
                    String bin = (scan.nextLine());
                    int dec = Integer.parseInt(bin, 2);
                    System.out.println(dec);

                }
                default -> {
                    System.out.println("Pro vyber moznosti zadej cislo");
                }

            }


            System.out.println("Chces pokracovat? (ano or ne)");
            String s = scan.nextLine();
            if (s.equals("ne")) {
                stop = true;
            }
        }

    }
}
