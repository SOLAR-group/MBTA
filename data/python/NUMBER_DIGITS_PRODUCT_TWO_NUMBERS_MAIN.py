if __name__ == '__main__':
    param = [
        (86, 39,),
        (81, 87,),
        (48, 84,),
        (64, 80,),
        (56, 20,),
        (5, 70,),
        (25, 13,),
        (94, 83,),
        (5, 55,),
        (46, 46,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
