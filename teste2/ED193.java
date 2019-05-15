public class SinglyLinkedList<T> {
   /*SinglyLinkedList.java*/
   public void removeAll(T value){
     if(size < 1) return;

     Node<T> cur = first;

     while(cur != null){
       while(cur.getNext() != null && value.equals(cur.getNext().getValue())){
         cur.setNext(cur.getNext().getNext());
         size--;
       }
      cur = cur.getNext();
      }
      if(value.equals(first.getValue())){
          removeFirst();
      }
   }
}
