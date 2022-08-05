package JavaProject.StudentManagementSystem.Version1$1;

import java.util.Scanner;

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
 * @author 86151
 */
public class TemplateUse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Template template = new Template();
        String schoolName = " XX ";
        int selectionFunction = 0;
        while (true) {
            System.out.println("-------------Welcome to" + schoolName + "student management system-------------");
            System.out.println("1:Add student");
            System.out.println("2:Delete student");
            System.out.println("3:Set student");
            System.out.println("4:Find student");
            System.out.println("5:exit");
            System.out.print("Please input your select: ");
            selectionFunction = scanner.nextInt();
            switch (selectionFunction){
                case 1:{
                    System.out.println("Please input student's id and age and name for add student.");
                    System.out.print("Input: ");
                    template.addStudent(scanner.nextInt(),scanner.nextInt(),scanner.nextLine());
                    break;
                }
                case 2:{
                    System.out.println("Please input student's id for delete student.");
                    System.out.print("Input: ");
                    template.deleteStudent(scanner.nextInt());
                    break;
                }
                case 3:{
                    System.out.println("Please input student's id and new age and new name for set student.");
                    System.out.print("Input: ");
                    template.setStudent(scanner.nextInt(), scanner.nextInt(), scanner.nextLine());
                    break;
                }
                case 4:{
                    System.out.println("Please input student's id for find student.");
                    System.out.print("Input: ");
                    template.findStudent(scanner.nextInt());
                    break;
                }
                case 5:{
                    template.exit();
                    break;
                }
                default: {
                    System.out.println("Input is error.");
                }
            }
        }

    }
}
