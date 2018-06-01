package cn.practice.sort;
/**
 * 从选择排序算法可以看出，其原理是对待排序列从左到右，
 * 为每个位置寻找当前最小的元素，比如为list[0]选择list中最小的元素与原来list[0]出的元素交换，
 * 为list[1]从剩下元素中选择最小的与其交换，依次类推。但这个算法是不稳定的，比如“4 8 3 4 2 9 7”，
 * 为第一个位置选择最小的元素2，与第一个位置的4交换，这破环了原来两个4之间的顺序。
 * */
public class ChoiceSort {
    public static void main(String[] args){
        int[] list = new int[]{1,3,4,5,2,1,2,3,4,5};
        selectionSort(list);
        for(int i=0;i<list.length;i++){
            int i1 = list[i];
            System.out.println(i1);
        }
    }
    public static void selectionSort(int[] list){
        for (int i=0;i<list.length - 1;i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            for(int j=i+1;j<list.length;j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
