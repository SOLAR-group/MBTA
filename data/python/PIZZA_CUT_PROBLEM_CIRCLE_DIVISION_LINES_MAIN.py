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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
