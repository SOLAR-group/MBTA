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
public class CHECK_DIVISIBILITY_LARGE_NUMBER_999{
static boolean f_gold ( String num ) {
  int n = num . length ( ) ;
  if ( n == 0 && num . charAt ( 0 ) == '0' ) return true ;
  if ( n % 3 == 1 ) num = "00" + num ;
  if ( n % 3 == 2 ) num = "0" + num ;
  int gSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int group = 0 ;
    group += ( num . charAt ( i ++ ) - '0' ) * 100 ;
    group += ( num . charAt ( i ++ ) - '0' ) * 10 ;
    group += num . charAt ( i ) - '0' ;
    gSum += group ;
  }
  if ( gSum > 1000 ) {
    num = Integer . toString ( gSum ) ;
    n = num . length ( ) ;
    gSum = f_gold ( num ) ? 1 : 0 ;
  }
  return ( gSum == 999 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("235764");
    param0.add("321308924");
    param0.add("101111");
    param0.add("1998");
    param0.add("339589");
    param0.add("0000101");
    param0.add("264735");
    param0.add("19570453184");
    param0.add("000");
    param0.add("SsHh");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_DIVISIBILITY_LARGE_NUMBER_999," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_DIVISIBILITY_LARGE_NUMBER_999," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
