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
public class WILDCARD_CHARACTER_MATCHING{
static boolean f_gold ( String first , String second ) {
  if ( first . length ( ) == 0 && second . length ( ) == 0 ) return true ;
  if ( first . length ( ) > 1 && first . charAt ( 0 ) == '*' && second . length ( ) == 0 ) return false ;
  if ( ( first . length ( ) > 1 && first . charAt ( 0 ) == '?' ) || ( first . length ( ) != 0 && second . length ( ) != 0 && first . charAt ( 0 ) == second . charAt ( 0 ) ) ) return f_gold ( first . substring ( 1 ) , second . substring ( 1 ) ) ;
  if ( first . length ( ) > 0 && first . charAt ( 0 ) == '*' ) return f_gold ( first . substring ( 1 ) , second ) || f_gold ( first , second . substring ( 1 ) ) ;
  return false ;
}


//TOFILL

}
