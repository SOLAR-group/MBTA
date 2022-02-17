====================
def MINIMUM_NUMBER_PLATFORMS_REQUIRED_RAILWAYBUS_STATION ( arr , dep , n ) :
    arr = np.array ( arr )
    dep = np.array ( dep )
    plat_needed , result = 1 , 1
    i , j = 1 , 0
    while i < n and j < n :
        if arr [ i ] <= dep [ j ] :
            plat_needed += 1
            i += 1
            if plat_needed > result :
                result = plat_needed
        else :
            plat_needed -= 1
            j += 1
    return result

