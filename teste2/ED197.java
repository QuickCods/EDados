public class ED197{
  public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
    MyQueue<Integer> q = new LinkedListQueue<Integer>();

    while(!a.isEmpty() || !b .isEmpty()){
      if(a.isEmpty()){
        q.enqueue(b.dequeue());
      }
      else if(b.isEmpty()){
        q.enqueue(a.dequeue());
      }
      else if(a.first() < b.first()){
        q.enqueue(a.dequeue());
      }
      else{
        q.enqueue(b.dequeue());
      }
    }
    return q;
  }

  // public static void main(String[] args){
  //   MyQueue<Integer> a = new LinkedListQueue<Integer>();
  //   MyQueue<Integer> b = new LinkedListQueue<Integer>();
  //
  //   a.enqueue(2);
  //   a.enqueue(4);
  //   a.enqueue(6);
  //   a.enqueue(8);
  //
  //   b.enqueue(1);
  //   b.enqueue(4);
  //   b.enqueue(9);
  //
  //   MyQueue<Integer> c = mer(a,b);
  // }
}
