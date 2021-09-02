package app;

import DatosProblema.Deposito;
import DatosProblema.Maquina;

public class Sistema {
    public Sistema() {
        super();
    }
    private static Deposito deposito = new Deposito();
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        Maquina b1 = new Maquina("1a", "1b", 1 );
        Maquina b2 = new Maquina("2a", "2b", 2 );
        Maquina b3 = new Maquina("3a", "3b", 3 );
        
        b1.setPrecio(2.0f);
        b2.setPrecio(3.0f);
        b3.setPrecio(4.0f);
        
        deposito.addMaquina(b1);
        deposito.addMaquina(b2);
        deposito.addMaquina(b3);
        
        System.out.println("Ventas realizadas = " + deposito.getCantidadDeVentas());
        
        System.out.println("Monto de ventas realizadas = " + deposito.getGanancia());
        
        deposito.venderMaquina(b1);
        deposito.venderMaquina(b2);
        
        System.out.println("Ventas realizadas = " + deposito.getCantidadDeVentas());
        
        System.out.println("Monto de ventas realizadas = " + deposito.getGanancia());     
        
        //Implementar un algoritmo para buscar una máquina, buscarMaquina(String nroDeSerie). El algoritmo podrá implementarse 
        //   en la clase Depósito. El método retornará un tipo Maquina{} o null si no encuentra una máquina.
        
    }
}
