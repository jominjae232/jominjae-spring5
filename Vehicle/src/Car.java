public class Car {
   // 속성=변수=필드(Java)/멤버변수(C++)
   private String nColor;
   private int maxSpeed;
   private   int nSpeed;
   private int guest;
   private String modelName;
   private int nWheel;
   
   public String getnColor() {
      return nColor;
   }
   public void setnColor(String nColor) {
      this.nColor = nColor;
   }
   public int getMaxSpeed() {
      return maxSpeed;
   }
   public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
   }
   public int getnSpeed() {
      return nSpeed;
   }
   public void setnSpeed(int nSpeed) {
      this.nSpeed = nSpeed;
   }
   public int getGuest() {
      return guest;
   }
   public void setGuest(int guest) {
      this.guest = guest;
   }
   public String getModelName() {
      return modelName;
   }
   public void setModelName(String modelName) {
      this.modelName = modelName;
   }
   public int getnWheel() {
      return nWheel;
   }
   public void setnWheel(int nWheel) {
      this.nWheel = nWheel;
   }
   Car() { //face //기본생성자(default constructor) - 매개변수 없음.
      // body
//      this.nColor="blue";
//      this.guest=5;
//      this.maxSpeed=240;
//      this.nSpeed=0;
      this("blue",5,240,0);
   }
   Car(String c, int g, int m, int n) {
      this.nColor=c;
      this.guest=g;
      this.maxSpeed=m;
      this.nSpeed=n;
   }
   Car(String a, int b, int t, int d, String e, int q){
//      this.nColor=a;
//      this.guest=b;
//      this.maxSpeed=t;
//      this.nSpeed=d;
      this(a,b,t,d); // 다른 생성자에서 데이터를 가져온다.
      
      this.modelName=e;
      this.nWheel=q;
   }
   void drive(int x) {
      this.nSpeed=x;
   }
   void stop() {
      this.nSpeed=0;
   }
}