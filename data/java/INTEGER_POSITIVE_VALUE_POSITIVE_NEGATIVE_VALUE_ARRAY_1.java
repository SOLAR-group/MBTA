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
public class INTEGER_POSITIVE_VALUE_POSITIVE_NEGATIVE_VALUE_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int neg = 0 , pos = 0 ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
    if ( arr [ i ] < 0 ) neg ++ ;
    else pos ++ ;
  }
  return ( sum / Math . abs ( neg - pos ) ) ;
}


//TOFILL

}
