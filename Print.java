//Primer codigo en Java
public class Print { //class sigue del nombre del archivo
    /*public static siginifica función global
     * Mientras que solo static siginifica función local
     */
     public static void main(String[] args) { 
        int r=suma(5,6);
        //int n=9;
        String caracter= "ho";
        System.out.println("Hello, World!");   
        System.out.println(caracter.repeat(3));   
    }
    static int suma(int a, int b){
        return a+b ;
    }
}
