import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , row , column ) :
    print ( "Diagonal one : " , end = "" )
    for i in range ( 0 , row ) :
        for j in range ( 0 , column ) :
            if ( i == j ) :
                print ( "{} ".format ( mat [ i ] [ j ] * mat [ i ] [ j ] ) , end = "" )
    print ( " \n\nDiagonal two : " , end = "" )
    for i in range ( 0 , row ) :
        for j in range ( 0 , column ) :
            if ( i + j == column - 1 ) :
                print ( "{} ".format ( mat [ i ] [ j ] * mat [ i ] [ j ] ) , end = "" )


#TOFILL
