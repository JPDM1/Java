import java.util.Arrays;

public class Multiple_arrays {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(Arrays.deepToString(myNumbers)); 
        int [][] myNumbers2 = new int[2][3]; // 2 rows, 3 columns
        myNumbers2[0][2] = 1; // 1st row, 3rd column
        myNumbers2[1][0] = 9; // 2nd row, 4th column
        System.out.println(Arrays.deepToString(myNumbers2));
    }
}
/*  
La forma de crear comentarios en Java en más de una línea es utilizando /* para abrir el comentario y * / para cerrarlo.    

 */
