if __name__ == '__main__':
    param = [
    (54,59,),
    (39,84,),
    (35,81,),
    (9,60,),
    (62,68,),
    (16,16,),
    (93,96,),
    (32,38,),
    (39,62,),
    (63,16,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPUTE_MODULUS_DIVISION_BY_A_POWER_OF_2_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPUTE_MODULUS_DIVISION_BY_A_POWER_OF_2_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
