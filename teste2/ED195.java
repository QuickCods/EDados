public class ED195{
  public static boolean balanced(String s){
    MyStack<Character> c = new LinkedListStack<Character>();

    for(int i = 0; i < s.length(); i++){
      char tmp = s.charAt(i);
      if(tmp == ')' || tmp == ']'){
        if(c.isEmpty())
          return false;
        if (tmp == ')' && c.top() == '(')
          c.pop();
        if (tmp == ']' && c.top() == '[')
          c.pop();
      }
      else
        c.push(tmp);
    }
    //versão também funcional
    // for(int i = 0; i < s.length(); i++){
    //   char tmp = s.charAt(i);
    //   if(tmp == '(' || tmp == '[')
    //     c.push(tmp);
    //   else if(tmp == ')' || tmp == ']'){
    //     if(c.isEmpty())
    //       return false;
    //     if (tmp == ')' && c.top() == '(')
    //       c.pop();
    //     if (tmp == ']' && c.top() == '[')
    //       c.pop();
    //   }
    // }
    return c.isEmpty();
  }
}
