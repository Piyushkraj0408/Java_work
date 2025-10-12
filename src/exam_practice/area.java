package exam_practice;
public class area {
    int length;
    int breadth;
    int height;
    void setDim(int len,int bre){
        this.length = len;
        this.breadth = bre;
        System.out.println("Parameter are seted");
    }
    void setTri(int a,int b, int c){
        this.length = a;
        this.breadth = b;
        this.height = c;
    }
    int getArae(){
        int area = (breadth*height)/2;
        return area;
    }
    int getPerimeter(){
        int perimeter = length + breadth + height;
        return perimeter;
    }
    public static void main(String[] args){
        area Area = new area();
        Area.setTri(3,4,5);
        int res = Area.getArae();
        System.out.println(res);
        System.out.println(Area.getPerimeter());
        }

}
