import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( xp , yp ) :
    xp [ 0 ] = xp [ 0 ] ^ yp [ 0 ]
    yp [ 0 ] = xp [ 0 ] ^ yp [ 0 ]
    xp [ 0 ] = xp [ 0 ] ^ yp [ 0 ]


#TOFILL
