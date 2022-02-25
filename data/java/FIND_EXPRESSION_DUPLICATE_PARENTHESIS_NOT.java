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
public class FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT{
static boolean f_gold ( String s ) {
  Stack < Character > Stack = new Stack < > ( ) ;
  char [ ] str = s . toCharArray ( ) ;
  for ( char ch : str ) {
    if ( ch == ')' ) {
      char top = Stack . peek ( ) ;
      Stack . pop ( ) ;
      int elementsInside = 0 ;
      while ( top != '(' ) {
        elementsInside ++ ;
        top = Stack . peek ( ) ;
        Stack . pop ( ) ;
      }
      if ( elementsInside < 1 ) {
        return true ;
      }
    }
    else {
      Stack . push ( ch ) ;
    }
  }
  return false ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("((a+b)+((c+d)))");
    param0.add("(((a+(b)))+(c+d))");
    param0.add("(((a+(b))+c+d))");
    param0.add("((a+b)+(c+d))");
    param0.add("(8582007)");
    param0.add("((a+(b))+(c+d))");
    param0.add("(PylsShEdKAE)");
    param0.add("886980680541");
    param0.add("001");
    param0.add("jsVmFeOq");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
