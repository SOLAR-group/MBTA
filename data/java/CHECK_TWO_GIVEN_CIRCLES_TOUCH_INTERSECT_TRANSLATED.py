import sys

def f_gold ( x1 , y1 , x2 , y2 , r1 , r2 ) :
    distSq = ( x1 - x2 ) ** 2 + ( y1 - y2 ) ** 2
    radSumSq = ( r1 + r2 ) ** 2
    if distSq == radSumSq :
        return 1
    elif distSq > radSumSq :
        return - 1
    else :
        return 0

if __name__ == '__main__':
    param = [
        (11, 36, 62, 64, 50, 4,),
        (87, 1, 62, 64, 54, 41,),
        (51, 1, 47, 90, 14, 71,),
        (89, 67, 9, 52, 94, 21,),
        (64, 10, 79, 45, 67, 78,),
        (57, 86, 99, 43, 83, 63,),
        (65, 90, 42, 82, 77, 32,),
        (32, 23, 28, 26, 60, 45,),
        (73, 61, 63, 77, 92, 76,),
        (3, 99, 6, 19, 21, 28,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
