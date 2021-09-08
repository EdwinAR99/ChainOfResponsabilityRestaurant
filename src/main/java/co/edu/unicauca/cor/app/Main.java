package co.edu.unicauca.cor.app;

import co.edu.unicauca.cor.domain.ClaimManager;
import co.edu.unicauca.cor.domain.Claim;
import co.edu.unicauca.cor.domain.TypeEnum;

/**
 *
 * @author Libardo, Julio
 * modificado por: 
 *          Jesus Edwin Adrada Ruiz - jesusadrada@unicauca.edu.co
  *         Carlos Enrique Hoyos - joiroce@unicauca.edu.co
  *         Eliana Andrea Camayo - eacamayo@unicauca.edu.co
 */
public class Main {


    public static void main(String[] args) {
        ClaimManager manager = new ClaimManager();
        manager.createAthentionFlow();

        Claim claim = new Claim(1, "Tiempo de entrega", "¿Cual es el promedio de entrega de mi domicilio?", TypeEnum.BASIC);
        manager.getLevelOne().attend(claim);

        claim = new Claim(2, "Cobro exajerado del domicilio", "El mensajero me cobró mucho por el domicilio", TypeEnum.DELIVERY);
        manager.getLevelOne().attend(claim);

        claim = new Claim(3, "Calidad del producto", "La comida del restaurante popayan casero estaba fria", TypeEnum.HIGH);
        manager.getLevelOne().attend(claim);

        //Implementación
        claim = new Claim(4, "Producto en malas condiciones", "El producto llegó con un olor extraño", TypeEnum.UNCLASSIFIED);
        manager.getLevelOne().attend(claim);
        
        
    }

}
