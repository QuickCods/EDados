public class SinglyLinkedList<T> {
  /*SinglyLinkedList.java*/
  public int count(T value){
    int c = 0;
    if(isEmpty()) { return c; }
    Node<T> cur = first;
    for(int i=0; i < size; i++){
      if(value.equals(cur.getValue())){
        c++;
      }
      cur = cur.getNext();
    }
    return c;
  }
}
