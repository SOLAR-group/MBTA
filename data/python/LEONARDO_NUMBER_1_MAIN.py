if __name__ == '__main__':
    param = [
    (75,),
    (76,),
    (55,),
    (14,),
    (43,),
    (10,),
    (16,),
    (30,),
    (44,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LEONARDO_NUMBER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEONARDO_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
