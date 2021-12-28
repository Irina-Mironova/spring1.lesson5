package ru.geekbrains.spring1.lesson5;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column (name = "price")
    private Integer price;

    @OneToMany(mappedBy = "idProduct")
    List<ShopCart> shopCartList;

    public Product() {
    }

    public List<ShopCart> getShopCartList() {
        return shopCartList;
    }

    public void setShopCartList(List<ShopCart> shopCartList) {
        this.shopCartList = shopCartList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString(){
        return "["+ id + " " + title + " " + price + "]";
    }
}
