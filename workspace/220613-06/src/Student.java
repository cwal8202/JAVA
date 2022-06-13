public class Student extends Human {
    private String major;

    public Student(String name, int age, String major){
    	super(name, age, "학생");
    	this.major = major;
    }

    @Override
    public String toString(){
    	return super.toString() + "\n전공 : " + major;		// super을 안쓰면 (this)가 자동으로 되어 자기 자신이 된다.
    //	return "이름 : " + getName()+ "\n나이 : " +getAge() + "\n전공 : " + major;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(){
    	this.major = major;
    }

    public static void main(String[] args) {
    	Student a = new Student("명진", 21, "컴퓨터");
    	Student b = new Student("미현", 22, "경영");
    	Student c = new Student("용준", 24, "경제");
    	
    	System.out.println(a.toString());
    }
}
