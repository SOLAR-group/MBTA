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
public class SPLIT_ARRAY_ADD_FIRST_PART_END{
public static void f_gold ( int arr [ ] , int n , int k ) {
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int x = arr [ 0 ] ;
    for ( int j = 0 ;
    j < n - 1 ;
    ++ j ) arr [ j ] = arr [ j + 1 ] ;
    arr [ n - 1 ] = x ;
  }
}


//TOFILL

}
