====================
public static int f_gold ( int n ) {
  int num = n ;
  int decValue = 0 ;
  int base = 1 ;
  int temp = num ;
  while ( ( temp = temp % 10 ) != 0 ) {
    int lastDigit = temp % 10 ;
    temp = ( int ) ( temp / 10 ) ;
    decValue += lastDigit * base ;
    base = base * 8 ;
  }
  return decValue ;
}

