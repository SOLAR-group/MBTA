if __name__ == '__main__':
    param = [
    (40,),
    (10,),
    (46,),
    (54,),
    (1,),
    (67,),
    (64,),
    (10,),
    (75,),
    (11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
