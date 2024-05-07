public class Formatter {
    public String rubCoast(double coast) {
        String rubString;
        int roundedNumber = (int) Math.floor(coast) % 10;
        rubString = switch (roundedNumber) {
            case 1 -> "рубль";
            case 2, 3, 4 -> "рубля";
            default -> "рублей";
        };
        return String.format("%.2f %s.", coast, rubString);
    }
}
