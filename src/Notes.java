import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("================================== Notes =======================================");
        System.out.println("================================================================================");
        System.out.println();
        menu();
    }
    public static int[] reader() {
        int[] valorError = {-1};
        try {
            //Gràcies a deu que stack overflow existeix. Si no fos així, no sé com ho hauria fet.
            BufferedReader reader = new BufferedReader(new FileReader("Data/notesData.txt"));
            int index = 0;
            while (reader.readLine() != null) {
                index++;
            }
            reader.close();
            int[] notes = new int[index];
            BufferedReader reader2 = new BufferedReader(new FileReader("Data/notesData.txt"));
            for (int i = 0; i < index; i++) {
                String Linea = reader2.readLine();
                notes[i] = Integer.parseInt(Linea);
            }
            reader2.close();
            return notes;
        } catch (FileNotFoundException e) {
            // Sé que no he de fer aixó pero, per algún motiu, decideixo fer-ho.
            System.out.println("Fitxer No Trobat");
            return valorError;
        } catch (IOException e) {
            System.out.println("IO Exception????");
            return valorError;
        }
    }
    public static void writer() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Data/notesData.txt",true));
            Scanner scanner = new Scanner(System.in);
            while (true){
                String input = scanner.nextLine();
                boolean esInt = true;
                for(int i = 0; i < input.length(); i++){
                    if(input.charAt(i)>'9'||input.charAt(i)<'0'){
                        esInt = false;
                        System.out.println("Sortint de l'editor");
                        break;
                    }
                }
                if (!esInt){
                    writer.close();
                    break;
                }else{
                    writer.write(input);
                    writer.newLine();
                }
            }
        }catch (IOException e){
            System.out.println("IO Exception????");
        }
    }
    public static int mitja(){
        try {
            int[] notes = reader();
            int mitja = 0;
            for (int i = 0; i < notes.length; i++) {
                mitja += notes[i];
            }
            return mitja / notes.length;
        }catch (ArithmeticException e){
            return 0;
        }
    }
    public static void comprovar(){
        try {
            Scanner scanner = new Scanner(System.in);
            int indexNota = scanner.nextInt();
            int[] notes = reader();
            if (notes[indexNota - 1] >= 5) {
                System.out.println("La Nota: " + indexNota + " Està Aprovada!!!");
            } else {
                System.out.println("La Nota: " + indexNota + " Està Suspesa. Posa't les piles");
            }
            menu();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("""
                    No existeix aquesta nota.
                    Si vols comprovar les notes que tens registrades selecciona la opció 2.
                    El numero de nota és el numero junt a la paraula "Numero" avans de els dos punts ":"
                    Per exemple "Numero 123 :"
                                        ^^^
                    """);
        }
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Seleccionar Opció
                1. Escriure notes (Cuidado, les notes són permanents)
                2. Veure les teves Notes
                3. Veure la mitja
                4. Comprobar si una nota està aprobada
                """);
        int menu = scanner.nextInt();
        switch (menu){
            case 1:
                System.out.println("""
                                                                    vvvvvvvvvvvvvvvvvvvvv
                        Introdueix les Notes que vulguis introduir  ¡¡¡LINEA PER LINEA!!!
                                                                    ^^^^^^^^^^^^^^^^^^^^^
                        Per acabar introdueix una lletra qualsevol
                        """);
                writer();
                menu();
                break;
            case 2:
                int[] notes = reader();
                if(notes.length==0){
                    System.out.println("Encara no tens Notes");
                }else {
                    for (int i = 0; i < notes.length; i++) {
                        System.out.println("Nota " + (i + 1) + ": " + notes[i]);
                    }
                }
                menu();
                break;
            case 3:
                System.out.println("La mitja de les teves notes és: "+mitja());
                menu();
                break;
            case 4:
                System.out.println("Introdueix el Numero de la Nota a comprovar:");
                comprovar();
                menu();
                break;
            case 5:
                System.out.println("Segur?");
                System.out.println("SI/NO");
                String confirmar = scanner.next();
                confirmar = confirmar.toLowerCase();
                if (confirmar.equals("si")){
                    System.out.println("Sortint del programa");
                    break;
                }
                else{
                    menu();
                    break;
                }
            default:
                System.out.println("Opció No Valida");
                menu();
                break;
        }
    }
}