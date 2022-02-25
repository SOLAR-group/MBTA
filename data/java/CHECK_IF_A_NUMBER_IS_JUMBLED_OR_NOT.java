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
public class CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT{
static boolean f_gold ( int num ) {
  if ( num / 10 == 0 ) return true ;
  while ( num != 0 ) {
    if ( num / 10 == 0 ) return true ;
    int digit1 = num % 10 ;
    int digit2 = ( num / 10 ) % 10 ;
    if ( Math . abs ( digit2 - digit1 ) > 1 ) return false ;
    num = num / 10 ;
  }
  return true ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(77);
    param0.add(35);
    param0.add(79);
    param0.add(45);
    param0.add(22);
    param0.add(68);
    param0.add(17);
    param0.add(5);
    param0.add(85);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
