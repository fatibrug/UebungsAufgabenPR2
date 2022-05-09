package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Order {

    private int nrArticles;
    private int capacityOrder;
    private Array[] articles;

    public Order(int nrArticles, int capacityOrder, Array[] articles) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.articles = articles;
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    @Override
    public String toString() {
        return "Order: " +
                "articles: " + Arrays.toString(articles);
    }

    public void addArticle(Article a){
        Article speicher = new Article();

        articles.add(a);
    }
}
