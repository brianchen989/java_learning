void main() {
    for (int i = 0;i<2;i++){
        for(int j = 0;j<3;j++){
            System.out.println(i+","+j);
        }
    }
    int[][] nums ={{1,2,3},{4,5,6},{7,8,9}};
    for (int i = 0;i<3;i++){
        for(int j = 0;j<3;j++){
            System.out.print(nums[i][j]);
        }
        System.out.println();
    }
}//break,comtinue same as python