import sys

def f_gold ( n ) :
    return n * ( 2 ** n - 1 )

if __name__ == '__main__':
    param = [
    (38,),
    (44,),
    (58,),
    (10,),
    (31,),
    (53,),
    (94,),
    (64,),
    (71,),
    (59,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HEXAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HEXAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
