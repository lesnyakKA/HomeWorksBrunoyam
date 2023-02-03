package yandex.lesnyakKA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String lastName;
    private int numberGroup;
    private int[] estimations;

    public Student(String lastName, int numberGroup, int[] estimation) {
        this.lastName = lastName;
        this.numberGroup = numberGroup;
        this.estimations = estimation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int[] getEstimation() {
        return estimations;
    }

    public void setEstimation(int[] estimation) {
        this.estimations = estimation;
    }

    @Override
    public String toString() {
        return "{" +
                "lastName='" + lastName + '\'' +
                ", numberGroup=" + numberGroup +
                ", estimation=" + Arrays.toString(estimations) +
                '}';
    }

    public int theBestEstimation() {

        int max = 0;
        int[] estimations = this.estimations;
        for (int item: estimations) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public boolean isGood() {
        List<Integer> array = new ArrayList<>();
        for (int item: this.estimations) {
            array.add(item);
        }

        if (array.contains(3) || array.contains(2) || array.contains(1)) {
            return false;
        }
        else {
            return true;
        }
    }
}
