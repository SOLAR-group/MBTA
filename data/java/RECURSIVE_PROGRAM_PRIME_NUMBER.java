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
public class RECURSIVE_PROGRAM_PRIME_NUMBER{
static boolean f_gold ( int n , int i ) {
  if ( n <= 2 ) return ( n == 2 ) ? true : false ;
  if ( n % i == 0 ) return false ;
  if ( i * i > n ) return true ;
  return f_gold ( n , i + 1 ) ;
}


//TOFILL

}
