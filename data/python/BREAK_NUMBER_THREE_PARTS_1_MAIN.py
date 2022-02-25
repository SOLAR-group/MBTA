if __name__ == '__main__':
    param = [
    (71,),
    (71,),
    (36,),
    (3,),
    (97,),
    (69,),
    (15,),
    (48,),
    (77,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("BREAK_NUMBER_THREE_PARTS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BREAK_NUMBER_THREE_PARTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
