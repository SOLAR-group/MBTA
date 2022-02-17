====================
def py2exe_copy_string ( s1 , s2 , index ) :
    s2 = s2.replace ( '\\' , '\\\\' )
    if index == len ( s1 ) - 1 :
        return s1
    return s1 [ index ]

