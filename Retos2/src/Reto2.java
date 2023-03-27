//Usando java.util.Arrays, podemos crear, comparar, ordenar, buscar, transmitir y transformar arrays.
import java.util.Arrays;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, puesto=0; 
        System.out.println("Digite la cantidad de participantes: ");
        n=leer.nextInt();
        String[] nombres = new String[n];
        int[] tiempos = new int[n];
        for(int i=0;i<tiempos.length;i++){
        System.out.println("Digite el nombre del participante: ");
        nombres[i]=leer.next();
        System.out.println("Digite el tiempo del participante: ");
        tiempos[i]=leer.nextInt();
       }
       Arrays.sort(tiempos);
       System.out.println("Los puestos ganadores son:");
       for (int numero:tiempos){
        puesto=puesto+1;
         System.out.println(puesto+" con el tiempo de "+numero+" Minutos");
       }
      
    leer.close();}
}
