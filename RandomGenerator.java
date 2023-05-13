//@author Shreyan Wankavala
//112634232
//Recitation 01

public class RandomGenerator {

    /** A method which takes in an array and returns a value from that array with an equal probability of any being chosen
     *
     * @param rides = the array that is passed in as a parameter
     * @return a random value from the array
     */
    public static Ride selectRide(Ride[] rides){
        return rides[(int)(Math.random() * rides.length)];
    }
}