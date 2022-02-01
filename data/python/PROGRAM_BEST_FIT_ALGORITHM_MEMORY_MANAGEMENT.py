# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( blockSize , m , processSize , n ) :
    allocation = [ - 1 ] * n
    for i in range ( n ) :
        bestIdx = - 1
        for j in range ( m ) :
            if blockSize [ j ] >= processSize [ i ] :
                if bestIdx == - 1 :
                    bestIdx = j
                elif blockSize [ bestIdx ] > blockSize [ j ] :
                    bestIdx = j
        if bestIdx != - 1 :
            allocation [ i ] = bestIdx
            blockSize [ bestIdx ] -= processSize [ i ]
    print ( "Process No.Process Size     Block no." )
    for i in range ( n ) :
        print ( i + 1 , "         " , processSize [ i ] , end = "         " )
        if allocation [ i ] != - 1 :
            print ( allocation [ i ] + 1 )
        else :
            print ( "Not Allocated" )


#TOFILL
