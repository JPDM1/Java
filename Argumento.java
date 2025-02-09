public class Argumento {
    public static void main(String[] args) {
        System.out.println("numero 1: " + args[0]);
        System.out.println("numero 2: " + args[1]);
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);
    }
    
}
