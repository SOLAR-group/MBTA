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
public class CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION{
static boolean f_gold ( int n ) {
  for ( int sum = 0 , i = 1 ;
  sum < n ;
  i += 2 ) {
    sum += i ;
    if ( sum == n ) return true ;
  }
  return false ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(4);
    param0.add(9);
    param0.add(25);
    param0.add(36);
    param0.add(3);
    param0.add(121);
    param0.add(14);
    param0.add(17);
    param0.add(80);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
