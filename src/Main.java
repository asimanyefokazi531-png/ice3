void main() {

    SalesModel model= new SalesModel();
    model.ShoeBrand="Nike";
    model.BrandSales=100;

    PrintSales printSales=new PrintSales(model);
    printSales.Print();
}
