if __name__ == '__main__':
    param = [
    (67,),
    (90,),
    (55,),
    (90,),
    (83,),
    (32,),
    (58,),
    (38,),
    (87,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
