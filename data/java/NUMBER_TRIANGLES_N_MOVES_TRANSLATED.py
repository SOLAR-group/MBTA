import sys

def f_gold ( n ) :
    answer = [ 1 ] * n + [ 1 ] * n
    for i in range ( 1 , n + 1 ) :
        answer [ i ] = answer [ i - 1 ] * 3 + 2
    return answer

if __name__ == '__main__':
    param = [
    (33,),
    (72,),
    (81,),
    (93,),
    (8,),
    (76,),
    (97,),
    (91,),
    (61,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
