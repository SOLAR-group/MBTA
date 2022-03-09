import sys

def f_gold ( diameter , height ) :
    return 2 * ( diameter + height )

if __name__ == '__main__':
    param = [
    (70,78,),
    (97,46,),
    (49,26,),
    (56,61,),
    (87,79,),
    (64,21,),
    (75,93,),
    (90,16,),
    (55,16,),
    (73,29,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_PERIMETER_CYLINDER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_PERIMETER_CYLINDER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
