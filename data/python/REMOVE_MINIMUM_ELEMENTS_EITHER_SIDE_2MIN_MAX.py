# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n ) :
    longest_start = - 1 ;
    longest_end = 0 ;
    for start in range ( n ) :
        min = sys.maxsize ;
        max = - sys.maxsize ;
        for end in range ( start , n ) :
            val = arr [ end ] ;
            if ( val < min ) :
                min = val ;
            if ( val > max ) :
                max = val ;
            if ( 2 * min <= max ) :
                break ;
            if ( end - start > longest_end - longest_start or longest_start == - 1 ) :
                longest_start = start ;
                longest_end = end ;
    if ( longest_start == - 1 ) :
        return n ;
    return ( n - ( longest_end - longest_start + 1 ) ) ;


#TOFILL
