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
public class LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING{
static String f_gold ( String str ) {
  String mx = "" ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  ++ i ) {
    if ( mx . compareTo ( str . substring ( i ) ) <= 0 ) {
      mx = str . substring ( i ) ;
    }
  }
  return mx ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("HCoAefoaan");
    param0.add("80336005");
    param0.add("01111111110");
    param0.add("qIH");
    param0.add("4210598472796");
    param0.add("10101");
    param0.add("imqmKdatcgXjs");
    param0.add("950509666021");
    param0.add("10111101101");
    param0.add("wasqgYFvz");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
