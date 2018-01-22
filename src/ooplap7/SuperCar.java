package ooplap7;
//design class
//taking about Supercar
//1. carbrand
//2. carcolor
//3. carenginesize
//4. maxspeed
//5. countryoforigin

public class SuperCar {
        private String carbrand;
        private String carcolor;
        private String carenginesize;
        private String maxspeed;
        private String countryoforigin;
    private Object getSupercarInfo;

    public SuperCar(){}
        public SuperCar(String b,String c,String s,String m,String r){
            this.carbrand= b;
            this.carcolor = c;
            this.carenginesize = s;
            this.maxspeed = m;
            this.countryoforigin = r;
        }// condtructor


    //getter and srtter methods

    public void setcarbrand(String b){
        this.carbrand = b;
    }//setcarbrand
    public String getcarbrand(){
        return  this.carbrand;
    }//getcarbrand

    public void setcarcolor(String c){
        this.carcolor = c;
    }//setcarcolor
    public String getcarcolor(){
        return  this.carcolor;
    }//getcarcolor

    public void setcarenginesize(String s){
        this.carenginesize = s;
    }//setcarenginesize
    public String getcarenginesize(){
        return  this.carenginesize;
    }//getcarenginesize

    public void setmaxspeed(String m){
        this.maxspeed = m;
    }//setmaxspeed
    public String getmaxspeed(){
        return  this.maxspeed;
    }//getmaxspeed

    public void setcountryoforigin(String r){
        this.countryoforigin = r;
    }//setcountryoforigin
    public String getcountryoforigin(){
        return  this.countryoforigin;
    }//getcountryoforigin


    public Object getSupercarInfo() {
        return getSupercarInfo ;
    }
}//class
