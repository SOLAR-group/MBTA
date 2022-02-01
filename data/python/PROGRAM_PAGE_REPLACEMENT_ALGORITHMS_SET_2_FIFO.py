# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
from queue import Queue

def f_gold ( pages , n , capacity ) :
    s = set ( )
    indexes = Queue ( )
    page_faults = 0
    for i in range ( n ) :
        if ( len ( s ) < capacity ) :
            if ( pages [ i ] not in s ) :
                s.add ( pages [ i ] )
                page_faults += 1
                indexes.put ( pages [ i ] )
        else :
            if ( pages [ i ] not in s ) :
                val = indexes.queue [ 0 ]
                indexes.get ( )
                s.remove ( val )
                s.add ( pages [ i ] )
                indexes.put ( pages [ i ] )
                page_faults += 1
    return page_faults


#TOFILL
