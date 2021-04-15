package me.right42.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_42840 {

    private class Student {
        private int[] selectNumbers;
        private int id;
        private int score;

        public Student(int id, int... selectNumbers) {
            this.id = id;
            this.selectNumbers = selectNumbers;
        }

        public int getScore() {
            return score;
        }

        public void calculate(int[] rightAnswers) {
            int index = 0;
            for (int rightAnswer : rightAnswers) {
                if(rightAnswer == this.selectNumbers[index]) {
                    this.score++;
                }
                if ((index + 1) == this.selectNumbers.length) {
                    index = 0;
                } else {
                    index++;
                }
            }
        }

        public int getId() {
            return this.id;
        }
    }

    public int[] solution(int[] answers) {
        Student student1 = new Student(1,1, 2, 3, 4, 5);
        Student student2 = new Student(2,2, 1, 2, 3, 2, 4, 2, 5);
        Student student3 = new Student(3,3, 3, 1, 1, 2, 2, 4, 4, 5, 5);

        List<Student> students = Arrays.asList(student1, student2, student3);

        int maxScore = students.stream()
                            .mapToInt((student) -> {
                                student.calculate(answers);
                                return student.getScore();
                            })
                            .max()
                            .getAsInt();

        List<Integer> result = new ArrayList<>();

        for (Student student : students) {
            if(student.getScore() == maxScore) {
                result.add(student.getId());
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
