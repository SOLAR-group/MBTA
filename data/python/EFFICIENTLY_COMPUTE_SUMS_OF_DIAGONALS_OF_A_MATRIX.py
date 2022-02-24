import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , n ) :
    principal = 0
    secondary = 0 ;
    for i in range ( 0 , n ) :
        for j in range ( 0 , n ) :
            if ( i == j ) :
                principal += mat [ i ] [ j ]
            if ( ( i + j ) == ( n - 1 ) ) :
                secondary += mat [ i ] [ j ]
    print ( "Principal Diagonal:" , principal )
    print ( "Secondary Diagonal:" , secondary )


#TOFILL
