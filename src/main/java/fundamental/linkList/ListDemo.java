package fundamental.linkList;

/**
 * @Author: tomato
 * @CreateTime: 2024-03-25  10:04
 * @Description: TODO
 * @Version: 1.0
 */
public interface ListDemo <E>{

        boolean add(E e);

        boolean addFirst(E e);

        boolean addLast(E e);

        boolean remove(Object o);

        E get(int index);

        void printLinkList();

}
