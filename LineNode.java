//@author Shreyan Wankavala

public class LineNode {
    private Person data;
    private LineNode next;

    /** The constructor wraps a line node around a person using data
     *
     * @param data = a person
     */
    public LineNode(Person data){
        this.data = data;
    }

    /** Signifies the next person in the linked list
     *
     * @return
     */
    public LineNode getNext(){
        return this.next;
    }

    /** Allows you to change the value of the next person in the list using next
     *
     * @param next = the next person in the list of type LineNode
     */
    public void setNext(LineNode next){
        this.next = next;
    }

    /** Returns the data in a given node
     *
     * @return the data in the node of type Person
     */
    public Person getData(){
        return data;
    }
}
