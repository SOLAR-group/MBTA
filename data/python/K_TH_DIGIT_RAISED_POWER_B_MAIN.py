if __name__ == '__main__':
    param = [
    (11,2,1),
    (41,3,3),
    (5,4,3),
    (1,2,4),
    (24,1,5),
    (5,2,3),
    (66,5,8),
    (7,10,3),
    (77,30,10),
    (60,50,1)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("K_TH_DIGIT_RAISED_POWER_B," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("K_TH_DIGIT_RAISED_POWER_B," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
