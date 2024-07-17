//to avoid every time changing our class features from printing int to double we have to copy paste the same class and
//and do some changes in it here java generics comes into the picture.

//T->Type
//E->Element
//K->Key
//V->Value

public  class Mygeneric {
    //using function we use generic in this way
    public <T> void heyGen(T element){ //type T passed
        System.out.println("hi generics"+ element);
    }
    public static void main(String[] args) {
//calling generics through function
        Mygeneric mg=new Mygeneric();
        mg.heyGen("pratik");


        IntegerDisplayer obj = new IntegerDisplayer();
        obj.setNum(20);
        obj.display();

        DoubleDisplayer obj1 = new DoubleDisplayer();
        obj1.setNum(20.0);
        obj1.display();

//displaying objects using generics

        Displayer<Integer>obj2=new Displayer<>();
        obj2.setNum(10);
        obj2.display();

        Displayer<Double>obj3=new Displayer<>();
        obj3.setNum(100.0);
        obj3.display();

        Displayer<college>object=new Displayer<>();
        object.setNum(new college());
        object.display();

        Displayer<student>object1=new Displayer<>();
        object1.setNum(new student());
        object1.display();

        Displayer<Teacher>object2=new Displayer<>();
        object2.setNum(new Teacher());
        object2.display();

    }
}

class college{
    void printCollege(){
        System.out.println("ASANSOL ENGINEERING COLLEGE");
    }
}

class student extends college{
    void printName(){
        System.out.println("student name printed");
    }
}

class Teacher extends college{
    void printName(){
        System.out.println("Teacher name printed");
    }
}

//using generics
//creating an object class we can also do the same but there is no type safety provided.

class Displayer1<T extends college>{//T->type //architect the displayer such that it only takes college child classes.
    T num;
    public void setNum(T num){
        this.num=num;

    }
    public void display(){
        System.out.println("element-> "+ this.num);
    }


}

class Displayer<T>{//T->type
    T num;
    public void setNum(T num){
        this.num=num;

    }
    public void display(){
        System.out.println("element-> "+ this.num);
    }


}

     class IntegerDisplayer{
        Integer num;
        public void setNum(Integer num){
            this.num=num;

        }
        public void display(){
            System.out.println("element-> "+ this.num);
        }
    }

    //Double displayer class

class DoubleDisplayer{
    Double num;
    public void setNum(Double num){
        this.num=num;

    }
    public void display(){
        System.out.println("element-> "+ this.num);
    }
}
