package com.example.ecommerce.model;

import com.example.ecommerce.domain.AccountStatus;
import com.example.ecommerce.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sellerName;

    private String mobile;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress = new Address();


    private String GSTIN;
    //GSTIN (Goods and Services Tax Identification Number) — это 15-значный уникальный идентификационный номер,
    // который присваивается каждому зарегистрированному плательщику налога на товары и услуги (GST) в Индии.

    private USER_ROLE role = USER_ROLE.ROLE_SELLER;

    private boolean isEmailVerified = false;

    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;
}
