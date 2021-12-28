package ru.geekbrains.spring1.lesson5;

import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;

@Entity
@Table(name = "shopcart")
public class ShopCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User idUser;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product idProduct;

    @Column(name = "amount")
    private Integer amount;

    public ShopCart() {
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String toString() {
        return String.format("ShopCarts [id = %d, idUser = %d, idProduct = %d, amount = %d]", id,
                idUser.getId(), idProduct.getId(), amount);
    }
}
