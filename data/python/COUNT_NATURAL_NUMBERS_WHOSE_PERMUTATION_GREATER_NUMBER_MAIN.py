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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
