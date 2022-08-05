package JavaProject.StudentManagementSystem.Version1$2;

import java.util.Scanner;

/**
 * 2022/8/4 1.2 END
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
 * @author 86151
 */
public class TemplateUse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Template template = new Template();
        String schoolName = " XX ";
        int selectionFunction;
        String ifDelete;
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
                    System.out.println("Please input student's age and name for add student.");
                    System.out.print("Input: ");
                    template.addStudent(scanner.nextInt(), scanner.nextLine());
                    break;
                }
                case 2:{
                    System.out.println("Are you sure you want to delete it? It cannot be restored after being deleted!(Y/N)");
                    System.out.print("Input: ");
                    ifDelete = scanner.next();
                    if ("N".equals(ifDelete)) {
                        break;
                    }
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
