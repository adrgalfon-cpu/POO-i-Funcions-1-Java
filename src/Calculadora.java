import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================================================================");
        System.out.println("================================Calculadora=====================================");
        System.out.println("================================================================================");
        System.out.println();
        System.out.println("Seleccionar el tipus d'operació a realitzar");
        System.out.println();
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        int operacio = scanner .nextInt(); //ho sento per els accents pero java no permet caracters "No ASCII"
        switch (operacio){
            case 1:
                suma();
            case 2:
                resta();
            case 3:
                multiplica();
            case 4:
                divideix();
        }
    }
    public static void suma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intordueix els dos números a sumar");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        if(numero1 == (int)numero1&&numero2 == (int)numero2){
            System.out.println("El resultat de sumar " + (int)numero1 + " i " + (int)numero2 + " és: " + ((int)numero1 + (int)numero2));
        }else {
            System.out.println("El resultat de sumar " + numero1 + " i " + numero2 + " és: " + (numero1 + numero2));
        }
        String[] args = new String[0];
        Main.main(args);
    }
    public static void resta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intordueix els dos números a restar");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        if(numero1 == (int)numero1&&numero2 == (int)numero2){
            System.out.println("El resultat de restar " + (int)numero1 + " i " + (int)numero2 + " és: " + ((int)numero1 - (int)numero2));
        }else {
            System.out.println("El resultat de restar " + numero1 + " i " + numero2 + " és: " + (numero1 - numero2));
        }
        String[] args = new String[0];
        Main.main(args);
    }
    public static void multiplica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intordueix els dos números a multiplicar");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        if(numero1 == (int)numero1&&numero2 == (int)numero2){
            System.out.println("El resultat de multiplicar " + (int)numero1 + " i " + (int)numero2 + " és: " + ((int)numero1 * (int)numero2));
        }else {
            System.out.println("El resultat de multiplicar " + numero1 + " i " + numero2 + " és: " + (numero1 * numero2));
        }
        String[] args = new String[0];
        Main.main(args);
    }
    public static void divideix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intordueix els dos números a dividir");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        if (numero1!=0&&numero2!=0) {
            if (numero1 == (int) numero1 && numero2 == (int) numero2) {
                System.out.println("El resultat de dividir " + (int) numero1 + " i " + (int) numero2 + " és: " + (numero1 / numero2));
            } else {
                System.out.println("El resultat de dividir " + numero1 + " i " + numero2 + " és: " + (numero1 / numero2));
            }
        }else{
            System.out.println("Divisió per 0 no és possible");
            divideix();
        }
        String[] args = new String[0];
        Main.main(args);
    }
}