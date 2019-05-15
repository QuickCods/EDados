public class SinglyLinkedList<T> {
  /*SinglyLinkedList.java*/
  public T remove(int pos){
    if (isEmpty())
      return null;
    if(pos < 0 || pos >= size)
      return null;
    if(pos == 0){
      T fir = getFirst();
      removeFirst();
      return fir;
    }
    if(pos == size-1){
      T ult = getLast();
      removeLast();
      return ult;
    }
    Node<T> cur = first;
    for(int i = 1; i < pos; i++){
      cur = cur.getNext();
    }
    T mid = cur.getNext().getValue();
    cur.setNext(cur.getNext().getNext());
    size--;
    return mid;
  }
}
