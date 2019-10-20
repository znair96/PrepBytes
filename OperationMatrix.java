public class OperationMatrix {
    public static void main(String[] args)
    {
        int[][] m1 = {{2,0},{1,2}};
        int[][] m2 = {{1,2},{3,4}};
        int[][] transpose = transposeMatrix(m2);
        int[][] product = new int[m1.length][m2[0].length];

        for(int i=0;i<m1.length;i++)
        {
            int[] oneDArraym1 = getHorizontal2D1DArray(i,m1);
            for(int j=0;j<m2[0].length;j++)
            {
                int[] oneDArraym2 = getVertical2D1DArray(j,transpose);
                product[i][j]=calculateMatrixMult(oneDArraym1,oneDArraym2);
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
        int[][] sumMatrix = addMatrix(m1,m2);

    }
    public static int[] getHorizontal2D1DArray(int index,int[][] arr)
    {
        int[] arr1D = new int[arr[index].length];
        //System.out.println("The size of One D array is "+arr[index].length);
        for(int i=0;i<arr1D.length;i++)
        {
            arr1D[i] = arr[index][i];
        }
        return arr1D;
    }
    public static int[] getVertical2D1DArray(int index,int[][] arr)
    {
        //System.out.println(arr.length+"  "+arr[0].length);
       // int[][] newArray = transposeMatrix(arr);
        int[] arr1VD = new int[arr[index].length];
       // System.out.println("The size of One D array is "+arr[index].length);
        for(int i=0;i<arr1VD.length;i++)
        {
            arr1VD[i] = arr[index][i];
        }
        return arr1VD;
    }
    public static int[][] transposeMatrix(int[][] arr)
    {
        //System.out.println(arr.length);
        int[][] transpose = new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j] = arr[j][i];
                //System.out.print(transpose[i][j]+" ");
            }
            //System.out.println();
        }
        return transpose;
    }
    public static int calculateMatrixMult(int[] A,int[] B)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum = sum+A[i]*B[i];
        }
        return sum;
    }
        public static int[][] addMatrix(int[][] arr1,int[][] arr2)
    {
        if(arr1.length == arr2.length)
        {
            int[][] sumMatrix = new int[arr1.length][arr2.length];
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr1.length;j++)
                {
                    sumMatrix[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return sumMatrix;
        }
        else
        {
            System.out.print("");
            return null;
        }
    }
}
