/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkday2;

/**
 *
 * @author yeerick
 */
public class IntegerRandomArray {
    
    public static void main(String[] args) {

        int[] randomNumber = new int[50];

        for (int i = 0; i < 50; i++) {
            randomNumber[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < 49; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (randomNumber[i] == randomNumber[j]) {
                    randomNumber[j] = -1;
                }
            }
        }

        for (int i = 0; i < randomNumber.length; i++) {
            if (randomNumber[i] == -1) {
                int[] temp = new int[(randomNumber.length - 1)];

                System.arraycopy(randomNumber, 0, temp, 0, i);
                System.arraycopy(randomNumber, i + 1, temp, i, randomNumber.length - i - 1);
                randomNumber = temp;
                i--;
            }
        }

        for (int i = 0; i < randomNumber.length; i++) {
            System.out.println(i + "|" + randomNumber[i]);
        }
        System.out.println("Array size is " + randomNumber.length);

        arrayGet(randomNumber, 5);
        sublist(randomNumber, 3, 6);
        randomNumber = null;
        System.out.println(randomNumber);
    }

    public static void arrayGet(int[] number, int index) {
        System.out.println(number[index]);
    }

    public static void sublist(int[] number, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + "|" + number[i]);
        }
    }
}

/*Output:
0|16
1|95
2|14
3|32
4|78
5|81
6|22
7|64
8|4
9|30
10|24
11|36
12|18
13|97
14|70
15|2
16|61
17|85
18|1
19|38
20|46
21|67
22|69
23|41
24|37
25|65
26|84
27|79
28|13
29|35
30|6
31|29
32|20
33|56
34|45
35|83
36|9
37|40
38|5
39|7
40|62
41|52
Array size is 42
81
3|32
4|78
5|81
6|22
null
*/