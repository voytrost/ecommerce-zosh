package com.example.ecommerce.domain;

public enum PaymentOrderStatus {
    PENDING,
    //Платёж ещё не обработан, ожидает подтверждения.
    SUCCESS,
    // Платёж успешно завершён.
    FAILED
    //Платёж не прошёл из-за ошибки (недостаточно средств, ошибка сети и т. д.).
}
