====================
public static int f_gold ( int process , int need ) {
  int minResources ;
  minResources = process * ( need - 1 ) + 1 ;
  return minResources ;
}

