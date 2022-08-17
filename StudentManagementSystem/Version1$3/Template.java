package JavaProject.StudentManagementSystem.Version1$3;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 2022/8/16 ~ 2022/8/17 1.3 END
 * 更新内容:
 * update:
 * <p>
 * 1. 增加了输入异常处理, 当用户输入错误内容时可以防止程序崩溃。
 * 1. Input exception handling has been added to prevent the program
 * from crashing when the user enters incorrect content.
 * <p>
 * 2. 更改了错误的英文, 防止误解。
 * 2. The wrong English has been changed to prevent misunderstandings.
 * <p>
 * bilibili: 代码永远不写注释
 * Github: small-yupi
 * CSDN: new_command
 * 邮箱: zsj20143688@163.com
 * @author 86151
 */
public class Template {

    Scanner scanner = new Scanner(System.in);

    Calendar calendar = Calendar.getInstance();
    private int[] number = new int[10];
    private int[] age = new int[10];
    private String[] name = new String[10];
    private int currentIndex = 0;
    private int year = calendar.get(Calendar.YEAR);
    private int month = calendar.get(Calendar.MONTH);
    private int day = calendar.get(Calendar.DAY_OF_MONTH);
    private int hour = calendar.get(Calendar.HOUR);
    private int minute = calendar.get(Calendar.MINUTE);
    private int second = calendar.get(Calendar.SECOND);
    private int millisecond = calendar.get(Calendar.MILLISECOND);

    private String timeOfEnrollment = year + " year " + (month + 1) + " month " + day + " day " + hour + " hour " + minute + " minute " + second + " second " + millisecond + " millisecond ";

    private String[] timeOfEnrollments = new String[10];



    /**
     * 添加学生
     * Add student
     */
    public void addStudent(int age, String name) {
        if (currentIndex == 0){
            Arrays.fill(number, 0);
        }
        currentIndex++;
        if (currentIndex == number.length - 1) {
            int[] temp1 = new int[number.length * 2];
            Arrays.fill(number, 0);
            int[] temp2 = new int[this.age.length * 2];
            String[] temp3 = new String[this.name.length * 2];
            for (int i = 0; i < currentIndex - 1; i++) {
                temp1[i] = number[i];
                temp2[i] = this.age[i];
                temp3[i] = this.name[i];
            }
            number = temp1;
            this.age = temp2;
            this.name = temp3;
        }
        String timeOfEnrollment = year + " year " + (month + 1) + " month " + day + " day " + hour + " hour " + minute + " minute " + second + " second " + millisecond + " millisecond ";
        timeOfEnrollments[currentIndex - 1] = timeOfEnrollment;
        if (currentIndex == 1) {
            number[currentIndex - 1] = number[currentIndex - 1] + 1;
        } else {
            number[currentIndex - 1] = number[currentIndex - 2] + 1;
        }
        this.age[currentIndex - 1] = age;
        this.name[currentIndex - 1] = name;
        System.out.println("Add succeed number:" + number[currentIndex - 1]);
    }

    /**
     * 删除学生
     * Delete student
     */
    public void deleteStudent(int number) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(), scanner.nextLine());
        }
        int findTheJudgment = 0;
        for (int i = 0; i < this.number.length - 1; i++) {
            if (number == this.number[i]) {
                findTheJudgment++;
                int[] temp1 = new int[this.number.length - 1];
                int[] temp2 = new int[this.age.length - 1];
                String[] temp3 = new String[this.name.length - 1];
                for (int j = 0; j < this.number.length - 1; j++) {
                    temp1[i + j] = this.number[i + j + 1];
                    temp2[i + j] = this.age[i + j + 1];
                    temp3[i + j] = this.name[i + j + 1];
                }
                this.number = temp1;
                this.age = temp2;
                this.name = temp3;
                break;
            }
        }

        if (findTheJudgment == 0){
            System.out.println("Number input error!");
        } else {
            currentIndex--;
        }
    }

    /**
     * 更改学生
     * Set student
     */
    public void setStudent(int number, int age, String name) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(), scanner.nextLine());
        }
        int findTheJudgment = 0;
        for (int i = 0; i < this.number.length - 1; i++) {
            if (number == this.number[i]) {
                findTheJudgment++;
                this.age[i] = age;
                this.name[i] = name;
                break;
            }
        }
        if (findTheJudgment == 0){
            System.out.println("Number is error!");
        }
    }

    /**
     * 查找学生
     * Find student
     */
    public void findStudent(int number) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(), scanner.nextLine());
        }
        int findTheJudgment = 0;
        for (int i = 0; i < this.number.length - 1; i++) {
            if (number == this.number[i]) {
                findTheJudgment++;
                System.out.println("age: " + age[i]);
                System.out.println("name: " + name[i]);
                System.out.println("time of enrollment: " + timeOfEnrollments[i]);
                break;
            }
        }
        if (findTheJudgment == 0) {
            System.out.println("Number input error!");
        }
    }

    /**
     * 退出
     * Exit
     */
    public void exit() {
        System.exit(0);
    }
}
