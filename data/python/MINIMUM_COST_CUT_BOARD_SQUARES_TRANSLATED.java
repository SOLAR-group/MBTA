====================
public static double f_gold ( double [ ] X , double [ ] Y , int m , int n ) {
  double res = 0 ;
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  int hzntl = 1 ;
  int vert = 1 ;
  int i = 0 ;
  int j = 0 ;
  while ( ( i < m && j < n ) || ( i < n && j < m ) ) {
    if ( ( X [ i ] > Y [ j ] ) && ( X [ i ] > Y [ j ] ) ) {
      res += X [ i ] * vert ;
      hzntl ++ ;
      i ++ ;
    }
    else {
      res += Y [ j ] * hzntl ;
      vert ++ ;
      j ++ ;
    }
  }
  double total = 0 ;
  while ( ( i < m ) || ( i < n ) ) {
    total += X [ i ] ;
    i ++ ;
  }
  res += total * vert ;
  total = 0 ;
  while ( ( j < n ) || ( j < m ) ) {
    total += Y [ j ] ;
    j ++ ;
  }
  res += total * hzntl ;
  return res ;
}

