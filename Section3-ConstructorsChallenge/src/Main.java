public class Main {
    public static void main(String[] args) {
        VipCustomer vip = new VipCustomer();
        VipCustomer vip2 = new VipCustomer(12000,"deek@gmail.com");
        VipCustomer vip3 = new VipCustomer("Fathima",25000,"Fathima@gmail.com");

        System.out.println(vip.getName());
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmailId());

        System.out.println(vip2.getName());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip2.getEmailId());

        System.out.println(vip3.getName());
        System.out.println(vip3.getCreditLimit());
        System.out.println(vip3.getEmailId());
        
    }
}
