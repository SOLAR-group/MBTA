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
public class FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  if ( n < 3 ) {
    return - 1 ;
  }
  Arrays . sort ( arr ) ;
  return Math . max ( arr [ 0 ] * arr [ 1 ] * arr [ n - 1 ] , arr [ n - 1 ] * arr [ n - 2 ] * arr [ n - 3 ] ) ;
}


//TOFILL

}
