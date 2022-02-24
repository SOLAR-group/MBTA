if __name__ == '__main__':
    param = [
    (93,),
    (83,),
    (51,),
    (77,),
    (13,),
    (34,),
    (49,),
    (12,),
    (68,),
    (80,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FIND_AREA_CIRCLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FIND_AREA_CIRCLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
