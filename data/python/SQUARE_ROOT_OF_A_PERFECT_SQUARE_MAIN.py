if __name__ == '__main__':
    param = [
    (1763.655093333857,),
    (-3544.737136289062,),
    (7893.209433000695,),
    (-3008.0331952533734,),
    (6155.190186637041,),
    (-5799.751467314729,),
    (8234.151546380555,),
    (-1829.5367705266551,),
    (5778.227173218819,),
    (-7785.473710863676,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARE_ROOT_OF_A_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARE_ROOT_OF_A_PERFECT_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
