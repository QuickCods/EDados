public class SinglyLinkedList<T> {
   /*SinglyLinkedList.java*/
   public void duplicate(){
     Node<T> cur = first;
     while(cur != null){
       Node <T> val = new Node<T>(cur.getValue(), cur.getNext());
       cur.setNext(val);
       size++;
       cur = cur.getNext().getNext();
     }
   }
}
