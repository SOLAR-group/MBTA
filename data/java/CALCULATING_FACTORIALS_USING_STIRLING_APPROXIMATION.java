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
public class CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION{
public static int f_gold ( double n ) {
  if ( n == 1 ) return 1 ;
  double z ;
  double e = 2.71 ;
  z = Math . sqrt ( 2 * 3.14 * n ) * Math . pow ( ( n / e ) , n ) ;
  return ( int ) ( z ) ;
}


//TOFILL

}
