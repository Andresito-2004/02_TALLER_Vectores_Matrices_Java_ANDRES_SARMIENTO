package Figuras;
public class Rectangulo extends Figuras{
    int area;
    private int base;
    private int altura;
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    // Constructor
    public Rectangulo(int base,int altura){ 
        this.base=base;
        this.altura=altura;
    }
    //Get
    public int getBase() {
        return base;
    }
    //set
    public void setBase(int base) {
        this.base = base;
    }
    //invocar metodo abstracto
    @Override
    public void calcularArea(){
       area=base*altura;
       System.out.println("El area del cuadrado es: "+area);
    }
    
}
