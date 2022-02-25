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
public class CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES{
static boolean f_gold ( String str1 , String str2 ) {
  if ( str1 . length ( ) != str2 . length ( ) ) return false ;
  String clock_rot = "" ;
  String anticlock_rot = "" ;
  int len = str2 . length ( ) ;
  anticlock_rot = anticlock_rot + str2 . substring ( len - 2 , len ) + str2 . substring ( 0 , len - 2 ) ;
  clock_rot = clock_rot + str2 . substring ( 2 ) + str2 . substring ( 0 , 2 ) ;
  return ( str1 . equals ( clock_rot ) || str1 . equals ( anticlock_rot ) ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("amazon");
    param0.add("onamaz");
    param0.add("amazon");
    param0.add("ab");
    param0.add("737009");
    param0.add("000110");
    param0.add("l");
    param0.add("4420318628");
    param0.add("11011111000000");
    param0.add(" pvFHANc");
    List<String> param1 = new ArrayList<>();
    param1.add("azonam");
    param1.add("amazon");
    param1.add("azoman");
    param1.add("ab");
    param1.add("239119");
    param1.add("01111");
    param1.add("YVo hqvnGxow");
    param1.add("52856");
    param1.add("10");
    param1.add("xBIDFbiGb");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
