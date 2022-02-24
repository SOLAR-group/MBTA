import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
from queue import Queue

def f_gold ( ip , op , n ) :
    Input = Queue ( )
    for i in range ( n ) :
        Input.put ( ip [ i ] )
    output = Queue ( )
    for i in range ( n ) :
        output.put ( op [ i ] )
    tempStack = [ ]
    while ( not Input.empty ( ) ) :
        ele = Input.queue [ 0 ]
        Input.get ( )
        if ( ele == output.queue [ 0 ] ) :
            output.get ( )
            while ( len ( tempStack ) != 0 ) :
                if ( tempStack [ - 1 ] == output.queue [ 0 ] ) :
                    tempStack.pop ( )
                    output.get ( )
                else :
                    break
        else :
            tempStack.append ( ele )
    return ( Input.empty ( ) and len ( tempStack ) == 0 )


#TOFILL
