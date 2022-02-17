====================
def f_gold ( n ) :
    result = 0
    for i in range ( 0 , n ) :
        for j in range ( 0 , n - i ) :
            for k in range ( 0 , ( n - i - j ) ) :
                if i + j + k == n :
                    result += 1
    return result

