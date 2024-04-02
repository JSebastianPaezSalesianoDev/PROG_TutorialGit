package clss;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int askedNumber = scanner.nextInt();    
        System.out.println("hola mundo");
        System.out.println("tu numero es " + askedNumber);
        scanner.close();
    }
}
