import java.io.FileWriter;
import java.io.IOException;
// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class COUNT_SUM_OF_DIGITS_IN_NUMBERS_FROM_1_TO_N{
static int f_gold ( int n ) {
  if ( n < 10 ) return ( n * ( n + 1 ) / 2 ) ;
  int d = ( int ) ( Math . log10 ( n ) ) ;
  int a [ ] = new int [ d + 1 ] ;
  a [ 0 ] = 0 ;
  a [ 1 ] = 45 ;
  for ( int i = 2 ;
  i <= d ;
  i ++ ) a [ i ] = a [ i - 1 ] * 10 + 45 * ( int ) ( Math . ceil ( Math . pow ( 10 , i - 1 ) ) ) ;
  int p = ( int ) ( Math . ceil ( Math . pow ( 10 , d ) ) ) ;
  int msd = n / p ;
  return ( msd * a [ d ] + ( msd * ( msd - 1 ) / 2 ) * p + msd * ( 1 + n % p ) + f_gold ( n % p ) ) ;
}


//TOFILL

}
