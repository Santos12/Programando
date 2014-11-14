package practicas_basicas;

/**
 *
 * @author Hack
 */
public class Practicas_Basicas {
 public static int Conta1;
 public static String a[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LlenaArreglo();
    }
    public static void LlenaArreglo(){
    a= new String [10];
        for (int i=0;i<10;i++){
            a[i]="Hola: "+(i+1);
            ImprimeArreglo(Conta1++);
        }
    }
    public static void ImprimeArreglo(int cont){
    System.out.println("a[] posicion "+cont+" "+a[cont]);
    }
    
}
