import java.util.List;

class CompositeWall implements CompositeBlock {
    private List<Block> blocks;

    public CompositeWall(List<Block> blocks) { // prszyjmujemy liste bloków jako paranetr
        this.blocks = blocks;
    }

    @Override
    public String getColor() {
        return blocks.get(0).getColor(); // metoda zwraca kolor pierwszego bloku z listy.
        //liczymy na to ze  wszystkie bloki w liście mają ten sam kolor.
    }

    @Override
    public String getMaterial() {
        return blocks.get(0).getMaterial(); // metoda podobna do koloru tylko dotyczy kategorii material
    }

    @Override
    public List<Block> getBlocks() { //  metoda zwraca listę wszystkich bloków zawartych w kompozycie
        return blocks;
    }
}