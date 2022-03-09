import sys

def f_gold ( a ) :
    area = float ( sqrt ( 5 * ( 5 + 2 * ( sqrt ( 5 ) ) ) ) ) * a ** 2 / 4
    return area

if __name__ == '__main__':
    param = [
    (2009.019461888707,),
    (-1480.5131394215787,),
    (357.7870347569567,),
    (-8040.293697508038,),
    (3821.882657293133,),
    (-6840.635072240347,),
    (1623.036598830132,),
    (-9714.00706195298,),
    (3916.454769669618,),
    (-669.068424712943,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
