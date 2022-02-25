if __name__ == '__main__':
    param = [
    (52,),
    (93,),
    (15,),
    (72,),
    (61,),
    (21,),
    (83,),
    (87,),
    (75,),
    (75,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
