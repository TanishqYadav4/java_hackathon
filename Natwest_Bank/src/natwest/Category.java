package natwest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Category implements CategoryOperations {
    private int typeId;
    private String typeName;
    private double interest;

    public Category(int typeId, String typeName, double interest) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.interest = interest;
    }

    // Getters and setters

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Type ID: " + typeId + "\n" +
                "Type Name: " + typeName + "\n" +
                "Interest: " + interest;
    }

    public static List<Category> displayAccountCategories() {
            return Stream.of(
                    new Category(1, "Savings", 5.0),
                    new Category(2, "Salary", 3.0)
            ).collect(Collectors.toList());
        }
}
