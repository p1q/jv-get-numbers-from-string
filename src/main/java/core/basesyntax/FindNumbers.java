package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        int[] tempArray = new int[text.length()];
        int tempArrayCurrentIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (isDigit(text.substring(i, i + 1))) {
                int tmp = Integer.valueOf(text.substring(i,
                        i + countDigitsQuantity(text.substring(i))));

                if (i > 0 && text.charAt(i - 1) == '-') {
                    tempArray[tempArrayCurrentIndex] = -tmp * 2;
                } else {
                    tempArray[tempArrayCurrentIndex] = tmp * 2;
                }

                tempArrayCurrentIndex++;
                i += countDigitsQuantity(text.substring(i));
            }
        }
        return Arrays.copyOf(tempArray, tempArrayCurrentIndex);
    }

    private boolean isDigit(String subString) {
        if (subString != null && !subString.isEmpty()) {
            String digits = "0123456789";
            return digits.contains(subString);
        } else {
            return false;
        }
    }

    private int countDigitsQuantity(String subString) {
        int counter = 0;
        int i = 0;

        while (isDigit(subString.substring(i, i + 1))) {
            counter++;
            i++;
            if (i == subString.length()) {
                break;
            }
        }
        return counter;
    }
}
