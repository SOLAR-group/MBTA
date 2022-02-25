if __name__ == '__main__':
    param = [
    (75,),
    (50,),
    (93,),
    (87,),
    (35,),
    (25,),
    (43,),
    (61,),
    (54,),
    (91,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
