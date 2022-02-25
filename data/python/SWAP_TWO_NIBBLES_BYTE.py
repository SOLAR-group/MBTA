import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    return ( ( x & 0x0F ) << 4 | ( x & 0xF0 ) >> 4 )


#TOFILL
if __name__ == '__main__':
    param = [
    (57,),
    (99,),
    (66,),
    (97,),
    (95,),
    (42,),
    (95,),
    (89,),
    (3,),
    (84,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
