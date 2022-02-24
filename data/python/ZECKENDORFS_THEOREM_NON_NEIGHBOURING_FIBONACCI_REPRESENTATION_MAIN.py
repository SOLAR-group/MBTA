if __name__ == '__main__':
    param = [
    (54,),
    (71,),
    (64,),
    (71,),
    (96,),
    (43,),
    (70,),
    (94,),
    (95,),
    (69,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
