// Matrices
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int columna1,columna2,columna3,columna4,falta=4,l=0,res=0; 
        String carta1,carta2;
        String [][] matriz= {{"mango","fresa","piña"},{"piña","melon","mango"},{"melon","uva","uva"}};

        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    do {
        System.out.println("Por favor ingrese una ubiacion en la columna para hallar la primera carta");
            columna1 = leer.nextInt();
        System.out.println("Por favor ingrese una ubiacion en la fila para hallar la primera carta");
            columna2 = leer.nextInt();
        System.out.println("Por favor ingrese una ubiacion en la columna para hallar la segunda carta");
            columna3 = leer.nextInt();
        System.out.println("Por favor ingrese una ubiacion en la fila para hallar la segunda carta");
            columna4 = leer.nextInt();
             carta1 = matriz[columna1][columna2];
             carta2 = matriz[columna3][columna4];
            if (carta1.equals(carta2)) {
                System.out.println("Has adivinado la palabra correcta  "+carta1+" & "+carta2+" felicitaciones"+l);
                falta=falta-1;
                if (falta>0) {
                  System.out.println("¿Quieres continuar jugando? \n te faltan aun "+falta+" pares \n1. Si \n2.No");
                res=leer.nextInt();  
                }
                else if (falta<=0) {
                    System.out.println("Gracias por jugar");
                }
            }
            else {
                System.out.println("No adivinaste la palabra correcta  "+carta1+" & "+carta2);
                System.out.println("¿Quieres continuar jugando? \n te faltan aun "+falta+" pares \n1. Si \n2.No");
                res=leer.nextInt();
        }
    } 
    while (res==1);
    l++;
    if (res==2) {
        System.out.println("Gracias por jugar de nuevo");
    }
leer.close();
}
}