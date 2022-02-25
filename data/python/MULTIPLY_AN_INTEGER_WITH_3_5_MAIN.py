if __name__ == '__main__':
    param = [
    (58,),
    (16,),
    (82,),
    (33,),
    (88,),
    (51,),
    (81,),
    (38,),
    (79,),
    (89,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
