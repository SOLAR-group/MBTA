if __name__ == '__main__':
    param = [
    (98,),
    (8,),
    (78,),
    (65,),
    (55,),
    (10,),
    (10,),
    (37,),
    (39,),
    (15,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_LARGEST_PRIME_FACTOR_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
