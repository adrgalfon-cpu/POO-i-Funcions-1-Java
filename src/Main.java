import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        System.out.println("Selecciona el teu exercici");
        System.out.println("1- Calculadora");
        System.out.println("2- Major d'edat");
        selector();
    }
    public static void selector(){
        Scanner scanner = new Scanner(System.in);
        int exercici = scanner.nextInt();
        switch (exercici){
            case 1:
                Calculadora.menu();
            case 2:
                Edat.main();

        }
    }
}