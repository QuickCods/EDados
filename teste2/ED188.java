public class SinglyLinkedList<T> {
  /*SinglyLinkedList.java*/
    public T get(int pos){
    if (isEmpty())
      return null;
    if(pos < 0 || pos >= size)
      return null;
    Node<T> cur = first;
    for(int i = 0; i < pos; i++)
      cur = cur.getNext();
    return  cur.getValue();
  }
}
