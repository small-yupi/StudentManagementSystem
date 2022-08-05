package JavaProject.StudentManagementSystem.Version1$0;

/**
 * 2022/7/30 ~ 2022/8/2 1.0 END
 * bilibili: 代码永远不写注释
 * Github: small-yupi
 * CSDN: new_command
 * 邮箱: zsj20143688@163.com
 * @author 86151
 */
public class Template {

    private int[] id = new int[10];
    private int[] age = new int[10];
    private String[] name = new String[10];
    private int currentIndex = 0;

    /**
     * 添加学生
     * Add student
     */
    public void addStudent(int id, int age, String name) {
        if (currentIndex + 1 == this.id.length - 1) {
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
        this.id[currentIndex] = id;
        this.age[currentIndex] = age;
        this.name[currentIndex] = name;
        currentIndex++;
    }

    /**
     * 删除学生
     * Delete student
     */
    public void deleteStudent(int id) {
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
        }
    }

    /**
     * 更改学生
     * Set student
     */
    public void setStudent(int id,int age,String name) {
        int findTheJudgment = 0;
        for (int i = 0; i < this.id.length - 1; i++) {
            if (id == this.id[i]) {
                findTheJudgment++;
                this.age[i] = age;
                this.name[i] = name;
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
        int findTheJudgment = 0;
        for (int i = 0; i < this.id.length - 1; i++) {
            if (id == this.id[i]) {
                findTheJudgment++;
                System.out.println("age: " + age[i]);
                System.out.println("name: " + name[i]);
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
