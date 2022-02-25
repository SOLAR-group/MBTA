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
public class SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN_1{
static int f_gold ( int n ) {
  int ans = 0 , temp = 0 , num ;
  for ( int i = 1 ;
  i <= n && temp < n ;
  i ++ ) {
    temp = i - 1 ;
    num = 1 ;
    while ( temp < n ) {
      if ( temp + i <= n ) ans += ( i * num ) ;
      else ans += ( ( n - temp ) * num ) ;
      temp += i ;
      num ++ ;
    }
  }
  return ans ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(93);
    param0.add(7);
    param0.add(81);
    param0.add(80);
    param0.add(47);
    param0.add(7);
    param0.add(41);
    param0.add(59);
    param0.add(34);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
