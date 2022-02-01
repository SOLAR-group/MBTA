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
public class COUNT_NUMBERS_THAT_DONT_CONTAIN_3{
static int f_gold ( int n ) {
  if ( n < 3 ) return n ;
  if ( n >= 3 && n < 10 ) return n - 1 ;
  int po = 1 ;
  while ( n / po > 9 ) po = po * 10 ;
  int msd = n / po ;
  if ( msd != 3 ) return f_gold ( msd ) * f_gold ( po - 1 ) + f_gold ( msd ) + f_gold ( n % po ) ;
  else return f_gold ( msd * po - 1 ) ;
}


//TOFILL

}
