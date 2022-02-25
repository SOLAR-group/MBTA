if __name__ == '__main__':
    param = [
    (94,4,69,),
    (7,12,33,),
    (20,44,24,),
    (90,94,88,),
    (50,58,27,),
    (32,90,29,),
    (46,25,6,),
    (82,50,87,),
    (43,82,70,),
    (6,83,19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DICE_THROW_PROBLEM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DICE_THROW_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
