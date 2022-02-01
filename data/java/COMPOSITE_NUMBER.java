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
public class COMPOSITE_NUMBER{
static boolean f_gold ( int n ) {
  if ( n <= 1 ) System . out . println ( "False" ) ;
  if ( n <= 3 ) System . out . println ( "False" ) ;
  if ( n % 2 == 0 || n % 3 == 0 ) return true ;
  for ( int i = 5 ;
  i * i <= n ;
  i = i + 6 ) if ( n % i == 0 || n % ( i + 2 ) == 0 ) return true ;
  return false ;
}


//TOFILL

}
