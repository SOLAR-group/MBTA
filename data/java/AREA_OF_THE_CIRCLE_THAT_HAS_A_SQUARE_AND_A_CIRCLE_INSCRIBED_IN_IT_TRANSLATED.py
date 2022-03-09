import sys

def f_gold ( a ) :
    area = float ( pi * a ** 2 ) / 4
    return area

if __name__ == '__main__':
    param = [
    (77,),
    (18,),
    (83,),
    (39,),
    (68,),
    (28,),
    (71,),
    (14,),
    (21,),
    (73,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("AREA_OF_THE_CIRCLE_THAT_HAS_A_SQUARE_AND_A_CIRCLE_INSCRIBED_IN_IT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("AREA_OF_THE_CIRCLE_THAT_HAS_A_SQUARE_AND_A_CIRCLE_INSCRIBED_IN_IT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
