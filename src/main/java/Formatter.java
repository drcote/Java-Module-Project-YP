public class Formatter {
    public String rubCoast(double coast) {
        String rubString;
        int lastDigit = (int) Math.floor(coast) % 10;
        int secondToLastDigit = ((int) Math.floor(coast) / 10) % 10;
        if (secondToLastDigit == 1) {
            rubString = "рублей";
        } else {
            rubString = switch (lastDigit) {
                case 1 -> "рубль";
                case 2, 3, 4 -> "рубля";
                default -> "рублей";
            };
        }

        return String.format("%.2f %s.", coast, rubString);
    }
}
