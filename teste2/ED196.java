public class ED196{
  public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
    while(!q.isEmpty()){
      String temp = q.dequeue();
      if(q.first().equals("A")){
        a.enqueue(temp);
        q.dequeue();
      }
      else if(q.first().equals("B")){
        b.enqueue(temp);
        q.dequeue();
      }
      else if(q.first().equals("X")){
        if(a.size() < b.size()){
          a.enqueue(temp);
          q.dequeue();
        }
        else if(a.size() > b.size()){
          b.enqueue(temp);
          q.dequeue();
        }
        else if(a.size() == b.size()){
          q.dequeue();
        }
      }
    }
  }
}
