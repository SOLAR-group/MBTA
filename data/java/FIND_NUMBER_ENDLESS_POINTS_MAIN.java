public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<boolean [ ] [ ]> param0 = new ArrayList<>();
    param0.add(new boolean[][]{new boolean[]{false,false,false,true},new boolean[]{false,true,true,true},new boolean[]{false,false,true,true},new boolean[]{true,true,true,true}});
    param0.add(new boolean[][]{new boolean[]{true,false,true,true,true,true,false,false,false},new boolean[]{false,true,true,true,true,true,false,true,true},new boolean[]{false,true,false,true,false,true,true,true,false},new boolean[]{false,false,false,false,true,true,false,false,true},new boolean[]{true,true,true,true,false,true,true,false,false},new boolean[]{false,false,true,true,false,true,false,false,true},new boolean[]{true,true,false,false,false,true,true,false,true},new boolean[]{false,true,true,false,false,false,false,false,false},new boolean[]{true,false,false,false,true,true,false,false,true}});
    param0.add(new boolean[][]{new boolean[]{false,false,false,true},new boolean[]{false,false,true,true},new boolean[]{false,false,false,true},new boolean[]{false,false,true,true}});
    param0.add(new boolean[][]{new boolean[]{false,true,true,false,false,true,false,false,true,false,false,false,true,false,false,true,false,true,true,false,false,true,true,true,true,true,true,false,false,true,false,false,false,true,false,true,true,true,false},new boolean[]{false,true,true,true,false,false,true,false,true,true,true,true,true,false,true,false,false,true,false,true,true,true,true,false,false,true,false,true,true,false,true,false,true,false,false,false,true,true,false},new boolean[]{false,true,true,false,true,false,false,true,false,true,true,false,true,true,false,true,false,true,false,true,false,true,true,false,true,false,true,false,true,false,false,false,false,true,false,false,true,true,true},new boolean[]{false,false,false,true,false,true,true,true,true,false,true,true,true,false,false,false,false,true,false,false,false,true,true,false,true,true,false,true,false,false,false,false,false,true,true,true,false,false,false},new boolean[]{true,false,false,true,false,false,false,true,false,true,true,false,false,true,true,true,false,false,false,false,false,true,true,false,true,false,false,true,false,true,false,false,false,true,false,true,false,true,false},new boolean[]{false,true,true,false,false,true,false,true,false,true,false,true,true,true,true,true,false,true,false,false,false,true,true,true,false,false,false,false,true,true,true,false,true,false,true,true,false,true,true},new boolean[]{false,false,true,false,true,true,true,true,false,true,true,true,true,false,false,true,false,true,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,false,true,true,false},new boolean[]{false,true,false,false,true,false,false,false,true,false,true,true,true,false,true,true,false,false,false,true,true,true,false,true,false,false,true,false,true,false,false,true,false,true,true,false,true,false,true},new boolean[]{true,true,true,false,true,true,true,false,false,false,false,true,true,false,false,false,true,false,false,true,false,false,false,true,true,false,false,false,true,true,false,true,false,true,false,false,false,true,false},new boolean[]{false,false,true,false,true,true,true,false,true,false,false,false,true,false,true,false,true,false,false,false,false,true,false,false,true,false,true,false,false,true,false,true,true,false,true,false,false,false,false},new boolean[]{true,false,true,true,true,false,true,true,false,true,false,true,false,false,false,true,true,true,true,true,false,true,true,false,true,true,true,true,false,false,true,false,false,false,false,true,false,false,false},new boolean[]{false,true,true,false,true,false,true,true,true,true,false,false,false,false,true,false,true,true,true,false,true,false,false,true,true,true,true,false,false,true,false,false,true,false,false,true,false,true,true},new boolean[]{false,false,false,false,true,false,false,true,true,true,false,true,true,false,true,false,false,false,true,true,true,true,true,false,false,true,false,false,true,false,true,false,false,false,true,true,true,false,false},new boolean[]{false,true,false,true,false,true,true,true,false,false,true,true,true,false,false,true,true,false,true,true,false,true,false,true,true,false,false,true,false,false,true,false,false,true,true,false,false,false,true},new boolean[]{false,false,true,false,true,true,false,false,false,true,true,true,true,true,false,true,false,false,false,false,false,false,true,false,false,false,false,false,true,true,false,false,false,true,false,true,true,false,false},new boolean[]{false,true,false,true,true,true,true,false,false,false,true,true,false,true,true,false,false,true,false,true,true,true,true,true,false,true,false,true,true,true,false,false,true,true,false,false,false,false,false},new boolean[]{true,true,false,false,true,true,true,false,false,false,true,true,true,true,false,true,false,false,true,true,false,true,true,true,false,true,true,false,false,false,true,true,false,false,false,false,true,false,true},new boolean[]{false,false,false,true,false,false,true,false,true,true,false,true,true,true,false,true,false,false,true,true,false,false,true,false,false,true,false,false,false,true,false,false,false,true,false,false,false,false,false},new boolean[]{false,true,false,false,true,false,true,true,true,false,true,true,true,true,true,false,false,false,true,false,true,true,true,false,true,false,true,false,false,true,true,true,true,true,false,true,true,true,true},new boolean[]{true,false,true,false,true,true,false,false,false,true,true,false,true,true,true,true,true,false,false,true,false,true,false,true,true,true,true,true,false,false,true,true,false,true,false,true,false,false,false},new boolean[]{true,true,false,false,false,false,false,true,true,true,false,true,false,true,true,true,false,true,false,true,true,false,true,true,true,false,false,true,true,true,false,true,false,true,true,false,true,false,true},new boolean[]{false,false,false,false,true,true,true,false,false,true,true,true,false,false,true,true,true,false,true,false,false,true,false,false,true,false,true,true,true,true,false,true,true,false,false,true,false,true,true},new boolean[]{false,true,true,false,true,true,true,true,false,false,true,false,false,true,true,true,false,false,false,true,true,true,false,true,true,true,true,false,true,false,true,false,false,false,true,false,false,true,true},new boolean[]{true,false,false,false,false,true,true,false,false,true,false,false,true,true,false,false,true,true,true,false,true,true,false,false,true,false,true,false,false,true,true,true,true,true,false,false,true,true,true},new boolean[]{true,true,true,false,false,true,false,true,false,true,true,true,true,false,false,true,true,true,false,false,false,true,false,false,false,false,false,true,true,true,false,true,true,false,false,false,true,true,true},new boolean[]{true,false,true,true,true,false,false,true,true,false,false,false,true,true,false,true,false,true,true,true,false,false,false,true,false,false,true,true,true,false,true,false,false,true,true,true,false,false,true},new boolean[]{false,false,false,true,true,false,false,false,true,true,false,false,false,true,false,true,false,false,false,false,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,true,false,false,true},new boolean[]{false,false,false,true,false,false,false,true,false,false,true,false,false,true,false,true,true,false,true,true,true,true,true,true,false,false,false,true,true,true,true,false,false,false,false,false,true,true,true},new boolean[]{false,true,false,true,true,false,true,true,true,true,true,true,false,false,true,true,true,true,false,false,true,false,true,false,true,true,true,true,true,true,false,true,true,true,true,false,true,true,false},new boolean[]{true,false,false,true,false,true,true,true,true,false,false,true,false,false,false,true,true,true,false,false,true,false,false,false,false,true,false,true,true,false,false,true,false,false,true,true,true,true,true},new boolean[]{false,true,true,true,false,false,true,false,false,true,false,false,true,true,true,false,false,true,false,false,false,true,false,true,true,true,false,true,false,false,true,true,false,false,false,true,false,true,false},new boolean[]{false,false,true,false,true,false,false,false,false,true,false,false,false,true,true,false,false,true,false,false,true,false,true,false,true,false,false,false,true,true,false,true,false,false,false,true,false,true,true},new boolean[]{false,true,false,false,true,true,true,true,true,true,false,false,true,false,true,false,false,true,true,true,true,false,false,true,false,true,false,true,true,true,true,true,true,false,true,false,false,true,true},new boolean[]{false,false,false,true,true,true,false,false,false,false,true,true,false,true,false,false,true,false,false,false,true,true,true,true,false,true,false,true,true,true,false,true,true,true,false,false,false,false,false},new boolean[]{false,false,true,true,true,false,true,false,true,true,true,true,false,true,false,true,false,false,true,false,false,true,false,true,false,true,false,true,true,false,false,false,true,false,false,false,true,false,true},new boolean[]{false,false,false,false,true,true,false,true,false,true,false,true,true,true,false,false,false,true,false,false,true,false,false,false,false,false,true,false,true,true,true,false,false,true,true,true,true,true,false},new boolean[]{true,true,true,true,false,false,false,true,false,false,false,true,false,false,true,false,false,false,false,false,true,true,false,false,false,false,false,true,true,true,true,true,true,true,true,false,true,true,true},new boolean[]{true,false,false,true,true,false,true,false,false,false,true,false,true,false,false,false,false,true,true,false,false,false,true,false,false,true,true,true,false,true,true,false,false,false,false,true,false,false,false},new boolean[]{true,true,false,true,true,false,true,true,false,false,true,true,true,false,true,false,true,false,true,false,true,false,true,true,true,true,false,false,false,false,false,true,true,false,false,true,true,false,false}});
    param0.add(new boolean[][]{new boolean[]{false,false,false,false,false,true,true,true,true},new boolean[]{false,false,false,false,true,true,true,true,true},new boolean[]{false,false,false,false,false,true,true,true,true},new boolean[]{false,false,false,false,false,true,true,true,true},new boolean[]{false,false,false,false,false,false,true,true,true},new boolean[]{true,true,true,true,true,true,true,true,true},new boolean[]{false,false,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,true,true,true,true},new boolean[]{false,false,false,false,false,false,true,true,true}});
    param0.add(new boolean[][]{new boolean[]{false,true,true,true,true,false,false,true,false,false,false,true,true,false,true,false,false,false,false,true,true,true,true,false,false},new boolean[]{false,true,false,false,false,false,true,true,true,true,false,true,true,false,true,true,true,false,true,false,true,true,false,false,true},new boolean[]{true,false,false,false,true,false,false,true,true,false,true,false,true,true,false,false,true,false,true,true,true,false,false,true,true},new boolean[]{false,true,true,false,true,true,true,true,false,true,false,false,false,true,false,false,false,false,true,false,true,true,false,true,false},new boolean[]{true,true,true,false,true,true,false,false,true,true,false,false,false,true,true,false,true,false,false,true,true,false,false,true,false},new boolean[]{true,false,false,true,false,false,true,false,true,true,true,false,false,true,false,true,true,false,false,false,false,false,true,true,false},new boolean[]{true,false,false,false,false,false,false,false,true,false,true,false,true,false,false,false,true,true,true,true,false,true,false,false,false},new boolean[]{true,false,true,false,false,false,false,false,true,false,true,false,true,false,true,false,false,true,true,false,false,true,false,true,false},new boolean[]{true,true,true,false,true,true,true,false,false,false,true,true,false,true,true,false,true,true,false,false,false,true,false,true,false},new boolean[]{true,false,true,false,true,false,true,true,false,true,true,false,false,true,true,true,true,true,false,false,true,false,true,true,false},new boolean[]{true,false,false,false,true,true,false,false,true,false,false,false,true,true,false,true,false,false,true,true,false,false,false,false,true},new boolean[]{false,true,false,true,true,false,true,false,false,true,false,false,false,false,false,true,false,true,true,true,false,true,true,false,false},new boolean[]{true,false,false,true,true,false,false,true,false,true,false,false,false,true,false,false,true,true,false,true,true,true,true,true,false},new boolean[]{false,true,true,true,true,false,false,false,false,true,true,true,true,false,true,true,false,false,true,true,true,true,true,true,false},new boolean[]{true,false,true,false,false,true,false,true,true,true,true,false,true,true,false,true,false,true,true,false,true,true,true,false,true},new boolean[]{true,true,true,false,false,false,true,false,true,false,true,false,true,true,false,false,true,true,true,false,false,true,true,false,true},new boolean[]{false,false,true,true,true,false,false,false,true,true,false,true,true,true,false,true,false,true,true,false,false,false,false,false,false},new boolean[]{false,false,false,true,true,true,true,false,false,true,true,true,false,true,true,false,true,true,true,false,false,true,false,true,false},new boolean[]{false,false,true,false,false,true,false,true,false,false,false,false,true,false,false,false,false,true,false,true,false,false,true,false,false},new boolean[]{false,false,true,true,false,false,false,true,true,true,false,false,true,false,false,true,true,false,false,false,false,true,false,true,false},new boolean[]{true,false,false,false,false,true,false,true,false,false,false,false,true,false,true,false,false,true,true,true,false,false,false,true,true},new boolean[]{false,true,false,false,true,false,false,true,false,true,true,true,true,false,true,false,true,true,false,true,true,false,false,false,false},new boolean[]{true,false,true,true,false,true,true,true,true,true,true,false,false,true,true,true,false,false,false,true,false,true,true,false,false},new boolean[]{true,true,true,false,true,false,true,true,true,false,true,true,true,false,false,false,false,true,false,true,true,true,true,false,true},new boolean[]{true,true,true,true,false,true,false,false,false,true,false,false,true,false,true,false,true,true,false,false,false,true,false,false,true}});
    param0.add(new boolean[][]{new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true,true,true},new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,true}});
    param0.add(new boolean[][]{new boolean[]{true,false,true,false,false,false,true,true,false,true,false,true,true,true,false,false,false,false,true,false,true,false,false,true,false,false,true},new boolean[]{false,true,false,true,false,false,true,true,false,false,false,true,true,false,true,false,true,false,true,false,true,false,false,false,false,true,true},new boolean[]{true,false,true,true,true,false,false,true,true,true,true,true,true,true,true,false,false,false,true,false,true,true,false,false,true,false,true},new boolean[]{true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,false,true,true,true,false,false,true},new boolean[]{true,false,true,false,false,true,true,false,false,true,true,true,false,false,false,true,false,true,false,true,true,true,true,true,true,false,false},new boolean[]{true,false,false,true,true,false,false,true,false,true,true,true,true,false,false,true,true,true,false,false,true,false,false,true,true,true,false},new boolean[]{true,false,true,true,true,true,false,true,false,false,false,true,true,false,true,true,false,true,true,false,true,false,false,false,false,false,false},new boolean[]{true,false,false,true,false,false,true,true,true,false,true,false,false,false,true,true,true,true,false,true,false,false,true,false,true,false,true},new boolean[]{false,true,false,true,false,true,true,true,false,true,true,false,false,false,true,false,false,false,false,true,true,false,true,false,true,false,true},new boolean[]{false,true,true,true,false,true,false,true,false,true,true,false,true,true,true,true,true,true,true,false,true,true,false,false,true,false,true},new boolean[]{false,true,false,false,true,true,false,false,false,false,true,true,false,false,true,false,false,true,true,true,true,false,false,true,false,false,true},new boolean[]{false,false,true,true,false,true,true,true,false,false,false,false,true,false,true,false,true,false,false,true,false,false,true,true,true,false,false},new boolean[]{true,true,false,false,true,true,false,false,true,true,true,false,false,true,true,false,false,false,true,false,false,false,true,false,false,false,true},new boolean[]{false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,false,false,false,false,false,true,false,true,true,false,true,false},new boolean[]{true,true,true,true,true,true,true,true,true,false,true,true,true,true,false,false,false,false,false,true,false,false,false,false,false,false,true},new boolean[]{false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,true,false,true,false,true,false,true,false},new boolean[]{true,true,false,true,true,true,true,true,true,false,false,true,true,false,true,true,false,false,false,false,false,true,true,false,false,false,false},new boolean[]{false,false,false,false,true,true,true,false,true,true,false,true,false,false,true,true,false,false,false,false,true,true,false,true,true,false,false},new boolean[]{true,false,true,true,false,true,false,false,false,false,false,false,false,false,true,false,true,true,false,true,true,true,true,false,false,false,true},new boolean[]{true,false,false,false,true,false,true,false,true,true,false,false,false,true,false,true,true,true,false,false,false,true,false,true,true,false,true},new boolean[]{true,false,true,true,true,true,false,true,true,false,true,true,true,false,false,true,true,false,false,false,false,false,true,false,true,true,true},new boolean[]{true,true,false,false,false,true,false,true,true,true,true,false,true,true,true,true,true,true,false,false,false,false,true,true,false,false,false},new boolean[]{true,false,false,false,false,false,false,true,true,true,false,true,false,false,false,false,true,false,false,false,true,true,false,true,true,true,true},new boolean[]{false,true,true,true,true,false,false,false,true,true,false,true,false,false,false,true,false,false,true,true,true,false,false,false,true,true,true},new boolean[]{false,false,true,true,false,true,true,false,false,true,true,true,false,false,true,false,true,true,true,true,false,true,true,true,true,false,false},new boolean[]{true,true,false,true,false,true,false,true,true,false,false,true,false,false,true,true,false,false,true,true,false,true,true,true,true,false,false},new boolean[]{true,false,true,false,true,true,true,true,true,false,false,false,false,false,false,true,true,false,false,false,false,false,false,true,false,true,true}});
    param0.add(new boolean[][]{new boolean[]{false,false,false,true},new boolean[]{false,true,true,true},new boolean[]{false,false,false,true},new boolean[]{false,true,true,true}});
    param0.add(new boolean[][]{new boolean[]{true,true,false,false,true,true,true,true,true,false,true,true,false,true,true,false,false,false,false,false,true,false,true,false,true,true,false,true},new boolean[]{false,false,true,true,false,false,false,true,true,false,false,true,false,true,false,false,true,true,false,false,true,true,true,true,false,true,false,false},new boolean[]{true,true,false,false,false,true,false,true,true,true,false,true,false,true,false,false,true,true,false,true,true,false,true,true,false,false,false,false},new boolean[]{true,false,true,false,true,false,true,false,false,true,true,true,true,true,true,false,true,false,false,true,false,false,false,true,false,true,false,true},new boolean[]{true,true,true,true,false,false,false,true,true,false,true,false,true,false,true,true,true,true,false,false,true,true,true,true,false,true,true,true},new boolean[]{true,false,true,true,true,true,true,true,false,true,false,false,false,false,false,true,false,true,true,false,true,true,false,true,false,false,false,true},new boolean[]{true,true,false,false,false,true,true,false,true,false,true,false,false,false,true,true,true,false,false,true,true,false,true,false,false,false,true,false},new boolean[]{false,true,true,true,true,false,false,true,false,false,false,false,false,false,false,false,true,false,true,false,false,true,false,true,true,true,false,true},new boolean[]{true,false,true,false,false,false,true,false,true,true,true,true,false,true,true,true,false,false,true,true,false,false,false,false,true,false,false,false},new boolean[]{false,false,true,true,false,true,false,false,true,true,true,true,false,false,true,false,false,true,true,false,true,false,true,true,false,true,true,true},new boolean[]{true,false,true,true,true,true,false,true,true,true,false,true,true,false,false,false,true,false,true,true,true,true,true,false,false,false,false,false},new boolean[]{false,false,false,false,true,false,true,true,true,false,false,false,false,true,false,false,true,true,false,true,true,true,true,true,true,true,true,false},new boolean[]{false,false,false,true,true,false,false,true,false,false,false,false,true,true,true,true,false,false,true,true,true,true,true,true,true,true,false,false},new boolean[]{false,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,false,false,false,false,true,false,true,false},new boolean[]{false,true,false,false,false,true,true,false,false,true,false,true,false,true,false,true,true,false,true,true,false,false,true,false,true,false,false,true},new boolean[]{true,true,false,true,true,true,true,true,false,false,false,true,true,false,false,true,true,true,false,false,false,false,true,false,true,true,false,true},new boolean[]{true,false,true,false,false,false,true,true,false,true,true,false,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,true},new boolean[]{true,false,true,false,true,false,false,false,true,true,true,false,true,true,true,false,false,false,false,false,true,true,true,true,true,true,false,false},new boolean[]{true,false,true,false,true,true,true,false,false,false,false,false,false,false,true,true,false,false,false,true,true,true,true,false,true,false,false,false},new boolean[]{false,false,true,false,true,false,true,false,true,true,false,true,true,true,false,false,true,true,true,false,false,false,false,false,false,false,false,false},new boolean[]{true,false,true,false,true,true,true,true,false,true,true,false,false,true,true,false,true,false,true,true,true,true,true,true,false,false,true,false},new boolean[]{true,false,false,true,false,false,false,false,false,true,true,false,false,true,false,false,true,false,true,false,true,false,true,true,false,true,false,false},new boolean[]{false,true,true,true,true,true,true,false,false,true,true,false,true,false,true,true,true,false,true,true,true,true,false,true,false,false,false,false},new boolean[]{true,true,false,false,true,true,false,false,true,false,false,false,true,false,false,false,false,false,true,true,true,false,true,true,false,false,true,false},new boolean[]{false,true,true,true,true,true,true,true,false,true,false,false,false,true,true,false,false,true,true,false,false,true,false,true,true,false,true,false},new boolean[]{true,true,true,true,true,true,true,true,false,true,false,false,true,false,true,false,true,true,true,true,false,false,true,false,true,false,true,true},new boolean[]{true,false,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,false,true,false,false,true,true,true,true,false,true},new boolean[]{false,true,true,false,false,false,true,true,true,true,false,true,true,false,false,false,true,true,true,true,false,true,true,true,true,false,true,false}});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(4);
    param1.add(2);
    param1.add(30);
    param1.add(7);
    param1.add(13);
    param1.add(19);
    param1.add(15);
    param1.add(3);
    param1.add(18);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_NUMBER_ENDLESS_POINTS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_NUMBER_ENDLESS_POINTS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
