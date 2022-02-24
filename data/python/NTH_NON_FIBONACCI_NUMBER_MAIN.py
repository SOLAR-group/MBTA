if __name__ == '__main__':
    param = [
    (76,),
    (91,),
    (62,),
    (65,),
    (83,),
    (57,),
    (76,),
    (6,),
    (2,),
    (86,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
