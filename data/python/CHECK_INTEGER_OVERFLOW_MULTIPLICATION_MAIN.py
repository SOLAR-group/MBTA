if __name__ == '__main__':
    param = [
    (37,80,),
    (10000000000,-10000000000,),
    (10000000000,10000000000,),
    (999999999,999999999,),
    (39,36,),
    (92,56,),
    (14,21,),
    (19,38,),
    (14,82,),
    (88,41,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
