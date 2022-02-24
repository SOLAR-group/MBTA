import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    i = len ( str ) - 1
    start = end = i + 1
    result = ''
    while i >= 0 :
        if str [ i ] == ' ' :
            start = i + 1
            while start != end :
                result += str [ start ]
                start += 1
            result += ' '
            end = i
        i -= 1
    start = 0
    while start != end :
        result += str [ start ]
        start += 1
    return result


#TOFILL
