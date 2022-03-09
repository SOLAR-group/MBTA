import sys

def f_gold ( n ) :
    res = 1
    while n % 2 == 0 :
        n = n / 2
    for i in range ( 3 , math.sqrt ( n ) ) :
        count , curr_sum = 0 , 1
        curr_term = 1
        while n % i == 0 :
            count += 1
            n = n / i
            curr_term *= i
            curr_sum += curr_term
        res *= curr_sum
    if n >= 2 :
        res *= ( 1 + n )
    return res

if __name__ == '__main__':
    param = [
    (20,),
    (6,),
    (39,),
    (80,),
    (88,),
    (7,),
    (16,),
    (27,),
    (83,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
