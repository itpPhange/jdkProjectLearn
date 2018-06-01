package cn.practice.sort;
/**
 * 快速排序是不稳定的，
 * 如“ 5 3 3 4 3 8 9 10 11”第一次切分，
 * 主元5要和元素3交换，
 * 即改变了3和另两个相等元素之间的顺序。
 *
 * 这里使用的是伪代码，方便理解。
 * */
public class FastSort {
    public static void quickSort(int[] list){
        if(list.length > 1){
            //select a pivot;
            //一般默认主元为第一个元素，同时从两边向中间比较
            //前向找到一个大于主元的元素，后向找到一个小于主元的元素，交换这两个元素
            //直到前向元素下标大于后向元素下标，把主元与此时后向元素交换，即主元前的元素
            //都小于主元，主元后的元素都大于主元。
            //partition list into list1 and list2 such that
            //all elements in list1 <= pivot and
            //all elements in list2 >pivot;
            //quickSort(list1);
            //quickSort(list2);
        }
    }
}
