package JavaProject.StudentManagementSystem.Version1$1;

import java.util.Scanner;
import java.util.Calendar;

/**
 * 2022/8/2 - 2022/8/3 1.1 END
 * 更新内容:
 * update:
 * <p>
 * 1.新增学生数量检查, 如果没有学生, 则不能进行删除、更改、查找学生操作。
 * 1.Check the number of new students. If there are no students, you cannot delete,
 * change, or search for students.
 * <p>
 * 2.新增学生ID检查, 如果相同则不能使用此ID进行添加学生。
 * 2. Add a student ID check. If the ID is the same, you cannot use this ID to add students.
 * <p>
 * 3. 新增添加时间, 自动记录添加时间。
 * 3. The add time is automatically recorded.
 * <p>
 * 4. 及时停止循环, 增加性能。
 * 4. Stop the loop in time to increase performance.
 * bilibili: 代码永远不写注释
 * Github: small-yupi
 * CSDN: new_command
 * 邮箱: zsj20143688@163.com
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
    public void addStudent(int id, int age, String name) {
        currentIndex++;
        int idFind = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (id == this.id[i]) {
                System.out.println("For this id.");
                idFind++;
                break;
            }
        }
        if (idFind == 0){
            if (currentIndex == this.id.length - 1) {
                int[] temp1 = new int[this.id.length * 2];
                int[] temp2 = new int[this.age.length * 2];
                String[] temp3 = new String[this.name.length * 2];
                for (int i = 0; i < currentIndex - 1; i++) {
                    temp1[i] = this.id[i];
                    temp2[i] = this.age[i];
                    temp3[i] = this.name[i];
                }
                this.id = temp1;
                this.age = temp2;
                this.name = temp3;
            }
            String timeOfEnrollment = year + " year " + (month + 1) + " month " + day + " day " + hour + " hour " + minute + " minute " + second + " second " + millisecond + " millisecond ";
            timeOfEnrollments[currentIndex - 1] = timeOfEnrollment;
            this.id[currentIndex - 1] = id;
            this.age[currentIndex - 1] = age;
            this.name[currentIndex - 1] = name;
        }

    }

    /**
     * 删除学生
     * Delete student
     */
    public void deleteStudent(int id) {
        if (currentIndex == 0) {
            System.out.println("No students yet, please add first.");
            System.out.println("Please input student's id and age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(),scanner.nextInt(),scanner.nextLine());
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
            System.out.println("Please input student's id and age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(),scanner.nextInt(),scanner.nextLine());
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
            System.out.println("Please input student's id and age and name for add student.");
            System.out.print("Input: ");
            addStudent(scanner.nextInt(),scanner.nextInt(),scanner.nextLine());
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
