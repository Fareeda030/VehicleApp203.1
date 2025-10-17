import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("公共汽车信息");
        System.out.println("品牌：");
        String make1 = input.nextLine();
        System.out.println("型号：");
        String model1 = input.nextLine();
        System.out.println("车轮数量：");
        int wheels1 = input.nextInt();
        System.out.println("乘客数量：");
        int passengers1 = input.nextInt();
        input.nextLine();

        Vehicle Bus = new Vehicle(make1,model1,wheels1,passengers1);

        System.out.println("\n汽车信息");
        System.out.println("品牌：");
        String make2 = input.nextLine();
        System.out.println("型号：");
        String model2 = input.nextLine();
        System.out.println("车轮数量：");
        int wheels2 = input.nextInt();
        System.out.println("乘客数量：");
        int passengers2 = input.nextInt();
        input.nextLine();
        Vehicle Car = new Vehicle(make2,model2,wheels2,passengers2);

        System.out.println("\n自行车信息");
        System.out.println("品牌：");
        String make3 = input.nextLine();
        System.out.println("型号：");
        String model3 = input.nextLine();
        System.out.println("车轮数量：");
        int wheels3 = input.nextInt();
        System.out.println("乘客数量：");
        int passengers3 = input.nextInt();
        input.nextLine();
        Vehicle Bike = new Vehicle(make3,model3,wheels3,passengers3);

        System.out.println("the make2 is:"+make2);
        System.out.println("the model2 is:"+model2);

    }


}