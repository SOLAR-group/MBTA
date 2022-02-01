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
public class PROGRAM_CHECK_ARRAY_SORTED_NOT_ITERATIVE_RECURSIVE{
static int f_gold ( int arr [ ] , int n ) {
  if ( n == 1 || n == 0 ) return 1 ;
  if ( arr [ n - 1 ] < arr [ n - 2 ] ) return 0 ;
  return f_gold ( arr , n - 1 ) ;
}


//TOFILL

}
