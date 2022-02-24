if __name__ == '__main__':
    param = [
    (7,),
    (47,),
    (72,),
    (66,),
    (71,),
    (56,),
    (61,),
    (68,),
    (78,),
    (22,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
