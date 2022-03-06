package 工具包;

public class Employee {
    private int NO;//编号
    private String Name;
    private int age;
    private double wage;//工资
    private String object;//对象

    public Employee(int NO, String name, int age, double wage, String object) {
        this.NO = NO;
        Name = name;
        this.age = age;
        this.wage = wage;
        this.object = object;
    }

    public Employee() {
    }

    public Employee(String name, int age) {
        Name = name;
        this.age = age;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "工具包.Employee{" +
                "NO=" + NO +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                ", object='" + object + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (NO != employee.NO) return false;
        if (age != employee.age) return false;
        if (Double.compare(employee.wage, wage) != 0) return false;
        if (Name != null ? !Name.equals(employee.Name) : employee.Name != null) return false;
        return object != null ? object.equals(employee.object) : employee.object == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = NO;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(wage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (object != null ? object.hashCode() : 0);
        return result;
    }
}

