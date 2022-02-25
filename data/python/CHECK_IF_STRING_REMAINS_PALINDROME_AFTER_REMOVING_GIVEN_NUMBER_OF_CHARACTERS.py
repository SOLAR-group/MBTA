import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str , n ) :
    l = len ( str )
    if ( l >= n ) :
        return True
    return False


#TOFILL
if __name__ == '__main__':
    param = [
    ('ZCoQhuM',2,),
    ('7437725',53,),
    ('11',30,),
    ('buGlvR',1,),
    ('9',92,),
    ('101101010110',3,),
    ('YguiM',18,),
    ('8198',90,),
    ('11101',71,),
    ('hUInqJXNdbfP',4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_IF_STRING_REMAINS_PALINDROME_AFTER_REMOVING_GIVEN_NUMBER_OF_CHARACTERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_IF_STRING_REMAINS_PALINDROME_AFTER_REMOVING_GIVEN_NUMBER_OF_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
