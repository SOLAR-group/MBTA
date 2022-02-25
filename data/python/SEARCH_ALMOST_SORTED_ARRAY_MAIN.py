if __name__ == '__main__':
    param = [
    ([6,7,15,42,47,54,56,59,59,64,68,70,71,75,91,93], 0, 15, 71),
([6,7,15,42,47,56,54,59,59,64,68,71,70, 75,91,93], 0, 15,    71),
([-92,-96,-68,-40,70], 0, 4, -96),
([-92,-86,-68,-40,70], 0, 4,    20),
([-3,-1,0,30,10,45,70,60], 0, 7,    0),
([-3,-1,0,10,5,45,60,50], 0, 7,    12),
([-3,-1,0,10,30,45,60,70], 0, 7,    18),
([0,0,1], 0, 2,    20),
([1,1,1], 0, 2,    17),
([30,2,30,45], 0, 3,    28)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SEARCH_ALMOST_SORTED_ARRAY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SEARCH_ALMOST_SORTED_ARRAY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
