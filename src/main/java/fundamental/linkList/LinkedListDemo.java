package fundamental.linkList;

/**
 * @Author: tomato
 * @CreateTime: 2024-03-25  10:09
 * @Description: TODO
 * @Version: 1.0
 */
public class LinkedListDemo<E> implements ListDemo<E> {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    public LinkedListDemo() {
    }

    void linkFirst(E e){
        final Node<E> f = first;
        final  Node<E> newNode = new Node<>(null,e,f);
        first = newNode;
        if (f==null){
            last=newNode;
        }else {
            f.prev = newNode;
        }
        size++;
    }
    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean addFirst(E e) {
        return false;
    }

    @Override
    public boolean addLast(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void printLinkList() {

    }


    /**
     * ？表示不确定的 java 类型
     * T (type) 表示具体的一个java类型
     * K V (key value) 分别代表java键值中的Key Value
     * E (element) 代表Element
     */
    private static class Node<E> {

        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

    }
}
