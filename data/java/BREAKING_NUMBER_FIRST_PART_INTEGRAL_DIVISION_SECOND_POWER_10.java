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
public class BREAKING_NUMBER_FIRST_PART_INTEGRAL_DIVISION_SECOND_POWER_10{
static int f_gold ( String N ) {
  int len = N . length ( ) ;
  int l = ( len ) / 2 ;
  int count = 0 ;
  for ( int i = 1 ;
  i <= l ;
  i ++ ) {
    String s = N . substring ( 0 , i ) ;
    int l1 = s . length ( ) ;
    String t = N . substring ( i , l1 + i ) ;
    if ( s . charAt ( 0 ) == '0' || t . charAt ( 0 ) == '0' ) continue ;
    if ( s . compareTo ( t ) == 0 ) count ++ ;
  }
  return count ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ZCoQhuM");
    param0.add("2674377254");
    param0.add("11");
    param0.add("LbuGlvRyWAPBpo");
    param0.add("26382426486138");
    param0.add("111010111010");
    param0.add("hUInqJXNdbfP");
    param0.add("5191");
    param0.add("1110101101");
    param0.add("2202200");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("BREAKING_NUMBER_FIRST_PART_INTEGRAL_DIVISION_SECOND_POWER_10," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("BREAKING_NUMBER_FIRST_PART_INTEGRAL_DIVISION_SECOND_POWER_10," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
