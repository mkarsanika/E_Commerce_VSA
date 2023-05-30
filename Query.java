package package2.DB;

public class Query {
  public static final String Login_check="Select * from login where username= ? ";
  public static final String Product_insert = "Insert into Product(Product_id,Product_name,Product_category,Product_Quantity,Product_price,Product_Expiry_date) values (?,?,?,?,?,?)";
  public static final String Product_delete ="Delete  from Product where Product_id = ?";
  public static final String Product_list = "Select * from Product order by Product_id";
  public static final String Product_Update = "Update Product set Product_name= ?,Product_category= ?,Product_Quantity= ?,Product_price= ?,Product_Expiry_date= ? where Product_id= ? ";
  public static final String Category_insert = "Insert into Category(Category_id,Category_name,Category_message) values (?,?,?)"; 
  public static final String Category_Update = "Update Category set Category_name=?,Category_message=? where Category_id=?";
  public static final String Category_delete = "Delete  from Category where Category_id = ?";
  public static final String Category_list = "Select * from Category order by Category_id";
  public static final String Admin_update = "Update Product set Product_name=? where  Product_id=? ";
  public static final String Supplier_insert = "Insert into Supplier(Supplier_id,Supplier_name,Supplier_password,Supplier_gender) values (?,?,?,?)";
  public static final String Supplier_list = "Select * from Supplier order by Supplier_id";
  public static final String Supplier_Update = "Update Supplier set Supplier_name=?,Supplier_password=?,Supplier_gender=?  where Supplier_id=?";
  public static final String Supplier_delete = "Delete   from Supplier where Supplier_id = ? ";
  public static final String Supplier_login_insert = "insert into login (Username,Password) values (?,?)";
  public static final String Supplier_login_delete = "delete  from login where Username = ? ";
  public static final String Supplier_check = "select Supplier_id from Supplier where Supplier_id= ?";
  public static final String Category_check = "select Category_id from Category where Category_id= ?";
  public static final String Customer_search = "Select Product_Id,Product_Quantity,Product_price,Product_Name from product  where  PRODUCT_CATEGORY= ? ";
  public static final String Customer_add_to_cart = "insert into Customer_list values (?,?,?,?)";
  public static final String Customer_search_product = "Select Product_category,Product_Quantity,Product_price from Product where Product_id=? ";
  public static final String Customer_product = "update Product set Product_Quantity= ? where Product_id=?";
  public static final String add_count="select count(*) from Customer_list where Customer_name = ?";
  public static final String Customerlist_search = "Select Product_Id,Product_Quantity,Total_price from Customer_list where Customer_name = ? "; 
  public static final String Customerlist_delete = "Delete  from Customer_list where Product_Id =?";
  public static final String Customerlist_update = "Update Customer_list set Product_Quantity = ? where Product_Id =?";
  public static final String Customer_product_play = "update Product set Product_Quantity=Product_Quantity + ? where Product_id=? ";
  public static final String Customer_final_bill = "Select Sum(Total_price) from Customer_list where Customer_name =?";
  public static final String Customer_final_delete = "Delete   from Customer_list where Customer_name = ? ";
  public static final String product_check="select Product_id from Product where Product_id= ?"; 
  public static final String Delete_expiry_product = "delete  from Product where Product_expiry_date > SYSDATE";
  public static final String Tempory_delete = "delete   from Customer_list where Customer_name = ? ";
  public static final String Delete_customer_product = "select Product_Quantity from Customer_list where Product_Id = ?";
  public static final String Customer_bill_update1 = "update Product set Product_quantity = Product_quantity + ? where Product_id = ? ";
  public static final String Customer_bill_update2 = "update customer_list set Product_quantity = ?,total_price = ? where Product_id = ?  " ;
  public static final String Customer_bill_update3 ="select product_quantity from product where product_id =? ";
  public static final String Customer_bill_update = "select product_quantity from customer_list where product_id =?";
  public static final String Customer_bill_update5 = "update Product set Product_quantity = Product_quantity - ? where Product_id = ?";

}
