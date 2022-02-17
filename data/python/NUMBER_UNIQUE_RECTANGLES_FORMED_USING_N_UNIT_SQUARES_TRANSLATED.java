====================
public static int fGold ( int n ) {
  int ans = 0 ;
  for ( int length = 1 ;
  length <= Integer . MAX_VALUE ;
  length ++ ) {
    int height = length ;
    while ( ( height * length <= n ) && ( height * length <= n ) ) {
      ans ++ ;
      height ++ ;
    }
  }
  return ans ;
}

