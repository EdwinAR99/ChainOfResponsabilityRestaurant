package co.edu.unicauca.cor.domain;

/**
 *
 * @author 
 * modificado por: 
 *          Jesus Edwin Adrada Ruiz - jesusadrada@unicauca.edu.co
  *         Carlos Enrique Hoyos - joiroce@unicauca.edu.co
  *         Eliana Andrea Camayo - eacamayo@unicauca.edu.co
 */
public class ClaimManager {

    private LevelOne levelOne;
    private LevelTwo levelTwo;
    private LevelThree levelThree;
    private LevelFour levelFour; //nivel 4

    public void createAthentionFlow() {
        levelOne = new LevelOne("mariaortega@gmail.com");
        levelTwo = new LevelTwo("oscarsanchez@gmail.com");
        levelThree = new LevelThree("kate@gmail.com");
        levelFour = new LevelFour("carlitoshoyos@gmail.com");
        // Crea los enlaces
        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);
        levelThree.setNextHandler(levelFour);
    }

    public LevelOne getLevelOne() {
        return levelOne;
    }

    public void setLevelOne(LevelOne levelOne) {
        this.levelOne = levelOne;
    }

    public LevelTwo getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(LevelTwo levelTwo) {
        this.levelTwo = levelTwo;
    }

    public LevelThree getLevelThree() {
        return levelThree;
    }

    public void setLevelThree(LevelThree levelThree) {
        this.levelThree = levelThree;
    }
    
    //nivel 4
    public LevelFour getLevelFour() {
        return levelFour;
    }

    public void setLevelFour(LevelFour levelFour) {
        this.levelFour = levelFour;
    }

}
