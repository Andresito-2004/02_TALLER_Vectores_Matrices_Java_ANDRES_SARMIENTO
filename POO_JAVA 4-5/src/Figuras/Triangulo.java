package Figuras;
public class Triangulo extends Figuras{
    int area;
    private int base;
    private int altura;
    // Constructor
    public Triangulo(int base,int altura){ 
        this.base=base;
        this.altura=altura;
    }
    //Bases get y set
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    //alturas get y set
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    //-----------------------
    @Override
    public void calcularArea(){
       area=base*altura;
       System.out.println("El area del triagunlo es es: "+area);
    }
}
