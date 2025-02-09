import java.util.Scanner;

public class Esprimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número : ");
        int n = sc.nextInt();
        boolean esPrimo = true;
        if(n>3){
            for(int i=2; i<n; i++){
                if(n%i==0){
                    esPrimo = false;
                    break;
                }
            }
        }
        sc.close(); // Cerrar el Scanner para evitar el leak de recursos
        System.out.println(esPrimo ? "Es primo" : "No es primo");
    }
}
