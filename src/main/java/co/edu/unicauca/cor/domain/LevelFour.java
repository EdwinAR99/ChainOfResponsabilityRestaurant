package co.edu.unicauca.cor.domain;

import co.edu.unicauca.cor.infra.Utilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Nivel #4: atención de reclamos
* * @author Jesus Edwin Adrada Ruiz - jesusadrada@unicauca.edu.co
  *         Carlos Enrique Hoyos - joiroce@unicauca.edu.co
  *         Eliana Andrea Camayo - eacamayo@unicauca.edu.co
 */
public class LevelFour extends ClaimHandler {

    public LevelFour(String email) {
        super(email);
    }

    @Override
    public boolean attend(Claim claim) {
        if (claim.getType().equals(TypeEnum.UNCLASSIFIED)) {
            Logger logger = LoggerFactory.getLogger(Utilities.class);
            logger.info("El reclamo está siendo atendido por: " + getEmail());
            Utilities.sendMail(getEmail(), claim.getTitle(), claim.getDescription());
            claim.setAttended(true);
            return true;

        } else {
            System.out.println("Lo sentimos :c El reclamo no se puede atender.");
            return false;
            
        }
    }

}
