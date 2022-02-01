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
public class POSSIBLE_TO_MAKE_A_DIVISIBLE_BY_3_NUMBER_USING_ALL_DIGITS_IN_AN_ARRAY{
public static boolean f_gold ( int arr [ ] , int n ) {
  int remainder = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) remainder = ( remainder + arr [ i ] ) % 3 ;
  return ( remainder == 0 ) ;
}


//TOFILL

}
