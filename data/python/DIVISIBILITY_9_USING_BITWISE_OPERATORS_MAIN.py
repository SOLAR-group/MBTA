if __name__ == '__main__':
    param = [
    (96,),
    (85,),
    (54,),
    (14,),
    (47,),
    (11,),
    (49,),
    (99,),
    (28,),
    (82,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DIVISIBILITY_9_USING_BITWISE_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DIVISIBILITY_9_USING_BITWISE_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
