====================
def break_number_three_pandas ( n ) :
    count = 0
    for i in range ( 0 , n ) :
        for j in range ( 0 , n ) :
            for k in range ( 0 , n ) :
                if i + j + k == n :
                    count += 1
        return count

