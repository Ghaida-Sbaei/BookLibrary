public class Author {
    private String name;
    private String email;
    private int age;
    private String gender;

    public Author(String name,String email,int age,String gender){
        this.name=name;
        this.email=email;
        this.age=age;
        this.gender=gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Author(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void show(){

        System.out.println("THe name :  "+name +" ,The email :  "+email+" , Age : , "+age+" & Gender : "+gender);
    }


}
