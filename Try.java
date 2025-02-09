public class Try {
    public static void main(String[] args) {
        int[] lista={1,2,3,4,5};
        try{
            lista[5]=6;
        } catch(Exception e){ 
            System.out.println("ERROR:\n"+e+"\n");
        } 
        System.out.println("Llegó hasta aquí!");
        
    }
    
}
