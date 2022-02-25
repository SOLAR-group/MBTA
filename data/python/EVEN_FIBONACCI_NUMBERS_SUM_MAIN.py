if __name__ == '__main__':
    param = [
    (67,),
    (89,),
    (12,),
    (94,),
    (96,),
    (25,),
    (49,),
    (8,),
    (33,),
    (59,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
