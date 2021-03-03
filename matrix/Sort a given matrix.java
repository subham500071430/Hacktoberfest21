class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int[] temp=new int[N*N];
        int k=0;
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[i].length;j++){
                temp[k++]=Mat[i][j];
            }
        }
        int x=0;
        Arrays.sort(temp);
        for(int i=0;i<Mat.length;i++){
            for(int j=0;j<Mat[i].length;j++){
                Mat[i][j]=temp[x++];
            }
        }
        return Mat;
    }
};
