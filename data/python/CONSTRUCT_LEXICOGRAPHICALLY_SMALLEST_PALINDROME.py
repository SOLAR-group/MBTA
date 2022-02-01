# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( string , l ) :
    string = list ( string )
    i = - 1
    j = l
    while i < j :
        i += 1
        j -= 1
        if ( string [ i ] == string [ j ] and string [ i ] != '*' ) :
            continue
        elif ( string [ i ] == string [ j ] and string [ i ] == '*' ) :
            string [ i ] = 'a'
            string [ j ] = 'a'
            continue
        elif string [ i ] == '*' :
            string [ i ] = string [ j ]
            continue
        elif string [ j ] == '*' :
            string [ j ] = string [ i ]
            continue
        print ( "Not Possible" )
        return ""
    return ''.join ( string )


#TOFILL
