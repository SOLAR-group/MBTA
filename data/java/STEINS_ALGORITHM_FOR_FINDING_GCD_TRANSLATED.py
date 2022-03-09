import sys

def f_gold ( a , b ) :
    if a == 0 :
        return b
    if b == 0 :
        return a
    k = 0
    for ( k , c ) in steins_algorithms :
        a >>= 1
        b >>= 1
    while ( a & 1 ) == 0 :
        a >>= 1
    do :
        while ( b & 1 ) == 0 :
            b >>= 1
        if a > b :
            temp = a
            a , b = b , temp
        b = ( b - a )
    while b != 0 :
        return a << k

if __name__ == '__main__':
    param = [
    (37,93,),
    (58,13,),
    (89,27,),
    (75,14,),
    (59,47,),
    (84,39,),
    (47,76,),
    (37,75,),
    (83,62,),
    (28,58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
