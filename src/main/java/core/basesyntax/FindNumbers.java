package core.basesyntax;

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
        text = text.replaceAll("[^0-9, -]"," ").trim();
        String[] numbersString = text.split("\\s+");

        int[] numbersInt = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbersInt[i] = Integer.valueOf(numbersString[i]) * 2;
        }
        return numbersInt;
    }
}
