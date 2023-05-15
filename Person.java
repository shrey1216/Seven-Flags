//@author Shreyan Wankavala

public class Person {
    private int number;
    private int maxLines;
    private Ride[] lines;
    private Status status;
    private int numRides;

    /** A constructor which initializes a new Person with a number and the max number of lines that person can have.
     *
     * @param number = the number for that person.
     * @param maxLines = the max number of lines that person can be on at a time.
     */
    public Person(int number, int maxLines){
        this.number = number;
        this.maxLines = maxLines;
        lines = new Ride[maxLines];
        numRides = 0;
        //the number must be positive
        //throw illegal argument exception if the number is not positive
    }

    /** A method to return the number of a person
     *
     * @return the person's number
     */
    public int getNumber(){
        return this.number;
    }

    /** A method to return the max number of lines a person can have
     *
     * @return the max number of lines for a person
     */
    public int getMaxLines(){
        return this.maxLines;
    }

    /** A method to return an array of type Ride for the rides a person is currently on
     *
     * @return an array of type Ride
     */
    public Ride[] getLines(){
        return this.lines;
    }

    /** A method to return the status of a person
     *
     * @return the status of a person
     */
    public Status getStatus(){
        return this.status;
    }

    /** A method to return the total number of rides a person has been on
     *
     * @return the total number of rides a person has been on
     */
    public int getNumRides(){
        return this.numRides;
    }

    /** A method to increment the number of rides a person has been on
     *
     */
    public void incrementNumRides(){
        numRides++;
    }

    /** A method to change the number of a person
     *
     * @param number = the number of a person
     */
    public void setNumber(int number){
        this.number = number;
    }

    /** A method to set the max number of a lines for a person
     *
     * @param maxLines = the max number of lines a person can be on
     */
    public void setMaxLines(int maxLines){
        this.maxLines = maxLines;
    }

    /** A method to set an entire line for a person of type Ride[]
     *
     * @param lines = the array of type Ride[] that you can set for a person
     */
    public void setLines(Ride[] lines){
        this.lines = lines;
    }

    /** A method which allows you to set a specific index for a ride a person has been on
     *
     * @param i = the index of the ride
     * @param ride = the ride of type Ride
     */
    public void setLinesIndex(int i, Ride ride){
        lines[i] = ride;
    }

    /** A method to set the current status of a person
     *
     * @param status = the status of the person as a parameter
     */
    public void setStatus(Status status){
        this.status = status;
    }

    /** A method to print the type of customer and his/her number as a toString
     *
     * @return the customer type and number as a toString
     */
    public String toString(){
        if(maxLines == 1){
            return "Regular " + number;
        }
        else if(maxLines == 2){
            return "Silver " + number;
        }
        else{
            return "Gold " + number;
        }
    }

    /** A method to print the lines of type Ride[]
     *
     */
    public void printLines(){
        Ride[] r = lines;
        for(int i = 0; i < r.length; i++){
            System.out.print(r[i].getName() + "  ");
        }
    }


}
