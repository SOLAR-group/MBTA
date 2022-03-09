import sys

def f_gold ( n ) :
    bell = np.zeros ( ( n + 1 , n + 1 ) )
    bell [ 0 , 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        bell [ i , 0 ] = bell [ i - 1 , i - 1 ]
        for j in range ( 1 , i + 1 ) :
            bell [ i , j ] = bell [ i - 1 , j - 1 ] + bell [ i , j - 1 ]
    return bell [ n , 0 ]

if __name__ == '__main__':
    param = [
    (84,),
    (78,),
    (9,),
    (73,),
    (4,),
    (53,),
    (85,),
    (38,),
    (39,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
