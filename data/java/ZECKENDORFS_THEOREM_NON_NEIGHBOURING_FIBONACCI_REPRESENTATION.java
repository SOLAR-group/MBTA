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
public class ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION{
public static int f_gold ( int n ) {
  if ( n == 0 || n == 1 ) return n ;
  int f1 = 0 , f2 = 1 , f3 = 1 ;
  while ( f3 <= n ) {
    f1 = f2 ;
    f2 = f3 ;
    f3 = f1 + f2 ;
  }
  return f2 ;
}


//TOFILL

}
