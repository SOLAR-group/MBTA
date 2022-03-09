import sys

def f_gold ( r ) :
    if r <= 0 :
        return 0
    result = 4
    for x in range ( 1 , r ) :
        y_square = r ** 2 - x ** 2
        y = int ( math.sqrt ( y_square ) )
        if y * y == y_square :
            result += 4
    return result

if __name__ == '__main__':
    param = [
    (34,),
    (56,),
    (90,),
    (47,),
    (36,),
    (63,),
    (21,),
    (76,),
    (18,),
    (75,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
