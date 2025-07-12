
class _3Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Ranjeet Kumar") ;
        System.out.println(s1.name);
        
        Student s2 = new Student() ;
    }
}

class Student {
    String name ;
    int roll ;
    Student(String name) {
        this.name = name ;
    }
    
    Student() {
        System.out.println("constructor is called...........") ;
    }
}