public class PrintSales extends Sales {
    public PrintSales(SalesModel model){
        super(model);
    }
    public  void  Print(){

        System.out.println("*********************************************");
        System.out.println("Shoe Sales Printout");
        System.out.println("*********************************************");
        System.out.println("Shoe Brand: "+ getShoeBrand());
        System.out.println("Shoe Brand Sales: "+ getBrandSales());
        System.out.println("**********************************************");
    }
}
