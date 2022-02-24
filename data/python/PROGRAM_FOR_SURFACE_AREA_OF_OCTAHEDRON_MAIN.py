if __name__ == '__main__':
    param = [
    (1449.255716877097,),
    (-8772.104874265995,),
    (2948.419328234334,),
    (-1184.220109553511,),
    (7422.825800698956,),
    (-5808.280006171851,),
    (829.8963781665169,),
    (-7368.438572511732,),
    (5572.033890611617,),
    (-3998.9441642787706,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FOR_SURFACE_AREA_OF_OCTAHEDRON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FOR_SURFACE_AREA_OF_OCTAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
