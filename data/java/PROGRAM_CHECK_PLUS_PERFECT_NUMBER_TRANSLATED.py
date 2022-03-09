import sys

def f_gold ( x ) :
    temp = x
    n = 0
    while x != 0 :
        x /= 10
        n += 1
    x = temp
    sum = 0
    while x != 0 :
        sum += pow ( x % 10 , n )
        x /= 10
    return ( sum , temp )

if __name__ == '__main__':
    param = [
    (371,),
    (9474,),
    (85,),
    (35,),
    (54,),
    (17,),
    (97,),
    (63,),
    (12,),
    (43,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
