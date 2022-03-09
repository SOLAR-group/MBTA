import sys

def f_gold ( x ) :
    if x == 0 or x == 1 :
        return x
    i , result = 1 , 1
    while result <= x :
        i += 1
        result = i * i
    return i - 1

if __name__ == '__main__':
    param = [
    (89,),
    (11,),
    (14,),
    (92,),
    (76,),
    (63,),
    (51,),
    (16,),
    (83,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARE_ROOT_OF_AN_INTEGER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARE_ROOT_OF_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
