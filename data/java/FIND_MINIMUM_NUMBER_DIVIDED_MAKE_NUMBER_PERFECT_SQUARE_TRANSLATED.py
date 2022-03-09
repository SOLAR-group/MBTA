import sys

def f_gold ( n ) :
    count , ans = 0 , 1
    while n % 2 == 0 :
        count += 1
        n /= 2
    if count % 2 == 1 :
        ans *= 2
    for i in range ( 3 , math.sqrt ( n ) , 2 ) :
        count = 0
        while n % i == 0 :
            count += 1
            n /= i
        if count % 2 == 1 :
            ans *= i
    if n > 2 :
        ans *= n
    return ans

if __name__ == '__main__':
    param = [
    (95,),
    (48,),
    (3,),
    (10,),
    (82,),
    (1,),
    (77,),
    (99,),
    (23,),
    (61,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
