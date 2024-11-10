import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("podaj liczbe");

        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();

        if (liczba > 10 && liczba % 2 == 0) {
            System.out.println("liczba " + liczba + " jest parzysta i wieksza niż 10");
        } else {
            System.out.println("liczba " + liczba + " nie spelnia ktoregos warunku");
        }


    }
}