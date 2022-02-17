====================
def f_gold ( str ) :
    mx = ""
    for i in range ( len ( str ) ) :
        if mx <= str [ i ] :
            mx = str [ i ]
    return mx

