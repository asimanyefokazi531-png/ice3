public abstract class Sales implements iSales {

    String brand;
    int sales;

    public Sales(SalesModel model){
        this.brand=model.ShoeBrand;
        this.sales=model.BrandSales;
    }
    @Override
    public String getShoeBrand(){
        return brand;
    }
    @Override
    public int getBrandSales(){
        return sales;
    }

}