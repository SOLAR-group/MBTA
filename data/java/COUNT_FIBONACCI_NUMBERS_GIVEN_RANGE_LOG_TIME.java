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
public class COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME{
static int f_gold ( int low , int high ) {
  int f1 = 0 , f2 = 1 , f3 = 1 ;
  int result = 0 ;
  while ( f1 <= high ) {
    if ( f1 >= low ) result ++ ;
    f1 = f2 ;
    f2 = f3 ;
    f3 = f1 + f2 ;
  }
  return result ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(76);
    param0.add(96);
    param0.add(19);
    param0.add(36);
    param0.add(60);
    param0.add(20);
    param0.add(76);
    param0.add(63);
    param0.add(2);
    param0.add(41);
    List<Integer> param1 = new ArrayList<>();
    param1.add(43);
    param1.add(52);
    param1.add(79);
    param1.add(2);
    param1.add(11);
    param1.add(15);
    param1.add(4);
    param1.add(93);
    param1.add(25);
    param1.add(39);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
