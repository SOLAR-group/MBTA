if __name__ == '__main__':
    param = [
    ([[44, 54, 93], [12, 13, 78], [25, 30, 47]],1,),
    ([[-8, 60, 16, 52], [52, 4, -64, -74], [-28, -52, -80, -94], [32, 76, 38, -40]],3,),
    ([[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]],20,),
    ([[75, 8, 74, 8, 9, 79, 65, 46, 52, 13], [4, 64, 20, 34, 65, 64, 1, 46, 27, 79], [67, 74, 12, 49, 67, 62, 69, 29, 18, 97], [14, 19, 80, 82, 21, 37, 57, 58, 85, 78], [4, 52, 20, 70, 69, 77, 64, 86, 60, 3], [7, 74, 86, 36, 48, 71, 8, 32, 47, 31], [57, 9, 84, 51, 96, 53, 44, 60, 98, 31], [52, 46, 95, 87, 13, 53, 28, 37, 66, 14], [75, 24, 45, 51, 74, 88, 74, 55, 97, 3], [69, 50, 90, 51, 44, 28, 34, 64, 91, 99]],7,),
    ([[-98, -84, -80, -80, -74, -66, -52, -50, -46, -44, -40, -32, -28, -22, -16, -12, 0, 4, 14, 18, 18, 20, 28, 28, 34, 40, 46, 48, 50, 52, 66, 68, 68, 68, 70, 74, 82, 84, 84, 84, 88, 90], [-98, -86, -86, -78, -76, -66, -62, -58, -54, -50, -50, -48, -44, -34, -22, -22, -16, -14, -6, 2, 2, 2, 14, 18, 22, 22, 26, 26, 26, 34, 38, 48, 54, 54, 58, 70, 70, 70, 80, 90, 94, 98], [-94, -92, -90, -84, -74, -68, -66, -64, -64, -60, -60, -56, -52, -50, -46, -42, -30, -28, -26, -26, -24, -22, -20, -20, -16, -12, -4, -4, -4, 6, 8, 12, 24, 36, 52, 62, 74, 84, 92, 92, 94, 98], [-98, -98, -96, -88, -88, -78, -74, -70, -68, -62, -60, -58, -54, -40, -36, -34, -30, -26, -18, -6, -4, -2, -2, 0, 10, 20, 26, 32, 38, 50, 50, 60, 60, 62, 64, 66, 70, 76, 76, 82, 84, 86], [-98, -96, -94, -92, -88, -82, -72, -72, -56, -52, -48, -40, -32, -18, -16, -14, -8, -4, 4, 18, 18, 20, 22, 26, 36, 38, 42, 44, 48, 48, 52, 52, 54, 56, 60, 62, 64, 66, 66, 82, 86, 90], [-96, -94, -88, -86, -72, -70, -60, -58, -48, -46, -44, -40, -38, -36, -30, -24, -22, -20, -16, -10, -8, -8, 4, 6, 10, 12, 16, 18, 30, 34, 38, 42, 48, 48, 62, 68, 74, 80, 80, 90, 96, 96], [-98, -96, -86, -84, -80, -78, -74, -72, -70, -66, -64, -60, -58, -52, -52, -50, -50, -42, -42, -22, -20, -20, -14, -12, -12, -10, -6, 4, 4, 6, 40, 42, 60, 60, 62, 64, 82, 84, 88, 88, 96, 98], [-98, -92, -82, -82, -76, -72, -70, -56, -54, -48, -46, -40, -36, -36, -34, -32, -28, -28, -22, -16, -8, -6, -2, -2, 12, 14, 16, 16, 20, 20, 22, 22, 34, 50, 54, 62, 70, 76, 88, 90, 98, 98], [-96, -82, -76, -66, -62, -58, -48, -46, -42, -32, -32, -26, -22, -18, -14, -4, 16, 16, 18, 20, 22, 26, 30, 32, 34, 38, 46, 60, 68, 70, 70, 70, 72, 72, 74, 76, 84, 94, 94, 94, 96, 98], [-94, -86, -84, -74, -70, -60, -54, -48, -48, -48, -42, -40, -36, -34, -34, -32, -30, -26, -10, -10, -8, -6, -4, -2, 0, 4, 4, 18, 18, 26, 30, 30, 36, 44, 58, 58, 58, 62, 66, 70, 76, 94], [-98, -94, -84, -80, -78, -78, -72, -70, -68, -58, -54, -54, -38, -34, -30, -26, -12, -10, -8, -2, 4, 4, 8, 8, 12, 16, 20, 40, 44, 50, 50, 52, 64, 66, 70, 80, 82, 84, 90, 94, 96, 96], [-94, -88, -78, -76, -76, -70, -64, -62, -62, -54, -50, -34, -22, -18, -18, -16, -4, 0, 0, 2, 4, 16, 20, 24, 28, 32, 40, 42, 42, 48, 56, 56, 58, 60, 70, 76, 76, 78, 82, 86, 86, 90], [-92, -92, -88, -86, -84, -80, -80, -74, -72, -72, -70, -68, -62, -60, -58, -52, -52, -44, -42, -36, -26, -12, -12, -10, -8, -4, 4, 6, 10, 10, 38, 40, 46, 46, 64, 70, 72, 74, 76, 84, 90, 94], [-82, -76, -76, -70, -60, -60, -48, -48, -46, -44, -40, -38, -34, -24, -18, -18, -14, -12, -6, -6, -6, -4, -4, 0, 2, 6, 16, 18, 24, 30, 44, 52, 52, 58, 62, 64, 64, 64, 72, 72, 84, 86], [-80, -80, -56, -50, -50, -48, -44, -38, -34, -28, -26, -20, -20, -8, -8, -6, 0, 4, 8, 10, 10, 12, 22, 24, 36, 38, 40, 44, 46, 48, 62, 64, 66, 68, 68, 68, 72, 74, 74, 76, 88, 98], [-82, -80, -74, -72, -68, -68, -68, -56, -50, -46, -46, -44, -44, -36, -28, -26, -26, -16, -12, -10, -4, -2, 0, 6, 18, 18, 20, 24, 26, 28, 32, 32, 32, 36, 54, 62, 66, 68, 74, 78, 88, 90], [-94, -92, -86, -82, -72, -64, -62, -62, -62, -60, -60, -58, -56, -54, -52, -48, -48, -44, -32, -30, -28, -28, -22, -20, -16, -16, 12, 12, 20, 34, 36, 36, 40, 42, 44, 46, 52, 54, 74, 78, 94, 96], [-98, -82, -78, -74, -68, -68, -68, -64, -62, -58, -56, -54, -50, -48, -46, -44, -44, -38, -32, -28, -24, -16, -16, -6, -4, -2, 8, 8, 30, 38, 50, 60, 64, 72, 76, 84, 88, 88, 92, 96, 98, 98], [-98, -98, -94, -90, -90, -86, -82, -78, -74, -64, -60, -50, -48, -40, -32, -28, -26, -20, -16, -12, -10, -10, -10, -4, 8, 8, 10, 12, 20, 22, 30, 32, 34, 34, 40, 42, 46, 60, 80, 86, 88, 90], [-96, -88, -82, -76, -74, -72, -68, -68, -60, -60, -60, -54, -52, -48, -46, -40, -22, -16, -16, -6, 6, 14, 14, 26, 28, 28, 30, 34, 44, 48, 50, 54, 54, 56, 70, 76, 76, 76, 84, 84, 88, 96], [-96, -92, -88, -72, -54, -50, -46, -44, -42, -32, -32, -28, -24, -24, -14, -12, -4, 2, 2, 6, 8, 8, 16, 18, 26, 26, 28, 30, 30, 38, 38, 40, 40, 42, 46, 50, 50, 56, 58, 62, 66, 88], [-98, -90, -82, -76, -62, -48, -44, -42, -40, -40, -20, -20, -18, -16, -16, -8, -2, 2, 8, 10, 20, 28, 34, 40, 42, 44, 46, 48, 48, 50, 54, 64, 66, 66, 66, 66, 72, 76, 78, 82, 82, 92], [-98, -94, -80, -76, -74, -70, -66, -62, -58, -56, -52, -50, -48, -40, -28, -28, -28, -26, -24, -22, -12, 0, 0, 2, 8, 14, 14, 20, 38, 40, 50, 52, 52, 52, 60, 70, 72, 76, 88, 92, 94, 96], [-80, -78, -76, -72, -66, -64, -62, -54, -46, -40, -34, -34, -24, -18, -4, 0, 6, 10, 10, 10, 12, 12, 18, 22, 32, 34, 34, 38, 40, 40, 40, 42, 44, 44, 46, 58, 66, 76, 82, 82, 88, 96], [-96, -94, -92, -86, -82, -82, -70, -70, -64, -60, -56, -46, -46, -46, -46, -44, -38, -8, -6, -4, 0, 0, 2, 6, 8, 12, 30, 34, 34, 36, 36, 38, 56, 62, 72, 74, 76, 82, 82, 88, 90, 98], [-96, -96, -90, -86, -76, -74, -72, -66, -66, -62, -60, -56, -56, -46, -42, -40, -38, -38, -28, -28, -20, -18, -16, -10, -8, -4, -2, 2, 12, 36, 38, 40, 44, 44, 48, 52, 64, 78, 80, 86, 90, 92], [-90, -78, -78, -74, -74, -66, -64, -62, -42, -42, -42, -38, -36, -34, -30, -22, -20, -16, -10, -6, -2, 0, 2, 6, 8, 10, 10, 10, 18, 22, 22, 38, 40, 42, 44, 48, 54, 56, 58, 58, 84, 94], [-94, -92, -90, -90, -86, -72, -72, -72, -66, -66, -56, -52, -50, -46, -40, -30, -24, -20, -20, -10, -6, 0, 2, 4, 10, 16, 18, 20, 22, 26, 26, 36, 40, 40, 48, 54, 60, 62, 70, 86, 88, 96], [-98, -92, -84, -80, -76, -70, -58, -52, -50, -50, -44, -38, -28, -28, -24, -24, -22, -12, -12, -10, -6, -4, -2, 2, 4, 6, 10, 16, 16, 18, 32, 34, 34, 40, 40, 48, 48, 52, 62, 64, 90, 92], [-94, -92, -84, -84, -82, -76, -66, -62, -56, -54, -46, -40, -40, -36, -34, -28, -22, -18, -12, -10, -10, -8, 12, 12, 14, 14, 20, 22, 24, 30, 34, 42, 46, 48, 58, 58, 64, 64, 72, 88, 88, 98], [-94, -92, -82, -66, -60, -52, -50, -44, -40, -36, -34, -28, -22, -18, -18, -14, -4, -4, 4, 10, 12, 14, 16, 22, 24, 28, 36, 38, 44, 44, 46, 50, 52, 64, 74, 82, 82, 84, 88, 90, 92, 98], [-90, -86, -86, -82, -82, -78, -74, -68, -66, -48, -48, -44, -38, -34, -32, -26, -18, -6, -4, -2, 0, 0, 0, 8, 18, 24, 26, 34, 48, 50, 52, 54, 60, 64, 72, 76, 82, 88, 92, 92, 94, 94], [-96, -94, -90, -86, -54, -54, -52, -50, -48, -46, -40, -36, -28, -28, -22, -20, -18, -14, -10, 0, 0, 4, 8, 8, 8, 22, 30, 36, 36, 46, 50, 52, 64, 68, 72, 74, 74, 78, 82, 82, 84, 88], [-98, -94, -82, -76, -74, -66, -56, -46, -42, -40, -40, -38, -36, -28, -26, -20, -10, -4, 0, 10, 28, 28, 30, 32, 34, 38, 40, 42, 46, 52, 52, 54, 54, 70, 72, 80, 80, 82, 84, 90, 92, 92], [-86, -82, -80, -78, -78, -74, -74, -66, -66, -66, -58, -58, -54, -46, -42, -32, -30, -28, -24, -24, -12, -10, -8, -2, 12, 14, 26, 34, 34, 36, 36, 38, 52, 58, 58, 62, 64, 64, 74, 86, 88, 94], [-98, -96, -92, -78, -76, -72, -70, -64, -58, -56, -50, -50, -50, -48, -42, -30, -26, -26, -14, -10, -8, -4, 4, 4, 8, 12, 26, 30, 30, 34, 36, 38, 46, 46, 46, 52, 54, 60, 68, 70, 76, 84], [-90, -76, -76, -74, -70, -66, -50, -42, -38, -34, -34, -30, -20, -16, -16, -14, -2, 0, 8, 8, 14, 18, 18, 26, 30, 34, 38, 38, 42, 46, 46, 48, 50, 50, 62, 68, 70, 72, 76, 76, 94, 96], [-94, -64, -62, -62, -56, -54, -54, -42, -40, -38, -34, -28, -26, -24, -22, -20, -12, -10, -6, -6, -2, -2, 0, 4, 8, 12, 28, 32, 44, 46, 52, 56, 60, 68, 72, 74, 86, 88, 90, 94, 94, 98], [-98, -92, -90, -82, -70, -68, -68, -66, -66, -64, -58, -50, -48, -44, -42, -30, -30, -24, -24, -20, -16, -14, -10, -6, 4, 12, 14, 20, 24, 26, 42, 46, 50, 62, 68, 72, 74, 84, 84, 86, 88, 94], [-90, -90, -88, -88, -72, -68, -64, -56, -52, -38, -38, -36, -32, -26, -26, -12, -8, 8, 12, 14, 22, 34, 42, 42, 50, 54, 54, 56, 58, 60, 60, 70, 72, 72, 74, 78, 78, 80, 84, 84, 90, 92], [-88, -64, -60, -56, -54, -50, -46, -44, -44, -42, -32, -32, -26, -24, -24, -22, -14, -4, 0, 2, 12, 14, 14, 20, 24, 30, 38, 38, 42, 44, 46, 60, 68, 70, 72, 80, 82, 82, 84, 88, 90, 96], [-98, -98, -94, -90, -86, -86, -86, -84, -84, -78, -74, -74, -72, -66, -58, -58, -54, -46, -46, -14, -10, 0, 0, 6, 6, 12, 22, 24, 42, 44, 48, 50, 50, 56, 58, 58, 70, 72, 82, 88, 90, 96]],21,),
    ([[0, 1, 0, 1, 0, 1], [1, 1, 0, 1, 1, 0], [0, 1, 1, 0, 0, 0], [0, 1, 1, 0, 0, 0], [1, 0, 0, 1, 0, 0], [0, 0, 1, 0, 1, 0]],5,),
    ([[10, 18, 38], [20, 82, 98], [58, 78, 92]],1,),
    ([[90, 72, 66, -20, -64, 22, -28, -64, 42, -56, -78, 82, -96, 14, -84], [-8, 50, -76, -78, 66, 24, -24, 92, 40, 74, 12, 22, -96, -38, 2], [38, -50, 68, 22, -58, 18, 80, -62, 24, 98, -90, 56, -62, -50, -86], [34, 72, 72, 58, -32, -18, 42, -2, 54, 24, -94, 98, -26, 84, -50], [-88, -86, 44, 92, 0, 6, -28, -18, 50, 58, 30, -96, -70, -40, -56], [-78, 46, 32, 66, -14, 68, 22, -6, 66, 58, 16, -78, -8, -14, -2], [-98, -98, 76, 82, -2, -74, -98, 80, -56, -56, -74, -54, -36, 94, 26], [20, -94, 40, 66, 6, -16, 86, -32, -64, 84, 42, -72, -62, 12, -78], [88, -60, 64, -44, -40, 66, -44, 88, -68, 20, 40, 50, -86, -2, -46], [-64, -62, 86, -6, 64, -92, -66, -42, 44, -62, 50, 78, -36, -26, 60], [88, 0, 74, 8, 68, 58, -98, -62, 70, 48, -48, -60, -38, -48, 48], [-80, -64, -40, 62, -94, -10, 60, -38, 80, 12, -32, -42, -40, 46, -62], [44, -84, -62, -64, -80, -40, 20, -54, -10, 22, 30, -38, 28, -14, 34], [-10, 36, 52, -84, 14, 94, -58, -78, 62, -36, -24, 86, -74, -28, 0], [82, 58, -20, -16, 32, 20, -28, -48, 48, -72, -82, -86, -40, 76, 88]],9,),
    ([[1]],0,),
    ([[22, 52, 13, 45, 52, 31, 82, 11, 41, 97, 10, 4, 59, 41, 33, 57, 21, 88, 74, 37, 3, 21, 69, 70, 82, 24, 67], [53, 28, 86, 51, 99, 34, 83, 79, 72, 88, 14, 5, 77, 28, 1, 92, 73, 81, 80, 68, 41, 37, 80, 99, 16, 18, 85], [12, 77, 44, 25, 33, 66, 11, 86, 81, 5, 29, 78, 95, 6, 59, 79, 80, 56, 93, 37, 86, 24, 56, 6, 54, 67, 2], [67, 1, 57, 81, 92, 69, 7, 93, 81, 36, 19, 2, 46, 4, 83, 10, 4, 17, 16, 84, 74, 52, 65, 51, 75, 33, 22], [34, 77, 98, 42, 77, 49, 15, 73, 93, 89, 71, 75, 52, 39, 35, 17, 65, 23, 75, 88, 35, 31, 12, 49, 97, 25, 53], [61, 98, 92, 37, 5, 47, 6, 79, 80, 96, 63, 73, 39, 54, 12, 4, 43, 98, 23, 84, 81, 5, 29, 11, 25, 56, 17], [47, 5, 3, 23, 94, 7, 44, 5, 40, 40, 97, 69, 58, 91, 40, 48, 6, 23, 11, 64, 75, 2, 94, 36, 46, 76, 95], [98, 43, 1, 22, 15, 17, 28, 57, 81, 10, 28, 67, 49, 83, 50, 84, 71, 78, 9, 29, 17, 41, 94, 95, 78, 79, 59], [71, 82, 52, 75, 8, 8, 99, 9, 86, 56, 42, 51, 74, 87, 23, 15, 79, 90, 22, 36, 31, 30, 28, 37, 80, 17, 63], [64, 41, 61, 54, 10, 32, 32, 6, 59, 96, 48, 47, 24, 78, 73, 17, 77, 21, 12, 60, 3, 62, 57, 2, 41, 81, 61], [47, 21, 45, 34, 87, 24, 43, 73, 21, 77, 79, 74, 73, 5, 69, 19, 34, 20, 7, 9, 54, 98, 24, 94, 73, 97, 91], [44, 31, 57, 15, 59, 50, 12, 31, 21, 18, 17, 33, 14, 15, 61, 48, 29, 47, 9, 62, 47, 18, 8, 80, 35, 95, 99], [47, 14, 94, 75, 56, 97, 77, 64, 52, 44, 80, 52, 45, 48, 96, 79, 31, 75, 20, 23, 6, 36, 35, 55, 19, 17, 36], [41, 77, 31, 91, 9, 98, 95, 95, 77, 30, 40, 5, 59, 67, 48, 82, 20, 96, 75, 21, 36, 22, 39, 54, 99, 88, 8], [96, 43, 48, 65, 60, 67, 21, 95, 99, 13, 52, 28, 20, 55, 1, 94, 97, 45, 59, 65, 8, 65, 66, 58, 52, 63, 84], [66, 43, 33, 40, 51, 33, 59, 64, 10, 22, 62, 5, 20, 43, 7, 54, 89, 33, 41, 17, 23, 34, 17, 58, 66, 87, 14], [73, 38, 15, 91, 54, 59, 54, 88, 89, 63, 22, 5, 40, 61, 59, 69, 98, 21, 68, 56, 31, 90, 7, 51, 42, 92, 86], [63, 11, 30, 97, 61, 15, 38, 66, 75, 54, 49, 76, 92, 94, 68, 53, 42, 71, 96, 99, 64, 40, 37, 98, 3, 4, 58], [31, 83, 87, 38, 13, 60, 70, 16, 76, 25, 59, 54, 31, 88, 72, 42, 32, 2, 61, 46, 22, 12, 9, 40, 74, 68, 35], [62, 37, 42, 33, 63, 73, 99, 1, 8, 18, 35, 87, 54, 98, 52, 57, 40, 52, 68, 9, 20, 53, 72, 74, 80, 12, 69], [8, 92, 7, 67, 41, 27, 10, 19, 52, 37, 86, 12, 11, 48, 99, 58, 78, 98, 45, 33, 75, 48, 88, 15, 30, 41, 78], [69, 89, 58, 78, 42, 17, 42, 91, 35, 68, 12, 73, 12, 12, 85, 52, 70, 44, 45, 10, 30, 10, 38, 27, 26, 97, 50], [23, 68, 7, 18, 45, 79, 28, 40, 39, 65, 25, 14, 38, 22, 36, 14, 96, 79, 18, 66, 54, 64, 80, 29, 98, 29, 85], [70, 35, 75, 61, 89, 55, 86, 20, 9, 55, 86, 32, 46, 26, 76, 58, 27, 48, 23, 99, 99, 73, 3, 80, 28, 1, 68], [31, 89, 14, 95, 93, 53, 5, 27, 52, 68, 35, 17, 9, 51, 43, 47, 31, 90, 46, 28, 85, 15, 45, 85, 19, 51, 15], [35, 40, 79, 82, 37, 8, 33, 80, 90, 4, 28, 62, 2, 1, 27, 82, 53, 75, 26, 41, 9, 46, 34, 61, 50, 19, 25], [44, 24, 15, 94, 82, 22, 25, 50, 55, 46, 62, 98, 47, 39, 95, 21, 65, 66, 47, 15, 45, 87, 56, 84, 63, 3, 55]],22,)
        ]
    filled_function_param = [
    ([[44, 54, 93], [12, 13, 78], [25, 30, 47]],1,),
    ([[-8, 60, 16, 52], [52, 4, -64, -74], [-28, -52, -80, -94], [32, 76, 38, -40]],3,),
    ([[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]],20,),
    ([[75, 8, 74, 8, 9, 79, 65, 46, 52, 13], [4, 64, 20, 34, 65, 64, 1, 46, 27, 79], [67, 74, 12, 49, 67, 62, 69, 29, 18, 97], [14, 19, 80, 82, 21, 37, 57, 58, 85, 78], [4, 52, 20, 70, 69, 77, 64, 86, 60, 3], [7, 74, 86, 36, 48, 71, 8, 32, 47, 31], [57, 9, 84, 51, 96, 53, 44, 60, 98, 31], [52, 46, 95, 87, 13, 53, 28, 37, 66, 14], [75, 24, 45, 51, 74, 88, 74, 55, 97, 3], [69, 50, 90, 51, 44, 28, 34, 64, 91, 99]],7,),
    ([[-98, -84, -80, -80, -74, -66, -52, -50, -46, -44, -40, -32, -28, -22, -16, -12, 0, 4, 14, 18, 18, 20, 28, 28, 34, 40, 46, 48, 50, 52, 66, 68, 68, 68, 70, 74, 82, 84, 84, 84, 88, 90], [-98, -86, -86, -78, -76, -66, -62, -58, -54, -50, -50, -48, -44, -34, -22, -22, -16, -14, -6, 2, 2, 2, 14, 18, 22, 22, 26, 26, 26, 34, 38, 48, 54, 54, 58, 70, 70, 70, 80, 90, 94, 98], [-94, -92, -90, -84, -74, -68, -66, -64, -64, -60, -60, -56, -52, -50, -46, -42, -30, -28, -26, -26, -24, -22, -20, -20, -16, -12, -4, -4, -4, 6, 8, 12, 24, 36, 52, 62, 74, 84, 92, 92, 94, 98], [-98, -98, -96, -88, -88, -78, -74, -70, -68, -62, -60, -58, -54, -40, -36, -34, -30, -26, -18, -6, -4, -2, -2, 0, 10, 20, 26, 32, 38, 50, 50, 60, 60, 62, 64, 66, 70, 76, 76, 82, 84, 86], [-98, -96, -94, -92, -88, -82, -72, -72, -56, -52, -48, -40, -32, -18, -16, -14, -8, -4, 4, 18, 18, 20, 22, 26, 36, 38, 42, 44, 48, 48, 52, 52, 54, 56, 60, 62, 64, 66, 66, 82, 86, 90], [-96, -94, -88, -86, -72, -70, -60, -58, -48, -46, -44, -40, -38, -36, -30, -24, -22, -20, -16, -10, -8, -8, 4, 6, 10, 12, 16, 18, 30, 34, 38, 42, 48, 48, 62, 68, 74, 80, 80, 90, 96, 96], [-98, -96, -86, -84, -80, -78, -74, -72, -70, -66, -64, -60, -58, -52, -52, -50, -50, -42, -42, -22, -20, -20, -14, -12, -12, -10, -6, 4, 4, 6, 40, 42, 60, 60, 62, 64, 82, 84, 88, 88, 96, 98], [-98, -92, -82, -82, -76, -72, -70, -56, -54, -48, -46, -40, -36, -36, -34, -32, -28, -28, -22, -16, -8, -6, -2, -2, 12, 14, 16, 16, 20, 20, 22, 22, 34, 50, 54, 62, 70, 76, 88, 90, 98, 98], [-96, -82, -76, -66, -62, -58, -48, -46, -42, -32, -32, -26, -22, -18, -14, -4, 16, 16, 18, 20, 22, 26, 30, 32, 34, 38, 46, 60, 68, 70, 70, 70, 72, 72, 74, 76, 84, 94, 94, 94, 96, 98], [-94, -86, -84, -74, -70, -60, -54, -48, -48, -48, -42, -40, -36, -34, -34, -32, -30, -26, -10, -10, -8, -6, -4, -2, 0, 4, 4, 18, 18, 26, 30, 30, 36, 44, 58, 58, 58, 62, 66, 70, 76, 94], [-98, -94, -84, -80, -78, -78, -72, -70, -68, -58, -54, -54, -38, -34, -30, -26, -12, -10, -8, -2, 4, 4, 8, 8, 12, 16, 20, 40, 44, 50, 50, 52, 64, 66, 70, 80, 82, 84, 90, 94, 96, 96], [-94, -88, -78, -76, -76, -70, -64, -62, -62, -54, -50, -34, -22, -18, -18, -16, -4, 0, 0, 2, 4, 16, 20, 24, 28, 32, 40, 42, 42, 48, 56, 56, 58, 60, 70, 76, 76, 78, 82, 86, 86, 90], [-92, -92, -88, -86, -84, -80, -80, -74, -72, -72, -70, -68, -62, -60, -58, -52, -52, -44, -42, -36, -26, -12, -12, -10, -8, -4, 4, 6, 10, 10, 38, 40, 46, 46, 64, 70, 72, 74, 76, 84, 90, 94], [-82, -76, -76, -70, -60, -60, -48, -48, -46, -44, -40, -38, -34, -24, -18, -18, -14, -12, -6, -6, -6, -4, -4, 0, 2, 6, 16, 18, 24, 30, 44, 52, 52, 58, 62, 64, 64, 64, 72, 72, 84, 86], [-80, -80, -56, -50, -50, -48, -44, -38, -34, -28, -26, -20, -20, -8, -8, -6, 0, 4, 8, 10, 10, 12, 22, 24, 36, 38, 40, 44, 46, 48, 62, 64, 66, 68, 68, 68, 72, 74, 74, 76, 88, 98], [-82, -80, -74, -72, -68, -68, -68, -56, -50, -46, -46, -44, -44, -36, -28, -26, -26, -16, -12, -10, -4, -2, 0, 6, 18, 18, 20, 24, 26, 28, 32, 32, 32, 36, 54, 62, 66, 68, 74, 78, 88, 90], [-94, -92, -86, -82, -72, -64, -62, -62, -62, -60, -60, -58, -56, -54, -52, -48, -48, -44, -32, -30, -28, -28, -22, -20, -16, -16, 12, 12, 20, 34, 36, 36, 40, 42, 44, 46, 52, 54, 74, 78, 94, 96], [-98, -82, -78, -74, -68, -68, -68, -64, -62, -58, -56, -54, -50, -48, -46, -44, -44, -38, -32, -28, -24, -16, -16, -6, -4, -2, 8, 8, 30, 38, 50, 60, 64, 72, 76, 84, 88, 88, 92, 96, 98, 98], [-98, -98, -94, -90, -90, -86, -82, -78, -74, -64, -60, -50, -48, -40, -32, -28, -26, -20, -16, -12, -10, -10, -10, -4, 8, 8, 10, 12, 20, 22, 30, 32, 34, 34, 40, 42, 46, 60, 80, 86, 88, 90], [-96, -88, -82, -76, -74, -72, -68, -68, -60, -60, -60, -54, -52, -48, -46, -40, -22, -16, -16, -6, 6, 14, 14, 26, 28, 28, 30, 34, 44, 48, 50, 54, 54, 56, 70, 76, 76, 76, 84, 84, 88, 96], [-96, -92, -88, -72, -54, -50, -46, -44, -42, -32, -32, -28, -24, -24, -14, -12, -4, 2, 2, 6, 8, 8, 16, 18, 26, 26, 28, 30, 30, 38, 38, 40, 40, 42, 46, 50, 50, 56, 58, 62, 66, 88], [-98, -90, -82, -76, -62, -48, -44, -42, -40, -40, -20, -20, -18, -16, -16, -8, -2, 2, 8, 10, 20, 28, 34, 40, 42, 44, 46, 48, 48, 50, 54, 64, 66, 66, 66, 66, 72, 76, 78, 82, 82, 92], [-98, -94, -80, -76, -74, -70, -66, -62, -58, -56, -52, -50, -48, -40, -28, -28, -28, -26, -24, -22, -12, 0, 0, 2, 8, 14, 14, 20, 38, 40, 50, 52, 52, 52, 60, 70, 72, 76, 88, 92, 94, 96], [-80, -78, -76, -72, -66, -64, -62, -54, -46, -40, -34, -34, -24, -18, -4, 0, 6, 10, 10, 10, 12, 12, 18, 22, 32, 34, 34, 38, 40, 40, 40, 42, 44, 44, 46, 58, 66, 76, 82, 82, 88, 96], [-96, -94, -92, -86, -82, -82, -70, -70, -64, -60, -56, -46, -46, -46, -46, -44, -38, -8, -6, -4, 0, 0, 2, 6, 8, 12, 30, 34, 34, 36, 36, 38, 56, 62, 72, 74, 76, 82, 82, 88, 90, 98], [-96, -96, -90, -86, -76, -74, -72, -66, -66, -62, -60, -56, -56, -46, -42, -40, -38, -38, -28, -28, -20, -18, -16, -10, -8, -4, -2, 2, 12, 36, 38, 40, 44, 44, 48, 52, 64, 78, 80, 86, 90, 92], [-90, -78, -78, -74, -74, -66, -64, -62, -42, -42, -42, -38, -36, -34, -30, -22, -20, -16, -10, -6, -2, 0, 2, 6, 8, 10, 10, 10, 18, 22, 22, 38, 40, 42, 44, 48, 54, 56, 58, 58, 84, 94], [-94, -92, -90, -90, -86, -72, -72, -72, -66, -66, -56, -52, -50, -46, -40, -30, -24, -20, -20, -10, -6, 0, 2, 4, 10, 16, 18, 20, 22, 26, 26, 36, 40, 40, 48, 54, 60, 62, 70, 86, 88, 96], [-98, -92, -84, -80, -76, -70, -58, -52, -50, -50, -44, -38, -28, -28, -24, -24, -22, -12, -12, -10, -6, -4, -2, 2, 4, 6, 10, 16, 16, 18, 32, 34, 34, 40, 40, 48, 48, 52, 62, 64, 90, 92], [-94, -92, -84, -84, -82, -76, -66, -62, -56, -54, -46, -40, -40, -36, -34, -28, -22, -18, -12, -10, -10, -8, 12, 12, 14, 14, 20, 22, 24, 30, 34, 42, 46, 48, 58, 58, 64, 64, 72, 88, 88, 98], [-94, -92, -82, -66, -60, -52, -50, -44, -40, -36, -34, -28, -22, -18, -18, -14, -4, -4, 4, 10, 12, 14, 16, 22, 24, 28, 36, 38, 44, 44, 46, 50, 52, 64, 74, 82, 82, 84, 88, 90, 92, 98], [-90, -86, -86, -82, -82, -78, -74, -68, -66, -48, -48, -44, -38, -34, -32, -26, -18, -6, -4, -2, 0, 0, 0, 8, 18, 24, 26, 34, 48, 50, 52, 54, 60, 64, 72, 76, 82, 88, 92, 92, 94, 94], [-96, -94, -90, -86, -54, -54, -52, -50, -48, -46, -40, -36, -28, -28, -22, -20, -18, -14, -10, 0, 0, 4, 8, 8, 8, 22, 30, 36, 36, 46, 50, 52, 64, 68, 72, 74, 74, 78, 82, 82, 84, 88], [-98, -94, -82, -76, -74, -66, -56, -46, -42, -40, -40, -38, -36, -28, -26, -20, -10, -4, 0, 10, 28, 28, 30, 32, 34, 38, 40, 42, 46, 52, 52, 54, 54, 70, 72, 80, 80, 82, 84, 90, 92, 92], [-86, -82, -80, -78, -78, -74, -74, -66, -66, -66, -58, -58, -54, -46, -42, -32, -30, -28, -24, -24, -12, -10, -8, -2, 12, 14, 26, 34, 34, 36, 36, 38, 52, 58, 58, 62, 64, 64, 74, 86, 88, 94], [-98, -96, -92, -78, -76, -72, -70, -64, -58, -56, -50, -50, -50, -48, -42, -30, -26, -26, -14, -10, -8, -4, 4, 4, 8, 12, 26, 30, 30, 34, 36, 38, 46, 46, 46, 52, 54, 60, 68, 70, 76, 84], [-90, -76, -76, -74, -70, -66, -50, -42, -38, -34, -34, -30, -20, -16, -16, -14, -2, 0, 8, 8, 14, 18, 18, 26, 30, 34, 38, 38, 42, 46, 46, 48, 50, 50, 62, 68, 70, 72, 76, 76, 94, 96], [-94, -64, -62, -62, -56, -54, -54, -42, -40, -38, -34, -28, -26, -24, -22, -20, -12, -10, -6, -6, -2, -2, 0, 4, 8, 12, 28, 32, 44, 46, 52, 56, 60, 68, 72, 74, 86, 88, 90, 94, 94, 98], [-98, -92, -90, -82, -70, -68, -68, -66, -66, -64, -58, -50, -48, -44, -42, -30, -30, -24, -24, -20, -16, -14, -10, -6, 4, 12, 14, 20, 24, 26, 42, 46, 50, 62, 68, 72, 74, 84, 84, 86, 88, 94], [-90, -90, -88, -88, -72, -68, -64, -56, -52, -38, -38, -36, -32, -26, -26, -12, -8, 8, 12, 14, 22, 34, 42, 42, 50, 54, 54, 56, 58, 60, 60, 70, 72, 72, 74, 78, 78, 80, 84, 84, 90, 92], [-88, -64, -60, -56, -54, -50, -46, -44, -44, -42, -32, -32, -26, -24, -24, -22, -14, -4, 0, 2, 12, 14, 14, 20, 24, 30, 38, 38, 42, 44, 46, 60, 68, 70, 72, 80, 82, 82, 84, 88, 90, 96], [-98, -98, -94, -90, -86, -86, -86, -84, -84, -78, -74, -74, -72, -66, -58, -58, -54, -46, -46, -14, -10, 0, 0, 6, 6, 12, 22, 24, 42, 44, 48, 50, 50, 56, 58, 58, 70, 72, 82, 88, 90, 96]],21,),
    ([[0, 1, 0, 1, 0, 1], [1, 1, 0, 1, 1, 0], [0, 1, 1, 0, 0, 0], [0, 1, 1, 0, 0, 0], [1, 0, 0, 1, 0, 0], [0, 0, 1, 0, 1, 0]],5,),
    ([[10, 18, 38], [20, 82, 98], [58, 78, 92]],1,),
    ([[90, 72, 66, -20, -64, 22, -28, -64, 42, -56, -78, 82, -96, 14, -84], [-8, 50, -76, -78, 66, 24, -24, 92, 40, 74, 12, 22, -96, -38, 2], [38, -50, 68, 22, -58, 18, 80, -62, 24, 98, -90, 56, -62, -50, -86], [34, 72, 72, 58, -32, -18, 42, -2, 54, 24, -94, 98, -26, 84, -50], [-88, -86, 44, 92, 0, 6, -28, -18, 50, 58, 30, -96, -70, -40, -56], [-78, 46, 32, 66, -14, 68, 22, -6, 66, 58, 16, -78, -8, -14, -2], [-98, -98, 76, 82, -2, -74, -98, 80, -56, -56, -74, -54, -36, 94, 26], [20, -94, 40, 66, 6, -16, 86, -32, -64, 84, 42, -72, -62, 12, -78], [88, -60, 64, -44, -40, 66, -44, 88, -68, 20, 40, 50, -86, -2, -46], [-64, -62, 86, -6, 64, -92, -66, -42, 44, -62, 50, 78, -36, -26, 60], [88, 0, 74, 8, 68, 58, -98, -62, 70, 48, -48, -60, -38, -48, 48], [-80, -64, -40, 62, -94, -10, 60, -38, 80, 12, -32, -42, -40, 46, -62], [44, -84, -62, -64, -80, -40, 20, -54, -10, 22, 30, -38, 28, -14, 34], [-10, 36, 52, -84, 14, 94, -58, -78, 62, -36, -24, 86, -74, -28, 0], [82, 58, -20, -16, 32, 20, -28, -48, 48, -72, -82, -86, -40, 76, 88]],9,),
    ([[1]],0,),
    ([[22, 52, 13, 45, 52, 31, 82, 11, 41, 97, 10, 4, 59, 41, 33, 57, 21, 88, 74, 37, 3, 21, 69, 70, 82, 24, 67], [53, 28, 86, 51, 99, 34, 83, 79, 72, 88, 14, 5, 77, 28, 1, 92, 73, 81, 80, 68, 41, 37, 80, 99, 16, 18, 85], [12, 77, 44, 25, 33, 66, 11, 86, 81, 5, 29, 78, 95, 6, 59, 79, 80, 56, 93, 37, 86, 24, 56, 6, 54, 67, 2], [67, 1, 57, 81, 92, 69, 7, 93, 81, 36, 19, 2, 46, 4, 83, 10, 4, 17, 16, 84, 74, 52, 65, 51, 75, 33, 22], [34, 77, 98, 42, 77, 49, 15, 73, 93, 89, 71, 75, 52, 39, 35, 17, 65, 23, 75, 88, 35, 31, 12, 49, 97, 25, 53], [61, 98, 92, 37, 5, 47, 6, 79, 80, 96, 63, 73, 39, 54, 12, 4, 43, 98, 23, 84, 81, 5, 29, 11, 25, 56, 17], [47, 5, 3, 23, 94, 7, 44, 5, 40, 40, 97, 69, 58, 91, 40, 48, 6, 23, 11, 64, 75, 2, 94, 36, 46, 76, 95], [98, 43, 1, 22, 15, 17, 28, 57, 81, 10, 28, 67, 49, 83, 50, 84, 71, 78, 9, 29, 17, 41, 94, 95, 78, 79, 59], [71, 82, 52, 75, 8, 8, 99, 9, 86, 56, 42, 51, 74, 87, 23, 15, 79, 90, 22, 36, 31, 30, 28, 37, 80, 17, 63], [64, 41, 61, 54, 10, 32, 32, 6, 59, 96, 48, 47, 24, 78, 73, 17, 77, 21, 12, 60, 3, 62, 57, 2, 41, 81, 61], [47, 21, 45, 34, 87, 24, 43, 73, 21, 77, 79, 74, 73, 5, 69, 19, 34, 20, 7, 9, 54, 98, 24, 94, 73, 97, 91], [44, 31, 57, 15, 59, 50, 12, 31, 21, 18, 17, 33, 14, 15, 61, 48, 29, 47, 9, 62, 47, 18, 8, 80, 35, 95, 99], [47, 14, 94, 75, 56, 97, 77, 64, 52, 44, 80, 52, 45, 48, 96, 79, 31, 75, 20, 23, 6, 36, 35, 55, 19, 17, 36], [41, 77, 31, 91, 9, 98, 95, 95, 77, 30, 40, 5, 59, 67, 48, 82, 20, 96, 75, 21, 36, 22, 39, 54, 99, 88, 8], [96, 43, 48, 65, 60, 67, 21, 95, 99, 13, 52, 28, 20, 55, 1, 94, 97, 45, 59, 65, 8, 65, 66, 58, 52, 63, 84], [66, 43, 33, 40, 51, 33, 59, 64, 10, 22, 62, 5, 20, 43, 7, 54, 89, 33, 41, 17, 23, 34, 17, 58, 66, 87, 14], [73, 38, 15, 91, 54, 59, 54, 88, 89, 63, 22, 5, 40, 61, 59, 69, 98, 21, 68, 56, 31, 90, 7, 51, 42, 92, 86], [63, 11, 30, 97, 61, 15, 38, 66, 75, 54, 49, 76, 92, 94, 68, 53, 42, 71, 96, 99, 64, 40, 37, 98, 3, 4, 58], [31, 83, 87, 38, 13, 60, 70, 16, 76, 25, 59, 54, 31, 88, 72, 42, 32, 2, 61, 46, 22, 12, 9, 40, 74, 68, 35], [62, 37, 42, 33, 63, 73, 99, 1, 8, 18, 35, 87, 54, 98, 52, 57, 40, 52, 68, 9, 20, 53, 72, 74, 80, 12, 69], [8, 92, 7, 67, 41, 27, 10, 19, 52, 37, 86, 12, 11, 48, 99, 58, 78, 98, 45, 33, 75, 48, 88, 15, 30, 41, 78], [69, 89, 58, 78, 42, 17, 42, 91, 35, 68, 12, 73, 12, 12, 85, 52, 70, 44, 45, 10, 30, 10, 38, 27, 26, 97, 50], [23, 68, 7, 18, 45, 79, 28, 40, 39, 65, 25, 14, 38, 22, 36, 14, 96, 79, 18, 66, 54, 64, 80, 29, 98, 29, 85], [70, 35, 75, 61, 89, 55, 86, 20, 9, 55, 86, 32, 46, 26, 76, 58, 27, 48, 23, 99, 99, 73, 3, 80, 28, 1, 68], [31, 89, 14, 95, 93, 53, 5, 27, 52, 68, 35, 17, 9, 51, 43, 47, 31, 90, 46, 28, 85, 15, 45, 85, 19, 51, 15], [35, 40, 79, 82, 37, 8, 33, 80, 90, 4, 28, 62, 2, 1, 27, 82, 53, 75, 26, 41, 9, 46, 34, 61, 50, 19, 25], [44, 24, 15, 94, 82, 22, 25, 50, 55, 46, 62, 98, 47, 39, 95, 21, 65, 66, 47, 15, 45, 87, 56, 84, 63, 3, 55]],22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            f_filled(*(filled_function_param[i]))
            f_gold(*parameters_set)
            if parameters_set == filled_function_param[i]:
                print("EFFICIENTLY_COMPUTE_SUMS_OF_DIAGONALS_OF_A_MATRIX," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("EFFICIENTLY_COMPUTE_SUMS_OF_DIAGONALS_OF_A_MATRIX," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("EFFICIENTLY_COMPUTE_SUMS_OF_DIAGONALS_OF_A_MATRIX," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
