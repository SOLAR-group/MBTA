if __name__ == '__main__':
    param = [
    (68,),
    (91,),
    (99,),
    (79,),
    (61,),
    (48,),
    (89,),
    (20,),
    (83,),
    (1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
