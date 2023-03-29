package Principal;
import java.util.Scanner;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
    //     //Crear objeto
    //     Persona Andres = new Persona();
    //     //invocar metodo
    //     Andres.pedirDatos();
    //     Andres.mostrarDatos();
    //     Andres.calcularMc();
    //     Andres.mayorEdad();
    // }
    // {
        Double peso,estatura;
         //Crear objeto
        Persona Andres = new Persona();
        Scanner leer = new Scanner(System.in);
        //Solicitar datos y capturar
        System.out.println("Digite su peso");
        peso=leer.nextDouble();
        System.out.println("Digite su estatura");
        estatura=leer.nextDouble();
        //enviar parametros
        Andres.calcularImc(peso,estatura);
        // mostrar resultado
        Andres.mostrarResultado();
       leer.close();
    }
}
