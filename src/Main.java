import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] sortArr={15, 10, 13, 8, 9, 5};
        int min=0, swap=0;
        for(int i=0;i<sortArr.length-1;i++)
        {
            min=sortArr[i];
            for(int j=i+1;j<sortArr.length;j++)
            {
                if(min>sortArr[j])
                {
                    swap=sortArr[j];
                    sortArr[j]=min;
                    min=swap;
                }
                sortArr[i]=min; 
            }
        }
        System.out.println(Arrays.toString(sortArr));
    }
}
