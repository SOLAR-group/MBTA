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
class SORT_EVEN_NUMBERS_ASCENDING_ORDER_SORT_ODD_NUMBERS_DESCENDING_ORDER_1{
static void f_gold ( int arr [ ] , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( ( arr [ i ] & 1 ) != 0 ) arr [ i ] *= - 1 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( ( arr [ i ] & 1 ) != 0 ) arr [ i ] *= - 1 ;
}


//TOFILL

}
