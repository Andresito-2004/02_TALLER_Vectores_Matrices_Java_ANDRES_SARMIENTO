import java.util.Scanner;
public class Reto1{
    public static void main(String[] args) {
        int cant, multi=0, nomulti=0;
        boolean num=false;
        Scanner leer = new Scanner(System.in);
        System.out.print("por favor ingrese la cantidad de numeros que desea ingresar: "+num);
        cant=leer.nextInt();
        // Creacion de array []
        int[] numero = new int[cant];
        for(int i=0;i<numero.length;i++){
            System.out.println("digite el numero: "+i);
            numero[i]=leer.nextInt();
            if (num= numero[i] % 2 == 0) {
                multi+=1;
            }
            else if (!(num= numero[i] % 2 == 0)) {
                nomulti+=1;
            }
        }  
        System.out.println("hay "+multi+" numeros multiplos de dos y hay "+nomulti+" numeros no multiplos de dos");
        leer.close();
    }
}
