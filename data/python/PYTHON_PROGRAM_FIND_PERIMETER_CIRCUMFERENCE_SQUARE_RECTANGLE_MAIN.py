if __name__ == '__main__':
    param = [
    (98,),
    (9,),
    (18,),
    (38,),
    (84,),
    (8,),
    (39,),
    (6,),
    (60,),
    (47,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
