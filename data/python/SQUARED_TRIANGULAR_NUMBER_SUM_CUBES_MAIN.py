if __name__ == '__main__':
    param = [
    (15,),
    (36,),
    (39,),
    (43,),
    (75,),
    (49,),
    (56,),
    (14,),
    (62,),
    (97,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
