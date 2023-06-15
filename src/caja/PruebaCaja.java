package caja;

public class PruebaCaja {

    public static void main(String[] args) {

        //Crear Objeto "Caja" utilizando el constructor sin argumentos
        Caja caja1 = new Caja();

        //Dando valor a los atributos del objeto
        caja1.alto = 23;
        caja1.ancho = 21;
        caja1.profundo = 14;
        
        //Mandando a llamar el metodo creado para calcular
        int volumen1 = caja1.calcularVolumen();

        //Imprimir el volumen de la caja1
        System.out.println("El volumen de la caja : " + volumen1);

        //Crear Objeto "Caja2" utilizando el constructor con argumentos
        Caja caja2 = new Caja(3, 2, 6);

        //Calcular el volumen de la caja
        int volumen2 = caja2.calcularVolumen();

        //Imprimir el volumen de la caja2
        System.out.println("El volumen de la caja : " + volumen2);

    }
}
