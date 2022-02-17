====================
def f_gold ( n ) :
    multiTerms = n * ( n + 1 ) // 2
    sum = multiTerms
    for i in range ( 2 , n + 1 ) :
        multiTerms = multiTerms - ( i - 1 )
        sum = sum + multiTerms * i
    return sum

