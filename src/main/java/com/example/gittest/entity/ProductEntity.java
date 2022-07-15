package com.example.gittest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_desc")
    private String productDesc;
    @Column(name = "product_original_price")
    private double productOriginalPrice;
    @Column(name = "product_discount")
    private Long productDiscount;
    @Column(name = "productPrice")
    private Long productPrice;
    @Column(name = "productStar")
    private double productStar;
    @Column(name = "product_thumbnail")
    private String productThumbnail;
    @Column(name = "product_quantity")
    private Long productQuantity;
    @Column(name = "product_brand")
    private String productBrand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

}
