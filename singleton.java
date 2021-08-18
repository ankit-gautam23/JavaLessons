public class singleton{

    static singleton sing_obj;
    private singleton() {
        
    }

    private static singleton getInstance(){
        if(sing_obj == null){
            sing_obj = new singleton(); 
        }
        return sing_obj;
    }

    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        system.out.println(obj);

        singleton obj1 = singleton.getInstance();
        system.out.println(obj1);
    }

}