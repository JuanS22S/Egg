/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
 */

package Entidades;

public class Matematicas {

    public int numerouno;
    public int numerodos;

    public Matematicas() {
    }

    public Matematicas(int numerouno, int numerodos) {
        this.numerouno = numerouno;
        this.numerodos = numerodos;
    }

    public void setNumerouno(int numerouno) {
        this.numerouno = numerouno;
    }

    public void setNumerodos(int numerodos) {
        this.numerodos = numerodos;
    }

    public int getNumerouno() {
        return numerouno;
    }

    public int getNumerodos() {
        return numerodos;
    }

    
    
}
