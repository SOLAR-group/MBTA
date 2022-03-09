import sys

def f_gold ( num ) :
    if num < 0 :
        return False
    sum = 0
    for n in range ( 1 , num + 1 ) :
        sum = sum + n
        if sum == num :
            return True
    return False

if __name__ == '__main__':
    param = [
    (97,),
    (97,),
    (32,),
    (40,),
    (18,),
    (14,),
    (90,),
    (39,),
    (1,),
    (57,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TRIANGULAR_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TRIANGULAR_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
