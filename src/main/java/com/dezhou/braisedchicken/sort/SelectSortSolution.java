package com.dezhou.braisedchicken.sort;

public class SelectSortSolution {

    public static void main(String[] args) {

        int[] input = {4, 2, -3, 6, 1};
        SelectSortSolution selectSortSolution = new SelectSortSolution();
        int[] output = selectSortSolution.solve(input);
        for (int anOutput : output) {
            System.out.print(anOutput + " ");
        }

    }

    private int[] solve(int[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}