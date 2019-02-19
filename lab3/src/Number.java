class Number {
    private String[] hundreds = new String[]{"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
            "восемьсот", "девятьсот"};
    private String[] tens = new String[]{"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
            "восемьдесят", "девяносто"};
    private String[] units = new String[]{"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private String[] elevens = new String[]{"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    String[] getHundreds() {
        return hundreds;
    }

    String[] getTens() {
        return tens;
    }

    String[] getUnits() {
        return units;
    }

    String[] getElevens() {
        return elevens;
    }
}
