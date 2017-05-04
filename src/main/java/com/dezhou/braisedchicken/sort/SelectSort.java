package com.dezhou.braisedchicken.sort;

public class SelectSort {
  public int[] solve(int[] array) {
    if (array == null) {
      return array;
    }
    int n = array.length;
    for (int i = 0; i < n-1; i++){
      int index = i;
      for (int j = i+1; j < n; j++){
        if(array[j] < array[index]){
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