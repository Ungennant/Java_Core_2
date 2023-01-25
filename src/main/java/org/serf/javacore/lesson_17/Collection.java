package org.serf.javacore.lesson_17;

public class Collection {

    private static Object[] array;

    public Collection(Object[] array) {
        this.array = array;
    }

    public class Forward implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    array[i] = 0;
                }
            }
            return array;
        }
    }

    public Forward createForward() {
        return new Forward();
    }

    public class Backward implements Iterator {

        int index = array.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            index -= 2;
            return array[index + 2];
        }
    }

    public Backward createBackward() {
        return new Backward();
    }

    public Iterator anonymous() {
        return new Iterator() {

            int index = array.length - 1;
            int counter;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Object next() {
                counter = index;
                index -= 3;
                if ((int) array[counter] % 2 == 1 || (int) array[counter] % 2 == -1) {
                    return array[counter];
                } else {
                    return "";
                }
            }
        };
    }

    public class ArraySort implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            for (int i = 0; i < array.length; i++) {
                if (i % 5 == 0 && (int) array[i] % 2 == 0){
                    array[i] = (int) array[i] - 100;
                }
            }
            return array;
        }
    }

    public ArraySort createArraySort(){
        return new ArraySort();
    }

    public static class ArraySortStatic implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            for (int i = 0; i < array.length; i++) {
                if(i % 2 == 0 && (int) array[i] % 2 == 0){
                    array[i] = 3;
                }
            }
            return array;
        }
    }

    public ArraySortStatic createArraySortStatic(){
        return new ArraySortStatic();
    }

}
