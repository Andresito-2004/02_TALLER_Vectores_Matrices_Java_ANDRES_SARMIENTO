package Salud;
//import java.util.Scanner;
public class Persona{
    // //Atributos
    private Double pesoactual;
    // private String tipoide;
    // private int ide;
    // private String nombre;
    // private String Apellido;
    // private double peso;
    // private double estatura;
    // private int edad;
    // private String sexo;
    // //Metodos
    // public void pedirDatos(){
    //     Scanner leer =new Scanner(System.in);
    //     System.out.println("Por favor ingrese su tipo de identificación: ");
    //         tipoide = leer.next();
    //     System.out.println("Por favor ingrese su identificación: ");
    //         ide = leer.nextInt();
    //     System.out.println("Por favor ingrese su nombre: ");
    //         nombre = leer.next();
    //     System.out.println("Por favor ingrese su apellido: ");
    //         Apellido = leer.next();
    //     System.out.println("Por favor ingrese su peso: ");
    //         peso = leer.nextDouble();
    //     System.out.println("Por favor ingrese su estatura: ");
    //         estatura = leer.nextDouble();
    //     System.out.println("Por favor ingrese su edad");
    //         edad = leer.nextInt();
    //     System.out.println("Por favor ingrese su sexo");
    //         sexo = leer.next();
    //         leer.close();
    // }
    // public void mostrarDatos(){
    //     System.out.println("tipo de identificación: "+tipoide);
    //     System.out.println("identificación: "+ide);
    //     System.out.println("nombre: "+nombre);
    //     System.out.println("Apellido: "+Apellido);
    //     System.out.println("Peso: "+peso);
    //     System.out.println("Estatura: "+estatura);
    //     System.out.println("Edad: "+edad);
    //     System.out.println("sexo: "+sexo);
    // }
    // public void calcularMc(){
    //     double pesoactual;
    //     pesoactual=peso/(estatura*estatura);
    //     if (pesoactual<20) {
    //         System.out.println("Tu peso esta por debajo de lo ideal "+pesoactual);
    //     }
    //     else if (pesoactual>20 && pesoactual<=25) {
    //         System.out.println("el peso es ideal"+pesoactual);
    //     }
    //     else if (pesoactual>25) {
    //         System.out.println("Estas en sobre peso");
    //     }
    // }
    // public void mayorEdad(){
    //     if (edad>=18) {
    //         System.out.println("Eres mayor de edad");
    //     }
    //     else {
    //         System.out.println("Eres menor de edad ");
    //     }
    // }
    public void calcularImc(Double peso, Double estatura){
     pesoactual=((peso)/(estatura*estatura));
    }
    public void mostrarResultado(){
        if (pesoactual<20) {
                System.out.println("Tu peso esta por debajo de lo ideal "+pesoactual);
               }
        else if (pesoactual>20 && pesoactual<=25) {
                System.out.println("el peso es ideal"+pesoactual);
               }
        else if (pesoactual>25) {
                     System.out.println("Estas en sobre peso");
                 } 
    }

}
