import java.util.Locale;
import java.util.Scanner;
public class Edat {
    public static void main(String[] args){
        System.out.println("================================================================================");
        System.out.println("=============================Ets Major d'Edat?==================================");
        System.out.println("================================================================================");
        System.out.println();
        String nom = nomUsuari();
        int edat = edatUsuari();
        System.out.println((edat<18)?nom+" és menor d'edat":nom+" és major d'edat");
    }

    public static String nomUsuari(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el teu Nom en una linea ");
        String input = scanner.nextLine();
        System.out.println("¿Segur?");
        System.out.println("SI/NO");
        String confirmar = scanner.nextLine();
        confirmar = confirmar.toLowerCase();
        if (confirmar.equals("si")){
            return input;
        }else{
            return (nomUsuari());
        }
    }

    public static int edatUsuari(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("La teva edat");
        int input = scanner.nextInt();
        if (input < 0){
            System.out.println("la edat ha de ser positiva. Intenta-ho de nou");
            return  edatUsuari();
        }
        System.out.println("Segur?");
        System.out.println("SI/NO");
        String confirmar = scanner.next();
        confirmar = confirmar.toLowerCase();
        if (confirmar.equals("si")){
            return input;
        }else{
            return edatUsuari();
        }
    }
}
