if __name__ == '__main__':
    param = [
    (23,),
    (41,),
    (69,),
    (56,),
    (71,),
    (38,),
    (26,),
    (52,),
    (93,),
    (44,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
