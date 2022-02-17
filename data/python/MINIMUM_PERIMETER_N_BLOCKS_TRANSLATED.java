====================
static final double fGold ( double n ) {
  double l = Math . sqrt ( n ) ;
  double sq = l * l ;
  if ( ( sq == n ) && ( l == n ) ) {
    return l * 4 ;
  }
  else {
    double row = n / l ;
    double perimeter = 2 * ( l + row ) ;
    if ( ( n % l != 0 ) && ( n % l != 0 ) ) {
      perimeter += 2 ;
    }
    return perimeter ;
  }
}

