import sys

def f_gold ( n ) :
    res , i = 1 , 0
    for i in range ( 2 , n + 1 ) :
        res *= i
    return res

if __name__ == '__main__':
    param = [
    (15,),
    (7,),
    (16,),
    (67,),
    (71,),
    (16,),
    (77,),
    (27,),
    (37,),
    (73,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
