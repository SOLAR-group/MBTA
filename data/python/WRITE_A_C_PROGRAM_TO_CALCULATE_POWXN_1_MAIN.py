if __name__ == '__main__':
    param = [
    (4922.762671782271,18,),
    (-838.1149138859112,7,),
    (8829.981827152698,18,),
    (-7084.090587314416,11,),
    (9213.145968063258,42,),
    (-4743.690018081376,63,),
    (3281.586891359318,30,),
    (-4006.1025383282854,63,),
    (7806.145296436601,52,),
    (-7219.421835366018,31,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_A_C_PROGRAM_TO_CALCULATE_POWXN_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_A_C_PROGRAM_TO_CALCULATE_POWXN_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
