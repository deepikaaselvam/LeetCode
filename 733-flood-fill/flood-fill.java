class Solution {
    private static int[][] change(int[][]image,int temporary,int row,int col,int sr,int sc,int color)
    {
        if(row<0||col<0||row>=image.length||col>=image[row].length||image[row][col]!=temporary)
        {
            return image;
        }
        if(image[row][col]==temporary)
        {
            image[row][col]=color;
          
        }
      change(image,temporary,row,col-1,sr,sc,color);
      change(image,temporary,row,col+1,sr,sc,color);
      change(image,temporary,row-1,col,sr,sc,color);
      change(image,temporary,row+1,col,sr,sc,color);
     
      return image;

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor==color) return image;
        int temp = image[sr][sc];
        for(int ind =0;ind<image.length;ind+=1)
        {
            for(int jind =0;jind<image[ind].length;jind+=1)
            {
                if(ind==sr&& jind==sc)
                {
                    // image[ind][jind]=color;
                    change(image,temp,ind,jind,sr,sc,color);
                }
            }
        }
        return image;
    }
}