import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class foodOrders {
    public String foodName,foodCategory,foodExp,foodOrigin, tCompany,tLocation,tSource,tDestination,tDeliveryDate,wLocation,WReceivingDate;
    public String foodPrice;
    public FactoryModel factory = new FactoryModel();

    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodCategory() {
        return foodCategory;
    }
    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }
    public String getFoodExp() {
        return foodExp;
    }
    public void setFoodExp(String foodExp) {
        this.foodExp = foodExp;
    }
    public String getFoodOrigin() {
        return foodOrigin;
    }
    public void setFoodOrigin(String foodOrigin) {
        this.foodOrigin = foodOrigin;
    }
    public String gettCompany() {return tCompany;}
    public void settCompany(String tCompany) {
        this.tCompany = tCompany;
    }
    public String gettLocation() {
        return tLocation;
    }
    public void settLocation(String tLocation) {
        this.tLocation = tLocation;
    }
    public String gettSource() {
        return tSource;
    }
    public void settSource(String tSource) {
        this.tSource = tSource;
    }
    public String gettDestination() {
        return tDestination;
    }
    public void settDestination(String tDestination) {
        this.tDestination = tDestination;
    }
    public String gettDeliveryDate() {
        return tDeliveryDate;
    }
    public void settDeliveryDate(String tDeliveryDate) {
        this.tDeliveryDate = tDeliveryDate;
    }
    public String getwLocation() {
        return wLocation;
    }
    public void setwLocation(String wLocation) {
        this.wLocation = wLocation;
    }
    public String getWReceivingDate() {
        return WReceivingDate;
    }
    public void setWReceivingDate(String WReceivingDate) {
        this.WReceivingDate = WReceivingDate;
    }
    public String getFoodPrice() {
        return foodPrice;
    }
    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
    public List<String[]> splitFile01(){
        List<String[]> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(factory.filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length >= 5) {
                    setFoodName(parts[0]);
                    setFoodCategory(parts[1]);
                    setFoodExp(parts[2]);
                    setFoodOrigin(parts[3]);
                    setFoodPrice(parts[4]);
                    settCompany(parts[5]);
                    settLocation(parts[6]);
                    settSource(parts[7]);
                    settDestination(parts[8]);
                    settDeliveryDate(parts[9]);
                    setwLocation(parts[10]);
                    setWReceivingDate(parts[11]);

                    lines.add(parts);
                } else {
                    System.out.println("Not enough parts in the line.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error reading the file");
        }
        return lines;
    }
}