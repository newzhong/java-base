package sort;

import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;

/**
 * <b>功能描述:冒泡排序</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-01 16:03
 * @since JDK 1.8
 */
public class PoolSort {
    public static int[] easyPoolSort(int[] numbers) {

        int changeNnum = 0;
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }
        int length = numbers.length;

        boolean change = true;
        for (int i = 0; i < length - 1 && change; i++) {
            change = false;
            changeNnum++;
            for (int j = 0; j < length - 1 - i; j++) {
                int temp = 0;
                // 交换
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    change = true;
                }
            }

        }
        return numbers;
    }

    /***
     * 标志冒泡排序
     * @param numbers
     * @return
     */
    public static int[] signSort(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            boolean channge = true;
            for (int j = 0; j < length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    channge = false;
                }
            }
            if (channge) {
                break;
            }
        }
        return numbers;
    }

    /***
     * 鸡尾酒排序---左右扫描
     * @param numbers
     * @return
     */
    public static int[] cocktailSort(int [] numbers){
        int length = numbers.length;
        for (int i = 0; i < length/2; i++) {

            // 1.奇数左边开始
            boolean isChange = true;
            for (int j = i; j < length -i -1; j++) {
                if (numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    isChange = false;
                }
            }
            if (isChange){
                break;
            }
            isChange = true;
            for (int j = length - i - 1; j > i; j --) {
                if (numbers[j] < numbers [j -1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    isChange = false;
                }
            }

            if (isChange){
                break;
            }
        }
        return numbers;

    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 9, 1, 0, -1};
        int[] ints = cocktailSort(numbers);
        for (int anInt : ints) {
            System.out.print(anInt);
            System.out.print(" ");
        }
    }
}