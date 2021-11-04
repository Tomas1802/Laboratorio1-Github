class NumberGenerator {
    public static int getRandomNumber(int number1, int number2) {
        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
}