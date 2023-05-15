//@author Shreyan Wankavala

public class Ride {

    private int duration;
    private int timeLeft;
    private String name;
    private VirtualLine virtualLine;
    private HoldingQueue holdingQueue;
    private Person[] peopleOnRide;

    /** A constructor which creates a new ride by taking in its name and duration. Each ride also has its own virtual line and holding queue.
     *
     * @param name = the name of the ride.
     * @param duration = the duration of the ride.
     */
    public Ride(String name, int duration){
        VirtualLine line = new VirtualLine();
        this.virtualLine = line;
        HoldingQueue holdingQueue = new HoldingQueue();
        this.holdingQueue = holdingQueue;
        this.name = name;
        this.duration = duration;
        this.timeLeft = duration;
    }

    /** Returns the duration of the ride
     *
     * @return the duration of the ride as an int
     */
    public int getDuration(){
        return duration;
    }

    /** Returns the time left in the ride
     *
     * @return the time left in the ride as an int
     */
    public int getTimeLeft(){
        return timeLeft;
    }

    /** Returns the name of the ride
     *
     * @return the name of the ride as a string
     */
    public String getName(){
        return name;
    }

    /** Returns the virtual line that belongs to a ride
     *
     * @return the virtual line of type VirtualLine
     */
    public VirtualLine getVirtualLine(){
        return virtualLine;
    }

    /** Returns the holding queue that belongs to a ride
     *
     * @return the holding queue of type HoldingQueue
     */
    public HoldingQueue getHoldingQueue(){
        return holdingQueue;
    }

    /** An array which stores the people who are currently on the ride
     *
     * @return an array filled with the people on the ride
     */
    public Person[] getPeopleOnRide(){
        return peopleOnRide;
    }


    /** A method to set the duration of the ride
     *
     * @param duration = the duration of the ride as an int
     */
    public void setDuration(int duration){
        this.duration = duration;
    }

    /** A method to set the time left in the ride
     *
     * @param timeLeft = the time left as an int
     */
    public void setTimeLeft(int timeLeft){
        this.timeLeft = timeLeft;
    }

    /** A method to set the name of a ride outside of the constructor
     *
     * @param name = the name of the ride as a String
     */
    public void setName(String name){
        this.name = name;
    }

    /** A method to change the virtual line for a ride
     *
     * @param virtualLine = the virtual line of type VirtualLine
     */
    public void setVirtualLine(VirtualLine virtualLine){
        this.virtualLine = virtualLine;
    }

    /** A method to change the holding queue for a line
     *
     * @param holdingQueue = the holding queue of type Holding Queue
     */
    public void setHoldingQueue(HoldingQueue holdingQueue){
        this.holdingQueue = holdingQueue;
    }

    /** A method which allows you to set the people on the ride as an array of type Person[]
     *
     * @param peopleOnRide = the array of type Person[]
     */
    public void setPeopleOnRide(Person[] peopleOnRide){
        this.peopleOnRide = peopleOnRide;
    }
}
