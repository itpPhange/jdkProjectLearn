package cn.practice.sort;


import java.util.ArrayList;
import java.util.List;


/***
 * BubbleSort 冒泡排序
 * 不稳定
 * 从上述冒泡排序的算法可以看出，其原理就是从左往右相邻的元素两两对比，
 * 将大的元素往后移直到排序完成。如果两个元素相等，是不会交换其位置的，因此冒泡排序是稳定的。
 * 注：如果将交换条件改为“list[i]>=list[i+1]”就不是稳定的了。
 */
public class BubbleSort {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        for (int i=0;i<10;i++){
            li.add(i);
        }
        for (int i=10;i>1;i--){
            li.add(i);
        }
        System.out.println(li);
        for (int i=1;i<li.size();i++){
            for (int k = 0;k<li.size()-i;k++){
                if (li.get(k)>=li.get(k+1)){
                    Integer integer = li.get(k);
                    Integer integers = li.get(k+1);
                    li.set(k+1,integer);
                    li.set(k,integers);
                }
            }
        }

        System.out.println(li);

    }

}
