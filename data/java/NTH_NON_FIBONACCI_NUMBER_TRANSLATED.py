import sys

def f_gold ( n ) :
    prev_prev , prev , curr = 1 , 2 , 3
    while n > 0 :
        prev_prev , prev , curr = prev , curr , prev_prev + prev
        n = n - ( curr - prev - 1 )
    n = n + ( curr - prev - 1 )
    return prev + n

if __name__ == '__main__':
    param = [
    (76,),
    (91,),
    (62,),
    (65,),
    (83,),
    (57,),
    (76,),
    (6,),
    (2,),
    (86,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
