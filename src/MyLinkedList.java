import java.util.ArrayList;

public class MyLinkedList<E> {

    private final ArrayList<Node<E>> ramMemory = new ArrayList<>();

    private Node<E> primerNode = null;



    public MyLinkedList() {

    }

    // FUNCIONS COMUNES

    /**
     * Returns the of this collection
     */
    public int size() {
        return ramMemory.size();
    }

    /**
     * Get the value at given index
     *
     * @throws IndexOutOfBoundsException the collection doesn't contain the requested element
     */
    public E get(Integer index) {

        Node<E> nodeActual = primerNode;
        for (int i = 0; i < index; i++){
            nodeActual = nodeActual.next;
        }

        return nodeActual.content;
    }

    /**
     * Adds the element at index
     *
     * @throws IndexOutOfBoundsException the collection doesn't contain the requested element
     */
    public void set(Integer index, E element) {

        Node<E> nodeActual = primerNode;
        for(int i = 0; i < index; i++){
            nodeActual = nodeActual.next;
        }
        nodeActual.content = element;

    }

    /**
     * Removes the element at index
     *
     * @throws IndexOutOfBoundsException the collection doesn't contain the requested element
     */
    public void remove(Integer index) {

    }

    // PILES I CUES

    /**
     * Adds the element at the fist position
     */
    public void addFirst(E element) {

    }

    /**
     * Adds the element at the last position
     */
    public void addLast(E element) {

    }

    /**
     * Get and remove the element at the first position
     */
    public E popFirst() {

    }

    /**
     * Get and remove the element at the last position
     */
    public E popLast() {

    }
}