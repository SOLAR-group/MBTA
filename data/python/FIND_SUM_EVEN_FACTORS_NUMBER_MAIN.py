if __name__ == '__main__':
    param = [
    (71,),
    (78,),
    (39,),
    (36,),
    (49,),
    (17,),
    (53,),
    (66,),
    (92,),
    (71,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_EVEN_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_EVEN_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
