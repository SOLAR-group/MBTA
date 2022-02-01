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
public class CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER{
static boolean f_gold ( char [ ] str1 , char [ ] str2 ) {
  int n1 = str1 . length ;
  int n2 = str2 . length ;
  if ( n1 != n2 ) return false ;
  Arrays . sort ( str1 ) ;
  Arrays . sort ( str2 ) ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) if ( str1 [ i ] != str2 [ i ] ) return false ;
  return true ;
}


//TOFILL

}
