====================
public static int fGold ( char [ ] X , char [ ] Y , int l , int r , int k , int [ ] [ ] dp ) {
  if ( k == 0 ) return 0 ;
  if ( l < 0 || r < 0 ) return 1000000000 ;
  if ( dp [ l ] [ r ] [ k ] != - 1 ) return dp [ l ] [ r ] [ k ] ;
  int cost = ( ( Character . digit ( X [ l ] , 16 ) - Character . digit ( X [ r ] , 16 ) ) ^ ( Character . digit ( Y [ l ] , 16 ) - Character . digit ( Y [ r ] , 16 ) ) ) ;
  dp [ l ] [ r ] [ k ] = Math . min ( new int [ ] {
    cost + fGold ( X , Y , l - 1 , r - 1 , k - 1 , dp ) , fGold ( X , Y , l - 1 , r , k , dp ) , fGold ( X , Y , l , r - 1 , k , dp ) }
    ) ;
    return dp [ l ] [ r ] [ k ] ;
  }
  
