====================
public static String f_gold ( String num ) {
  num = Arrays . asList ( num ) ;
  int n = num . length ( ) ;
  int [ ] rightMin = new int [ n ] ;
  int right ;
  rightMin [ n - 1 ] = - 1 ;
  ;
  right = n - 1 ;
  for ( int i = n - 2 ;
  i > 0 ;
  i -- ) {
    if ( num . charAt ( i ) > num . charAt ( right ) ) {
      rightMin [ i ] = right ;
    }
    else {
      rightMin [ i ] = - 1 ;
      right = i ;
    }
  }
  int small = - 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( num . charAt ( i ) != '0' ) {
      if ( small == - 1 ) {
        if ( num . charAt ( i ) < num . charAt ( 0 ) ) {
          small = i ;
        }
      }
      else if ( num . charAt ( i ) < num . charAt ( small ) ) {
        small = i ;
      }
    }
  }
  if ( small != - 1 ) {
    num = num . substring ( 0 , small ) ;
  }
  else {
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( rightMin [ i ] != - 1 ) {
        num = num . substring ( rightMin [ i ] ) ;
        break ;
      }
    }
  }
  return new String ( num ) ;
}

