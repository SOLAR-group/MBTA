import sys

def f_gold ( n ) :
    res = 1
    for i in range ( n ) :
        res *= ( 2 ** n - i )
        res /= ( i + 1 )
    return res / ( n + 1 )

if __name__ == '__main__':
    param = [
    (72,),
    (90,),
    (61,),
    (28,),
    (70,),
    (13,),
    (7,),
    (98,),
    (99,),
    (67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DYCK_PATH," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYCK_PATH," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
