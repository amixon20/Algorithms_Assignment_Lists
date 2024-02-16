class AList {
    private Book[] listArray;
    private static final int defaultSize = 4;
    private int size;

    public AList() {
        this(defaultSize);
    }
    public AList(int maxSize) {
        this.listArray = new Book[maxSize];
        this.size = 0;
    }
    void listAdd(Book p) {
        if (listArray.length == size) {
            resize(size * 2);
        }
        listArray[size] = p;
        ++size;
    }
    void listRemove(int pos) {
        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; ++i) {
                listArray[i] = listArray[i + 1];
            }
            --size;
        }
    }
    @Override
    public String toString() {
        String string = "";
        for(int i = 0; i < size; ++i) {
            string += "\n" + "{Title: " + listArray[i].title + ", Author: " + listArray[i].author
                    + ", Price: " + listArray[i].price + "}";
        }
        return string;
    }
    public void resize(int newSize) {
        Book[] newArray = new Book[newSize];
        for(int i = 0; i < size; ++i) {
            newArray[i] = listArray[i];
        }
        listArray = newArray;
    }
}

