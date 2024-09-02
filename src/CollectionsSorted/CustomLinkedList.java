package CollectionsSorted;

import java.util.Collection;

public class CustomLinkedList<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;

    public CustomLinkedList() {
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public boolean addAll(CustomLinkedList<E> c) {
        Node<E> x = c.first;
        for (int i = 0; i < c.size; i++) {
            linkLast(x.item);
            x = x.next;
        }
        return true;
    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> x = first;
        for (int i = 0; i < size; i++) {
            sb.append(x.item);
            if (x.next == null) {
                sb.append("");
            } else {
                sb.append(',').append(' ');
            }
            x = x.next;
        }
        return sb.toString();
    }
}
