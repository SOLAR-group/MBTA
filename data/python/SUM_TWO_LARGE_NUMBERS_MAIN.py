if __name__ == '__main__':
    param = [
        ('VkfzrPG', 'rKZ',),
        ('0526110506447', '903',),
        ('011010010', '110100000',),
        ('sPAwZACc ', 'liYMsojPiinOV',),
        ('3', '611',),
        ('0101', '01110101011',),
        ('VTtNu', 'Wsmc',),
        ('2317170', '898421173423',),
        ('111111000010', '01100001110111',),
        ('Ktt', 'CTbbVX wGBkE',)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_TWO_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_TWO_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
