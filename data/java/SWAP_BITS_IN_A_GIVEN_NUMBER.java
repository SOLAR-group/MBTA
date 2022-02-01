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
public class SWAP_BITS_IN_A_GIVEN_NUMBER{
static int f_gold ( int x , int p1 , int p2 , int n ) {
  int set1 = ( x >> p1 ) & ( ( 1 << n ) - 1 ) ;
  int set2 = ( x >> p2 ) & ( ( 1 << n ) - 1 ) ;
  int xor = ( set1 ^ set2 ) ;
  xor = ( xor << p1 ) | ( xor << p2 ) ;
  int result = x ^ xor ;
  return result ;
}


//TOFILL

}
