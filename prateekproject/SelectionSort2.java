package prateekproject;

public class SelectionSort2 {
    public static void main(String[] args) {
        String[] names = {"Prateek", "Nimesh", "Sinay", "Suprativ", "Ansuman", "Dikhita"};
        int minIdx;
        String temp;
        for (int i = 0; i < names.length; i++) {
            minIdx = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            temp = names[i];
            names[i] = names[minIdx];
            names[minIdx] = temp;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
