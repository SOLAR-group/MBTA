if __name__ == '__main__':
    param = [
    (23,98,25,),
    (87,55,94,),
    (35,90,29,),
    (25,9,41,),
    (93,22,39,),
    (52,42,96,),
    (95,88,26,),
    (91,64,51,),
    (75,1,6,),
    (96,44,76,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
