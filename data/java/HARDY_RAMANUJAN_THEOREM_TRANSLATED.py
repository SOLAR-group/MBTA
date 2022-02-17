====================
def f_gold ( n ) :
    count = 0
    if n % 2 == 0 :
        count += 1
        while n % 2 == 0 :
            n = n // 2
    for i in range ( 3 , math.sqrt ( n ) , 2 ) :
        if n % i == 0 :
            count += 1
            while n % i == 0 :
                n = n // i
    if n > 2 :
        count += 1
    return count

