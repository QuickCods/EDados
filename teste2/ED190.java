
public class SinglyLinkedList<T> {
/*SinglyLinkedList.java*/
  public SinglyLinkedList<T> copy(){
    SinglyLinkedList<T> newList = new SinglyLinkedList<T>();
    Node<T> cur = first;
    while(cur != null){
      T val = cur.getValue();
      newList.addLast(val);
      cur = cur.getNext();
    }
    return newList;
  }
}
