
package caja;

public class Caja {
    
    //Atributos de la clase (Debe tener 3 atributos de tipo entero)
    int ancho;
    int alto;
    int profundo;
    
    //Constructor(vacío)
    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    //Constructor(con argumentos)
    public Caja(int ancho,int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodo para calcular volumen
    public int calcularVolumen(){
        return ancho * alto * profundo;
        
    }
}
