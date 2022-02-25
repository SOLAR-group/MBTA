import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    even_bits = x & 0xAAAAAAAA
    odd_bits = x & 0x55555555
    even_bits >>= 1
    odd_bits <<= 1
    return ( even_bits | odd_bits )


#TOFILL
if __name__ == '__main__':
    param = [
    (99,),
    (94,),
    (11,),
    (3,),
    (77,),
    (57,),
    (54,),
    (66,),
    (98,),
    (36,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
