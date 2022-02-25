if __name__ == '__main__':
    param = [
    (69,),
    (72,),
    (88,),
    (7,),
    (66,),
    (34,),
    (23,),
    (37,),
    (33,),
    (21,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
