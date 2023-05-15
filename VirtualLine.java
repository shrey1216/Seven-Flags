//@author Shreyan Wankavala

import java.util.LinkedList;

public class VirtualLine extends LinkedList{


    private LineNode head;
    private LineNode tail;
    private int lineSize;

    /** Constructor makes a virtual line by setting the head and tail to null, and setting the line size to 0
     *
     */
    public VirtualLine(){
        this.head = null;
        this.tail = null;
        this.lineSize = 0;
    }

    /** A method to add a person to the end of a list
     *
     * @param p = the person that is going to be added.
     */
    public void enqueue(Person p){
        LineNode node = new LineNode(p);

        if(head == null){
            head = node;
        }
        else{
            tail.setNext(node);
        }
        tail = node;
        node.setNext(null);
        lineSize++;
    }

    /** A person to remove a person from the front of the list using first in first out.
     *
     * @return the person that was removed from the front of the list.
     */
    public Person dequeue(){
        LineNode temp = head;
        if(head == null){
            System.out.println("The list is empty!");
            //HANDLE THIS EXCEPTION!
        }
        else{
            head = head.getNext();
            lineSize--;
        }
        return temp.getData();
    }

    /** A method which allows you to look at a person at the front of the list without removing him/her.
     *
     * @return the data in the node in the head position
     */
    public Person peek(){
        return head.getData();
        //NEEDS EXCEPTION FOR WHEN LIST IS EMPTY
    }

    /** A method which returns the node at the head position in the list
     *
     * @return the node in the head position
     */
    public LineNode getHead(){
        return head;
    }

    /** A method which returns the node at the tail position of the list
     *
     * @return the node in the tail position
     */
    public LineNode getTail(){
        return tail;
    }

    /** A method to return the size of the line
     *
     * @return the size of the line as an int
     */
    public int getLineSize(){
        return lineSize;
    }

    /** A method to print the nodes in the line
     *
     */
    public void printLine(){
        LineNode temp = head;
        if(lineSize == 0){
            System.out.print("[EMPTY]");
        }
        while(temp != null){
                System.out.print(temp.getData().toString());
            temp = temp.getNext();
            if(temp != null){
                System.out.print(", ");
            }
        }
    }

    //is empty is inherited from the java API

}
