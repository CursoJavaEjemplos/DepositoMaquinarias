package DatosProblema;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Maquina> maquinas = null; //new ArrayList<Bicicleta>();
    //Maquina[] maquinas = new Maquina[100]; 
    
    //Ver los métodos públicos de acceso a estos atributos 
    private Float ganancia = new Float(0.0);
    private Integer cantidadDeVentas = new Integer(0);
   
    public Deposito() {
        super();
        maquinas = new ArrayList<Maquina>();
        cantidadDeVentas = 0;
        ganancia = 0.0f; 
    }
   
    public void addMaquina(Maquina nuevaMaqui) {
        maquinas.add(nuevaMaqui); 
    }
    public void venderMaquina(Maquina maquina) {
        
        cantidadDeVentas++;
        ganancia = ganancia + maquina.getPrecio(); 
        //ojo! 
        maquinas.remove(maquina);
 
    }
    
    //Interfaz pública a los atributos privados
    public Float getGanancia() {
        return ganancia;
    }

    public Integer getCantidadDeVentas() {
        return cantidadDeVentas;
    }
}
