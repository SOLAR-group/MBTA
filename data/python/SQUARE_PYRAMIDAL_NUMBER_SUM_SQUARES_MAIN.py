if __name__ == '__main__':
    param = [
    (1,),
    (5,),
    (14,),
    (140,),
    (204,),
    (3,),
    (506,),
    (42,),
    (4,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
