if __name__ == '__main__':
    param = [
    (27,7,),
    (77,34,),
    (35,22,),
    (26,20,),
    (6,10,),
    (66,47,),
    (44,29,),
    (26,33,),
    (74,86,),
    (65,97,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("EULERIAN_NUMBER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EULERIAN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
