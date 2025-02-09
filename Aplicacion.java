import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input="";
        while(!input.equals("salir")){
            System.out.println("Ingrese comando");
            input=sc.next().toLowerCase(); //con nextLine() se vuelve a pedir el input 
            System.out.println(input);

        }
        sc.close();
        System.out.println("Saliendo...");
        
        
    }
    
}
