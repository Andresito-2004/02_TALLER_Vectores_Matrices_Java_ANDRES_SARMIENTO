package Interfaz;
import java.util.Scanner;
public class ppt implements Juego {
    //Atributos
    private String nombre;
    private String juego;
    private String Juegom;
    private int Maquina;
    private int jugador;
    //objeto para Scanner
    Scanner leer = new Scanner(System.in);
 
    
    public void inicio() {
        System.out.print("Por favor ingrese su nombre: ");
        nombre= leer.next();;
    }

    
    public void jugar() {
        System.out.println("Elige una de las siguientes opciones\n1 Piedra\n2 Papel\n3 Tijera \n Ingresa la jugada: ");
        jugador= leer.nextInt();
        Maquina = (int)Math.floor(Math.random() * (3 - 1 + 1)) + 1;
        if (jugador==1) {
            Juegom="Piedra";
        }
            else if (jugador==2) {
                Juegom="Papel";
            }
                else if (jugador==3) {
                    Juegom="Tijera";
                }
        if (Maquina==1) {
                juego="Piedra";
                }
                else if (Maquina==2) {
                    juego="Papel";
                    }
                        else if (Maquina==3) {
                            juego="Tijera";
                        }
    }

    public void finalizar() {
        if (jugador==Maquina) {
            System.out.println("Empate tu jugada es: "+juego+" y el sistema es: "+Juegom);
        }
        else if (jugador==1 && Maquina==3) {
            System.out.println("Ganaste "+nombre+" tu jugada es: "+juego+" y el sistema es: "+Juegom);
        }
        else if (jugador==2 && Maquina==1) {
            System.out.println("Ganaste "+nombre+" tu jugada es: "+juego+" y el sistema es: "+Juegom);
        }
        else if (jugador==3 && Maquina==2) {
            System.out.println("Ganaste "+nombre+" tu jugada es: "+juego+" y el sistema es: "+Juegom);
        }
        else{
            System.out.println("perdiste "+nombre+" tu jugada es: "+juego+" y el sistema es: "+Juegom);
        }
        leer.close();
    }
    
}
