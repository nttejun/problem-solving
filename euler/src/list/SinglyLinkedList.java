package list;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * Created by nttej on 2017-10-03.
 */

class ListInfo<T> {

    private T data;
    private ListInfo<T> link;

    public ListInfo(T value) {
        data = value;
    }

    public ListInfo<T> link() {
        return link;
    }

    public T value() {
        return data;
    }

    public void setValue(T value) {
        data = value;
    }

    public void setLink(ListInfo<T> dataElement) {
        link = dataElement;
    }

    public ListInfo<Integer> insertList(ListInfo<Integer> list, int data) {

        ListInfo<Integer> listInfo = new ListInfo<Integer>(data);

        listInfo.setLink(list);

        return listInfo;

    }

    public ListInfo<Integer> findList(ListInfo<Integer> head, int data) {

        ListInfo<Integer> element = head;

        while (element != null && element.value() != data) {

            element = element.link();

        }

        return element;

    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {

        int data = 10;

        ListInfo<Integer> head = new ListInfo<>(data);

        head.insertList(head, data);

    }
}
