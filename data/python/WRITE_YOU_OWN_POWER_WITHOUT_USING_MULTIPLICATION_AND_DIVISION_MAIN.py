if __name__ == '__main__':
    param = [
    (66,4,),
    (82,66,),
    (12,38,),
    (55,33,),
    (34,26,),
    (22,23,),
    (13,98,),
    (57,84,),
    (76,94,),
    (76,95,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
