@SuppressWarnings("unchecked")
public class GenericAList<T> {
        private T[] listArray;
        private static final int defaultSize = 4;
        private int size;

        public GenericAList() {
            this(defaultSize);
        }
        public GenericAList(int maxSize) {
            this.listArray = (T[]) new Object[maxSize];
            this.size = 0;
        }
        void listAdd(T p) {
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
                string += "\n" + listArray[i];
            }
            return string;
        }
        public void resize(int newSize) {
            T[] newArray = (T[]) new Object[newSize];
            for(int i = 0; i < size; ++i) {
                newArray[i] = listArray[i];
            }
            listArray = newArray;
        }
    }

