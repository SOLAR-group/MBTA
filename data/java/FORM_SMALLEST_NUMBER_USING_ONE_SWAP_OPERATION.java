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
public class FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION{
public static String f_gold ( String str ) {
  char [ ] num = str . toCharArray ( ) ;
  int n = str . length ( ) ;
  int [ ] rightMin = new int [ n ] ;
  rightMin [ n - 1 ] = - 1 ;
  int right = n - 1 ;
  for ( int i = n - 2 ;
  i >= 1 ;
  i -- ) {
    if ( num [ i ] > num [ right ] ) rightMin [ i ] = right ;
    else {
      rightMin [ i ] = - 1 ;
      right = i ;
    }
  }
  int small = - 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) if ( num [ i ] != '0' ) {
    if ( small == - 1 ) {
      if ( num [ i ] < num [ 0 ] ) small = i ;
    }
    else if ( num [ i ] < num [ small ] ) small = i ;
  }
  if ( small != - 1 ) {
    char temp ;
    temp = num [ 0 ] ;
    num [ 0 ] = num [ small ] ;
    num [ small ] = temp ;
  }
  else {
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( rightMin [ i ] != - 1 ) {
        char temp ;
        temp = num [ i ] ;
        num [ i ] = num [ rightMin [ i ] ] ;
        num [ rightMin [ i ] ] = temp ;
        break ;
      }
    }
  }
  return ( new String ( num ) ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ncYltuhSxEfG");
    param0.add("26615541616459");
    param0.add("0101");
    param0.add("hK");
    param0.add("422162103899");
    param0.add("0010");
    param0.add("zfcSh");
    param0.add("92");
    param0.add("0");
    param0.add("v");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
