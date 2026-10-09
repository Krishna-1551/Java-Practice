public class Worker {
    private int hw;
    private double payrate ;

    public void setData(int h, double p){
        hw=h;
        payrate=p;
    }
    public void getSalary(){

        if (hw>40){
            double norm_sal=40*payrate;
            int eh=hw-40;
            double add_sal= 2*payrate*eh;
            double final_sal=norm_sal+add_sal;
            System.out.println("The salary is "+final_sal);

        }
        else{
            double base_sal= payrate*hw;
            System.out.println("The salary is "+base_sal);
        }
    }

}
