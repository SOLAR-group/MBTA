import sys

def f_gold ( side ) :
    volume = ( pow ( side , 3 ) / ( 6 * sqrt ( 2 ) ) )
    return volume

if __name__ == '__main__':
    param = [
    (58,),
    (56,),
    (35,),
    (99,),
    (13,),
    (45,),
    (40,),
    (92,),
    (7,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
