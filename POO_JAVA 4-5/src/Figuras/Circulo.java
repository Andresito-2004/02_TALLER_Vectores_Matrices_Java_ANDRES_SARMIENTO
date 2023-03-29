package Figuras;
public class Circulo extends Figuras {
    double area;
    private double pi=3.14;
    private int radio;
    // Constructor
    public Circulo(int radio){ 
        this.radio=radio;
    }
    //Get
    public int getRadio() {
        return radio;
    }
    //Set
    public void setRadio(int radio) {
        this.radio = radio;
    }
    //llamado metodo abstracto
    @Override
    public void calcularArea(){
       area=pi*(radio*radio);
       System.out.println("El area del circulo es: "+area);
    }
}
