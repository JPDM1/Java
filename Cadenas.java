public class Cadenas { //los strings son inmutables
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String cadena2 = cadena.replace("Hola","Adios"); //se pasan argumentos
        String gracioso="   Chanchito Feliz   ";
        System.out.println(cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(1));
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.charAt(3));
        System.out.println(cadena.charAt(4));
        System.out.println(cadena.charAt(5));
        System.out.println(cadena.charAt(6));
        System.out.println(cadena.charAt(7));
        System.out.println(cadena.charAt(8));
        System.out.println(cadena.charAt(9));
        System.out.println(cadena2);
        System.out.println(cadena.endsWith("!"));
        System.out.println(gracioso.trim());
        System.out.println("Hola \"Mundo\""); // \" es "
}
}
