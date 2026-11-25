import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("""
                Selecciona el teu exercici
                ---------------------------
                1- Calculadora
                2- Major d'edat
                3- Notes 
                
                9- Sortir del Programa
                        """);
        selector();
    }
    public static void selector(){
        Scanner scanner = new Scanner(System.in);
        String[] args = new String[0];
        boolean tancar = false;
        int exercici = scanner.nextInt();
        switch (exercici){
            case 1:
                Calculadora.main(args);
                break;
            case 2:
                Edat.main(args);
                break;
            case 3:
                Notes.main(args);
                break;
            case 9:
                tancar=true;
                break;
            default:
                System.out.println("Selecciona un Numero d'Exercici valid");
                break;
        }
        if(!tancar) {
            System.out.println();
            System.out.println("Exercici Finalitzat");
            System.out.println();
            main(args);
        }else{
            System.out.println("Finalitzant Programa");
        }
    }
}