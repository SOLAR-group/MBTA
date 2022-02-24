if __name__ == '__main__':
    param = [
    (2,),
    (74,),
    (46,),
    (38,),
    (51,),
    (48,),
    (6,),
    (14,),
    (31,),
    (10,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
