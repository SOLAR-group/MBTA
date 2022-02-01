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
public class DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION{
static int f_gold ( int n , int m , int k ) {
  if ( m <= n - k + 1 ) return m + k - 1 ;
  m = m - ( n - k + 1 ) ;
  return ( m % n == 0 ) ? n : ( m % n ) ;
}


//TOFILL

}
