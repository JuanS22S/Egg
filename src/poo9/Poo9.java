package poo9;

import Entidades.Matematicas;
import Servicios.ServiciosEntidades;
import java.util.Scanner;

public class Poo9 {

    public static void main(String[] args) {
     
        ServiciosEntidades SE = new ServiciosEntidades();
        Matematicas m1 = SE.Cuentas();
        
        Scanner leer = new Scanner(System.in);
        
        m1.setNumerouno((int) (Math.random()*10));
        m1.setNumerodos((int) (Math.random()*10));
        
       //int numero = (int) (Math.random() * 10);
        
        System.out.println("NUMERO UNO " + m1.getNumerouno());
        System.out.println("NUMERO DOS " + m1.getNumerodos());
        
//Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
        
       int devolverMayor = Math.max(m1.getNumerouno(), m1.getNumerodos());
       
        System.out.println("NUMERO MAYOR " + devolverMayor);
        
        
//Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
        
        int menor = Math.min(m1.getNumerouno(), m1.getNumerodos());
        
        int calcularPotencia = (int) Math.pow(devolverMayor, menor);
        
        System.out.println("POTENCIA " + calcularPotencia);
        
       
//Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
   
int absolutoMenor = (int) Math.abs(menor);

int calcularRaiz = (int) Math.sqrt(absolutoMenor);

        System.out.println("NUMERO MENOR ABSOLUTO " + absolutoMenor);
        System.out.println("RAIZ DEL NUMERO MENOR" + calcularRaiz);

    }
    
}
