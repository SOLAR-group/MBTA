====================
public static int fGold ( int n ) {
  List < Integer > res = Lists . newArrayList ( ) ;
  res . add ( 0 ) ;
  res . add ( 1 ) ;
  int i = 2 ;
  while ( i < n + 1 ) {
    res . add ( Math . max ( i , ( res . get ( Integer . valueOf ( i / 2 ) ) + res . get ( Integer . valueOf ( i / 3 ) ) + res . get ( Integer . valueOf ( i / 4 ) ) + res . get ( Integer . valueOf ( i / 5 ) ) ) ) ;
    i = i + 1 ;
  }
  return res . get ( n ) ;
}

