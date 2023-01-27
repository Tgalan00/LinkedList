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
        for (int i = 0; i < index; i++) {
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
        for (int i = 0; i < index; i++) {
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

        Node<E> nodeActual = primerNode;
        for (int i = 0; i < index; i++) {
            nodeActual = nodeActual.next;
        }

        if (index == 0) {

//            nodeActual.next.previous = null;
            Node<E> nodeSegon = nodeActual.next;
            if (nodeSegon != null) {
                nodeSegon.previous = null;
                primerNode = nodeSegon;
            }else {
                primerNode = null;
            }


        }else if (ramMemory.size()-1 == index) {

            Node<E> nodeUltim = nodeActual.previous;
            nodeUltim.next = null;


        } else {

            Node<E> nodePrevi = nodeActual.previous;
            Node<E> nodeSeguent = nodeActual.next;

            nodePrevi.next = nodeSeguent;
            nodeSeguent.previous = nodePrevi;



        }
        ramMemory.remove(nodeActual);

    }

    // PILES I CUES

    /**
     * Adds the element at the first position
     */
    public void addFirst(E element) {

        Node<E> newNode = new Node<>(element, null, primerNode);
        ramMemory.add(newNode);
        primerNode.previous = newNode;
        primerNode = newNode;




    }

    /**
     * Adds the element at the last position
     */
    public void addLast(E element) {
        Node<E> ultimNode = primerNode;
        for (int i = 0; i < ramMemory.size() - 1; i++) {
            ultimNode = ultimNode.next;
        }

        Node<E> newNode = new Node<>(element, ultimNode, null);
        ramMemory.add(newNode);
        ultimNode.next = newNode;
        


    }

    /**
     * Get and remove the element at the first position
     */
    public E popFirst() {

        E node = get(0);
        remove(0);
        return node;

    }

    /**
     * Get and remove the element at the last position
     */
    public E popLast() {

        E node2 = get(ramMemory.size()-1);
        remove(ramMemory.size()-1);
        return node2;

    }
}