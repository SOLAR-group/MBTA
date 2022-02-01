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
public class REMOVE_ARRAY_END_ELEMENT_MAXIMIZE_SUM_PRODUCT{
static int f_gold ( int dp [ ] [ ] , int a [ ] , int low , int high , int turn ) {
  if ( low == high ) {
    return a [ low ] * turn ;
  }
  if ( dp [ low ] [ high ] != 0 ) {
    return dp [ low ] [ high ] ;
  }
  dp [ low ] [ high ] = Math . max ( a [ low ] * turn + f_gold ( dp , a , low + 1 , high , turn + 1 ) , a [ high ] * turn + f_gold ( dp , a , low , high - 1 , turn + 1 ) ) ;
  return dp [ low ] [ high ] ;
}


//TOFILL

}
