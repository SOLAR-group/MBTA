# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( rows , columns , numbers ) :
    k = 0
    arr = [ [ 0 for i in range ( columns ) ] for j in range ( rows ) ]
    for i in range ( rows ) :
        if ( i % 2 == 0 ) :
            j = 0
            while j < columns and numbers [ k ] > 0 :
                arr [ i ] [ j ] = k + 1
                numbers [ k ] -= 1
                if numbers [ k ] == 0 :
                    k += 1
                j += 1
        else :
            j = columns - 1
            while j >= 0 and numbers [ k ] > 0 :
                arr [ i ] [ j ] = k + 1
                numbers [ k ] -= 1
                if numbers [ k ] == 0 :
                    k += 1
                j -= 1
    for i in arr :
        for j in i :
            print ( j , end = " " )
        print ( )


#TOFILL
