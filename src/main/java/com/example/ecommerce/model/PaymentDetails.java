package com.example.ecommerce.model;

import com.example.ecommerce.domain.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {

    private String paymentId;
    private String razorpayPaymentLinkId;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentId;
    private PaymentStatus status;


}

/*
paymentId — идентификатор платежа в вашей системе (не в Razorpay, а, скорее всего, внутренний ID).

razorpayPaymentLinkId — уникальный ID платёжной ссылки, который выдаёт Razorpay.

razorpayPaymentLinkReferenceId — это может быть внутренний референс-код (например, номер заказа),
который вы передаёте в Razorpay, и он возвращает его обратно для связи данных.

razorpayPaymentLinkStatus — статус платёжной ссылки на стороне Razorpay (например, created, paid, expired, cancelled).

razorpayPaymentId — уникальный ID фактической транзакции от Razorpay (не путать с ID ссылки).
Это уже привязано к факту оплаты.

PaymentStatus status — переменная типа PaymentStatus,
скорее всего это enum с возможными состояниями оплаты (например, PENDING, SUCCESS, FAILED).

*/