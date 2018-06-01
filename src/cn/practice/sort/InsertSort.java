package cn.practice.sort;
/**
 * 从插入排序可以看出，其原理是在一个已经排好序的序列中依次插入一个新的元素。
 * 如果碰到相等的元素，就把新元素插入相等元素的后面，
 * 即他们原来的顺序没有变化，因此插入排序是稳定的。
 * */
public class InsertSort {
    public static void main(String[] args){
        int[] list = new int[]{1,3,4,5,2,1,2,3,4,5};
        insertionSort(list);
        for(int i=0;i<list.length;i++){
            int i1 = list[i];
            System.out.println(i1);
        }
    }

    public static void insertionSort(int[] list){
        for (int i=0;i<list.length;i++){
            int currentElement = list[i];
            int k;
            for(k=i-1; k>=0 && list[k] > currentElement; k--){
                list[k+1] = list[k]; //如果当前值大于已排好序列表的k元素，则k元素后移
            }
            list[k+1] = currentElement;
        }
    }


}
