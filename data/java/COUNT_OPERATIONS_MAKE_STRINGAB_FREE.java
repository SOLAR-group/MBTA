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
public class COUNT_OPERATIONS_MAKE_STRINGAB_FREE{
static int f_gold ( char [ ] s ) {
  int b_count = 0 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( s [ s . length - i - 1 ] == 'a' ) {
      res = ( res + b_count ) ;
      b_count = ( b_count * 2 ) ;
    }
    else {
      b_count += 1 ;
    }
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<char [ ]> param0 = new ArrayList<>();
    param0.add(new char[]{'L','k','y'});
    param0.add(new char[]{'1','0','9','5','7','4','6','0','4','8','0','1','4','1','8','9','1','5','4','4','8','0','5','8','9','8','1','9','7','0','4','2','5','2','4','6','6','5','3','1','1','0','6'});
    param0.add(new char[]{'0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'A','L','a','l','G',' ','p','b'});
    param0.add(new char[]{'0','1','1','1','2','2','4','5','5','5','6','6','6','7','9'});
    param0.add(new char[]{'0'});
    param0.add(new char[]{' ','A','B','B','B','B','D','G','G','H','H','H','I','I','J','J','J','L','M','N','O','Q','U','U','X','Y','Y','Z','Z','c','c','e','f','h','k','o','p','q','q','s','v','z'});
    param0.add(new char[]{'2','5','7','5','2','3','9'});
    param0.add(new char[]{'0','0','0','0','0','0','1','1','1','1','1','1','1','1','1'});
    param0.add(new char[]{'a','z','M',' ','l','X','x','B','i','j'});
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_OPERATIONS_MAKE_STRINGAB_FREE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_OPERATIONS_MAKE_STRINGAB_FREE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
