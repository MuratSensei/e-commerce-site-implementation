package com.dolap.backend.ecommercesite.domain.product.command;

import com.dolap.backend.ecommercesite.contracts.interfaces.Command;
import com.dolap.backend.ecommercesite.domain.product.constants.GenderTypeEnum;
import com.dolap.backend.ecommercesite.domain.product.constants.ProductCategoryEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Positive;
import java.util.Objects;

public class UpdateProductCommand implements Command {

    @JsonIgnore
    private String id;

    private String name;

    private ProductCategoryEnum category;

    private String description;

    private String content;

    private String brand;

    @Positive
    private Double unitPrice;

    @Positive
    private Double unitWeight;

    private String photoUrl;

    private GenderTypeEnum gender;

    public UpdateProductCommand() {
    }

    public UpdateProductCommand(String name, ProductCategoryEnum category, String description, String content, String brand, Double unitPrice, Double unitWeight, String photoUrl, GenderTypeEnum gender) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.content = content;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.unitWeight = unitWeight;
        this.photoUrl = photoUrl;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(ProductCategoryEnum category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public GenderTypeEnum getGender() {
        return gender;
    }

    public void setGender(GenderTypeEnum gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateProductCommand that = (UpdateProductCommand) o;
        return id == that.id &&
                Double.compare(that.unitPrice, unitPrice) == 0 &&
                Double.compare(that.unitWeight, unitWeight) == 0 &&
                Objects.equals(name, that.name) &&
                category == that.category &&
                Objects.equals(description, that.description) &&
                Objects.equals(content, that.content) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(photoUrl, that.photoUrl) &&
                gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, description, content, brand, unitPrice, unitWeight, photoUrl, gender);
    }

    @Override
    public String toString() {
        return "UpdateProductCommand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", brand='" + brand + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitWeight=" + unitWeight +
                ", photoUrl='" + photoUrl + '\'' +
                ", gender=" + gender +
                '}';
    }

}
