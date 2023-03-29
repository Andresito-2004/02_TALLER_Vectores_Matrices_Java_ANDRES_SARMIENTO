package Principal2;
import Salud2.Empleado;
public class Inicio {
    public static void main(String[] args) {
        //Crear objeto
        Empleado Andres = new Empleado("Cedula",1019762470,"Andres","Sarmiento",63.7,1.80,
        19,"masculino","Consultor",3500,8,"Software");
        //invocar metodo
        Andres.calcularHonorarios();
        Andres.mostrarInformacion();
    }
}
