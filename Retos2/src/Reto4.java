import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        String [][] nombre = new String [4][4];
        String [][] precios = new String [4][4];
        for (int i=0;i<nombre.length;i++){
            for (int j=0;j<nombre.length;j++){
                        System.out.println("Digite el nombre: "+i+j);
                        nombre[i][j]=leer.next();
                        System.out.println("Digite el precio: "+i+j);
                        precios[i][j]=leer.next();
                    }
                }
    for(int i=0;i<nombre.length;i++){
        for(int j=0;j<nombre.length;j++){
            num+=1;
            System.out.print(+num+" "+nombre[i][j]+" "+precios[i][j]+"\t");
        }
        System.out.println();
    }
leer.close();}
}
