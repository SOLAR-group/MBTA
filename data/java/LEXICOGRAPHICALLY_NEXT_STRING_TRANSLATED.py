====================
def f_gold ( str ) :
    if str == "" :
        return "a"
    i = len ( str ) - 1
    while str [ i ] == "z" and i >= 0 :
        i -= 1
    if i == - 1 :
        str = str + 'a'
    else :
        str = str [ : i ] + chr ( ord ( str [ i ] ) + 1 ) + str [ i + 1 : ]
    return str

