class SimpleBlock implements Block { // prszechowywanie prywatnych  pol z informacjami o blockach
    private String color;
    private String material;

    public SimpleBlock(String color, String material) { // konstuktor  bloku
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() { // metoda implementuje metodę z interfejsu Block i zwraca kolor bloku.
        return color;
    }

    @Override
    public String getMaterial() { // metoda implementuje metodę z interfejsu Block i zwraca material bloku.
        return material;
    }
}
