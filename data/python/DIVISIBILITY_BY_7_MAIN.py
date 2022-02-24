if __name__ == '__main__':
    param = [
    (0,),
    (-21,),
    (7,),
    (63,),
    (84,),
    (73,),
    (81,),
    (-10,),
    (47,),
    (23,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
