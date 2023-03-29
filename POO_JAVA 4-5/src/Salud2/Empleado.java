package Salud2;
public class Empleado extends Persona{
    double total;
    //Atributos faltantes
    private String cargo;
    private int vhora;
    private int htrabajadas;
    private String departamento;
    //contructor clase hija
    public Empleado(String tipoide, int ide, String nombre, String apellido, double peso, double estatura, int edad,String sexo,
        String cargo,int vhora,int htrabajadas,String departamento) {
        // no se necesitan inicializar ya que etsan inicializados de la clase padre   
        super(tipoide, ide, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo=cargo;
        this.vhora=vhora;
        this.htrabajadas=htrabajadas;
        this.departamento=departamento;
    }
    public void calcularHonorarios() {
      total = (vhora*htrabajadas)-((vhora*htrabajadas)*0.0966);
    }
    public void mostrarInformacion() {
        System.out.println("El tipo de documento es: "+getTipoide()+
        "\nEl numero de identificación es: "+getIde()+
        "\nEl nombre de: "+getNombre()+" "+getApellido()+
        "\nEl departamento es: "+departamento+
        "\nEl cargo es: "+cargo+
        "\nEl numero de horas trabajadas son: "+htrabajadas+
        "\nEl valor por la hora es: "+vhora+
        "\nEl valor que se le debe pagar es: "+total);
    }
}
