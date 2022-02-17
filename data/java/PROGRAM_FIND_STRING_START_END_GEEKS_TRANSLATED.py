====================
def program_find_string_start_end_geeks ( str , corner ) :
    n = len ( str )
    cl = len ( corner )
    if n < cl :
        return False
    return ( str [ : cl ] == corner and str [ n - cl : n ] == corner )

