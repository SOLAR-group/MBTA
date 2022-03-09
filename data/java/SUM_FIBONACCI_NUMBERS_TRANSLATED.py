import sys

def f_gold ( n ) :
    if n <= 0 :
        return 0
    fibo = [ 0 ] * ( n + 1 )
    sum = fibo [ 0 ] + fibo [ 1 ]
    for i in range ( 2 , n + 1 ) :
        fibo [ i ] = fibo [ i - 1 ] + fibo [ i - 2 ]
        sum += fibo [ i ]
    return sum

if __name__ == '__main__':
    param = [
    (9,),
    (50,),
    (7,),
    (21,),
    (21,),
    (91,),
    (11,),
    (25,),
    (62,),
    (4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_FIBONACCI_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_FIBONACCI_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
