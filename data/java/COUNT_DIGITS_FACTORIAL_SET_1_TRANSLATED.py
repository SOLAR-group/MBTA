import sys

def f_gold ( n ) :
    if n < 0 :
        return 0
    if n <= 1 :
        return 1
    digits = 0
    for i in range ( 2 , n + 1 ) :
        digits += math.log10 ( i )
    return int ( math.floor ( digits ) ) + 1

if __name__ == '__main__':
    param = [
    (66,),
    (7,),
    (55,),
    (37,),
    (76,),
    (16,),
    (17,),
    (95,),
    (71,),
    (90,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DIGITS_FACTORIAL_SET_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DIGITS_FACTORIAL_SET_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
