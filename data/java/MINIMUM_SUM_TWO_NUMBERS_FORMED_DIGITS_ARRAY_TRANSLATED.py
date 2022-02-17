====================
def f_gold ( arr , n ) :
    arr = np.asarray ( arr )
    a , b = 0 , 0
    for i in range ( n ) :
        if i % 2 != 0 :
            a = a * 10 + arr [ i ]
        else :
            b = b * 10 + arr [ i ]
    return a , b

