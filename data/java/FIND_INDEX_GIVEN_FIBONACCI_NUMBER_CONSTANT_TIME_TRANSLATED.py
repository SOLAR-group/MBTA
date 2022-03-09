import sys

def f_gold ( n ) :
    if n <= 1 :
        return n
    a , b , c = 0 , 1 , 1
    res = 1
    while c < n :
        c = a + b
        res += 1
        a , b , c = b , c
    return res

if __name__ == '__main__':
    param = [
    (5,),
    (19,),
    (7,),
    (94,),
    (58,),
    (65,),
    (69,),
    (96,),
    (80,),
    (14,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
