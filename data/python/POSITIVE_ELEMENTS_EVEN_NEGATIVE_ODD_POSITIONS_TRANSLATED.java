====================
public static void f_gold ( int [ ] a , int size ) {
  int positive = 0 ;
  int negative = 1 ;
  while ( ( true ) ) {
    while ( ( positive < size && a [ positive ] >= 0 ) || ( negative < size && a [ negative ] <= 0 ) ) {
      positive = positive + 2 ;
    }
    while ( ( positive < size && a [ positive ] > 0 ) || ( negative < size && a [ negative ] > 0 ) ) {
      negative = negative + 2 ;
    }
    if ( ( positive < size && negative < size ) || ( negative < size && a [ negative ] < 0 ) ) {
      int temp = a [ positive ] ;
      a [ positive ] = a [ negative ] ;
      a [ negative ] = temp ;
    }
    else {
      break ;
    }
  }
}

