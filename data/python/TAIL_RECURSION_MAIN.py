if __name__ == '__main__':
    param = [
    (77,),
    (62,),
    (42,),
    (16,),
    (82,),
    (37,),
    (29,),
    (32,),
    (82,),
    (91,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
