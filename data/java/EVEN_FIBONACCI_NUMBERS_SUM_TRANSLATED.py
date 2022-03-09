import sys

def f_gold ( limit ) :
    if limit < 2 :
        return 0
    ef1 , ef2 = 0 , 2
    sum = ef1 + ef2
    while ef2 <= limit :
        ef3 = 4 * ef2 + ef1
        if ef3 > limit :
            break
        ef1 , ef2 = ef2 , ef3
        sum += ef2
    return int ( sum )

if __name__ == '__main__':
    param = [
    (67,),
    (89,),
    (12,),
    (94,),
    (96,),
    (25,),
    (49,),
    (8,),
    (33,),
    (59,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
