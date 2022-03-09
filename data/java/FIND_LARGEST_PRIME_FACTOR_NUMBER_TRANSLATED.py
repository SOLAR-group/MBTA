import sys

def f_gold ( n ) :
    max_prime = - 1
    while n % 2 == 0 :
        max_prime = 2
        n >>= 1
    for i in range ( 3 , math.sqrt ( n ) , 2 ) :
        while n % i == 0 :
            max_prime = i
            n = n / i
    if n > 2 :
        max_prime = n
    return max_prime

if __name__ == '__main__':
    param = [
    (98,),
    (8,),
    (78,),
    (65,),
    (55,),
    (10,),
    (10,),
    (37,),
    (39,),
    (15,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
