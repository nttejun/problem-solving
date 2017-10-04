package list;

import java.util.List;

/**
 * Created by nttej on 2017-10-03.
 */

class ListInfo<T> {

    private T data;
    private ListInfo<T> link;

    public T value(){return data;}
    public ListInfo<T> link() {return link;}

    public void setValue(T value){data = value;}
    public void setNext(ListInfo<T> element){link = element;}

}

public class SinglyLinkedList {

    public static void main(String[] args) {

        ListInfo<Integer> info = null;

    }
 }
