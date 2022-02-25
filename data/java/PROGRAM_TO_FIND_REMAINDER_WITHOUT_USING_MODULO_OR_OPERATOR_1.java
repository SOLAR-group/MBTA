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
public class PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1{
static int f_gold ( int num , int divisor ) {
  if ( divisor == 0 ) {
    System . out . println ( "Error: divisor " + "can't be zero \n" ) ;
    return - 1 ;
  }
  if ( divisor < 0 ) divisor = - divisor ;
  if ( num < 0 ) num = - num ;
  int i = 1 ;
  int product = 0 ;
  while ( product <= num ) {
    product = divisor * i ;
    i ++ ;
  }
  return num - ( product - divisor ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(63);
    param0.add(15);
    param0.add(56);
    param0.add(63);
    param0.add(28);
    param0.add(54);
    param0.add(2);
    param0.add(94);
    param0.add(82);
    List<Integer> param1 = new ArrayList<>();
    param1.add(55);
    param1.add(22);
    param1.add(26);
    param1.add(58);
    param1.add(94);
    param1.add(45);
    param1.add(97);
    param1.add(58);
    param1.add(91);
    param1.add(40);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
