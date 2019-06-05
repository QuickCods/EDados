//213
static ED2013{
  static int bestSum;
  static String bestPath;

  public static String maxSum(BTree<Integer> t){
    bestSum = 0;
    bestPath = "NULL";

    maxSum(t.getRoot(), 0, "");

    return bestPath;
  }

  private static void maxSum(BTNode<Integer>, int sum, String path){
    if (n == null) return;
    sum += n.getValue();
    if(n.getLeft() == null && n.getRight() == null){
      if(sum > bestSum){
        bestSum = sum;
        bestPath = path;
      }
    }

    maxSum(n.getLeft(), sum, path + "E");
    maxSum(n.getRight(), sum, path + "D");
  }

  // public static void main(String[] args){
  //   Scanner in = new Scanner(System.in);
  //
  //   int n = in.nextInt();
  //   for(int i = 0; i < n; i++){
  //     BTree<Interger> t = LibBTree.readInttree(in);
  //     String ans = maxSum(t);
  //     System.out.println(ans + " | bestSum = " + bestSum);
  //   }
  // }
}

//ED212
class ED212{
  public static int[] sumLevels(BTree<Integer> t){
    int sum = new int[t.depth() + 1];
    sumLevels(t.getRoot(), 0, sum);
    return sum;
  }

  private static void sumLevels(BTNode<Integer>, int level, int[] sum){
    if(n == null) return;
    sum[level] += n.getValue();
    sumLevels(n.getLeft(), level + 1, sum);
    sumLevels(n.getRight(), level + 1, sum);
  }
}

//ED207
public int nodesLevel(int k){
  return nodesLevel(l root);
}

private int nodesLevel(int k, BTNode<T> n){
  if(n == null) return 0;
  if(k == 0) return 1;
  return nodesLevel(k-1, n.getLeft()) + nodesLevel(k-1, n.getRight());
}

//ED172
class ED172{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    BSTMap<String, Integer> map = new BSTMap<> ();
    while(in.hasNext()){
      String s = in.next();
      Integer f = map.get(s);
      if(f == null) map.put(s, 1);
      else map.put(s, f+1);
    }
    for(String s : map.keys()){
      System.out.printf("%s: %d%n", s, s.map.get(s));
    }

    // LinkedList<Integer> list = new LinkedList<> ();
    // list.addLast(42);
    // list.addLast(24);
    // list.addLast(2);
    // for(int i : list){
    //   System.out.println(i);
    // }
  }
}
