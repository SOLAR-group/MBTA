# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( string ) :
    length = len ( string )
    if string [ 0 ] < 'A' or string [ 0 ] > 'Z' :
        return False
    if string [ length - 1 ] != '.' :
        return False
    prev_state = 0
    curr_state = 0
    index = 1
    while ( string [ index ] ) :
        if string [ index ] >= 'A' and string [ index ] <= 'Z' :
            curr_state = 0
        elif string [ index ] == ' ' :
            curr_state = 1
        elif string [ index ] >= 'a' and string [ index ] <= 'z' :
            curr_state = 2
        elif string [ index ] == '.' :
            curr_state = 3
        if prev_state == curr_state and curr_state != 2 :
            return False
        if prev_state == 2 and curr_state == 0 :
            return False
        if curr_state == 3 and prev_state != 1 :
            return True
        index += 1
        prev_state = curr_state
    return False


#TOFILL
