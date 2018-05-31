package cn.practice.sort;
/**
* 从归并算法可以看出，其原理是将待排序列递归地划分为短序列，
 * 指导每部分都只包含一个元素，然后再合并，合并时如果两个元素相等也会按照元素之前的顺序，
 * 把下标小的元素先放入结果列表中，依然没有破环相同元素之间原本的顺序，因此归并算法也是稳定的。
 * 注：如果在合并中，判定条件改为“if(list1[current1] < list2[current2])”则不稳定。
 *
*
* */
public class MergeSort{


    public static void main(String[] args){

        int[] list2 = new int[]{1,4,2,3,7,5};
        int[] list1 = new int[]{144,4221,32312312,3123123,32222,11};


        int[] merge = merge(list1, list2);

       for (int i=0;i<merge.length;i++){
           System.out.println(merge[i]);
       }


    }
    public static int[] merge(int[] list1,int[] list2){
        int[] temp = new int[list1.length+list2.length];
        int current1 = 0,current2 =0,current3 = 0;
        while(current1<list1.length && current2<list2.length) {
            if (list1[current1] <= list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }
        while (current1<list1.length)
            temp[current3++] = list1[current1++];
        while (current2<list2.length)
            temp[current3++] = list2[current2++];
        return temp;
    }

}