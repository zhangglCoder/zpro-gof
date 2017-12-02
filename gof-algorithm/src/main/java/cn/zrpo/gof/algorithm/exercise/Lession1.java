package cn.zrpo.gof.algorithm.exercise;


/**
 * 斐波那契数列
 * 1，1，2，3，5，8，13，21，34，55
 */
public class Lession1 {

    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int j = 0; j < 30; j++) {
            System.out.print(fun(j) + "\t");
        }
        long end1 = System.currentTimeMillis();

        System.out.println();
        System.out.println("递归耗时="+(end1 - start1));

        System.out.println();

        long start2 = System.currentTimeMillis();
        for (int j = 1; j <= 10000; j++) {
            System.out.print(fun2(j) + "\t");
        }
        long end2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("循环耗时="+(end2 - start2));
    }

    /**
     * 递归实现
     * @param n
     * @return
     */
    public static Integer fun(Integer n){
        if(n == 1 || n == 0){
            return 1;
        }
        return fun(n -1 ) + fun(n - 2);
    }

    /**
     * 非递归
     * @param n
     * @return
     */
    public static int fun2(int n){
        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
