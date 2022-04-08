public class Student {
    private String name;
    private String addr;
    private int[] grades;

    public Student(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.addr = address;
    }

    public String getAddress() {
        return addr;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public String toString() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        String txt = "學生姓名: " + name + "總平均為: " + (double) sum / 5.;
        return txt;
    }
}