package yandex.lesnyakKA;

public class Main {
    public static void main(String[] args) {

//        №1
//        Rectangle rect = new Rectangle(15, 3);
//        System.out.println(rect.getLongRectangle());
//        System.out.println(rect.getPerimeterRectangle());

//        №2
//        int[] estimations = {3, 4, 3, 4, 2, 5};
//        Student currentStudent = new Student("Popov", 1254, estimations);
//        System.out.println(currentStudent.theBestEstimation());

//         №3

          int[] estimations1 = {3, 4, 5, 5, 2};
          int[] estimations2 = {4, 4, 5, 5, 5};
          int[] estimations3 = {3, 4, 5, 5, 2};


          Student student1 = new Student("Igor", 12, estimations1);
          Student student2 = new Student("Alena", 12, estimations2);
          Student student3 = new Student("Egor", 12, estimations3);
          Student[] group = {student1, student2, student3};


          for (Student item: group) {
              if (item.isGood()) {
                  System.out.println(item);
              }
          }
    }
}