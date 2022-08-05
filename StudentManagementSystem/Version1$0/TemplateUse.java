package JavaProject.StudentManagementSystem.Version1$0;

import java.util.Scanner;

/**
 * 2022/7/30 ~ 2022/8/2 1.0 END
 * bilibili: 代码永远不写注释
 * Github: small-yupi
 * CSDN: new_command
 * 邮箱: zsj20143688@163.com
 * @author 86151
 */
public class TemplateUse extends Template {

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
                    System.out.println("Please input student's old id and new age and new name for set student.");
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
