if __name__ == '__main__':
    param = [
    (67,),
    (2,),
    (58,),
    (6,),
    (42,),
    (17,),
    (37,),
    (44,),
    (23,),
    (40,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
