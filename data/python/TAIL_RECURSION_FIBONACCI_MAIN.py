if __name__ == '__main__':
    param = [
    (4,43,24,),
    (60,48,98,),
    (92,21,69,),
    (73,79,38,),
    (58,38,30,),
    (82,26,12,),
    (53,10,17,),
    (57,37,26,),
    (47,91,99,),
    (83,3,64,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TAIL_RECURSION_FIBONACCI," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TAIL_RECURSION_FIBONACCI," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
