# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( no ) :
    return 0 if no == 0 else int ( no % 10 ) + f_gold ( int ( no / 10 ) )


#TOFILL
