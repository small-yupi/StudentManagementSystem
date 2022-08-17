package JavaProject.StudentManagementSystem.Version1$3;

import java.util.InputMismatchException;
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

public class TemplateUse{

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Template template = new Template();
        String schoolName = " XX ";
        int selectionFunction = 0;
        int exceptionJudge = 0;
        int saveExceptionJubge = 0;
        String ifDelete;
        while (true) {

            while (true) {
                System.out.println("-------------Welcome to" + schoolName + "student management system-------------");
                System.out.println("1:Add student");
                System.out.println("2:Delete student");
                System.out.println("3:Set student");
                System.out.println("4:Find student");
                System.out.println("5:exit");
                System.out.print("Please input your select: ");
                try {
                    saveExceptionJubge = exceptionJudge;
                    selectionFunction = new Scanner(System.in).nextInt();
                } catch (InputMismatchException i) {
                    exceptionJudge++;
                    System.out.println("Input is error!");
                    System.out.println("Journal:");
                    i.printStackTrace();
                    Thread.sleep(20);
                    System.out.print("Sorry, there is an exception in the program.");
                    System.out.println("An exception log has been generated. Do you want to send it?(Y/N)");
                    scanner.nextLine();
                }
                if (exceptionJudge == 0) {
                    break;
                } else if (exceptionJudge > 5) {
                    System.out.println("Input error too many, program will exit!");
                    System.exit(0);
                } else if (exceptionJudge == saveExceptionJubge) {
                    break;
                }

            }

            switch (selectionFunction){
                case 1:{
                    while (true) {
                        System.out.println("Please input student's age and name for add student.");
                        System.out.print("Input: ");
                        try {
                            saveExceptionJubge = exceptionJudge;
                            template.addStudent(scanner.nextInt(), scanner.nextLine());
                        } catch (InputMismatchException i) {
                            exceptionJudge++;
                            System.out.println("Input is error!");
                            System.out.println("Journal:");
                            i.printStackTrace();
                            Thread.sleep(20);
                            System.out.print("Sorry, there is an exception in the program.");
                            System.out.println("An exception log has been generated. Do you want to send it?(Y/N)");
                            scanner.nextLine();
                        }
                        if (exceptionJudge == 0) {
                            break;
                        } else if (exceptionJudge > 5) {
                            System.out.println("Input error too many, program will exit!");
                            System.exit(0);
                        } else if (exceptionJudge == saveExceptionJubge) {
                            break;
                        }

                    }
                    break;
                }
                case 2:{
                    System.out.println("Are you sure you want to delete it? It cannot be restored after being deleted!(Y/N)");
                    System.out.print("Input: ");
                    ifDelete = scanner.next();
                    if ("N".equals(ifDelete)) {
                        break;
                    }
                    while (true) {
                        System.out.println("Please input student's number for delete student.");
                        System.out.print("Input: ");
                        try {
                            saveExceptionJubge = exceptionJudge;
                            template.deleteStudent(scanner.nextInt());
                        } catch (InputMismatchException i) {
                            exceptionJudge++;
                            System.out.println("Input is error!");
                            System.out.println("Journal:");
                            i.printStackTrace();
                            Thread.sleep(20);
                            System.out.print("Sorry, there is an exception in the program.");
                            System.out.println("An exception log has been generated. Do you want to send it?(Y/N)");
                            scanner.nextLine();
                        }
                        if (exceptionJudge == 0) {
                            break;
                        } else if (exceptionJudge > 5) {
                            System.out.println("Input error too many, program will exit!");
                            System.exit(0);
                        } else if (exceptionJudge == saveExceptionJubge) {
                            break;
                        }

                    }
                    break;
                }
                case 3:{
                    while (true) {
                        System.out.println("Please input student's number and new age and new name for set student.");
                        System.out.print("Input: ");
                        try {
                            saveExceptionJubge = exceptionJudge;
                            template.setStudent(scanner.nextInt(), scanner.nextInt(), scanner.nextLine());
                        } catch (InputMismatchException i) {
                            exceptionJudge++;
                            System.out.println("Input is error!");
                            System.out.println("Journal:");
                            i.printStackTrace();
                            Thread.sleep(20);
                            System.out.print("Sorry, there is an exception in the program.");
                            System.out.println("An exception log has been generated. Do you want to send it?(Y/N)");
                            scanner.nextLine();
                        }
                        if (exceptionJudge == 0) {
                            break;
                        } else if (exceptionJudge > 5) {
                            System.out.println("Input error too many, program will exit!");
                            System.exit(0);
                        } else if (exceptionJudge == saveExceptionJubge) {
                            break;
                        }
                    }

                    break;
                }
                case 4:{
                    while (true) {
                        System.out.println("Please input student's number for find student.");
                        System.out.print("Input: ");
                        try {
                            saveExceptionJubge = exceptionJudge;
                            template.findStudent(scanner.nextInt());
                        } catch (InputMismatchException i) {
                            exceptionJudge++;
                            System.out.println("Input is error!");
                            System.out.println("Journal:");
                            i.printStackTrace();
                            Thread.sleep(20);
                            System.out.print("Sorry, there is an exception in the program.");
                            System.out.println("An exception log has been generated. Do you want to send it?(Y/N)");
                            scanner.nextLine();
                        }
                        if (exceptionJudge == 0) {
                            break;
                        } else if (exceptionJudge > 5) {
                            System.out.println("Input error too many, program will exit!");
                            System.exit(0);
                        } else if (exceptionJudge == saveExceptionJubge) {
                            break;
                        }

                    }
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
