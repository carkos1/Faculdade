/**
 * @author Igor Reis
 * @version 1.0
 */

 /**
  * Class to manage Angles
  */
public class Angulo {

    /**
     * Angle Degree
     */
    private double graus;


    /**
     * Construtors for Class Angulo
     */

    /**
     * Main Constructor for degree
     */
    public Angulo(){
        this.graus = 1;
    }

    /**
     * Second Constructor for degree
     * @param graus
     */

    public Angulo(double graus){
        this();
        this.graus = graus;
    }


    /**
     * Getters and Setters
     * @return angle values
     */

     /**
      * Getter for degree angle
      * @return
      */
    public double getAngulo(){
        return this.graus;
    }

    /**
     * Setter for degree angle
     * @param graus
     */
    public void setAngulo(double graus){
        this.graus = graus;
    }

    /**
     * Main Methods of the Class Angulo
     * @param angulo
     * @return sums, subtractions, radian values, boolean operations, sin, cos and tan values
     */

    /**
     * Method for adding a value to current angle degree
     * @param angulo
     * @return angle + given angle
     */
    public double adicao(double angulo){
        return this.getAngulo() + angulo;
    }


    /**
     * Method for subtracting a value to current angle degree
     * @param angulo
     * @return angle - given angle
     */
    public double subtracao(double angulo){
        return this.getAngulo() - angulo;
    }


    /**
     * Method to convert from degrees to radians
     * @return radian value of an angle
     */
    public double radianos(){
        return this.getAngulo()*(Math.PI/180);
    }


    /**
     * Method to compare two angles degrees
     * @param angulo
     * @return boolean operation
     */
    public boolean equals(double angulo){
        return this.getAngulo() == angulo;
    }


    /**
     * Method to calculate sin of an angle
     * @return sin
     */
    public double sin(){
        return Math.sin(this.getAngulo());
    }

    /**
     * Method to calculate cos of an angle
     * @return cos
     */
    public double cos(){
        return Math.cos(this.getAngulo());
    }

    /**
     * Method to calculate tan of an angle
     * @return tan
     */
    public double tg(){
        return Math.tan(this.getAngulo());
    }

    /**
     * To String Method
     */
    @Override
    public String toString(){
        return "Angulo de " + this.graus + " graus";
    }
}
