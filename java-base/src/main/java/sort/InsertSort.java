package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <b>功能描述:直接插入排序</b><br>
 * @author newzhong
 * @version 1.0.0
 * @since JDK 1.8
 *
 * @Note
 * <b>创建时间:</b> 2021-04-18 20:15 
 */
public class InsertSort {
    /***
     * 升序
     * 简单的说就是 在要排序的一组数中，假设前面(n-1)[n>=2] 个数已经是排 好顺序的，
     * 现在要把第n 个数插到前面的有序数中，使得这 n个数 也是排好顺序的。如此反复循环，直到全部排好顺序。
     *
     * @param numbers
     * @return
     */
    public int[] insertSort(int[] numbers){

        int length = numbers.length;
        for (int i = 1; i < length; i++) {

            // 1
            int temp = numbers[i];
            //   3 1 1
            for (int j = i -1; j >=0 ; j--) {
                if (temp < numbers[j]){
                    numbers[j] = temp;
                }
            }
            numbers[i] = numbers[i-1];
        }
        return (numbers);
    }
    public String PrintMinNumber(int [] numbers) {
        int l = numbers.length;
        if(l==0 || numbers == null){
            return null;
        }

        String[] result = new String[l];
        for(int i = 0; i< l;i++){
           result[i] = String.valueOf(numbers[i]);
        }
        //Arrays.sort(result);
        Arrays.sort(result,(a,b)->{
            String c=a+b;
            String d=b+a;
            return c.compareTo(d);
        });
        StringBuffer s = new StringBuffer();

        for(String str: result){
            s.append(str);
        }

        return s.toString();
    }
    /**
     *
     * @param s string字符串
     * @return int整型
     */

    public int romanToInt (String s) {
        char c = s.charAt(0);
        // write code here
        int result = 0;
        // "LVIII"  58
        return 0;

    }
    public static void main(String[] args) {
        //InsertSort insertSort = new InsertSort();
        //int[] insertSortNum = {3,32,321};
        //String s = insertSort.PrintMinNumber(insertSortNum);

        int i = Integer.parseInt( isNullNum("null"));
        System.out.println(i);

    }
    public static String isNullNum(String str){
        if (isBlank(str) || "null".equals(str)){
            str = "0";
        }
        return str;

    }
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

}