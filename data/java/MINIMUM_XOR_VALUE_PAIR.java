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
public class MINIMUM_XOR_VALUE_PAIR{
static int f_gold ( int arr [ ] , int n ) {
  int min_xor = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) min_xor = Math . min ( min_xor , arr [ i ] ^ arr [ j ] ) ;
  return min_xor ;
}


//TOFILL

}
