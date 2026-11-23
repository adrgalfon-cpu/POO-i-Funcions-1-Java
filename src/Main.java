import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el teu exercici");
        System.out.println("1- Calculadora");
        int exercici = scanner.nextInt();
        switch (exercici){
            case 1:
                Calculadora.menu();

        }
    }
}