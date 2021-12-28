package ru.geekbrains.spring1.lesson5;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class MainApp {
    public static void main(String[] args) {
        EntityManagerFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        Product product = em.find(Product.class, 1L);
        System.out.println(product.toString());
        product.getShopCartList().stream().forEach(s -> System.out.println(s.toString()));
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
