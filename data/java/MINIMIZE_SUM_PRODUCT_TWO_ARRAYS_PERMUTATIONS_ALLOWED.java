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
public class MINIMIZE_SUM_PRODUCT_TWO_ARRAYS_PERMUTATIONS_ALLOWED{
static int f_gold ( int A [ ] , int B [ ] , int n ) {
  Arrays . sort ( A ) ;
  Arrays . sort ( B ) ;
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) result += ( A [ i ] * B [ n - i - 1 ] ) ;
  return result ;
}


//TOFILL

}
