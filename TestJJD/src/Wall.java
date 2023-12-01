
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.Optional;

class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        //  przeszukujev listy bloków w poszukiwaniu pierwszego bloku o zadanym kolorze
        return blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) { //  przeszukujev listy bloków w poszukiwaniu pierwszego bloku o zadanym materiale
        return blocks.stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size(); // metoda zwraca liczbę bloków w strukturze
    }
}

