import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( symb , oper , n ) :
    F = [ [ 0 for i in range ( n + 1 ) ] for i in range ( n + 1 ) ]
    T = [ [ 0 for i in range ( n + 1 ) ] for i in range ( n + 1 ) ]
    for i in range ( n ) :
        if symb [ i ] == 'F' :
            F [ i ] [ i ] = 1
        else :
            F [ i ] [ i ] = 0
        if symb [ i ] == 'T' :
            T [ i ] [ i ] = 1
        else :
            T [ i ] [ i ] = 0
    for gap in range ( 1 , n ) :
        i = 0
        for j in range ( gap , n ) :
            T [ i ] [ j ] = F [ i ] [ j ] = 0
            for g in range ( gap ) :
                k = i + g
                tik = T [ i ] [ k ] + F [ i ] [ k ] ;
                tkj = T [ k + 1 ] [ j ] + F [ k + 1 ] [ j ] ;
                if oper [ k ] == '&' :
                    T [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ]
                    F [ i ] [ j ] += ( tik * tkj - T [ i ] [ k ] * T [ k + 1 ] [ j ] )
                if oper [ k ] == '|' :
                    F [ i ] [ j ] += F [ i ] [ k ] * F [ k + 1 ] [ j ]
                    T [ i ] [ j ] += ( tik * tkj - F [ i ] [ k ] * F [ k + 1 ] [ j ] )
                if oper [ k ] == '^' :
                    T [ i ] [ j ] += ( F [ i ] [ k ] * T [ k + 1 ] [ j ] + T [ i ] [ k ] * F [ k + 1 ] [ j ] )
                    F [ i ] [ j ] += ( T [ i ] [ k ] * T [ k + 1 ] [ j ] + F [ i ] [ k ] * F [ k + 1 ] [ j ] )
            i += 1
    return T [ 0 ] [ n - 1 ]


#TOFILL
if __name__ == '__main__':
    param = [
    ("TTFT", "|&^",4,),
    ("TFT", "^&",3,),
    ("TFF", "^|",3,),
    ("TTFT", "|||",4,),
    ("TTFT", "&&&",4,),
    ("TTFT", "&&^",4,),
    ("TTFT", "^&|",4,),
    ("TTFT", "^^^",4,),
    ("TTFT", "^||",4,),
    ("TTFT", "|^|",4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
