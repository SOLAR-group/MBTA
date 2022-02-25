if __name__ == '__main__':
    param = [
    (37,),
    (25,),
    (63,),
    (66,),
    (32,),
    (5,),
    (41,),
    (82,),
    (54,),
    (5,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_OCTAL_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_OCTAL_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
