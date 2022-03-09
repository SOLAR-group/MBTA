import sys

def f_gold ( num ) :
    result = 0
    for i in range ( 2 , math.sqrt ( num ) ) :
        if num % i == 0 :
            if i == ( num / i ) :
                result += i
            else :
                result += ( i + num / i )
    return ( result + 1 )

if __name__ == '__main__':
    param = [
    (2,),
    (57,),
    (28,),
    (43,),
    (38,),
    (29,),
    (45,),
    (47,),
    (44,),
    (3,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
