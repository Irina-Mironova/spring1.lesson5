package ru.geekbrains.spring1.lesson5;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "idUser")
    private List<ShopCart> shopCartList;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public List<ShopCart> getShopCartList() {
        return shopCartList;
    }

    public void setShopCartList(List<ShopCart> shopCartList) {
        this.shopCartList = shopCartList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("User [id = %d, name = %s]", id, name);
    }
}
