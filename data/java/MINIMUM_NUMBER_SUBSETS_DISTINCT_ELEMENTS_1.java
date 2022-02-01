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
public class MINIMUM_NUMBER_SUBSETS_DISTINCT_ELEMENTS_1{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > mp = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mp . put ( arr [ i ] , mp . get ( arr [ i ] ) == null ? 1 : mp . get ( arr [ i ] ) + 1 ) ;
  int res = 0 ;
  for ( Map . Entry < Integer , Integer > entry : mp . entrySet ( ) ) res = Math . max ( res , entry . getValue ( ) ) ;
  return res ;
}


//TOFILL

}
