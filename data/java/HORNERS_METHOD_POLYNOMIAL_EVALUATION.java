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
public class HORNERS_METHOD_POLYNOMIAL_EVALUATION{
static int f_gold ( int poly [ ] , int n , int x ) {
  int result = poly [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) result = result * x + poly [ i ] ;
  return result ;
}


//TOFILL

}
