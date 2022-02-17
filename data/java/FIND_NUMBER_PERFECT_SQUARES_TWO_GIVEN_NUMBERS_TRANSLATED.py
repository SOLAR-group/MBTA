====================
def find_number_perfECT_SQUARES_TWO_GIVEN_NUMBERS ( a , b ) :
    cnt = 0
    for i in range ( a , b + 1 ) :
        for j in range ( 1 , j * j + 1 ) :
            if j * j == i :
                cnt += 1
        return cnt

