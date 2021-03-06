package inputOutputEnums;

public enum Input {
    BESTSELLER (1),
    RATING (8),
    REVIEWCOUNT (15),
    AGEGROUP (4),
    THEMES (20),
    TYPE  (4);

    private final int size;
    Input(int size) {
        this.size = size;
    }
    
    public int size() { return size; }
    
}
