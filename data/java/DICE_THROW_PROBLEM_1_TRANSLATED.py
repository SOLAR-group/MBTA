import sys

def f_gold ( f , d , s ) :
    mem = np.zeros ( ( d + 1 , s + 1 ) )
    mem [ 0 , 0 ] = 1
    for i in range ( 1 , d + 1 ) :
        for j in range ( i , s + 1 ) :
            mem [ i , j ] = mem [ i , j - 1 ] + mem [ i - 1 , j - 1 ]
            if j - f - 1 >= 0 :
                mem [ i , j ] -= mem [ i - 1 , j - f - 1 ]
    return mem

if __name__ == '__main__':
    param = [
    (57,5,33,),
    (58,45,4,),
    (38,89,9,),
    (5,39,30,),
    (91,90,47,),
    (76,56,46,),
    (38,43,84,),
    (97,26,52,),
    (97,90,90,),
    (99,2,26,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DICE_THROW_PROBLEM_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DICE_THROW_PROBLEM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
