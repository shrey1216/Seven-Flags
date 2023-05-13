//@author Shreyan Wankavala
//112634232
//Recitation 01

public class HoldingQueue extends VirtualLine {

    private int maxSize;
    private LineNode head;
    private LineNode tail;
    private int lineSize;

    /** Creates a new list which is the Holding Queue. Inherits methods from Virtual Line. Sets head and tail to null, and line size to 0
     *
     */
    public HoldingQueue(){
        this.head = null;
        this.tail = null;
        this.lineSize = 0;
    }
}
