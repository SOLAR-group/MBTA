if __name__ == '__main__':
    param = [
    (46,),
    (68,),
    (4,),
    (12,),
    (56,),
    (14,),
    (81,),
    (29,),
    (26,),
    (40,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
