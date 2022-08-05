package JavaProject.StudentManagementSystem.Version1$2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 2022/8/4 1.2
 * 更新内容:
 * update:
 * <p>
 * 1. ID不需要输入, 会自动按顺序生成, 并输出生成的ID。
 * 1. ID is automatically generated in sequence, and the generated ID is displayed.
 * <p>
 * 2. 删除了ID判断的代码, 提升了性能。
 * 2. ID determination code was removed, improving performance.
 * <p>
 * 3. 增加删除确认, 防止误删。
 * 3. Add deletion confirmation to prevent deletion by mistake.
 * <p>
 * @author 86151
 */
public class Template {

    Scanner scanner = new Scanner(System.in);

    Calendar calendar = Calendar.getInstance();
    private int[] id = new int[10];
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
            Arrays.fill(id, 0);
        }
        currentIndex++;
        if (currentIndex == id.length - 1) {
            int[] temp1 = new int[id.length * 2];
            Arrays.fill(id, 0);
            int[] temp2 = new int[this.age.length * 2];
            String[] temp3 = new String[this.name.length * 2];
            for (int i = 0; i < currentIndex - 1; i++) {
                temp1[i] = id[i];
                temp2[i] = this.age[i];
                temp3[i] = this.name[i];
            }
            id = temp1;
            this.age = temp2;
            this.name = temp3;
        }
        String timeOfEnrollment = year + " year " + (month + 1) + " month " + day + " day " + hour + " hour " + minute + " minute " + second + " second " + millisecond + " millisecond ";
        timeOfEnrollments[currentIndex - 1] = timeOfEnrollment;
        if (currentIndex == 1) {
            id[currentIndex - 1] = id[currentIndex - 1] + 1;
        } else {
            id[currentIndex - 1] = id[currentIndex - 2] + 1;
        }
        this.age[currentIndex - 1] = age;
        this.name[currentIndex - 1] = name;
        System.out.println("Add succeed ID:" + id[currentIndex - 1]);
    }

    /**
     * 删除学生
     * Delete student
     */
    public void deleteStudent(int id) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(), scanner.nextLine());
        }
        int findTheJudgment = 0;
        for (int i = 0; i < this.id.length - 1; i++) {
            if (id == this.id[i]) {
                findTheJudgment++;
                int[] temp1 = new int[this.id.length - 1];
                int[] temp2 = new int[this.age.length - 1];
                String[] temp3 = new String[this.name.length - 1];
                for (int j = 0; j < this.id.length - 1; j++) {
                    temp1[i + j] = this.id[i + j + 1];
                    temp2[i + j] = this.age[i + j + 1];
                    temp3[i + j] = this.name[i + j + 1];
                }
                this.id = temp1;
                this.age = temp2;
                this.name = temp3;
                break;
            }
        }

        if (findTheJudgment == 0){
            System.out.println("ID input error!");
        } else {
            currentIndex--;
        }
    }

    /**
     * 更改学生
     * Set student
     */
    public void setStudent(int id,int age,String name) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(), scanner.nextLine());
        }
        int findTheJudgment = 0;
        for (int i = 0; i < this.id.length - 1; i++) {
            if (id == this.id[i]) {
                findTheJudgment++;
                this.age[i] = age;
                this.name[i] = name;
                break;
            }
        }
        if (findTheJudgment == 0){
            System.out.println("ID is error!");
        }
    }

    /**
     * 查找学生
     * Find student
     */
    public void findStudent(int id) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(), scanner.nextLine());
        }
        int findTheJudgment = 0;
        for (int i = 0; i < this.id.length - 1; i++) {
            if (id == this.id[i]) {
                findTheJudgment++;
                System.out.println("age: " + age[i]);
                System.out.println("name: " + name[i]);
                System.out.println("time of enrollment: " + timeOfEnrollments[i]);
                break;
            }
        }
        if (findTheJudgment == 0) {
            System.out.println("ID input error!");
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
