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
public class PERMUTE_TWO_ARRAYS_SUM_EVERY_PAIR_GREATER_EQUAL_K{
static boolean f_gold ( Integer a [ ] , int b [ ] , int n , int k ) {
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( b ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( a [ i ] + b [ i ] < k ) return false ;
  return true ;
}


//TOFILL

}
