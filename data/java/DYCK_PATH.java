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
public class DYCK_PATH{
public static int f_gold ( int n ) {
  int res = 1 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    res *= ( 2 * n - i ) ;
    res /= ( i + 1 ) ;
  }
  return res / ( n + 1 ) ;
}


//TOFILL

}
