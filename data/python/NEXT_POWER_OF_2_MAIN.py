if __name__ == '__main__':
    param = [
    (74,),
    (70,),
    (85,),
    (78,),
    (71,),
    (32,),
    (97,),
    (90,),
    (64,),
    (48,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
