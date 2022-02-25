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
public class DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS{
static String f_gold ( int n ) {
  if ( n == 0 ) return "0" ;
  String bin = "" ;
  while ( n > 0 ) {
    bin = ( ( n & 1 ) == 0 ? '0' : '1' ) + bin ;
    n >>= 1 ;
  }
  return bin ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(17);
    param0.add(8);
    param0.add(99);
    param0.add(57);
    param0.add(39);
    param0.add(99);
    param0.add(14);
    param0.add(22);
    param0.add(7);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
