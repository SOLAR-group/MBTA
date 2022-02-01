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
public class FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT{
static boolean f_gold ( String s ) {
  Stack < Character > Stack = new Stack < > ( ) ;
  char [ ] str = s . toCharArray ( ) ;
  for ( char ch : str ) {
    if ( ch == ')' ) {
      char top = Stack . peek ( ) ;
      Stack . pop ( ) ;
      int elementsInside = 0 ;
      while ( top != '(' ) {
        elementsInside ++ ;
        top = Stack . peek ( ) ;
        Stack . pop ( ) ;
      }
      if ( elementsInside < 1 ) {
        return true ;
      }
    }
    else {
      Stack . push ( ch ) ;
    }
  }
  return false ;
}


//TOFILL

}
