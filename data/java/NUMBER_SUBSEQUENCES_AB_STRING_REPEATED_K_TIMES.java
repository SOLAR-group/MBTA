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
public class NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES{
static int f_gold ( String s , int K ) {
  int n = s . length ( ) ;
  int C = 0 , c1 = 0 , c2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == 'a' ) c1 ++ ;
    if ( s . charAt ( i ) == 'b' ) {
      c2 ++ ;
      C += c1 ;
    }
  }
  return C * K + ( K * ( K - 1 ) / 2 ) * c1 * c2 ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("abbc");
param0.add("abahk");
param0.add("hugbabab");
param0.add("abadbc");
param0.add("nkg9");
param0.add("jh7dab");
param0.add("abd");
param0.add("aabb8yk");
param0.add("1111");
param0.add("PFXAhru");
    List<Integer> param1 = new ArrayList<>();
    param1.add(96);
    param1.add(7);
    param1.add(59);
    param1.add(60);
    param1.add(8);
    param1.add(41);
    param1.add(87);
    param1.add(4);
    param1.add(18);
    param1.add(8);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
