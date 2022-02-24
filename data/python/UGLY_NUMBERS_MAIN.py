if __name__ == '__main__':
    param = [
    (27,),
    (64,),
    (93,),
    (90,),
    (85,),
    (86,),
    (72,),
    (86,),
    (32,),
    (1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("UGLY_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("UGLY_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
