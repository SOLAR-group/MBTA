import sys

def f_gold ( x , y ) :
    if x == 1 :
        return ( y == 1 )
    pow = 1
    while pow < y :
        pow = pow * x
    return ( pow == y )

if __name__ == '__main__':
    param = [
    (57,1,),
    (3,9,),
    (10,101,),
    (10,10000,),
    (6,46656,),
    (2,2048,),
    (1,40,),
    (20,79,),
    (96,98,),
    (25,5,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
