package Salud2;
public class Persona{
    //Atributos
    private String tipoide;
    private int ide;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    
    //Constructor 
    public Persona(String tipoide,int ide,String nombre,String apellido,double peso,double estatura,int edad,String sexo){
        this.tipoide=tipoide;
        this.ide=ide;
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;
    }
    // Fin Constructor 
    //Getters
    public String getTipoide(){
        return tipoide;
    }
    public int getIde(){
        return ide;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public double getPeso(){
        return peso;
    }
    public double getEstatura(){
        return estatura;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    //Fin de Getters
}
