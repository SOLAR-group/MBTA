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
public class CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING{
static int f_gold ( String str ) {
  int res = str . charAt ( 0 ) - '0' ;
  for ( int i = 1 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( str . charAt ( i ) == '0' || str . charAt ( i ) == '1' || res < 2 ) res += ( str . charAt ( i ) - '0' ) ;
    else res *= ( str . charAt ( i ) - '0' ) ;
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("pR");
    param0.add("9518");
    param0.add("1");
    param0.add("nNMCIXUCpRMmvO");
    param0.add("3170487");
    param0.add("0100101010");
    param0.add("Z rONcUqWb");
    param0.add("00419297");
    param0.add("00");
    param0.add("r");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
