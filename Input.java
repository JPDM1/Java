import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //llama para crear un input
        System.out.println("Ingresa tu edad:");
        byte valor=sc.nextByte();
        var x =1;
        System.out.println("Tu edad es: "+valor);
        System.out.println(x);

        sc.close();
    }
}
