====================
public static int fGold ( int [ ] [ ] dp , int [ ] a , int low , int high , int turn ) {
  if ( ( low == high ) && ( dp [ low ] [ high ] != 0 ) ) return a [ low ] [ high ] ;
  if ( ( dp [ low ] [ high ] != 0 ) && ( a [ low ] [ high ] != 0 ) ) return dp [ low ] [ high ] ;
  dp [ low ] [ high ] = Math . max ( a [ low ] * turn + fGold ( dp , a , low + 1 , high , turn + 1 ) , a [ high ] * turn + fGold ( dp , a , low , high - 1 , turn + 1 ) ) ;
  ;
  return dp [ low ] [ high ] ;
}

