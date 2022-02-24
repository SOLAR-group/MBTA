if __name__ == '__main__':
    param = [
    (57,),
    (18,),
    (97,),
    (9,),
    (42,),
    (67,),
    (71,),
    (66,),
    (69,),
    (18,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
