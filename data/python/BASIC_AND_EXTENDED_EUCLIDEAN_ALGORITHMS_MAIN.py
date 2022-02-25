if __name__ == '__main__':
    param = [
    (46,89,),
    (26,82,),
    (40,12,),
    (58,4,),
    (25,44,),
    (2,87,),
    (8,65,),
    (21,87,),
    (82,10,),
    (17,61,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
