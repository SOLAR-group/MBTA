import sys

def f_gold ( N ) :
    B_Number = 0
    cnt = 0
    while N != 0 :
        rem = N % 2
        c = pow ( 10 , cnt )
        B_Number += rem * c
        N /= 2
        cnt += 1
    return B_Number

if __name__ == '__main__':
    param = [
    (18,),
    (92,),
    (87,),
    (50,),
    (56,),
    (88,),
    (3,),
    (16,),
    (45,),
    (58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
