import sys

def f_gold ( n ) :
    der = [ 1 , 0 , 1 , 1 ]
    for i in range ( 3 , n + 1 ) :
        der [ i ] = ( i - 1 ) * ( der [ i - 1 ] + der [ i - 2 ] )
    return der

if __name__ == '__main__':
    param = [
    (22,),
    (91,),
    (33,),
    (93,),
    (90,),
    (59,),
    (88,),
    (41,),
    (70,),
    (63,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DERANGEMENTS_PERMUTATION_SUCH_THAT_NO_ELEMENT_APPEARS_IN_ITS_ORIGINAL_POSITION_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DERANGEMENTS_PERMUTATION_SUCH_THAT_NO_ELEMENT_APPEARS_IN_ITS_ORIGINAL_POSITION_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
